package com.stuhilton.humidity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SensorReadingController {

    private SensorReadingService sensorReadingService;

    @Autowired
    public SensorReadingController(SensorReadingService sensorReadingService) {
        this.sensorReadingService = sensorReadingService;
    }

    @RequestMapping(value = "/readings", method = POST)
    public ResponseEntity addSensorReading(@RequestBody SensorReading sensorReading) {
        sensorReadingService.add(sensorReading);
        return new ResponseEntity(CREATED);
    }
}
