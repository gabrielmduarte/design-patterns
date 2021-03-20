package com.gabrielduarte.designpatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Budget {

    private BigDecimal value;

}
