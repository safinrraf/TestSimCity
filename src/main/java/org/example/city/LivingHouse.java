package org.example.city;

import java.math.BigDecimal;

public class LivingHouse extends Building {

    public LivingHouse(BigDecimal price) {
        super(BuildingType.WOHNEN, "LH", price);
    }

}
