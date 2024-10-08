package net.gey.katzencraft;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent PINK_CAKE = new FoodComponent.Builder().hunger(4).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent BLUE_CAKE = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent YELLOW_CAKE = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f).alwaysEdible().build();
}
