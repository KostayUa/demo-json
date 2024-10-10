package org.example.demo.json.model;

public class Quantity {
    private int value;
    public String unit;

    public Quantity() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
