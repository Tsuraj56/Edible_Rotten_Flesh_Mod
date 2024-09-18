package edible_rotten_flesh.ediblerottenflesh.items;

import edible_rotten_flesh.ediblerottenflesh.EdibleRottenFleshMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Cooked_Rotten_Flesh =  registerItem("cooked_rotten_flesh", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_ROTTEN_FLESH)));

    private static void addItemstoFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(Cooked_Rotten_Flesh);
    }

    private static Item registerItem(String name , Item item){
        return Registry.register(Registries.ITEM, new Identifier(EdibleRottenFleshMod.MOD_ID, name ), item);
    }

    public static void registerModItems() {
        EdibleRottenFleshMod.LOGGER.info("Registering Mod Items for " + EdibleRottenFleshMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemstoFoodItemGroup);
    }
}
