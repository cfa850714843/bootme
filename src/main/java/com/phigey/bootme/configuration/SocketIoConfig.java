package com.phigey.bootme.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author lizf
 */
@Component
@PropertySource(value = "classpath:application.yaml")
@ConfigurationProperties(prefix = "socket.io")
public class SocketIoConfig {
    private String host;
    private Integer port;

    public SocketIoConfig() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
