package com.aranaira.ascpath;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("ascpath")
public class AscensionPathfinder {
  public static final Logger LOG = LogManager.getLogger();
  public static final String MODID = "ascpath";
  public static final String VERSION = "GRADLE:VERSION";

  public static ItemGroup itemGroup;

  public AscensionPathfinder() {
    IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
  }
}
