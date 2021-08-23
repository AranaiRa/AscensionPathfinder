package com.aranaira.ascpath.client.render;

import com.aranaira.ascpath.AscensionPathfinder;
import com.aranaira.ascpath.client.models.LibeerianModel;
import com.aranaira.ascpath.core.entity.LibeerianEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LibeerianRenderer extends MobRenderer<LibeerianEntity, LibeerianModel<LibeerianEntity>> {
    public static final ResourceLocation LIBEERIAN = new ResourceLocation(AscensionPathfinder.MODID, "textures/entity/libeerian.png");

    public LibeerianRenderer(EntityRendererManager p_i226033_1_) {
        super(p_i226033_1_, new LibeerianModel<>(), 0.4F);
        //this.addLayer(new BeeHeldItemLayer<>(this));
    }

    public ResourceLocation getEntityTexture(LibeerianEntity p_110775_1_) {
        return LIBEERIAN;
    }
}