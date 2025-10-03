package net.volwert123.more_food.common;

import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.item.BalmItems;
import net.blay09.mods.balm.api.loot.BalmLootTables;
import net.blay09.mods.balm.api.module.BalmModule;
import net.minecraft.resources.ResourceLocation;
import net.volwert123.more_food.common.registry.MFLootTables;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;

public class MoreFood implements BalmModule {
    public static final String MOD_ID = "more_food";

    @Override
    public void registerBlocks(BalmBlocks blocks) {
        MFBlocks.initialize(blocks);
    }

    @Override
    public void registerItems(BalmItems items) {
        MFItems.initialize(items);
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