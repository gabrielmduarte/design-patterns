package com.gabrielduarte.designpatterns.tests;

import com.gabrielduarte.designpatterns.calculator.TaxCalculator;
import com.gabrielduarte.designpatterns.domain.Budget;
import com.gabrielduarte.designpatterns.domain.ICMS;
import com.gabrielduarte.designpatterns.domain.ISS;

import java.math.BigDecimal;

public class TaxTests {

    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.valueOf(100));
        TaxCalculator calculator = new TaxCalculator();

        BigDecimal icms = calculator.calculate(budget, new ICMS());
        BigDecimal iss = calculator.calculate(budget, new ISS());

        System.out.println("icms: " + icms);
        System.out.println("iss: " + iss);
    }
}
