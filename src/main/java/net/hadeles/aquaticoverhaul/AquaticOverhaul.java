package net.hadeles.aquaticoverhaul;

import net.fabricmc.api.ModInitializer;

import net.hadeles.aquaticoverhaul.block.ModBlocks;
import net.hadeles.aquaticoverhaul.item.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AquaticOverhaul implements ModInitializer {
	public static final String MOD_ID = "aquaticoverhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
