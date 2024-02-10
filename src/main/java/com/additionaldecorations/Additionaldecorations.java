package com.additionaldecorations;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.additionaldecorations.Collections.BlocksCollection;

public class Additionaldecorations implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("additionaldecorations");
	public static final String modID = "additionaldecorations";

	@Override
	public void onInitialize() {
		LOGGER.info("Registering Blocks!");
		BlocksCollection.register(modID);
	}
}