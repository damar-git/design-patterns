package com.damar.designpatterns.factory.model;

public class Chair extends Furniture {
    public Chair(Material material, String color) {
        super(material, color);
    }

    public void deliver() {
        System.out.println("Chair delivered.");
    }
}
