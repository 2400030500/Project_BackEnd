package com.klu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	@Autowired
    private  JavaMailSender mailSender;
    public void sendOtpEmail(String toEmail, String otp) {
    	 SimpleMailMessage message =new SimpleMailMessage();
    	 message.setFrom("yadlapallipavansai@gmail.com");
    	 message.setTo(toEmail);
    	 message.setSubject("Your Otp From Student FeedBack Page");
    	 message.setText(otp);
    	 mailSender.send(message);
    	 System.out.println("email Sent to user Sucessfully");
    }
}