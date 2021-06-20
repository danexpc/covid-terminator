package com.selfstudy.services;

import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
    private static final ObjectFactory instance = new ObjectFactory();
    private Config config;

    private ObjectFactory() {
        config = new JavaConfig("com.selfstudy", new HashMap<>(Map.of(Policeman.class, AngryPoliceman.class)));
    }

    public static ObjectFactory getInstance() {
        return instance;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (implClass.isInterface()) {
            implClass = config.getImplClass(type);
        }

        return implClass.getDeclaredConstructor().newInstance();
    }
}
