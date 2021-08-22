package com.aranaira.ascpath.common.block;

import com.aranaira.ascpath.AscensionPathfinder;
import com.aranaira.ascpath.common.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AscensionPathfinder.MODID);

    public static final RegistryObject<Block> PRISM_FLESH = registerBlock("prism_flesh",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_WOOD = registerBlock("prism_wood",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_LIGHT = registerBlock("prism_light",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_BLOOM = registerBlock("prism_bloom",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_METAL = registerBlock("prism_metal",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_EARTH = registerBlock("prism_earth",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_FLUID = registerBlock("prism_fluid",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_DUST = registerBlock("prism_dust",
            () -> new BlockPollinatorPrism());

    public static final RegistryObject<Block> PRISM_CRYSTAL = registerBlock("prism_crystal",
            () -> new BlockPollinatorPrism());

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
