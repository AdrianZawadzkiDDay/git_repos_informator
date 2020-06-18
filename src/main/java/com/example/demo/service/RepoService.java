package com.example.demo.service;

import com.example.demo.model.GitRepo;
import com.example.demo.pojo.RepoInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class RepoService {

    private String url;
    private GitRepo gitRepo = new GitRepo();

    RestTemplate restTemplate = new RestTemplate();

    public void getDataRepo(String userAndRepoName) {

        url = "https://api.github.com/repos/" + userAndRepoName;
        System.out.println(url);

        try {
            RepoInfo repoInfo = restTemplate.getForObject(url, RepoInfo.class);

            gitRepo.setName(repoInfo.getName());
            gitRepo.setDescription(repoInfo.getDescription());
            gitRepo.setGitCloneUrl(repoInfo.getCloneUrl());
            gitRepo.setNumberOfStargazes(repoInfo.getStargazersCount());
            gitRepo.setDateCreate(repoInfo.getCreatedAt());
            gitRepo.setError("OK");


        } catch (HttpClientErrorException e) {
            gitRepo.setError("error");
            gitRepo.setName("");
       }

    }


    public GitRepo getGitRepo() {
        return gitRepo;
    }

}
