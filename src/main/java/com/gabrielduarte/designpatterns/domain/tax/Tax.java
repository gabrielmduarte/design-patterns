package com.gabrielduarte.designpatterns.domain.tax;

import com.gabrielduarte.designpatterns.domain.Budget;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(Budget budget);
}
