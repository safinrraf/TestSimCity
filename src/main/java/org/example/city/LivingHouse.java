package org.example.city;

import java.math.BigDecimal;

public class LivingHouse extends Building {

    private final BuildingType buildingType = BuildingType.WOHNEN;
    private final String emoji = "H";

    private BigDecimal price;
    private CityCell cityCell;

    public LivingHouse(BigDecimal price, CityCell cityCell) {
        this.price = price;
        this.cityCell = cityCell;
    }

    @Override
    BuildingType getType() {
        return buildingType;
    }

    @Override
    BigDecimal getPrice() {
        return price;
    }

    @Override
    void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    CityCell getCityCell() {
        return cityCell;
    }

    @Override
    String getEmoji() {
        return emoji;
    }
}
