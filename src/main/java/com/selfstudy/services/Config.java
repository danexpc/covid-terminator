package com.selfstudy.services;

public interface Config {
    <T> Class <? extends T> getImplClass(Class<T> ifc);
}
