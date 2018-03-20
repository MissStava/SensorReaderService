package com.stuhilton.humidity;

public class SensorReadingValidator {

    public static void validate(SensorReading sensorReading) {

        if (sensorReading.getReading() < 0.00D)
            throw new InvalidArgumentException("Reading must be 0 or higher");

        if (sensorReading.getType() == null || sensorReading.getType().isEmpty())
            throw new InvalidArgumentException("Type must not be empty");

    }
}
