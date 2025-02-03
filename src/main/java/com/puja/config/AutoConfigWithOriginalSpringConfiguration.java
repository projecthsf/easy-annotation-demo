package com.puja.config;

import com.puja.annotation.MyFieldAnnotation;
import com.puja.service.TestServiceWithOriginalSpringConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigWithOriginalSpringConfiguration {
    @MyFieldAnnotation
    private TestServiceWithOriginalSpringConfiguration testServiceWithOriginalSpringConfiguration;
}
