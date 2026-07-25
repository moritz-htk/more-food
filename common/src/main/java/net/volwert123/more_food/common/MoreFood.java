package net.volwert123.more_food.common;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.core.BalmRegistrars;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFCreativeTabs;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFLootTables;

public class MoreFood {
    public static final String MOD_ID = "more_food";

    public static void initialize(BalmRegistrars registrars) {
        registrars.blocks(MFBlocks::initialize);
        registrars.items(MFItems::initialize);
        registrars.creativeModeTabs(MFCreativeTabs::initialize);
        MFLootTables.initialize(Balm.lootModifiers());
    }
}