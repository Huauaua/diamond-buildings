package com.kele.datagen;

import com.kele.block.ModBlockFamilies;
import com.kele.block.ModBlocks;
import com.kele.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(family ->
                        blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_APPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_APPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_APPLE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.red_apple, Models.GENERATED);
        itemModelGenerator.register(ModItems.green_apple, Models.GENERATED);
        itemModelGenerator.register(ModItems.blue_apple, Models.GENERATED);
        itemModelGenerator.register(ModItems.water_cup, Models.GENERATED);
        itemModelGenerator.register(ModItems.filled_water_cup, Models.GENERATED);
        itemModelGenerator.register(ModItems.shit, Models.GENERATED);
    }
}
