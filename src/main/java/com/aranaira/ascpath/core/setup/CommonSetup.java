package com.aranaira.ascpath.core.setup;

import com.aranaira.ascpath.AscensionPathfinder;
import com.aranaira.ascpath.core.entity.LibeerianEntity;
import com.aranaira.ascpath.core.entity.ModEntities;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import noobanidus.mods.carrierbees.entities.AppleBeeEntity;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(bus = MOD, modid = AscensionPathfinder.MODID)
public class CommonSetup {

    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }

    @SubscribeEvent
    public static void onAttribute(EntityAttributeCreationEvent event) {
        //AttributeModifierMap.MutableAttribute attr = AppleBeeEntity.createAttributes();
        //AscensionPathfinder.LOG.info("&&&&&&& is attr null? "+(attr == null));
        //event.put(ModEntities.LIBEERIAN.get(), attr.create());
    }
}
