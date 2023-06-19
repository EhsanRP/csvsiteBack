package com.example.demo.controllers;

import com.example.demo.controllers.apiModels.*;
import com.example.demo.converter.Converter;
import com.example.demo.domain.*;
import com.example.demo.repositories.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@Value
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    AppsRepository appsRepository;
    ExpertiesRepository expertiesRepository;
    LanguagesRepository languagesRepository;
    EducationRepository educationRepository;
    UserAccountsRepository userAccountsRepository;

    @GetMapping("/profile/{userId}")
    public UserAccountModel getProfile(@PathVariable String userId) {

        var user = Converter.UserEntityToModel(userAccountsRepository.findById(userId).get());

        return user;

    }

    @DeleteMapping("/remove/{userId}")
    public void removeProfile(@PathVariable String userId) {
        userAccountsRepository.deleteById(userId);
    }

    @PostMapping("/new")
    public UserAccounts createProfile(@RequestBody UserAccountModel userAccountModel) {

        var user = new UserAccounts();
        user.setId(userAccountModel.getId());
        user.setName(userAccountModel.getName());
        user.setSubtitle(userAccountModel.getSubtitle());
        user.setProfilePhoto(userAccountModel.getProfilePhoto());

        user = userAccountsRepository.save(user);

        var experties = new ArrayList<Experties>();

        for (ExpertiesModel x : userAccountModel.getExperties()) {
            var item = new Experties();
            item.setExpert(x.getExpert());
            item.setLevel(x.getLevel());
            item.setUserAccount(user);
            item = expertiesRepository.save(item);
            experties.add(item);
        }
        user.setExperties(experties);

        var educations = new ArrayList<Education>();

        for (EducationModel x : userAccountModel.getEducations()) {
            var item = new Education();
            item.setLevel(x.getLevel());
            item.setPlace(x.getPlace());
            item.setUserAccount(user);
            item = educationRepository.save(item);
            educations.add(item);
        }

        user.setEducations(educations);

        var languages = new ArrayList<Languages>();

        for (LanguagesModel x : userAccountModel.getLanguages()) {
            var item = new Languages();
            item.setLevel(x.getLevel());
            item.setLanguage(x.getLanguage());
            item.setUserAccount(user);
            item = languagesRepository.save(item);
            languages.add(item);
        }

        user.setLanguages(languages);

        var apps = new ArrayList<Apps>();

        for (AppsModel x : userAccountModel.getApps()) {
            var item = new Apps();
            item.setLevel(x.getLevel());
            item.setName(x.getName());
            item.setUserAccount(user);
            item = appsRepository.save(item);
            apps.add(item);
        }

        user.setLanguages(languages);

        user = userAccountsRepository.save(user);

        return user;

    }

}
