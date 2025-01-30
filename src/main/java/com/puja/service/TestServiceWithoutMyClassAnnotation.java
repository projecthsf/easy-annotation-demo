package com.puja.service;

import com.puja.annotation.MyAnnotationProcessor;
import io.github.easyannotation.annotation.AnnotationScan;

@AnnotationScan(processor = MyAnnotationProcessor.class)
public class TestServiceWithoutMyClassAnnotation {
    public String getString() {
        return TestServiceWithoutMyClassAnnotation.class.getName();
    }
}
