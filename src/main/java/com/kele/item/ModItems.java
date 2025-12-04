package com.kele.item;

import com.kele.MyFirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item green_apple = registerModItems("green_apple", new Item(new Item.Settings().maxCount(64)));
    public static final Item blue_apple = registerModItems("blue_apple", new Item(new Item.Settings().maxCount(64)));
    public static final Item red_apple = registerModItems("red_apple", new Item(new Item.Settings().maxCount(64)));

    public static final Item water_cup = registerModItems("water_cup", new WaterCupItem(new Item.Settings()));
    public static final Item filled_water_cup = registerModItems("filled_water_cup", new FilledWaterCupItem(new Item.Settings()));

    public static final Item shit = registerModItems("shit", new ShitItem(new Item.Settings()));

    // 注册物品
    public static Item registerModItems(String id, Item item) {
//        System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(MyFirstMod.MOD_ID,id)), item);
    }
    public static Item register(String id, Item item) {
        return register(new Identifier(MyFirstMod.MOD_ID, id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    // 添加物品到物品栏
    public static void addItemToItemgroups(FabricItemGroupEntries entries) {
        entries.add(green_apple);
        entries.add(blue_apple);
        entries.add(red_apple);
        entries.add(water_cup);
        entries.add(filled_water_cup);
    }
    public static void addItemToItemgroups2(FabricItemGroupEntries entries) {
//        entries.add(green_apple);
    }


    //进入游戏时调用的初始化函数
    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemToItemgroups);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToItemgroups2);

        ModItemGroups.registerGroups();
    }
}
