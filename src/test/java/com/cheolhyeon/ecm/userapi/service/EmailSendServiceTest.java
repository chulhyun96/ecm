package com.cheolhyeon.ecm.userapi.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

class EmailSendServiceTest {

    @Autowired
    EmailSendService emailSendService;
    //이메일 안됨
    @Test
    @DisplayName("send e-mail")
    void doTest() {
        emailSendService.sendEmail();
    }
}