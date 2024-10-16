package com.cheolhyeon.ecm.userapi.service;

import com.cheolhyeon.ecm.userapi.client.MailgunClient;
import com.cheolhyeon.ecm.userapi.mailgun.SendEmailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public Response sendEmail() {
        return mailgunClient.sendEmail(SendEmailForm.builder()
                .from("dmddkalsi@my.com")
                .to("tghy4@naver.com")
                .subject("Test email")
                .text("my text")
                .build());
    }
}
