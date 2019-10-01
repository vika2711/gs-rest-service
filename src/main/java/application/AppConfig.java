package application;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ConfigurationProperties("application")
//@PropertySource("classpath:documentation.properties")
public class AppConfig  {
    private Long id;
    private String name;
    private String data;

    private String url;
    private Boolean isDemo;
    private Long maintenanceCheckMilliseconds;
}
