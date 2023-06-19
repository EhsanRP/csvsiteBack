package com.example.demo.controllers.apiModels;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationModel {

    private Integer id;

    private String userAccount;

    private String level;

    private String place;

}
