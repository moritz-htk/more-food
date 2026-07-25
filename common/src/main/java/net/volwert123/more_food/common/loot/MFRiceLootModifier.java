package net.volwert123.more_food.common.loot;

import net.blay09.mods.balm.world.level.storage.loot.BalmLootModifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.volwert123.more_food.common.registry.MFItems;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Set;

public class MFRiceLootModifier implements BalmLootModifier {
    private static final float DROP_CHANCE = 0.15f;
    private static final Set<Block> GRASS_BLOCKS = Set.of(Blocks.SHORT_GRASS, Blocks.FERN);

    @Override
    public void apply(LootContext context, List<ItemStack> loot, @Nullable ResourceKey<LootTable> lootTableId) {
        if (!context.hasParameter(LootContextParams.BLOCK_STATE)) {
            return;
        }

        BlockState state = context.getOptionalParameter(LootContextParams.BLOCK_STATE);

        if (!GRASS_BLOCKS.contains(state.getBlock())) return;

        var random = context.getRandom();
        if (random.nextFloat() < DROP_CHANCE) {
            loot.add(new ItemStack(MFItems.RICE.asItem()));
        }
    }
}