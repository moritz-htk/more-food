package net.volwert123.more_food.fabric;

import net.fabricmc.api.ModInitializer;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.fabric.loot.MFLootTableModifiers;

public class MoreFoodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoreFood.init();
        MFLootTableModifiers.modifyLootTables();
    }
}