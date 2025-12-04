package com.kele.item;

import net.minecraft.command.argument.BlockArgumentParser;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

public class WaterCupItem extends Item {
    public WaterCupItem(Settings settings) {
        super(settings.maxCount(16));
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        // 只检测客户端即可，避免双执行
        if (!world.isClient) {
            // 找到视线所指的水源方块
            var hit = raycast(world, player, RaycastContext.FluidHandling.SOURCE_ONLY);
            if (hit.getType() == HitResult.Type.BLOCK) {
                var pos = hit.getBlockPos();
                Fluid fluid = world.getFluidState(pos).getFluid();
                if (fluid == Fluids.WATER || fluid == Fluids.FLOWING_WATER) {
                    // 成功：播放倒水声
                    world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL,
                            SoundCategory.PLAYERS, 1.0F, 1.0F);

                    // 空杯减 1，给玩家水杯
                    if(stack.getCount() > 1) {
                        stack.decrement(1);
                        if (!player.giveItemStack(new ItemStack(ModItems.filled_water_cup, 1)))
                            player.dropItem(new ItemStack(ModItems.filled_water_cup, 1), false);
                    }
                    else player.setStackInHand(hand,new ItemStack(ModItems.filled_water_cup, 1));

                    return TypedActionResult.success(stack);
                }
            }
        }
        return TypedActionResult.pass(stack);
    }
//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand){
//        ItemStack stack = player.getStackInHand(hand);
//        BlockHitResult hit = raycast(world,player, RaycastContext.FluidHandling.SOURCE_ONLY);
//        if(hit.getType() == HitResult.Type.BLOCK){
//            BlockPos pos = hit.getBlockPos();
//            if(world.getFluidState(pos).isIn(FluidTags.WATER)){
//                if(!world.isClient){
//                    stack.decrement(1);
//                    ItemStack filled = new ItemStack(ModItems.filled_water_cup);
//                    if(!player.giveItemStack(filled)){
//                        player.dropItem(filled, false);
//                    }
//                }
//                return new TypedActionResult<>(ActionResult.SUCCESS, stack);
//            }
//        }
//        return new TypedActionResult<>(ActionResult.PASS, stack);
//    }
}
