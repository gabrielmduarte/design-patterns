package com.gabrielduarte.designpatterns.domain;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(Budget budget);
}
