package com.kele.datagen;

import com.kele.block.ModBlocks;
import com.kele.item.ModItemGroups;
import com.kele.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.GOLD_STAIRS, "Gold Stairs");
        translationBuilder.add(ModBlocks.GOLD_SLAB, "Gold Slab");
        translationBuilder.add(ModBlocks.GOLD_BUTTON, "Gold Button");
        translationBuilder.add(ModBlocks.GOLD_FENCE, "Gold Fence");
        translationBuilder.add(ModBlocks.GOLD_FENCE_GATE, "Gold Fence Gate");
        translationBuilder.add(ModBlocks.GOLD_WALL, "Gold Wall");
        translationBuilder.add(ModBlocks.GOLD_DOOR, "Gold Door");
        translationBuilder.add(ModBlocks.GOLD_TRAPDOOR, "Gold Trapdoor");

        translationBuilder.add(ModBlocks.IRON_STAIRS, "Iron Stairs");
        translationBuilder.add(ModBlocks.IRON_SLAB, "Iron Slab");
        translationBuilder.add(ModBlocks.IRON_BUTTON, "Iron Button");
        translationBuilder.add(ModBlocks.IRON_FENCE, "Iron Fence");
        translationBuilder.add(ModBlocks.IRON_FENCE_GATE, "Iron Fence Gate");
        translationBuilder.add(ModBlocks.IRON_WALL, "Iron Wall");

        translationBuilder.add(ModItems.shit, "Shit");

        translationBuilder.add(ModBlocks.DIAMOND_STAIR, "Diamond Stair");
        translationBuilder.add(ModBlocks.DIAMOND_SLAB, "Diamond Slab");
        translationBuilder.add(ModBlocks.DIAMOND_BUTTON, "Diamond Button");
        translationBuilder.add(ModBlocks.DIAMOND_PRESSURE_PLATE, "Diamond Pressure Plate");
        translationBuilder.add(ModBlocks.DIAMOND_FENCE, "Diamond Fence");
        translationBuilder.add(ModBlocks.DIAMOND_FENCE_GATE, "Diamond Fence Gate");
        translationBuilder.add(ModBlocks.DIAMOND_WALL, "Diamond Wall");
        translationBuilder.add(ModBlocks.DIDAMOND_DOOR, "Diamond Door");
        translationBuilder.add(ModBlocks.DIDAMOND_TRAPDOOR, "Diamond Trapdoor");

        translationBuilder.add(ModItems.water_cup, "Water Cup");
        translationBuilder.add(ModItems.filled_water_cup, "Filled Water Cup");

        translationBuilder.add(ModBlocks.BLUE_APPLE_BLOCK, "Blue Apple Block");
        translationBuilder.add(ModBlocks.GREEN_APPLE_BLOCK, "Green Apple Block");
        translationBuilder.add(ModBlocks.RED_APPLE_BLOCK, "Red Apple Block");

        translationBuilder.add(ModItems.blue_apple, "Blue Apple");
        translationBuilder.add(ModItems.green_apple, "Green Apple");
        translationBuilder.add(ModItems.red_apple, "Red Apple");

        translationBuilder.add(ModItemGroups.MOD_GROUP, "Mod Items");
    }
}
