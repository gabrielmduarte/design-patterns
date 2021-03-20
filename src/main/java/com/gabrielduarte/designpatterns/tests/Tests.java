package com.gabrielduarte.designpatterns.tests;

import com.gabrielduarte.designpatterns.calculator.DiscountCalculator;
import com.gabrielduarte.designpatterns.calculator.TaxCalculator;
import com.gabrielduarte.designpatterns.domain.Budget;
import com.gabrielduarte.designpatterns.domain.tax.ICMS;
import com.gabrielduarte.designpatterns.domain.tax.ISS;

import java.math.BigDecimal;

public class Tests {

    public static void main(String[] args) {
        testStrategyPattern();
        System.out.println("-----------");
        testChainPattern();
    }

    private static void testStrategyPattern() {
        Budget budget = new Budget();
        budget.setValue(BigDecimal.valueOf(100));
        TaxCalculator calculator = new TaxCalculator();

        BigDecimal icms = calculator.calculate(budget, new ICMS());
        BigDecimal iss = calculator.calculate(budget, new ISS());

        System.out.println("icms: " + icms);
        System.out.println("iss: " + iss);
    }

    private static void testChainPattern() {
        Budget budgetSixItems = new Budget();
        budgetSixItems.setValue(BigDecimal.valueOf(100));
        budgetSixItems.setNumberOfItems(6);

        Budget budgetOneItemThousandReais = new Budget();
        budgetOneItemThousandReais.setValue(BigDecimal.valueOf(1000));
        budgetOneItemThousandReais.setNumberOfItems(1);

        Budget budgetNoDiscount = new Budget();
        budgetNoDiscount.setValue(BigDecimal.valueOf(400));
        budgetNoDiscount.setNumberOfItems(4);

        DiscountCalculator discountCalculator = new DiscountCalculator();
        BigDecimal sixItemsDiscount = discountCalculator.calculate(budgetSixItems);
        BigDecimal thousandReaisDiscount = discountCalculator.calculate(budgetOneItemThousandReais);
        BigDecimal noDiscount = discountCalculator.calculate(budgetNoDiscount);


        System.out.println("value of discount for budgetSixItems= " + sixItemsDiscount);
        System.out.println("value of discount for budgetOneItemThousandReais= " + thousandReaisDiscount);
        System.out.println("value of discount for budgetNoDiscount= " + noDiscount);
    }

}
