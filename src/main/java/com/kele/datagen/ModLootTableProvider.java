package com.kele.datagen;

import com.kele.block.ModBlocks;
import com.kele.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate(){
        addDrop(ModBlocks.GOLD_STAIRS);
        addDrop(ModBlocks.GOLD_SLAB, slabDrops(ModBlocks.GOLD_SLAB));
        addDrop(ModBlocks.GOLD_BUTTON);
        addDrop(ModBlocks.GOLD_FENCE);
        addDrop(ModBlocks.GOLD_FENCE_GATE);
        addDrop(ModBlocks.GOLD_WALL);
        addDrop(ModBlocks.GOLD_DOOR, doorDrops(ModBlocks.GOLD_DOOR));
        addDrop(ModBlocks.GOLD_TRAPDOOR);

        addDrop(ModBlocks.IRON_STAIRS);
        addDrop(ModBlocks.IRON_SLAB, slabDrops(ModBlocks.IRON_SLAB));
        addDrop(ModBlocks.IRON_BUTTON);
        addDrop(ModBlocks.IRON_FENCE);
        addDrop(ModBlocks.IRON_FENCE_GATE);
        addDrop(ModBlocks.IRON_WALL);

        addDrop(ModBlocks.DIAMOND_STAIR);
        addDrop(ModBlocks.DIAMOND_SLAB, slabDrops(ModBlocks.DIAMOND_SLAB));
        addDrop(ModBlocks.DIAMOND_BUTTON);
        addDrop(ModBlocks.DIAMOND_PRESSURE_PLATE);
        addDrop(ModBlocks.DIAMOND_FENCE);
        addDrop(ModBlocks.DIAMOND_FENCE_GATE);
        addDrop(ModBlocks.DIAMOND_WALL);
        addDrop(ModBlocks.DIDAMOND_DOOR, doorDrops(ModBlocks.DIDAMOND_DOOR));
        addDrop(ModBlocks.DIDAMOND_TRAPDOOR);

        addDrop(ModBlocks.RED_APPLE_BLOCK, ModAppleBlockOreDrops(ModBlocks.RED_APPLE_BLOCK, ModItems.red_apple));
        addDrop(ModBlocks.GREEN_APPLE_BLOCK, ModAppleBlockOreDrops(ModBlocks.GREEN_APPLE_BLOCK, ModItems.green_apple));
        addDrop(ModBlocks.BLUE_APPLE_BLOCK, ModAppleBlockOreDrops(ModBlocks.BLUE_APPLE_BLOCK, ModItems.blue_apple));
    }
    public LootTable.Builder ModAppleBlockOreDrops(Block drop, Item dropItem) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(dropItem)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}