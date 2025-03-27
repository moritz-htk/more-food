package net.volwert123.more_food.common;

import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFCreativeTabs;
import net.volwert123.more_food.common.registry.MFItems;

public class MoreFood {
    public static final String MOD_ID = "more_food";

    public static void init() {
        MFBlocks.BLOCKS.register();
        MFCreativeTabs.TABS.register();
        MFItems.ITEMS.register();
    }
}