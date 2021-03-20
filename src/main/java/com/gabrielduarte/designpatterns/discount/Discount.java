package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class Discount {

    private Discount next;

    public BigDecimal calculate(final Budget budget) {
        if (shouldCalculate(budget)) {
            return doesCalculation(budget);
        }
        return getNext().calculate(budget);
    }

    protected abstract BigDecimal doesCalculation(final Budget budget);
    protected abstract boolean shouldCalculate(final Budget budget);

}
