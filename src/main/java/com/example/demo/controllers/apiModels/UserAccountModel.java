package com.example.demo.controllers.apiModels;

import com.example.demo.domain.Apps;
import com.example.demo.domain.Education;
import com.example.demo.domain.Experties;
import com.example.demo.domain.Languages;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountModel {

    private String id;

    private String bio;

    private String name;

    private String subtitle;

    private String profilePhoto;

    private List<ExpertiesModel> experties = new ArrayList<>();

    private List<EducationModel> educations = new ArrayList<>();

    private List<AppsModel> apps = new ArrayList<>();

    private List<LanguagesModel> languages = new ArrayList<>();
}
