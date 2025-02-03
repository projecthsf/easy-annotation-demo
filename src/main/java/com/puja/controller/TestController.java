package com.puja.controller;

import com.puja.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestServiceWithMyClassAnnotation testServiceWithMyClassAnnotation;
    private final TestServiceWithoutMyClassAnnotation testServiceWithoutMyClassAnnotation;

    private final TestServiceWithMyConfigAnnotation testServiceWithMyConfigAnnotation;
    private final TestServiceWithoutMyConfigAnnotation testServiceWithoutMyConfigAnnotation;
    private final TestServiceWithOriginalSpringConfiguration testServiceWithOriginalSpringConfiguration;

    @GetMapping("/test-1")
    public String testServiceWithMyClassAnnotation() {
        return testServiceWithMyClassAnnotation.getString();
    }

    @GetMapping("/test-2")
    public String testServiceWithoutMyClassAnnotation() {
        return testServiceWithoutMyClassAnnotation.getString();
    }

    @GetMapping("/test-3")
    public String testServiceWithMyConfigAnnotation() {
        return testServiceWithMyConfigAnnotation.getString();
    }

    @GetMapping("/test-4")
    public String testServiceWithOriginalSpringConfiguration() {
        return testServiceWithoutMyConfigAnnotation.getString();
    }

    @GetMapping("/test-5")
    public String testServiceWithoutMyConfigAnnotation() {
        return testServiceWithOriginalSpringConfiguration.getString();
    }
}
