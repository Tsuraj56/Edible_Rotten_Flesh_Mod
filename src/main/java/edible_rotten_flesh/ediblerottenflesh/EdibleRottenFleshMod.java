package edible_rotten_flesh.ediblerottenflesh;

import edible_rotten_flesh.ediblerottenflesh.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdibleRottenFleshMod implements ModInitializer {
	public static final String MOD_ID = "edible-rotten-flesh-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}