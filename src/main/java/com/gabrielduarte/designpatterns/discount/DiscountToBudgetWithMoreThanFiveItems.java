package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithMoreThanFiveItems extends Discount {

    public DiscountToBudgetWithMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal doesCalculation(final Budget budget) {
        return budget.getValue().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean shouldCalculate(Budget budget) {
        return budget.getNumberOfItems() > 5;
    }

}
