package com.kamertic.cuba.mailservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
public class MailInfo {
    @Autowired(required=false)
    private UserInfo userInfo;
    private String mailSubject;
    private Template mailTemplate;

}
