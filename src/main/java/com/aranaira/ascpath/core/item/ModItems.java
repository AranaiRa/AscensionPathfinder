package com.aranaira.ascpath.core.item;

import com.aranaira.ascpath.AscensionPathfinder;
import com.aranaira.ascpath.core.item.aspected.heart.*;
import com.aranaira.ascpath.core.item.aspected.knock.*;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AscensionPathfinder.MODID);

    public static final RegistryObject<Item> KNOWLEDGE_FRAGMENT = ITEMS.register("knowledge_fragment",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> RUNE_OF_SCRAPPING = ITEMS.register("rune_scrapping",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> POWDERED_LIVINGROCK = ITEMS.register("powdered_livingrock",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> RESIDUUM = ITEMS.register("residuum",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<ResiduumBagItem> RESIDUUM_BAG = ITEMS.register("residuum_bag",
            () -> new ResiduumBagItem(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    //////
    //ASPECTED ITEMS
    //////

    //Heart
    public static final RegistryObject<ParsevailInkItem> PARSEVAIL_INK = ITEMS.register("parsevail_ink",
            () -> new ParsevailInkItem(new Item.Properties().group(AscensionPathfinder.ITEMGROUP).rarity(Rarity.RARE).maxStackSize(1)));

    //Knock
    public static final RegistryObject<LatchkeyItem> LATCHKEY = ITEMS.register("latchkey",
            () -> new LatchkeyItem(new Item.Properties().group(AscensionPathfinder.ITEMGROUP).rarity(Rarity.RARE).maxStackSize(1)));

    public static final RegistryObject<SanguineLatchkeyItem> SANGUINE_LATCHKEY = ITEMS.register("sanguine_latchkey",
            () -> new SanguineLatchkeyItem(new Item.Properties().group(AscensionPathfinder.ITEMGROUP).rarity(Rarity.RARE).maxStackSize(1)));

    //////
    //BEE ESSENCES
    //////
    public static final RegistryObject<Item> ESSENCE_FLESH = ITEMS.register("essence_flesh",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_WOOD = ITEMS.register("essence_wood",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_LIGHT = ITEMS.register("essence_light",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_BLOOM = ITEMS.register("essence_bloom",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_METAL = ITEMS.register("essence_metal",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_EARTH = ITEMS.register("essence_earth",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_FLUID = ITEMS.register("essence_fluid",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_DUST = ITEMS.register("essence_dust",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static final RegistryObject<Item> ESSENCE_CRYSTAL= ITEMS.register("essence_crystal",
            () -> new Item(new Item.Properties().group(AscensionPathfinder.ITEMGROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
