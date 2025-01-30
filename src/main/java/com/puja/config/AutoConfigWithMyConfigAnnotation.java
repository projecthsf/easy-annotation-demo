package com.puja.config;

import com.puja.annotation.MyConfigAnnotation;
import com.puja.annotation.MyFieldAnnotation;
import com.puja.service.TestServiceWithMyConfigAnnotation;

@MyConfigAnnotation
public class AutoConfigWithMyConfigAnnotation {
    @MyFieldAnnotation
    private TestServiceWithMyConfigAnnotation testClass1Service;
}
