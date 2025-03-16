package org.example.city;

import java.math.BigDecimal;

public class EmptyPlace extends Building {
    public EmptyPlace() {
        super(BuildingType.EMPTY, "*", BigDecimal.ZERO);
    }
}
