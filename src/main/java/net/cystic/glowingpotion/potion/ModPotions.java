package net.cystic.glowingpotion.potion;

import net.cystic.glowingpotion.GlowingPotion;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final Potion GLOWING_POTION = registerPotion("glowing_potion", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 3600)));
    public static final Potion LONG_GLOWING_POTION = registerPotion("long_glowing_potion", new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 9600)));

    public static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(GlowingPotion.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        registerPotionRecipes();
    }

    public static void registerPotionRecipes() {
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.GLOW_INK_SAC, GLOWING_POTION);
        BrewingRecipeRegistry.registerPotionRecipe(ModPotions.GLOWING_POTION, Items.REDSTONE, LONG_GLOWING_POTION);
    }
}
