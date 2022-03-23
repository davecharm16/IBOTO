package com.example.iboto;

public class Model {
    private int candidateImage;
    private String name;

    public Model(int candidateImage, String name) {
        this.candidateImage = candidateImage;
        this.name = name;
    }

    public int getCandidateImage() {
        return candidateImage;
    }

    public void setCandidateImage(int candidateImage) {
        this.candidateImage = candidateImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
