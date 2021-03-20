package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal calculate(final Budget budget) {
        return BigDecimal.ZERO;
    }

}
