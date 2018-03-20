package com.stuhilton.humidity.controller;

import com.stuhilton.humidity.entity.SensorReading;
import com.stuhilton.humidity.service.SensorReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
    @ResponseStatus(code = CREATED)
    public void addSensorReading(@RequestBody SensorReading sensorReading) {
        sensorReadingService.add(sensorReading);
    }
}
