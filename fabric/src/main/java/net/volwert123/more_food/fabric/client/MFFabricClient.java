package net.volwert123.more_food.fabric.client;

import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.fabric.platform.runtime.FabricLoadContext;
import net.fabricmc.api.ClientModInitializer;
import net.volwert123.more_food.client.MFClient;
import net.volwert123.more_food.common.MoreFood;

public class MFFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(MoreFood.MOD_ID, FabricLoadContext.INSTANCE, new MFClient());
    }
}