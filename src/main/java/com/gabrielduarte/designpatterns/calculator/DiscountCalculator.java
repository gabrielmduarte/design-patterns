package com.gabrielduarte.designpatterns.calculator;

import com.gabrielduarte.designpatterns.discount.Discount;
import com.gabrielduarte.designpatterns.discount.DiscountToBudgetWithMoreThanFiveItems;
import com.gabrielduarte.designpatterns.discount.DiscountToBudgetWithValueBiggerThanFiveHundred;
import com.gabrielduarte.designpatterns.discount.NoDiscount;
import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        Discount discount = new DiscountToBudgetWithMoreThanFiveItems(
                                    new DiscountToBudgetWithValueBiggerThanFiveHundred(
                                            new NoDiscount()));

        return discount.calculate(budget);
    }

}
