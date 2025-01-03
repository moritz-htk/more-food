package net.volwert123.more_food.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.neoforge.loot.MFLootModifiers;

@Mod(MoreFood.MOD_ID)
public class MFNeoForge {
    public MFNeoForge(IEventBus modEventBus) {
        MoreFood.init();
        MFLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
    }
}