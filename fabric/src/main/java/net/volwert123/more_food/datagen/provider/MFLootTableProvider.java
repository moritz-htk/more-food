package net.volwert123.more_food.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.volwert123.more_food.common.block.MFRiceCropBlock;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;

import java.util.concurrent.CompletableFuture;

public class MFLootTableProvider extends FabricBlockLootSubProvider {
    private final HolderGetter<Block> blockLookup;
    private final HolderGetter<Enchantment> enchantmentLookup;

    public MFLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
        this.blockLookup = registriesFuture.join().lookupOrThrow(Registries.BLOCK);
        this.enchantmentLookup = registriesFuture.join().lookupOrThrow(Registries.ENCHANTMENT);
    }

    @Override
    public void generate() {
        LootItemCondition.Builder isRiceMaxAge = MatchBlock.blockMatches(blockLookup, MFBlocks.RICE_CROP.asBlock(), StatePropertiesPredicate.Builder.properties().hasProperty(MFRiceCropBlock.AGE, 7));
        add(MFBlocks.RICE_CROP.asBlock(), applyExplosionDecay(MFBlocks.RICE_CROP.asBlock(), LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(MFItems.RICE.asItem()))).withPool(LootPool.lootPool().when(isRiceMaxAge).add(LootItem.lootTableItem(MFItems.RICE.asItem()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(enchantmentLookup.getOrThrow(Enchantments.FORTUNE), 0.5714286F, 3))))));
    }
}