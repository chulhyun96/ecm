package com.cheolhyeon.ecm.service;

import com.cheolhyeon.ecm.domain.SignUpForm;
import com.cheolhyeon.ecm.domain.model.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignUpCustomerServiceTest {

    @Autowired
    private SignUpCustomerService signUpCustomerService;

    @Test
    @DisplayName("회원가입")
    void 회원가입() {
        //given
        SignUpForm form = SignUpForm.builder()
                .name("A")
                .email("google@google.com")
                .birth(LocalDate.now())
                .password("394934")
                .phone("01012345678")
                .build();
        //when
        Customer customer = signUpCustomerService.signUp(form);
        //then
        assertNotNull(customer);
    }
}