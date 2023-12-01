package net.mockingbird.learnmod;

import net.fabricmc.api.ModInitializer;

import net.mockingbird.learnmod.item.ModItemGroups;
import net.mockingbird.learnmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnMod implements ModInitializer {
	public static final String MOD_ID = "learnmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}