package com.sample.ms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Payment {

//    @Id
//    @GeneratedValue
    private Long id;

    private String stream;

    public Payment(String stream) {
        this.stream = stream;
    }

}


