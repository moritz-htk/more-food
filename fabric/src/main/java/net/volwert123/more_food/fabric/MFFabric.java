package net.volwert123.more_food.fabric;

import net.blay09.mods.balm.api.Balm;
import net.blay09.mods.balm.api.EmptyLoadContext;
import net.fabricmc.api.ModInitializer;
import net.volwert123.more_food.common.MoreFood;

public class MFFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Balm.initializeMod(MoreFood.MOD_ID, EmptyLoadContext.INSTANCE, new MoreFood());
    }
}