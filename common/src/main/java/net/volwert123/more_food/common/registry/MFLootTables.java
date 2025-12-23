package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.world.level.storage.loot.BalmLootTables;
import net.minecraft.resources.Identifier;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.loot.MFRiceLootModifier;

public class MFLootTables {
    public static void initialize(BalmLootTables lootTables) {
        lootTables.registerLootModifier(Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, "rice_grass"), new MFRiceLootModifier());
    }
}