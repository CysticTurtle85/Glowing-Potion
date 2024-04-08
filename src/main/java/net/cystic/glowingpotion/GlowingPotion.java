package net.cystic.glowingpotion;

import net.cystic.glowingpotion.potion.ModPotions;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowingPotion implements ModInitializer {

	public static final String MOD_ID = "glowingpotion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPotions.registerPotions();
	}
}