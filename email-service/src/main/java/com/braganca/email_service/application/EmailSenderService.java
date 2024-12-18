package com.braganca.email_service.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.braganca.email_service.core.EmailSenderUseCase;
import com.braganca.email_service.adapters.EmailSenderGateway;

@Service
public class EmailSenderService implements EmailSenderUseCase{
    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway){
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {    
        this.emailSenderGateway.sendEmail(to, subject, body);
    }

}
