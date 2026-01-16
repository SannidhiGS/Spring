package com.xworkz.app.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Constructor (optional, just for logging)
    public AppWeb() {
        System.out.println("The Web App constructor created");
    }

    /**
     * Root application context.
     * Typically contains beans for services, repositories, mail, database, security, etc.
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                AppConfiguration.class,  // Your main app config (services, beans, datasource)
                MailConfig.class         // JavaMail configuration
        };
    }

    /**
     * Servlet application context.
     * Typically contains web-specific beans like controllers, view resolvers, handler mappings.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                AppConfiguration.class       // Spring MVC config (controllers, view resolver, resource handlers)
        };
    }

    /**
     * Maps DispatcherServlet to "/" to handle all requests.
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };
    }
}
