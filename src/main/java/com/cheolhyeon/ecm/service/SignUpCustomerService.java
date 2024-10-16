package com.cheolhyeon.ecm.service;

import com.cheolhyeon.ecm.domain.SignUpForm;
import com.cheolhyeon.ecm.domain.model.Customer;
import com.cheolhyeon.ecm.repository.SignUpRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class SignUpCustomerService {
    private final SignUpRepository signUpRepository;

    @Transactional
    public Customer signUp(SignUpForm form) {
        return signUpRepository.save(Customer.from(form));
    }
}
