package com.stuhilton.humidity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SensorReadingController {

    @RequestMapping(value = "/sensorReading", method = POST)
    public SensorReading addSensorReading(@RequestBody SensorReading reading) {
        return new SensorReading(0.00, null);
    }
}
