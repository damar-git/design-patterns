package com.damar.designpatterns.factory.model;

public abstract class Furniture {

    private String color;

    private Material material;

    public abstract void deliver();

    public Furniture(Material material, String color) {
        this.color = color;
        this.material = material;
    }

    public enum Material {
        WOODEN,
        STEEL
    }

    public enum Type {
        CHAIR,
        TABLE
    }

}
