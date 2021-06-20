package com.selfstudy.services;

import lombok.SneakyThrows;

public class ObjectFactory {
    private static final ObjectFactory instance = new ObjectFactory();
    private Config config = new JavaConfig("com.selfstudy");

    private ObjectFactory() {}

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
