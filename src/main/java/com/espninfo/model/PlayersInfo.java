package com.espninfo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PlayersInfo {

    private int age;
    private String firstName;
    private String lastName;
    private String birthCity;
    private String birthCountry;
    private String dateOfBirth;
    private String hobby;

}
