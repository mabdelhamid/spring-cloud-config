package com.sample.ms.model;

import com.sample.ms.rest.BeneficiaryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class BeneficiaryInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(BeneficiaryInitializer.class);

    private final BeneficiaryRepository beneficiaryRepository;

    @Autowired
    public BeneficiaryInitializer(BeneficiaryRepository beneficiaryRepository) {
        this.beneficiaryRepository = beneficiaryRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Stream.of("data 1", "data 2", "data 3", "data 4", "data 5")
                .forEach(email -> beneficiaryRepository.save(new Beneficiary(email)));

        log.info("Registered entities count : " + beneficiaryRepository.count());
    }
}