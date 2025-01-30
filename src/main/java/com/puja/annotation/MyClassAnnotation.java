package com.puja.annotation;

import io.github.easyannotation.annotation.AnnotationScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@AnnotationScan(processor = MyAnnotationProcessor.class)
public @interface MyClassAnnotation {
}
