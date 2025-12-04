package com.kele.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class ShitItem extends Item {
    public ShitItem(Settings settings) {
        super(settings
                .maxCount(64)
                .food(ModFoodComponents.shit));
    }
}
