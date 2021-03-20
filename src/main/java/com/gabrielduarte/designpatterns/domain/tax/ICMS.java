package com.gabrielduarte.designpatterns.domain.tax;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(BigDecimal.valueOf(0.5));
    }
}
