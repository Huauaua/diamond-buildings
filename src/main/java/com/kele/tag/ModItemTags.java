package com.kele.tag;

import com.kele.MyFirstMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTags extends FabricTagProvider.ItemTagProvider {
    public static final TagKey<Item> MOD_APPLE = of("mod_apple");

    public ModItemTags(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }

    //tag的注册方法
    private static TagKey<Item> of(String id){
        return TagKey.of(RegistryKeys.ITEM, new Identifier(MyFirstMod.MOD_ID, id));
    }
}
