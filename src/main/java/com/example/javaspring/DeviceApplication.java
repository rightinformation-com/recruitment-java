package com.example.javaspring;

import com.example.javaspring.persistence.Device;
import com.example.javaspring.persistence.DeviceRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DeviceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DeviceApplication.class, args);

        DeviceRepository deviceRepository = context.getBean(DeviceRepository.class);
        deviceRepository.save(new Device("pump-001", "mmm11", "Ania"));
        deviceRepository.save(new Device("compressor-101", "AA", "Kuba"));
        deviceRepository.save(new Device("other", "xxx", "Maciek"));
    }

}
