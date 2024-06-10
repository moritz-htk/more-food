package net.volwert123.more_food;

import net.volwert123.more_food.registry.*;

public class MoreFood {
    public static final String MOD_ID = "more_food";

    public static void init() {
        MFBlocks.BLOCKS.register();
        MFCreativeTabs.TABS.register();
        MFItems.ITEMS.register();
    }
}