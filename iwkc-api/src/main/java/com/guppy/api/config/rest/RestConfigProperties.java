package com.guppy.api.config.rest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by guppy.kang on 2018. 7. 14.
 * email : guppy.kang@kakaocorp.com
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "iwkc.rest.config")
public class RestConfigProperties {

    private int readTimeOut = 2000;

    private int connectionTimeOut = 2000;

    private int maxConnectionPerRoute = 2;

    private int maxConnectionPool = 20;
}
