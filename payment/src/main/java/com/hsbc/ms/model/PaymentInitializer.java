package com.sample.ms.model;

import com.sample.ms.rest.PaymentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class PaymentInitializer /*implements CommandLineRunner*/ {

    private static final Logger log = LoggerFactory.getLogger(com.sample.ms.model.PaymentInitializer.class);

    private final PaymentRepository paymentRepository;

//    @Autowired
    public PaymentInitializer(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

//
//    @Override
//    public void run(String... args) throws Exception {
//        Stream.of("data 1", "data 2", "data 3", "data 4", "data 5")
//                .forEach(email -> paymentRepository.save(new Payment(email)));
//
//        log.info("Registered entities count : " + paymentRepository.count());
//    }
}