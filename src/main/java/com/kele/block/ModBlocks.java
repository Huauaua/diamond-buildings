package com.kele.block;

import com.kele.MyFirstMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block IRON_STAIRS = registerModBlocks("iron_stairs",
            new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerModBlocks("iron_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_BUTTON = registerModBlocks("iron_button",
            new ButtonBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), BlockSetType.IRON, 20, true));
    public static final Block IRON_FENCE = registerModBlocks("iron_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block IRON_FENCE_GATE = registerModBlocks("iron_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK), WoodType.OAK));
    public static final Block IRON_WALL = registerModBlocks("iron_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));


    public static final Block GOLD_STAIRS = registerModBlocks("gold_stairs",
            new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_SLAB = registerModBlocks("gold_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_BUTTON = registerModBlocks("gold_button",
            new ButtonBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK), BlockSetType.STONE, 20, true));
    public static final Block GOLD_FENCE = registerModBlocks("gold_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_FENCE_GATE = registerModBlocks("gold_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK), WoodType.OAK));
    public static final Block GOLD_WALL = registerModBlocks("gold_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Block GOLD_DOOR = registerModBlocks("gold_door",
            new DoorBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block GOLD_TRAPDOOR = registerModBlocks("gold_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.STONE));


    public static final Block DIAMOND_STAIR = registerModBlocks("diamond_stair",
            new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_SLAB = registerModBlocks("diamond_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_BUTTON = registerModBlocks("diamond_button",
            new ButtonBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK), BlockSetType.STONE, 20, true));
    public static final Block DIAMOND_PRESSURE_PLATE = registerModBlocks("diamond_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS, AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK), BlockSetType.STONE));
    public static final Block DIAMOND_FENCE = registerModBlocks("diamond_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIAMOND_FENCE_GATE = registerModBlocks("diamond_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK), WoodType.OAK));
    public static final Block DIAMOND_WALL = registerModBlocks("diamond_fence_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
    public static final Block DIDAMOND_DOOR = registerModBlocks("diamond_door",
            new DoorBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block DIDAMOND_TRAPDOOR = registerModBlocks("diamond_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).nonOpaque(), BlockSetType.STONE));


    public static final Block RED_APPLE_BLOCK = registerModBlocks("red_apple_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(0.2f, 0.2f)));
    public static final Block BLUE_APPLE_BLOCK = registerModBlocks("blue_apple_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(1f, 1f)));
    public static final Block GREEN_APPLE_BLOCK = registerModBlocks("green_apple_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(2, 2)));

    public static Block registerModBlocks(String id, Block block){
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(MyFirstMod.MOD_ID, id), block);
    }
    public static void registerBlockItem(String id, Block block){
        Registry.register(Registries.ITEM, new Identifier(MyFirstMod.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){

    }
}
