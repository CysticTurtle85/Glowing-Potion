package net.cystic.glowingpotion.item;

import net.cystic.glowingpotion.GlowingPotion;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PotionItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(GlowingPotion.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}
