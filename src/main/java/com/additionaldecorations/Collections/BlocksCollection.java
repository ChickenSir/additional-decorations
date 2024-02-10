package com.additionaldecorations.Collections;

import com.additionaldecorations.Blocks.IronIngotStack;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    public static final Block IRON_INGOT_STACK = new IronIngotStack(FabricBlockSettings.copyOf(Blocks.IRON_BARS));

    public static void register(String modID) {
        // Register Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "iron_ingot_stack"), IRON_INGOT_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "iron_ingot_stack"), new BlockItem(IRON_INGOT_STACK, new FabricItemSettings()));
    }
}
