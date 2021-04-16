package com.example.gymcenter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.example.gymcenter"})
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/static/fonts/");
//        admin
        registry.addResourceHandler("/ajaxadmin/**").addResourceLocations("classpath:/static/ajaxadmin/");
        registry.addResourceHandler("/jsadmin/**").addResourceLocations("classpath:/static/jsadmin/");
        registry.addResourceHandler("/stylesheetsadmin/**").addResourceLocations("classpath:/static/stylesheetsadmin/");
        registry.addResourceHandler("/vendoradmin/**").addResourceLocations("classpath:/static/vendoradmin/");
    }
}
