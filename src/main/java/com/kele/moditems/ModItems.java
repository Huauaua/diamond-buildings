package com.kele.moditems;

import com.kele.MyFirstMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item green_apple = registerItems("green_apple", new Item(new Item.Settings().maxCount(6)));
    public static final Item blue_apple = registerItems("blue_apple", new Item(new Item.Settings().maxCount(6)));
    public static final Item red_apple = registerItems("red_apple", new Item(new Item.Settings().maxCount(6)));

    public static Item registerItems(String id, Item item) {
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
    public static void registerItems() {}
}
