package org.example.city;

import java.math.BigDecimal;

public abstract class Building {

    abstract BuildingType getType();

    abstract BigDecimal getPrice();

    abstract void setPrice(BigDecimal price);

    abstract CityCell getCityCell();

    abstract String getEmoji();
}
