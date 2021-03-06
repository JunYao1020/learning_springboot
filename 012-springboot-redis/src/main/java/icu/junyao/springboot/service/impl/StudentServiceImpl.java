package icu.junyao.springboot.service.impl;

import icu.junyao.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wu
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String count) {
        return (String) redisTemplate.opsForValue().get(count);
    }
}
