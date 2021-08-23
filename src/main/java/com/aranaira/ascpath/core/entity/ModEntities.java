package com.aranaira.ascpath.core.entity;

import com.aranaira.ascpath.AscensionPathfinder;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, AscensionPathfinder.MODID);

    public static final RegistryObject<EntityType<LibeerianEntity>> LIBEERIAN = ENTITIES.register("libeerian",
            () -> EntityType.Builder.create(LibeerianEntity::new, EntityClassification.MONSTER).build("libeerian"));

    public static final RegistryObject<EntityType<LibeerianBookEntity>> LIBEERIAN_BOOK = ENTITIES.register("libeerian_book",
            () -> EntityType.Builder.<LibeerianBookEntity>create(LibeerianBookEntity::new, EntityClassification.MISC).build("libeerian_book"));
}
