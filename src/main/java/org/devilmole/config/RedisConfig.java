package org.devilmole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
@Configuration
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

//    @Bean
//    public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, User> templates = new RedisTemplate<String, User>();
//        templates.setConnectionFactory(jedisConnectionFactory());
//        templates.setKeySerializer(new StringRedisSerializer());
//        templates.setValueSerializer(new RedisObjectSerializer());
//        return templates;
//    }

}