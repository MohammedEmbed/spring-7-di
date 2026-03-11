package com.momed.spring7di.services;

import com.momed.spring7di.controllers.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    public LifeCycleDemoBean(){
        System.out.println("## I'm a LifeCycleBean Constructor Banana!! ##");
    }

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer){
        this.javaVer = javaVer;
        System.out.println("## 1 Properties Set. Java Version: "+this.javaVer);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 BeanNameAware. My Bean Name is: "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("## 3 BeanFactoryAware. Bean Factory has been set. ##");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContextAware. Application Context has been set. ##");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 5 PostConstruct. The @PostConstruct annotated method has been called. ##");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 AfterPropertiesSet Populate Properties. The LifeCycleBean has its properties.##");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## 7 PreDestroy. The @PreDestroy annotated method has been called. ##");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 DisposableBean.destroy. The LifeCycleBean has been terminated. ##");
    }

    @Override
    public @Nullable Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## postProcessBeforeInitialization of: "+beanName);

        if(bean instanceof MyController myController){
            myController.beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public @Nullable Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## postProcessAfterInitialization of: "+beanName);

        if(bean instanceof MyController myController){
            myController.afterInit();
        }

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

}
