package com.example.demo.bootstrap;

import com.example.demo.domain.*;
import com.example.demo.repositories.*;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Value
@AllArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {

    AppsRepository appsRepository;
    ExpertiesRepository expertiesRepository;
    LanguagesRepository languagesRepository;
    EducationRepository educationRepository;
    UserAccountsRepository userAccountsRepository;

    @Override
    public void run(String... args) throws Exception {
        var userAccount = new UserAccounts();
        userAccount.setId("ehsanrp");
        userAccount.setName("Ehsan Rostami Pour");
        userAccount.setSubtitle("Junior Spring Framework Developer");
        userAccount.setBio("s, cum te nobis patrioque. Cu nec facete gloriatur philosophia. His in bonorum appellantur, cu nusquam principes adolescens quo. Nec natum nonumes ea.");
        userAccount = userAccountsRepository.save(userAccount);

        var languages = new Languages();
        languages.setLanguage("Persian");
        languages.setLevel(5);
        languages.setUserAccount(userAccount);
        languagesRepository.save(languages);

        var languages2 = new Languages();
        languages2.setLanguage("Arabic");
        languages2.setLevel(3);
        languages2.setUserAccount(userAccount);
        languagesRepository.save(languages2);

        var languages3 = new Languages();
        languages3.setLanguage("English");
        languages3.setLevel(10);
        languages3.setUserAccount(userAccount);
        languagesRepository.save(languages3);
        
        var app = new Apps();
        app.setName("Photoshop");
        app.setLevel(10);
        app.setUserAccount(userAccount);
        appsRepository.save(app);
        
        var app2 = new Apps();
        app2.setName("Photoshop");
        app2.setLevel(10);
        app2.setUserAccount(userAccount);
        appsRepository.save(app2);
        
        var app3 = new Apps();
        app3.setName("Photoshop");
        app3.setLevel(10);
        app3.setUserAccount(userAccount);
        appsRepository.save(app3);
        
        var app4 = new Apps();
        app4.setName("Photoshop");
        app4.setLevel(10);
        app4.setUserAccount(userAccount);
        appsRepository.save(app4);
        
        var app5 = new Apps();
        app5.setName("Photoshop");
        app5.setLevel(10);
        app5.setUserAccount(userAccount);
        appsRepository.save(app5);

        var expertie = new Experties();
        expertie.setExpert("JAVA");
        expertie.setLevel(10);
        expertie.setUserAccount(userAccount);
        expertiesRepository.save(expertie);
        
        var expertie2 = new Experties();
        expertie2.setExpert("JAVA");
        expertie2.setLevel(10);
        expertie2.setUserAccount(userAccount);
        expertiesRepository.save(expertie2);
        
        var expertie3 = new Experties();
        expertie3.setExpert("JAVA");
        expertie3.setLevel(10);
        expertie3.setUserAccount(userAccount);
        expertiesRepository.save(expertie3);
        
        var edu = new Education();
        edu.setPlace("Amir Kabir");
        edu.setLevel("Bachelor");
        edu.setUserAccount(userAccount);
        educationRepository.save(edu);

        var edu2 = new Education();
        edu2.setPlace("Amir Kabir");
        edu2.setLevel("Bachelor");
        edu2.setUserAccount(userAccount);
        educationRepository.save(edu2);

        var edu3 = new Education();
        edu3.setPlace("Amir Kabir");
        edu3.setLevel("Bachelor");
        edu3.setUserAccount(userAccount);
        educationRepository.save(edu3);
        
    }
}
