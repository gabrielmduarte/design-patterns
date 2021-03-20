package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class DiscountToBudgetWithMoreThanFiveItems extends Discount {

    public DiscountToBudgetWithMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(final Budget budget) {
        if (budget.getNumberOfItems() > 5) {
            return budget.getValue().multiply(BigDecimal.valueOf(0.1));
        }

        return getNext().calculate(budget);
    }

}
