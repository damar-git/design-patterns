package com.damar.designpatterns.singleton;

public class SingletonObject {

    private static SingletonObject instance;

    private String value;

    private SingletonObject(String value) {
        this.value = value;
    }

    public static SingletonObject getInstance(String value) {
        if (instance == null)
            return new SingletonObject(value);
        else
            return instance;
    }

}
