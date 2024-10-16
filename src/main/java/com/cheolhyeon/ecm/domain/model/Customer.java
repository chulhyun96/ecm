package com.cheolhyeon.ecm.domain.model;

import com.cheolhyeon.ecm.domain.SignUpForm;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EnableJpaAuditing
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;
    private String password;
    private LocalDate birth;
    private String phone;

    private LocalDateTime verifyExpiredAt;
    private String verificationCode;
    private boolean verified;

    public static Customer from(SignUpForm form) {
        return Customer.builder()
                .email(form.getEmail())
                .name(form.getName())
                .password(form.getPassword())
                .birth(form.getBirth())
                .phone(form.getPhone())
                .verified(false)
                .build();
    }
}
