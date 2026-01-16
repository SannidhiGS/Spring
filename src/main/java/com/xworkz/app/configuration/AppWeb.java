package com.xworkz.app.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWeb extends AbstractAnnotationConfigDispatcherServletInitializer {
    public AppWeb(){
        System.out.println("The Web App constructor created");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                AppConfiguration.class
        };
    }
}
