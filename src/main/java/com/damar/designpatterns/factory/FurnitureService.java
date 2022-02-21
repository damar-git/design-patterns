package com.damar.designpatterns.factory;

import com.damar.designpatterns.factory.model.Furniture;

public class FurnitureService {

    public void deliverFurniture(Furniture.Type type,
                                 Furniture.Material material,
                                 String color) {

        Furniture furniture = FurnitureFactory.getFurniture(type, material, color);
        furniture.deliver();
    }
}
