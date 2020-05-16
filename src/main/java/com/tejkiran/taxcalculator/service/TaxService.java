package com.tejkiran.taxcalculator.service;

import org.springframework.stereotype.Component;

@Component
public class TaxService {

    public String calculateTax() {
        System.out.println("Caught at Service");
        return "0";
    }
}
