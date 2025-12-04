package com.kele.block;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.registry.Registries;

import java.util.Map;
import java.util.stream.Stream;

public class ModBlockFamilies {
    private static final Map<Block, BlockFamily> BASE_BLOCKS_TO_FAMILIES = Maps.<Block, BlockFamily>newHashMap();

    public static final BlockFamily GOLD_BUILDINGS = register(Blocks.GOLD_BLOCK)
            .stairs(ModBlocks.GOLD_STAIRS)
            .slab(ModBlocks.GOLD_SLAB)
            .button(ModBlocks.GOLD_BUTTON)
            .fence(ModBlocks.GOLD_FENCE)
            .fenceGate(ModBlocks.GOLD_FENCE_GATE)
            .wall(ModBlocks.GOLD_WALL)
            .door(ModBlocks.GOLD_DOOR)
            .trapdoor(ModBlocks.GOLD_TRAPDOOR)
            .build();

    public static final BlockFamily IRON_BUILDINGS = register(Blocks.IRON_BLOCK)
            .stairs(ModBlocks.IRON_STAIRS)
            .slab(ModBlocks.IRON_SLAB)
            .button(ModBlocks.IRON_BUTTON)
            .fence(ModBlocks.IRON_FENCE)
            .fenceGate(ModBlocks.IRON_FENCE_GATE)
            .wall(ModBlocks.IRON_WALL)
            .door(Blocks.IRON_DOOR)
            .trapdoor(Blocks.IRON_TRAPDOOR)
            .build();

    public static final BlockFamily DIAMOND_BUILDINGS = register(Blocks.DIAMOND_BLOCK)
            .stairs(ModBlocks.DIAMOND_STAIR)
            .slab(ModBlocks.DIAMOND_SLAB)
            .button(ModBlocks.DIAMOND_BUTTON)
            .pressurePlate(ModBlocks.DIAMOND_PRESSURE_PLATE)
            .fence(ModBlocks.DIAMOND_FENCE)
            .fenceGate(ModBlocks.DIAMOND_FENCE_GATE)
            .wall(ModBlocks.DIAMOND_WALL)
            .door(ModBlocks.DIDAMOND_DOOR)
            .trapdoor(ModBlocks.DIDAMOND_TRAPDOOR)
            .build();

    public static BlockFamily.Builder register(Block baseBlock) {
        BlockFamily.Builder builder = new BlockFamily.Builder(baseBlock);
        BlockFamily blockFamily = (BlockFamily)BASE_BLOCKS_TO_FAMILIES.put(baseBlock, builder.build());
        if (blockFamily != null) {
            throw new IllegalStateException("Duplicate family definition for " + Registries.BLOCK.getId(baseBlock));
        } else {
            return builder;
        }
    }

    public static Stream<BlockFamily> getFamilies(){
        return BASE_BLOCKS_TO_FAMILIES.values().stream();
    }
}
