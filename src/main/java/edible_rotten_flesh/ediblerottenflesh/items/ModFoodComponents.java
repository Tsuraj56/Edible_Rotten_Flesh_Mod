package edible_rotten_flesh.ediblerottenflesh.items;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COOKED_ROTTEN_FLESH = new FoodComponent.Builder()
            .meat()
            .hunger(5)
            .saturationModifier(1f)
            .build();
}
