package com.gabrielduarte.designpatterns.discount;

import com.gabrielduarte.designpatterns.domain.Budget;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public abstract class Discount {

    private Discount next;

    public abstract BigDecimal calculate(Budget budget);

}
