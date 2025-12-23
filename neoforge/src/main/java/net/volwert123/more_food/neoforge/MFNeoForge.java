package net.volwert123.more_food.neoforge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.neoforge.platform.runtime.NeoForgeLoadContext;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.volwert123.more_food.common.MoreFood;

@Mod(MoreFood.MOD_ID)
public class MFNeoForge {
    public MFNeoForge(IEventBus modEventBus) {
        final var loadContext = new NeoForgeLoadContext(modEventBus);
        Balm.initializeMod(MoreFood.MOD_ID, loadContext, new MoreFood());
    }
}