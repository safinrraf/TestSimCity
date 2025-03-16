package org.example.city;

import java.math.BigDecimal;

public abstract class Building {

    protected final BuildingType buildingType;
    protected final String emoji;
    protected BigDecimal price;

    protected Building(BuildingType buildingType, String emoji, BigDecimal price) {
        this.buildingType = buildingType;
        this.emoji = emoji;
        this.price = price;
    }

    protected BuildingType getType() {
        return this.buildingType;
    }

    protected BigDecimal getPrice(){
        return this.price;
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getEmoji() {
        return this.emoji;
    }
}
