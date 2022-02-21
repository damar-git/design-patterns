package com.damar.designpatterns.factory.model;

public class Table extends Furniture {
    public Table(Material material, String color) {
        super(material, color);
    }

    public void deliver() {
        System.out.println("Table delivered.");
    }
}
