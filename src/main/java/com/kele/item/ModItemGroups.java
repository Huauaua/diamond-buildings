package com.kele.item;

import com.kele.MyFirstMod;
import com.kele.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MOD_GROUP = register("mod_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MyFirstMod.MOD_ID, id));
    }
    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                MOD_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, -1)
                        .displayName(Text.translatable("itemGroup.mod_group"))
                        .icon(()-> new ItemStack(ModBlocks.BLUE_APPLE_BLOCK.asItem()))
                        .entries(((displayContext, entries) -> {
                            // 这里添加group中的物品
                            entries.add(Blocks.IRON_BLOCK);
                            entries.add(ModBlocks.IRON_STAIRS);
                            entries.add(ModBlocks.IRON_SLAB);
                            entries.add(ModBlocks.IRON_BUTTON);
                            entries.add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
                            entries.add(ModBlocks.IRON_FENCE);
                            entries.add(ModBlocks.IRON_FENCE_GATE);
                            entries.add(ModBlocks.IRON_WALL);
                            entries.add(Blocks.IRON_TRAPDOOR);
                            entries.add(Blocks.IRON_DOOR);

                            entries.add(Blocks.GOLD_BLOCK);
                            entries.add(ModBlocks.GOLD_STAIRS);
                            entries.add(ModBlocks.GOLD_SLAB);
                            entries.add(ModBlocks.GOLD_BUTTON);
                            entries.add(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
                            entries.add(ModBlocks.GOLD_FENCE);
                            entries.add(ModBlocks.GOLD_FENCE_GATE);
                            entries.add(ModBlocks.GOLD_WALL);
                            entries.add(ModBlocks.GOLD_DOOR);
                            entries.add(ModBlocks.GOLD_TRAPDOOR);

                            entries.add((ModItems.shit));

                            entries.add(Blocks.DIAMOND_BLOCK);
                            entries.add(ModBlocks.DIAMOND_STAIR);
                            entries.add(ModBlocks.DIAMOND_SLAB);
                            entries.add(ModBlocks.DIAMOND_BUTTON);
                            entries.add(ModBlocks.DIAMOND_PRESSURE_PLATE);
                            entries.add(ModBlocks.DIAMOND_FENCE);
                            entries.add(ModBlocks.DIAMOND_FENCE_GATE);
                            entries.add(ModBlocks.DIAMOND_WALL);
                            entries.add(ModBlocks.DIDAMOND_DOOR);
                            entries.add(ModBlocks.DIDAMOND_TRAPDOOR);

                            entries.add(ModItems.water_cup);
                            entries.add(ModItems.filled_water_cup);

                            entries.add(ModItems.green_apple);
                            entries.add(ModItems.blue_apple);
                            entries.add(ModItems.red_apple);

                            entries.add(ModBlocks.BLUE_APPLE_BLOCK);
                            entries.add(ModBlocks.RED_APPLE_BLOCK);
                            entries.add(ModBlocks.GREEN_APPLE_BLOCK);
                        })).build());
    }
}
