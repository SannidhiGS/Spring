package com.xworkz.app.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

    public AppWeb() {
        System.out.println("The Web App constructor created");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // IMPORTANT
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                AppConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
