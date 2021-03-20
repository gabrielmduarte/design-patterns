package com.gabrielduarte.designpatterns.calculator;

import com.gabrielduarte.designpatterns.domain.Budget;
import com.gabrielduarte.designpatterns.domain.Tax;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(final Budget budget, final Tax tax) {
        return tax.calculate(budget);
    }

}
