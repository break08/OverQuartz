package com.quartz;

import com.quartz.init.OverQuartzBlocks;
import com.quartz.OverQuartzWorldgen;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OverQuartz implements ModInitializer {
	public static final String MOD_ID = "overquartz";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		OverQuartzBlocks.initialize();
                OverQuartzWorldgen.generate();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}