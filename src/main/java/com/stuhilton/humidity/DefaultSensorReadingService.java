package com.stuhilton.humidity;

import org.springframework.stereotype.Service;

@Service
public class DefaultSensorReadingService implements SensorReadingService {

    @Override
    public void add(SensorReading sensorReading) {
        System.out.println("You've added a service");
    }
}
