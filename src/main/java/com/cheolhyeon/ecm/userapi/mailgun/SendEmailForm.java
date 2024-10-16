package com.cheolhyeon.ecm.userapi.mailgun;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SendEmailForm {
    private String from;
    private String to;
    private String subject;
    private String text;

}
