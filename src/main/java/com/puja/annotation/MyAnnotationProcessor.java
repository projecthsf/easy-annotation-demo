package com.puja.annotation;

import io.github.easyannotation.annotation.Processor;
import io.github.easyannotation.binding.AnnotationFieldProperty;
import io.github.easyannotation.processor.AbstractAnnotationProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collections;

@Processor
@Slf4j
public class MyAnnotationProcessor extends AbstractAnnotationProcessor {
    @Override
    public AnnotationFieldProperty getAnnotationFieldProperty() {
        AnnotationFieldProperty property = new AnnotationFieldProperty();
        property.setField(MyFieldAnnotation.class);
        property.setDependOn(Collections.singletonList(Configuration.class));

        return property;
    }

    @Override
    public <A extends Annotation> void processClass(BeanDefinition beanDefinition, Class<?> clazz, A annotation) {
        String beanName = DefaultBeanNameGenerator.INSTANCE.generateBeanName(beanDefinition, registry);
        registry.registerBeanDefinition(beanName, beanDefinition);
    }

    @Override
    public void processField(Field field, Annotation annotation) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(field.getType());

        String beanName = DefaultBeanNameGenerator.INSTANCE.generateBeanName(beanDefinition, registry);
        registry.registerBeanDefinition(beanName, beanDefinition);
    }
}
