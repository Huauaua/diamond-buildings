package com.kele.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class FilledWaterCupItem extends Item {
    public FilledWaterCupItem(Settings settings) {
        super(settings
                .maxCount(1)
                .food(new FoodComponent.Builder()
                .alwaysEdible()          // 允许随时喝
                .snack()                 // 不显示饥饿图标
                .build()));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient && user instanceof PlayerEntity p) {
            // 恢复 1 点饥饿 + 1.2 饱和度（可自行调整）
            p.getHungerManager().add(1, 1.2F);
        }
        // 喝完返还空杯
        return new ItemStack(ModItems.water_cup, 1);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 24; // 1.6 秒
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK; // 显示喝水动画
    }

    @Override
    public SoundEvent getDrinkSound() {
        return super.getDrinkSound();
    }
}