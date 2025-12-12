package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.api.loot.BalmLootTables;
import net.minecraft.resources.ResourceLocation;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.loot.MFRiceLootModifier;

public class MFLootTables {
    public static void initialize(BalmLootTables lootTables) {
        lootTables.registerLootModifier(ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, "rice_grass"), new MFRiceLootModifier());
    }
}