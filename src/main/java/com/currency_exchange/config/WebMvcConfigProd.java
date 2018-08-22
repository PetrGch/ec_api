package com.currency_exchange.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by petr on 02.06.18.
 */

@Configuration
@Profile("prod")
public class WebMvcConfigProd implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("http://excurrate.com:3000")
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowCredentials(true).maxAge(3600);
  }

}
