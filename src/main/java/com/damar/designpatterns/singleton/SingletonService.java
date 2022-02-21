package com.damar.designpatterns.singleton;

public class SingletonService {

    public SingletonObject getSingletonObject(String value) {
        return SingletonObject.getInstance(value);
    }
}
