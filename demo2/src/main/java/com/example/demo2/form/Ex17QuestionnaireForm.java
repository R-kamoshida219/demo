package com.example.demo2.form;

import java.util.List;

public class Ex17QuestionnaireForm {


    private String name;
    private String email;
    private List<Integer> genderList;
    private List<Integer> hobbyList;
    private List<Integer> languageList;
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
    public List<Integer> getGenderList() {
        return genderList;
    }
    public void setGenderList(List<Integer> genderList) {
        this.genderList = genderList;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<Integer> getLanguageList() {
        return languageList;
    }
    public void setLanguageList(List<Integer> languageList) {
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
        return "Ex17QuestionnaireForm [name=" + name + ", email=" + email + ", genderList=" + genderList
                + ", hobbyList=" + hobbyList + ", languageList=" + languageList + ", com=" + com + "]";
    }

    

    

}
