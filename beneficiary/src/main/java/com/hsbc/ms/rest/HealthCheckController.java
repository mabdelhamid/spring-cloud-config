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
public class HealthCheckController {

    @Value("${beneficiary.label:ConfigServerError}")
    private String serviceName;

    @Value("${beneficiary.version:ConfigServerError}")
    private String serviceVersion;


    @RequestMapping("/check")
    public ResponseEntity<String> check() {
        StringBuilder sb = new StringBuilder("Label : ")
                .append(serviceName)
                .append(" - Version : ")
                .append(serviceVersion);

        return ResponseEntity.ok(sb.toString());
    }
}
