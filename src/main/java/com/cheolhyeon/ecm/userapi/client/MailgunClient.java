package com.cheolhyeon.ecm.userapi.client;

import com.cheolhyeon.ecm.userapi.mailgun.SendEmailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {
    @PostMapping(value = "sandboxfed4811c2af14f28b40a20ab29eec237.mailgun.org/messages")
    Response sendEmail(@SpringQueryMap SendEmailForm form);
}
