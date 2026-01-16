package com.xworkz.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.util.Properties;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.xworkz.app")
public class AppConfiguration implements WebMvcConfigurer {
    public AppConfiguration() {
        System.out.println("The App Configuration method is initiated");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("/images/");
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/xworkz");
        dataSource.setUsername("root");
        dataSource.setPassword("Sannidhi@123");
        return dataSource;
    }

    @Bean
    public Properties getJpaProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean getEntityManagerData() {
        LocalContainerEntityManagerFactoryBean lbf = new LocalContainerEntityManagerFactoryBean();
        lbf.setDataSource(getDataSource());
        lbf.setPackagesToScan("com.xworkz.app.entity");
        lbf.setJpaProperties(getJpaProperties());
        lbf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return lbf;
    }
}
