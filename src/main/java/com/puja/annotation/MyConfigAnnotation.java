package com.puja.annotation;

import io.github.easyannotation.annotation.AnnotationConfigurationScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@AnnotationConfigurationScan(processor = MyAnnotationProcessor.class, fieldAnnotation = MyFieldAnnotation.class)
public @interface MyConfigAnnotation {
}
