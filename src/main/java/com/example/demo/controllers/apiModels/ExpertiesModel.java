package com.example.demo.controllers.apiModels;

import com.example.demo.domain.UserAccounts;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExpertiesModel {

    private Integer id;

    private String userAccount;

    private String expert;

    private Integer level;
}
