package com.kele.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents{
    public static final FoodComponent filled_water_cup = new FoodComponent.Builder().hunger(1).saturationModifier(0.5f).build();
    public static final FoodComponent shit = new FoodComponent.Builder()
            .hunger(1)
            .saturationModifier(1)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,  15 * 20, 0), 1.0F)// 反胃 15 秒                                                      // 100% 触发
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), 1.0F)// 瞬间伤害 I
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 10 * 20, 0), 1.0F)// 中毒 10 秒
            .build();
    public ModFoodComponents(){}
}
