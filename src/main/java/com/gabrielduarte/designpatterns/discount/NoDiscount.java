package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal doesCalculation(final Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean shouldCalculate(Budget budget) {
        return true;
    }

}
