package com.deepster.springcloud.config.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("app")
public class AppProperties {
    private DisplayConfig displayConfig = new DisplayConfig();
    @Setter
    @Getter
    public static class DisplayConfig {
        private String welcomeMessage;
    }
}
