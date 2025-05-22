package com.example.server.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtProperties {
    private String secret;
    private long expiration;
}
