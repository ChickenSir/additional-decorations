package com.additionaldecorations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.additionaldecorations.Collections.BlocksCollection;

public class Additionaldecorations implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("additionaldecorations");
	public static final String modID = "additionaldecorations";
	public static final String modName = "Additional Decorations";

	// Item Group For Modded Content
	private static final ItemGroup MOD_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(BlocksCollection.IRON_INGOT_STACK))
		.displayName(Text.translatable(modName))
		.entries((context, entries) -> {
			entries.add(BlocksCollection.IRON_INGOT_STACK);
			entries.add(BlocksCollection.GOLD_INGOT_STACK);
			entries.add(BlocksCollection.COPPER_INGOT_STACK);
			entries.add(BlocksCollection.NETHERITE_INGOT_STACK);
			entries.add(BlocksCollection.BRICK_STACK);
			entries.add(BlocksCollection.NETHER_BRICK_STACK);
			entries.add(BlocksCollection.BUCKET_CLAY);
		})
		.build();

	@Override
	public void onInitialize() {
		// Register Blocks

		LOGGER.info("Registering Blocks!");
		BlocksCollection.register(modID);

		// Register Item Group

		LOGGER.info("Registering Item Group!");
		Registry.register(Registries.ITEM_GROUP, new Identifier(modID, "mod_group"), MOD_GROUP);
	}
}