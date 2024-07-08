package net.volwert123.more_food.fabric.loot;

import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.volwert123.more_food.registry.MFItems;

public class MFLootTableModifiers {
    private static final ResourceKey<LootTable> GRASS_BLOCK_KEY = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace("blocks/short_grass"));
    private static final ResourceKey<LootTable> FERN_BLOCK_KEY = ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.withDefaultNamespace("blocks/fern"));

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            addLoot(key, GRASS_BLOCK_KEY, tableBuilder, MFItems.RICE.get(), ConstantValue.exactly(1));
            addLoot(key, FERN_BLOCK_KEY, tableBuilder, MFItems.RICE.get(), ConstantValue.exactly(1));
        });
    }

    private static void addLoot(ResourceKey<LootTable> lootTable, ResourceKey<LootTable> id, FabricLootTableBuilder tableBuilder, Item item, NumberProvider count) {
        if (!lootTable.equals(id)) return;
        tableBuilder.pool(LootPool.lootPool().when(LootItemRandomChanceCondition.randomChance(0.15f)).add(LootItem.lootTableItem(item)).apply(SetItemCountFunction.setCount(count)).build());
    }
}