package com.stuhilton.humidity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SensorReadingController {

    @RequestMapping(value = "/sensorReading", method = GET)
    public SensorReading addSensorReading(
            @RequestParam(value="reading") double reading,
            @RequestParam(value="type") String type) {
        return new SensorReading(reading, type);
    }
}
