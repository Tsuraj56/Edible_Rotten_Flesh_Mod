package edible_rotten_flesh.ediblerottenflesh.items;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent COOKED_ROTTEN_FLESH = new FoodComponent.Builder()
            .saturationModifier(1f)
            .nutrition(5)
            .build();
}
