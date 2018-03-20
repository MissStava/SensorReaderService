package com.stuhilton.humidity;

import org.springframework.stereotype.Service;

import static com.stuhilton.humidity.SensorReadingValidator.validate;

@Service
public class DefaultSensorReadingService implements SensorReadingService {

    @Override
    public void add(SensorReading sensorReading) {
        validate(sensorReading);
        System.out.println("Persisting");
    }
}
