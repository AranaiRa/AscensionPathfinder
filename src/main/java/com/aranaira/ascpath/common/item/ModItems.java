package com.aranaira.ascpath.common.item;

import com.aranaira.ascpath.AscensionPathfinder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AscensionPathfinder.MODID);

    public static final RegistryObject<Item> ESSENCE_BLOOM = ITEMS.register("essence_bloom",
            () -> new Item(new Item.Properties().group(ItemGroup.BREWING)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
