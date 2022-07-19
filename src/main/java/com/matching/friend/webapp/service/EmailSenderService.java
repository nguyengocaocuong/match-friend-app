package com.matching.friend.webapp.service;

public interface EmailSenderService {
    void sendSimpleEmail(String toEmail, String body, String subject);
}
