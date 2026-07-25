package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class MFCreativeModeTabs {
    public static void initialize(BalmCreativeModeTabRegistrar creativeModeTabs) {
        creativeModeTabs.register("main", (resourceLocation, builder) -> builder
                .title(Component.translatable(resourceLocation.toLanguageKey("itemGroup")))
                .icon(() -> new ItemStack(MFItems.COOKED_CARROT.asItem()))
                .displayItems((itemDisplayParameters, output) -> {
                    for (DeferredItem item : MFItems.ITEMS) {
                        output.accept(item.asItem());
                    }
                }));
    }
}