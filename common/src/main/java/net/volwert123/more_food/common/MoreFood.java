package net.volwert123.more_food.common;

import net.blay09.mods.balm.api.loot.BalmLootTables;
import net.blay09.mods.balm.api.module.BalmModule;
import net.blay09.mods.balm.world.item.BalmCreativeModeTabRegistrar;
import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.minecraft.resources.ResourceLocation;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFCreativeModeTabs;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFLootTables;

public class MoreFood implements BalmModule {
    public static final String MOD_ID = "more_food";

    @Override
    public void registerBlocks(BalmBlockRegistrar blocks) {
        MFBlocks.initialize(blocks);
    }

    @Override
    public void registerItems(BalmItemRegistrar items) {
        MFItems.initialize(items);
    }

    @Override
    public void registerCreativeModeTabs(BalmCreativeModeTabRegistrar creativeModeTabs) {
        MFCreativeModeTabs.initialize(creativeModeTabs);
    }

    @Override
    public void registerLootTables(BalmLootTables lootTables) {
        MFLootTables.initialize(lootTables);
    }

    @Override
    public ResourceLocation getId() {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, "common");
    }
}