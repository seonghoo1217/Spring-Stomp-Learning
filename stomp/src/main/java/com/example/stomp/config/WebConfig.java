package com.example.stomp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final String ipAddress="localhost";
    private final String frontEndPort="3000";

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(false)
                .allowedHeaders("Access-Control-Allow-Origin","*")
                .exposedHeaders("Access-Control-Allow-Origin","*")
                .allowedOrigins("http://"+this.ipAddress+":"+this.frontEndPort,"https://cecd-114-205-30-236.ngrok-free.app","http:localhost:8080","*")
                .allowedMethods("OPTIONS","GET","POST","PUT","DELETE");
    }
}
