package com.stuhilton.humidity;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import static com.stuhilton.humidity.SensorReadingValidator.validate;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Service
public class DefaultSensorReadingService implements SensorReadingService {

    @Override
    public void add(SensorReading sensorReading) {
        if (validate(sensorReading))  {
            System.out.println("Persisting");
        } else {
            throw new HttpClientErrorException(BAD_REQUEST);
        }
    }
}
