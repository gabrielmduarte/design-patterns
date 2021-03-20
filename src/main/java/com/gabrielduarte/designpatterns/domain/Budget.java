package com.gabrielduarte.designpatterns.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Budget {

    private BigDecimal value;

    private int numberOfItems;

}
