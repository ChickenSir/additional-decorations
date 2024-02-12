package com.additionaldecorations.Collections;

import com.additionaldecorations.Blocks.BrickStack;
import com.additionaldecorations.Blocks.BucketBlock;
import com.additionaldecorations.Blocks.IngotStack;
import com.additionaldecorations.Blocks.WoodStump;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlocksCollection {
    public static final Block IRON_INGOT_STACK = new IngotStack(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool());
    public static final Block GOLD_INGOT_STACK = new IngotStack(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).requiresTool());
    public static final Block COPPER_INGOT_STACK = new IngotStack(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool());
    public static final Block NETHERITE_INGOT_STACK = new IngotStack(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).requiresTool());
    public static final Block BRICK_STACK = new BrickStack(FabricBlockSettings.copyOf(Blocks.BRICKS).requiresTool());
    public static final Block NETHER_BRICK_STACK = new BrickStack(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).requiresTool());
    public static final Block BUCKET_CLAY = new BucketBlock(FabricBlockSettings.copyOf(Blocks.FLOWER_POT).sounds(BlockSoundGroup.METAL));
    public static final Block OAK_STUMP =  new WoodStump(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1));
    public static final Block BIRCH_STUMP =  new WoodStump(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS).strength(1));

    public static void register(String modID) {
        // Register Blocks
        Registry.register(Registries.BLOCK, new Identifier(modID, "iron_ingot_stack"), IRON_INGOT_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "iron_ingot_stack"), new BlockItem(IRON_INGOT_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "gold_ingot_stack"), GOLD_INGOT_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "gold_ingot_stack"), new BlockItem(GOLD_INGOT_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "copper_ingot_stack"), COPPER_INGOT_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "copper_ingot_stack"), new BlockItem(COPPER_INGOT_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "netherite_ingot_stack"), NETHERITE_INGOT_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "netherite_ingot_stack"), new BlockItem(NETHERITE_INGOT_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "brick_stack"), BRICK_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "brick_stack"), new BlockItem(BRICK_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "nether_brick_stack"), NETHER_BRICK_STACK);
        Registry.register(Registries.ITEM, new Identifier(modID, "nether_brick_stack"), new BlockItem(NETHER_BRICK_STACK, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "bucket_clay"), BUCKET_CLAY);
        Registry.register(Registries.ITEM, new Identifier(modID, "bucket_clay"), new BlockItem(BUCKET_CLAY, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "oak_stump"), OAK_STUMP);
        Registry.register(Registries.ITEM, new Identifier(modID, "oak_stump"), new BlockItem(OAK_STUMP, new FabricItemSettings()));

        Registry.register(Registries.BLOCK, new Identifier(modID, "birch_stump"), BIRCH_STUMP);
        Registry.register(Registries.ITEM, new Identifier(modID, "birch_stump"), new BlockItem(BIRCH_STUMP, new FabricItemSettings()));
    }
}
