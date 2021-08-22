package com.aranaira.ascpath.core.block.properties;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.function.ToIntFunction;

public class DefaultProperties {
    public static Block.Properties pollinators() {
        return Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(2.5F, 7F)
                .harvestLevel(0)
                .sound(SoundType.GLASS)
                .setLightLevel(new ToIntFunction<BlockState>() {
                    @Override
                    public int applyAsInt(BlockState value) {
                        return 15;
                    }
                });
    }
}
