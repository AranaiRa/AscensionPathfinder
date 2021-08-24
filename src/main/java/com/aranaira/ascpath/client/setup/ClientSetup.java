package com.aranaira.ascpath.client.setup;

import com.aranaira.ascpath.AscensionPathfinder;
import com.aranaira.ascpath.client.render.LibeerianRenderer;
import com.aranaira.ascpath.core.entity.LibeerianBookEntity;
import com.aranaira.ascpath.core.entity.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = MOD, modid = AscensionPathfinder.MODID)
public class ClientSetup {

    @SubscribeEvent
    public static void setup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Minecraft mc = event.getMinecraftSupplier().get();
            EntityRendererManager manager = mc.getRenderManager();

            manager.register(ModEntities.LIBEERIAN.get(), new LibeerianRenderer(manager));

            ItemRenderer renderer = mc.getItemRenderer();
            manager.register(ModEntities.LIBEERIAN_BOOK.get(), new SpriteRenderer<>(manager, renderer, 0.9f, true));
        });
    }
}
