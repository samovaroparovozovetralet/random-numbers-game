package org.java.training.autumn.controller;

import org.java.training.autumn.view.View;

import java.util.Date;
import java.util.Scanner;

public class InputNotebook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String secondName;
    private String patronymic;

    private String nickname;
    private String homePhone;
    private String cellPhone;
    private String email;
    private String skype;
    private String location;

    private Date createdAt;
    private Date changedAt;

    public InputNotebook(View view, Scanner sc){
        this.view = view;
        this.sc = sc;
    }

    public void getNote(){
        UtilityController utilityController = new UtilityController(view, sc);

    }


}
