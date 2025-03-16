package org.example.city;

import java.math.BigDecimal;

public class Hospital extends Building {


    public Hospital(BigDecimal price) {
        super(BuildingType.SPITAL, "H", price);
    }

}
