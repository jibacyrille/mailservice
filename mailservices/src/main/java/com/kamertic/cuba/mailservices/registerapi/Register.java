package com.kamertic.cuba.mailservices.registerapi;

import com.kamertic.cuba.mailservices.models.MailInfo;
import com.kamertic.cuba.mailservices.models.UserInfo;
import com.kamertic.cuba.mailservices.services.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/register")
public class Register {
    @Autowired
    private EmailServiceImpl emailService;

    public EmailServiceImpl getEmailService() {
        return emailService;
    }

    public void setEmailService(EmailServiceImpl emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(method = RequestMethod.POST,path = "/register")
    @ResponseBody

    public String register(@RequestBody MailInfo mailInfo) throws Exception {
        emailService.sendEmail(mailInfo);
        return "Email Sent..!";
    }
}
