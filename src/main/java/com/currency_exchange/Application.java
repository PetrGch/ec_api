package com.currency_exchange;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.Properties;
import java.util.TimeZone;

/**
 * Created by petr on 02.06.18.
 */

@SpringBootApplication
@EntityScan(basePackageClasses = {
    Application.class,
    Jsr310JpaConverters.class
})
public class Application extends SpringBootServletInitializer {

  @PostConstruct
  void init() {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
  }

  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class)
        .sources(Application.class)
        .properties(getProperties())
        .run(args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
    return springApplicationBuilder
        .sources(Application.class)
        .properties(getProperties());
  }

  static Properties getProperties() {
    Properties props = new Properties();
    props.put("spring.config.location", "classpath:properties/");
    return props;
  }

}
