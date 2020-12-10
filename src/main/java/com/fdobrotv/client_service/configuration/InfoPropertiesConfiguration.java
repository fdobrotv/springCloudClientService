package com.fdobrotv.client_service.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("some")
@Data
@RefreshScope
public class InfoPropertiesConfiguration {
    private String variable;
}