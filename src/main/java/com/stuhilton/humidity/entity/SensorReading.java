package com.stuhilton.humidity.entity;

public class SensorReading {

    private final double reading;
    private final String type;

    public SensorReading(double reading, String type) {
        this.reading = reading;
        this.type = type;
    }

    public double getReading() {
        return reading;
    }

    public String getType() {
        return type;
    }
}
