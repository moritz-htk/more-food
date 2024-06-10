package net.volwert123.more_food.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.neoforge.loot.MFLootModifiers;

@Mod(MoreFood.MOD_ID)
public class MoreFoodNeoForge {
    public MoreFoodNeoForge(IEventBus modEventBus) {
        MoreFood.init();
        MFLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
    }
}