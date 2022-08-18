package com.kamertic.cuba.mailservices.models;

import lombok.Data;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;


@Data
public class UserInfo {
    private String username;
    private String name;
    //@NotNull
    private String email;
    //getter & setter

}
