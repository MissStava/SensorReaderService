package com.stuhilton.humidity.service;

import com.stuhilton.humidity.entity.SensorReading;
import org.springframework.stereotype.Service;

import static com.stuhilton.humidity.validation.SensorReadingValidator.validate;

@Service
public class DefaultSensorReadingService implements SensorReadingService {

    @Override
    public void add(SensorReading sensorReading) {
        validate(sensorReading);
    }
}
