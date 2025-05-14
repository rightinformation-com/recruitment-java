package com.example.javaspring.controller;

import com.example.javaspring.persistence.Device;
import com.example.javaspring.persistence.DeviceRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceRepository deviceRepository;

    public DeviceController(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    @GetMapping
    public List<Device> getDevices(@RequestParam String username) {
        boolean isAdmin = isAdmin(username);

        if (isAdmin) {
            return deviceRepository.findAll().stream().toList();
        } else {
            return deviceRepository.findByUsername(username).stream().toList();
        }
    }

    private boolean isAdmin(String username) {
        return username.equals("admin");
    }
}
