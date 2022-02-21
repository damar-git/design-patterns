package com.damar.designpatterns.factory;

import com.damar.designpatterns.factory.model.Chair;
import com.damar.designpatterns.factory.model.Furniture;
import com.damar.designpatterns.factory.model.Table;

public class FurnitureFactory {

    private FurnitureFactory() {

    }

    public static Furniture getFurniture(Furniture.Type type,
                                  Furniture.Material material,
                                  String color) {
        if (material == null) throw new RuntimeException("Material should be not null.");
        switch (type) {
            case CHAIR:
                return new Chair(material, color);
            case TABLE:
                return new Table(material, color);
            default:
                throw new RuntimeException(String.format("No forniture available for the given material: %S", material));
        }
    }

}
