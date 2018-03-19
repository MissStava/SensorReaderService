package com.stuhilton.humidity;

public class SensorReadingValidator {

    public static boolean validate(SensorReading sensorReading) {
        return sensorReading.getReading() >= 0.00 &&
                sensorReading.getType() != null && 
                !sensorReading.getType().isEmpty();
    }
}
