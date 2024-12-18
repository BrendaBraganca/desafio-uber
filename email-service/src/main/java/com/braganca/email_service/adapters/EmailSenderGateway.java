package com.braganca.email_service.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String sender, String body);

}
