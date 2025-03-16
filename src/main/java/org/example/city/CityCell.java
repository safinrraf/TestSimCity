package org.example.city;

import java.math.BigDecimal;

public class CityCell {
    private int criminalRate;
    private int environmentalPollution;
    private BigDecimal propertyValue;
    private Building building;

    public CityCell(int criminalRate, int environmentalPollution, BigDecimal propertyValue, Building building) {
        this.criminalRate = criminalRate;
        this.environmentalPollution = environmentalPollution;
        this.propertyValue = propertyValue;
        this.building = building;
    }

    public int getCriminalRate() {
        return criminalRate;
    }

    public int getEnvironmentalPollution() {
        return environmentalPollution;
    }

    public BigDecimal getPropertyValue() {
        return propertyValue;
    }

    public Building getBuilding() {
        return building;
    }
}
