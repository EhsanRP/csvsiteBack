package com.example.demo.converter;

import com.example.demo.controllers.apiModels.*;
import com.example.demo.domain.*;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static UserAccountModel UserEntityToModel(UserAccounts userAccounts){

        var model = new UserAccountModel();
        model.setId(userAccounts.getId());
        model.setName(userAccounts.getName());
        model.setBio(userAccounts.getBio());
        model.setSubtitle(userAccounts.getSubtitle());
        model.setProfilePhoto(userAccounts.getProfilePhoto());
        model.setApps(appsEntityToModel(userAccounts.getApps()));
        model.setEducations(educationEntityToModel(userAccounts.getEducations()));
        model.setExperties(expertiesEntityToModel(userAccounts.getExperties()));
        model.setLanguages(languageEntityToModel(userAccounts.getLanguages()));
        return model;
    }

    public static List<LanguagesModel> languageEntityToModel(List<Languages> languages){
        var models = new ArrayList<LanguagesModel>();
        languages.forEach(language ->{
            var item = new LanguagesModel();
            item.setId(language.getId());
            item.setLevel(language.getLevel());
            item.setLanguage(language.getLanguage());
            item.setUserAccount(language.getUserAccount().getId());
            models.add(item);
        });
        return models;
    }
    public static List<AppsModel> appsEntityToModel(List<Apps> languages){
        var models = new ArrayList<AppsModel>();
        languages.forEach(language ->{
            var item = new AppsModel();
            item.setId(language.getId());
            item.setLevel(language.getLevel());
            item.setName(language.getName());
            item.setUserAccount(language.getUserAccount().getId());
            models.add(item);
        });
        return models;
    }
    public static List<EducationModel> educationEntityToModel(List<Education> languages){
        var models = new ArrayList<EducationModel>();
        languages.forEach(language ->{
            var item = new EducationModel();
            item.setId(language.getId());
            item.setPlace(language.getPlace());
            item.setLevel(language.getLevel());
            item.setUserAccount(language.getUserAccount().getId());
            models.add(item);
        });
        return models;
    }
    public static List<ExpertiesModel> expertiesEntityToModel(List<Experties> languages){
        var models = new ArrayList<ExpertiesModel>();
        languages.forEach(language ->{
            var item = new ExpertiesModel();
            item.setId(language.getId());
            item.setExpert(language.getExpert());
            item.setLevel(language.getLevel());
            item.setUserAccount(language.getUserAccount().getId());
            models.add(item);
        });
        return models;
    }
}
