package com.kele.datagen;

import com.kele.block.ModBlocks;
import com.kele.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        generateIronBuildings(exporter);
        generateGoldBuildings(exporter);
        generateDiamondBuildings(exporter);

        offerSmelting(exporter, List.of(Items.GOLD_BLOCK),RecipeCategory.MISC, Items.GOLD_INGOT,
                1.0f,200,"smelting");
        offerBlasting(exporter, List.of(Items.GOLD_BLOCK),RecipeCategory.MISC, Items.GOLD_INGOT,
                1.0f,200,"blasting");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.blue_apple, 4)
                .input(ModBlocks.BLUE_APPLE_BLOCK)
                .criterion(hasItem(ModBlocks.BLUE_APPLE_BLOCK), conditionsFromItem(ModBlocks.BLUE_APPLE_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.green_apple, 4)
                .input(ModBlocks.GREEN_APPLE_BLOCK)
                .criterion(hasItem(ModBlocks.GREEN_APPLE_BLOCK), conditionsFromItem(ModBlocks.GREEN_APPLE_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.red_apple, 4)
                .input(ModBlocks.RED_APPLE_BLOCK)
                .criterion(hasItem(ModBlocks.RED_APPLE_BLOCK), conditionsFromItem(ModBlocks.RED_APPLE_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_APPLE_BLOCK, 1)
                .input('#', ModItems.red_apple)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GREEN_APPLE_BLOCK, 1)
                .input('#', ModItems.green_apple)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUE_APPLE_BLOCK, 1)
                .input('#', ModItems.blue_apple)
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .offerTo(exporter);

    }

    private void generateDiamondBuildings(Consumer<RecipeJsonProvider> exporter) {
        // 钻石楼梯 ×4
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_STAIR, 4)
                .input('#', Blocks.DIAMOND_BLOCK)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石台阶 ×6
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_SLAB, 6)
                .input('#', Blocks.DIAMOND_BLOCK)
                .pattern("###")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石按钮 ×1
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DIAMOND_BUTTON, 1)
                .input(Items.DIAMOND, '#')
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石压力板 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DIAMOND_PRESSURE_PLATE, 1)
                .input('#', Items.DIAMOND)
                .pattern("##")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石栅栏 ×3
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_FENCE, 3)
                .input('#', Items.DIAMOND)
                .input('/', Items.STICK)
                .pattern("#/#")
                .pattern("#/#")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石栅栏门 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_FENCE_GATE, 1)
                .input('#', Items.DIAMOND)
                .input('/', Items.STICK)
                .pattern("/#/")
                .pattern("/#/")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石墙 ×6
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_WALL, 12)
                .input('#', Blocks.DIAMOND_BLOCK)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石门 ×3
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIDAMOND_DOOR, 3)
                .input('#', Items.DIAMOND)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // 钻石活板门 ×2
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIDAMOND_TRAPDOOR, 2)
                .input('#', Items.DIAMOND)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
    }

    private void generateGoldBuildings(Consumer<RecipeJsonProvider> exporter) {
        // 金楼梯 ×4
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_STAIRS, 4)
                .input('#', Blocks.GOLD_BLOCK)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金台阶 ×6
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_SLAB, 6)
                .input('#', Blocks.GOLD_BLOCK)
                .pattern("###")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金按钮 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.GOLD_BUTTON, 1)
                .input('#', Items.GOLD_NUGGET)
                .input('$', Items.STONE_BUTTON)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金压力板 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, 1)
                .input('#', Items.GOLD_INGOT)
                .pattern("##")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金栅栏 ×3
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_FENCE, 3)
                .input('#', Items.GOLD_INGOT)
                .input('/', Items.STICK)
                .pattern("#/#")
                .pattern("#/#")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金栅栏门 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_FENCE_GATE, 1)
                .input('#', Items.GOLD_INGOT)
                .input('/', Items.STICK)
                .pattern("/#/")
                .pattern("/#/")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金墙 ×12
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_WALL, 12)
                .input('#', Blocks.GOLD_BLOCK)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金门 ×3
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_DOOR, 3)
                .input('#', Items.GOLD_INGOT)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);

        // 金活板门 ×2
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GOLD_TRAPDOOR, 2)
                .input('#', Items.GOLD_INGOT)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
    }

    private void generateIronBuildings(Consumer<RecipeJsonProvider> exporter) {
        // 铁楼梯 ×4
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_STAIRS, 4)
                .input('#', Blocks.IRON_BLOCK)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁台阶 ×6
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_SLAB, 6)
                .input('#', Blocks.IRON_BLOCK)
                .pattern("###")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁按钮 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.IRON_BUTTON, 1)
                .input('#', Items.IRON_NUGGET)
                .input('$', Items.STONE_BUTTON)
                .pattern("###")
                .pattern("#$#")
                .pattern("###")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁压力板 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, 1)
                .input('#', Items.IRON_INGOT)
                .pattern("##")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁栅栏 ×3
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_FENCE, 3)
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .pattern("#/#")
                .pattern("#/#")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁栅栏门 ×1
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_FENCE_GATE, 1)
                .input('#', Items.IRON_INGOT)
                .input('/', Items.STICK)
                .pattern("/#/")
                .pattern("/#/")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        // 铁墙 ×12
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_WALL, 12)
                .input('#', Blocks.IRON_BLOCK)
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

    }
}
