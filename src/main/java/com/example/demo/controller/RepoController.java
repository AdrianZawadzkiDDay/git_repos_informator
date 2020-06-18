package com.example.demo.controller;

import com.example.demo.model.GitRepo;
import com.example.demo.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RepoController {

    private RepoService service;

    @Autowired
    public RepoController(RepoService service) {
        this.service = service;
    }

    @GetMapping
    public String start(ModelMap model) {
        model.addAttribute("search", new GitRepo());

        return "index";

    }

    @GetMapping("/repoSearch")
    public String getCity(@RequestParam("name") String nameRepo, ModelMap model) {
        service.getDataRepo(nameRepo);
        model.addAttribute("repo", service.getGitRepo());

        return "search";

    }

}
