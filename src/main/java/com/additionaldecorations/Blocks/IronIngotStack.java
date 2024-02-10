package com.additionaldecorations.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class IronIngotStack extends Block {
    private static final VoxelShape BlockShape = Block.createCuboidShape(0, 0, 0, 10, 6, 10);


    public IronIngotStack(Settings settings) {
        super(settings);
    }
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return BlockShape;
    }
}
