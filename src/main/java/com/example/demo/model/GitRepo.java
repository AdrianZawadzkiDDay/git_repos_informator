package com.example.demo.model;

public class GitRepo {

    private String name;
    private String description;
    private String gitCloneUrl;

    private Integer numberOfStargazes;
    private String dateCreate;

    private String error;

    public GitRepo() {
    }

    public GitRepo(String name, String description, String gitCloneUrl, Integer numberOfStargazes, String dateCreate, String error) {
        this.name = name;
        this.description = description;
        this.gitCloneUrl = gitCloneUrl;
        this.numberOfStargazes = numberOfStargazes;
        this.dateCreate = dateCreate;
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitCloneUrl() {
        return gitCloneUrl;
    }

    public void setGitCloneUrl(String gitCloneUrl) {
        this.gitCloneUrl = gitCloneUrl;
    }

    public Integer getNumberOfStargazes() {
        return numberOfStargazes;
    }

    public void setNumberOfStargazes(Integer numberOfStargazes) {
        this.numberOfStargazes = numberOfStargazes;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
