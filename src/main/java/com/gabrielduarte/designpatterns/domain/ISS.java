package com.gabrielduarte.designpatterns.domain;

import java.math.BigDecimal;

public class ISS implements Tax {
    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(BigDecimal.valueOf(0.1));
    }
}
