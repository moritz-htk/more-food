package net.volwert123.more_food.fabric;

import net.fabricmc.api.ModInitializer;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.fabric.loot.MFLootTableModifiers;

public class MFFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoreFood.init();
        MFLootTableModifiers.modifyLootTables();
    }
}