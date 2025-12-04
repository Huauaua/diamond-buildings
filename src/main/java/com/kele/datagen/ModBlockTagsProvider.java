package com.kele.datagen;

import com.kele.block.ModBlocks;
import com.kele.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DIAMOND_FENCE)
                .add(ModBlocks.GOLD_FENCE)
                .add(ModBlocks.IRON_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DIAMOND_FENCE_GATE)
                .add(ModBlocks.GOLD_FENCE_GATE)
                .add(ModBlocks.IRON_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DIAMOND_WALL)
                .add(ModBlocks.GOLD_WALL)
                .add(ModBlocks.IRON_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_APPLE_BLOCK)
                .add(ModBlocks.RED_APPLE_BLOCK)
                .add(ModBlocks.GREEN_APPLE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLUE_APPLE_BLOCK)
                .add(ModBlocks.RED_APPLE_BLOCK)
                .add(ModBlocks.GREEN_APPLE_BLOCK);

        getOrCreateTagBuilder(ModBlockTags.MOD_APPLE_BLOCK)
                .add(ModBlocks.BLUE_APPLE_BLOCK)
                .add(ModBlocks.RED_APPLE_BLOCK)
                .add(ModBlocks.GREEN_APPLE_BLOCK);

    }
}
