package com.devops.java_devops_cicd;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "application", "Java DevOps CI/CD"
        );
    }

    @GetMapping("/api/info")
    public Map<String, String> info() {
        return Map.of(
            "application", "Java DevOps CI/CD",
            "version", "1.0.0",
            "environment", "development"
        );
    }
}