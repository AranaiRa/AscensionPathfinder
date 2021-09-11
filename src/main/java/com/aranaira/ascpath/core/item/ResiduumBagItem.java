package com.aranaira.ascpath.core.item;

import com.aranaira.ascpath.AscensionPathfinder;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class ResiduumBagItem extends Item {
    public ResiduumBagItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if(hand == Hand.MAIN_HAND && !world.isRemote) {
            stack.setCount(stack.getCount() - 1);
            ItemStack leather = new ItemStack(Items.LEATHER, 1);
            ItemStack residuum = new ItemStack(ModItems.RESIDUUM.get(), 1);
            ItemStack livingrock = new ItemStack(ModItems.POWDERED_LIVINGROCK.get(), 1);

            world.addEntity(new ItemEntity(world, player.getPosX(), player.getPosY(), player.getPosZ(), leather));
            world.addEntity(new ItemEntity(world, player.getPosX(), player.getPosY(), player.getPosZ(), residuum));
            world.addEntity(new ItemEntity(world, player.getPosX(), player.getPosY(), player.getPosZ(), livingrock));
        }

        return ActionResult.resultSuccess(stack);
    }

    @Override
    public boolean doesSneakBypassUse(ItemStack stack, IWorldReader world, BlockPos pos, PlayerEntity player) {
        return true;
    }
}
