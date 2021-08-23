package com.aranaira.ascpath.core.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRendersAsItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import noobanidus.mods.carrierbees.entities.projectiles.HoneyCombEntity;
import noobanidus.mods.carrierbees.init.ModItems;

@OnlyIn(
        value = Dist.CLIENT,
        _interface = IRendersAsItem.class
)
public class LibeerianBookEntity extends HoneyCombEntity {
    private static ItemStack LIBEERIAN_BOOK = new ItemStack(Items.BOOK);

    public LibeerianBookEntity(EntityType<? extends LibeerianBookEntity> type, World world) {
        super(type, world);
    }

    public LibeerianBookEntity(LivingEntity parent, double accelX, double accelY, double accelZ, World world) {
        super(ModEntities.LIBEERIAN_BOOK.get(), parent, accelX, accelY, accelZ, world);
    }

    @Override
    public ItemStack getItem() {
        return LIBEERIAN_BOOK;
    }

    @Override
    public EffectInstance getInstance() {
        return null;
    }
}