package com.dogpalse.demo.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
            .title("DEMO")
            .version("1.0.0")
            .description("Demo Application");
        
        return new OpenAPI()
            .components(new Components())
            .info(info);
    }
}
