package com.stuhilton.humidity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SensorReadingController {

    @RequestMapping(value = "/readings", method = POST)
    public ResponseEntity addSensorReading(@RequestBody SensorReading reading) {
        return new ResponseEntity(CREATED);
    }
}
