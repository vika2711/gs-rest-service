package application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("app.api.swagger")
public class SwaggerConfiguration {
    private String basePackage;

}
