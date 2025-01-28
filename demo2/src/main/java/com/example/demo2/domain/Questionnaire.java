package com.example.demo2.domain;

import java.util.List;

public class Questionnaire {

    private String name;
    private String email;
    private List<String> genderList;
    private List<String> hobbyList;
    private List<String> languageList;
    private String com;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getGenderList() {
        return genderList;
    }
    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }
    public String getCom() {
        return com;
    }
    public void setCom(String com) {
        this.com = com;
    }
    
    @Override
    public String toString() {
        return "Questionnaire [name=" + name + ", email=" + email + ", genderList=" + genderList + ", hobbyList="
                + hobbyList + ", languageList=" + languageList + ", com=" + com + "]";
    }


    
    
}
