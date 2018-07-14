package com.guppy.api.config.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.HttpClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;


/**
 * Created by guppy.kang on 2018. 7. 14.
 * email : guppy.kang@kakaocorp.com
 */

@Getter
@RequiredArgsConstructor
@Configuration
@EnableConfigurationProperties(RestConfigProperties.class)
public class RestConfig {

    private final RestConfigProperties properties;

    /**
     * Custom MappingJackson2HttpMessageConverter
     * : Rest 응답시 커스터마이징한 ObjectMapper 로 동작하도록 커스터마이징
     * @param objectMapper
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(ObjectMapper objectMapper) {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();

        jsonConverter.setObjectMapper(objectMapper);

        return jsonConverter;
    }

    @Bean
    public CloseableHttpClient httpClient() {
        return HttpClientBuilder
                .create()
                .setMaxConnTotal(properties.getMaxConnectionPool())
                .setMaxConnPerRoute(properties.getMaxConnectionPerRoute())
                .build();
    }

    @Bean
    public RestTemplate restTemplate(HttpClient httpClient,
                                     MappingJackson2HttpMessageConverter jackson2HttpMessageConverter) {

        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(properties.getConnectionTimeOut());
        factory.setReadTimeout(properties.getReadTimeOut());
        factory.setHttpClient(httpClient);


        RestTemplate restTemplate = new RestTemplate(factory);
        restTemplate.getMessageConverters()
                .removeIf(converter -> (converter instanceof MappingJackson2HttpMessageConverter));
        restTemplate.getMessageConverters().add(jackson2HttpMessageConverter);

        return restTemplate;
    }

}
