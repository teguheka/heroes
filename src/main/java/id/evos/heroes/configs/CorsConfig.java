/**
 * DANA.id
 * Copyright (c) 2004‐2021 All Rights Reserved.
 */
package id.evos.heroes.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Teguh Eka Putra
 * @version $Id: CorsConfig.java, v 0.1 2021‐03‐15 09.39 Teguh Eka Putra Exp $$
 */
@Configuration
public class CorsConfig {

    @Value("#{'${cors.allowed.origins}'.split(',')}")
    private String[] allowedCorsOrigins;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins(allowedCorsOrigins);
            }
        };
    }

}
