package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithValueBiggerThanFiveHundred extends Discount {

    public DiscountToBudgetWithValueBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal doesCalculation(final Budget budget) {
        return budget.getValue().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public boolean shouldCalculate(Budget budget) {
        return budget.getValue().compareTo(BigDecimal.valueOf(500)) > 0;
    }

}
