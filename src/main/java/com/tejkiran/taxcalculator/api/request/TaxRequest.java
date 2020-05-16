package com.tejkiran.taxcalculator.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaxRequest {

    public int salary;
    public int deductions;
}
