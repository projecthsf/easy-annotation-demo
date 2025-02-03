package com.puja.config;

import com.puja.annotation.MyAnnotationProcessor;
import com.puja.annotation.MyFieldAnnotation;
import com.puja.service.TestServiceWithoutMyConfigAnnotation;
import io.github.easyannotation.annotation.AnnotationConfigurationScan;
import org.springframework.context.annotation.Configuration;

@AnnotationConfigurationScan(processor = MyAnnotationProcessor.class, fieldAnnotation = MyFieldAnnotation.class)
public class AutoConfigWithoutMyConfigAnnotation {
    @MyFieldAnnotation
    private TestServiceWithoutMyConfigAnnotation testClass2Service;
}
