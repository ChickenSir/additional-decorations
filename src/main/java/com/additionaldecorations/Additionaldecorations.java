package com.additionaldecorations;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Additionaldecorations implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("additionaldecorations");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}