package com.puja.service;

import com.puja.annotation.MyClassAnnotation;

@MyClassAnnotation
public class TestServiceWithMyClassAnnotation {
    public String getString() {
        return TestServiceWithMyClassAnnotation.class.getName();
    }
}
