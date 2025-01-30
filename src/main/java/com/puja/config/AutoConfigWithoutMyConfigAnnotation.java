package com.puja.config;

import com.puja.annotation.MyFieldAnnotation;
import com.puja.service.TestServiceWithoutMyConfigAnnotation;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigWithoutMyConfigAnnotation {
    @MyFieldAnnotation
    private TestServiceWithoutMyConfigAnnotation testClass2Service;
}
