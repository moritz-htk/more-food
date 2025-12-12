package net.volwert123.more_food.fabric.client;

import net.blay09.mods.balm.api.EmptyLoadContext;
import net.blay09.mods.balm.api.client.BalmClient;
import net.fabricmc.api.ClientModInitializer;
import net.volwert123.more_food.client.MFClient;
import net.volwert123.more_food.common.MoreFood;

public class MFFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BalmClient.initializeMod(MoreFood.MOD_ID, EmptyLoadContext.INSTANCE, new MFClient());
    }
}