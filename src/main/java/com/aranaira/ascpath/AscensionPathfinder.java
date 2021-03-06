package com.aranaira.ascpath;

import com.aranaira.ascpath.core.block.ModBlocks;
import com.aranaira.ascpath.core.entity.LibeerianEntity;
import com.aranaira.ascpath.core.entity.ModEntities;
import com.aranaira.ascpath.core.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AscensionPathfinder.MODID)
public class AscensionPathfinder {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "ascpath";
  public static final String VERSION = "GRADLE:VERSION";

  public static ItemGroup ITEMGROUP = ItemGroup.MISC;

  public AscensionPathfinder() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    ModItems.register(modEventBus);
    ModBlocks.register(modEventBus);

    modEventBus.addListener(this::setup);
    // Register the enqueueIMC method for modloading
    modEventBus.addListener(this::enqueueIMC);
    // Register the processIMC method for modloading
    modEventBus.addListener(this::processIMC);
    // Register the doClientStuff method for modloading
    modEventBus.addListener(this::doClientStuff);

    // Register ourselves for server and other game events we are interested in
    MinecraftForge.EVENT_BUS.register(this);
  }

  private void setup(final FMLCommonSetupEvent event)
  {
    // some preinit code
    LOG.info("HELLO FROM PREINIT");
    LOG.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
  }

  private void doClientStuff(final FMLClientSetupEvent event) {
    // do something that can only be done on the client
  }

  private void enqueueIMC(final InterModEnqueueEvent event)
  {
    // some example code to dispatch IMC to another mod
    InterModComms.sendTo("examplemod", "helloworld", () -> { LOG.info("Hello world from the MDK"); return "Hello world";});
  }

  private void processIMC(final InterModProcessEvent event)
  {

  }

  // You can use SubscribeEvent and let the Event Bus discover methods to call
  @SubscribeEvent
  public void onServerStarting(FMLServerStartingEvent event) {
    // do something when the server starts
    LOG.info("HELLO from server starting");
  }

  // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
  // Event bus for receiving Registry Events)
  @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
  public static class RegistryEvents {
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
      // register a new block here
      LOG.info("HELLO from Register Block");
    }
  }
}
