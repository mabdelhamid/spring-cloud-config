package com.sample.ms.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
public class CheckController {

    @Value("${payment.label:ConfigServerError}")
    private String serviceName;

    @Value("${payment.version:ConfigServerError}")
    private String serviceVersion;

    @Value("${dpy.message:ConfigServerError}")
    private String message;

    @Value("${payment.user:ConfigServerError}")
    private String user;

    @Value("${payment.password:ConfigServerError}")
    private String password;


    @RequestMapping("${dpy.check.route:/check}")
    public ResponseEntity<String> check() {
        StringBuilder sb = new StringBuilder("Label : ")
                .append(serviceName)
                .append(" - Version : ")
                .append(serviceVersion)
                .append("<br />Welcome Message : ").append(message)
                .append("<br />OPS credentials " + user + "/" + password);

        return ResponseEntity.ok(sb.toString());
    }
}
