package com.kamertic.cuba.mailservices.services;

import com.kamertic.cuba.mailservices.models.MailInfo;
import com.kamertic.cuba.mailservices.models.UserInfo;
import freemarker.template.TemplateException;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailServiceInterface {
    void sendEmail(MailInfo mailInfo) throws MessagingException, IOException, TemplateException;
    String getEmailContent(MailInfo mailInfo) throws IOException, TemplateException ;

}
