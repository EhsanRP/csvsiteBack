package com.example.demo.controllers.apiModels;

import com.example.demo.domain.UserAccounts;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppsModel {


    private Integer id;

    private String userAccount;

    private String name;

    private Integer level;
}
