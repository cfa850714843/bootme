package com.phigey.bootme.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author lizf
 */
@Component
@PropertySource(value = "classpath:application.yaml")
@ConfigurationProperties(prefix = "socket.io")
@Data
@Getter
public class SocketIoConfig {
    private String host;
    private Integer port;
}
