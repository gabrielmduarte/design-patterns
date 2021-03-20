package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithValueBiggerThanFiveHundred extends Discount {

    public DiscountToBudgetWithValueBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calculate(final Budget budget) {
        if (budget.getValue().compareTo(BigDecimal.valueOf(500)) > 0) {
            return budget.getValue().multiply(BigDecimal.valueOf(0.05));
        }

        return getNext().calculate(budget);
    }

}
