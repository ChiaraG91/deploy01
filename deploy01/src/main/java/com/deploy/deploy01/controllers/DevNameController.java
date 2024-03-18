package com.deploy.deploy01.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev-name")
public class DevNameController {

    @GetMapping
    public ResponseEntity<String> getDevNam() {
        String devName = "Chiara";
        return ResponseEntity.ok("DevName: " + devName);
    }
}
