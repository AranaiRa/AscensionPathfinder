package com.aranaira.ascpath.core.block;

import com.aranaira.ascpath.core.block.properties.DefaultProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockStandard extends Block {
    public BlockStandard(Properties properties) {
        super(properties);
    }
}
