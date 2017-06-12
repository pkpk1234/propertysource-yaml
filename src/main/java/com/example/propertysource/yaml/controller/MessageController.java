package com.example.propertysource.yaml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pkpk1234 on 2017/6/12.
 */

@RestController
public class MessageController {
    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok(message);
    }
}
