package com.kele.datagen;

import com.kele.block.ModBlocks;
import com.kele.item.ModItemGroups;
import com.kele.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.GOLD_STAIRS, "金楼梯");
        translationBuilder.add(ModBlocks.GOLD_SLAB, "金台阶");
        translationBuilder.add(ModBlocks.GOLD_BUTTON, "金按钮");
        translationBuilder.add(ModBlocks.GOLD_FENCE, "金栅栏");
        translationBuilder.add(ModBlocks.GOLD_FENCE_GATE, "金栅栏门");
        translationBuilder.add(ModBlocks.GOLD_WALL, "金墙");
        translationBuilder.add(ModBlocks.GOLD_DOOR, "金门");
        translationBuilder.add(ModBlocks.GOLD_TRAPDOOR, "金活板门");

        translationBuilder.add(ModBlocks.IRON_STAIRS, "铁楼梯");
        translationBuilder.add(ModBlocks.IRON_SLAB, "铁台阶");
        translationBuilder.add(ModBlocks.IRON_BUTTON, "铁按钮");
        translationBuilder.add(ModBlocks.IRON_FENCE, "铁栅栏");
        translationBuilder.add(ModBlocks.IRON_FENCE_GATE, "铁栅栏门");
        translationBuilder.add(ModBlocks.IRON_WALL, "铁墙");

        translationBuilder.add(ModItems.shit, "狗屎");

        translationBuilder.add(ModBlocks.DIAMOND_STAIR, "钻石楼梯");
        translationBuilder.add(ModBlocks.DIAMOND_SLAB, "钻石台阶");
        translationBuilder.add(ModBlocks.DIAMOND_BUTTON, "钻石按钮");
        translationBuilder.add(ModBlocks.DIAMOND_PRESSURE_PLATE, "钻石压力板");
        translationBuilder.add(ModBlocks.DIAMOND_FENCE, "钻石栅栏");
        translationBuilder.add(ModBlocks.DIAMOND_FENCE_GATE, "钻石栅栏门");
        translationBuilder.add(ModBlocks.DIAMOND_WALL, "钻石墙");
        translationBuilder.add(ModBlocks.DIDAMOND_DOOR, "钻石门");
        translationBuilder.add(ModBlocks.DIDAMOND_TRAPDOOR, "钻石活板门");

        translationBuilder.add(ModItems.blue_apple, "蓝苹果");
        translationBuilder.add(ModItems.green_apple, "绿苹果");
        translationBuilder.add(ModItems.red_apple, "红苹果");
        translationBuilder.add(ModItems.water_cup, "玻璃杯");
        translationBuilder.add(ModItems.filled_water_cup, "装水的玻璃杯");

        translationBuilder.add(ModBlocks.BLUE_APPLE_BLOCK, "蓝苹果块");
        translationBuilder.add(ModBlocks.GREEN_APPLE_BLOCK, "绿苹果块");
        translationBuilder.add(ModBlocks.RED_APPLE_BLOCK, "红苹果块");
//
        translationBuilder.add(ModItemGroups.MOD_GROUP, "模组物品");
    }
}
