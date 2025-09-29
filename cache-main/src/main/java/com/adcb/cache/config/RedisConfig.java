package com.adcb.cache.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
public class RedisConfig {

    @Value("${spring.data.redis.host}")
    private String redisHost;

    @Value("${spring.data.redis.port}")
    private String redisPort;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
    System.out.println("Redis host "+redisHost+" Redis port "+redisPort);
    RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration(redisHost, Integer.parseInt(redisPort));
    org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration clientConfig = org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration.builder()
        .useSsl()
        .disablePeerVerification()
        .build();
    return new LettuceConnectionFactory(redisConfig, clientConfig);
    }

    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory factory) {
        return new StringRedisTemplate(factory);
    }
}
