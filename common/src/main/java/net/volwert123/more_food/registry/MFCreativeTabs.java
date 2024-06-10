package net.volwert123.more_food.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.volwert123.more_food.MoreFood;

public class MFCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MoreFood.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> MORE_FOOD_MAIN = TABS.register(MoreFood.MOD_ID + "_main", () -> CreativeTabRegistry.create(Component.literal("More Food"), () -> new ItemStack(MFItems.COOKED_CARROT)));
}