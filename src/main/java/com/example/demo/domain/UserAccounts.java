package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAccounts {

    @Id
    private String id;

    private String name;

    private String bio;

    private String subtitle;

    private String profilePhoto;

    @OneToMany(mappedBy = "userAccount")
    private List<Experties> experties = new ArrayList<>();

    @OneToMany(mappedBy = "userAccount")
    private List<Education> educations = new ArrayList<>();

    @OneToMany(mappedBy = "userAccount")
    private List<Apps> apps = new ArrayList<>();

    @OneToMany(mappedBy = "userAccount")
    private List<Languages> languages = new ArrayList<>();

    public void addExperties(Experties experties){
        experties.setUserAccount(this);
        this.experties.add(experties);
    }

    public void addEducations(Education education){
        education.setUserAccount(this);
        this.educations.add(education);
    }

    public void addApps(Apps apps){
        apps.setUserAccount(this);
        this.addApps(apps);
    }

    public void addLanguages(Languages languages){
        languages.setUserAccount(this);
        this.addLanguages(languages);
    }

}
