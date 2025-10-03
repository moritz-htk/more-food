package net.volwert123.more_food.neoforge.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.balm.neoforge.NeoForgeLoadContext;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.volwert123.more_food.client.MFClient;
import net.volwert123.more_food.common.MoreFood;

@Mod(value = MoreFood.MOD_ID, dist = Dist.CLIENT)
public class MFNeoForgeClient {
    public MFNeoForgeClient(IEventBus modEventBus) {
        final var loadContext = new NeoForgeLoadContext(modEventBus);
        BalmClient.initializeMod(MoreFood.MOD_ID, loadContext, new MFClient());
    }
}