package com.tejkiran.taxcalculator.api;

import com.tejkiran.taxcalculator.api.request.TaxRequest;
import com.tejkiran.taxcalculator.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxControllerRest {

    @Autowired
    TaxService taxService;

    @RequestMapping(value="/calculate", method = RequestMethod.POST)
    public String calculate(@RequestBody TaxRequest req) {
        System.out.println("Reached the controller");
        System.out.println(req.getSalary());
        System.out.println(req.getDeductions());
        return taxService.calculateTax();
    }

    @RequestMapping("/health")
    public String health() {
        return "Healthy!";
    }
}
