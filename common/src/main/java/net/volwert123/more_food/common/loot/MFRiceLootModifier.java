package net.volwert123.more_food.common.loot;

import net.blay09.mods.balm.world.level.storage.loot.BalmLootModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.volwert123.more_food.common.registry.MFItems;

import java.util.List;

public class MFRiceLootModifier implements BalmLootModifier {
    private static final float DROP_CHANCE = 0.15f;

    @Override
    public void apply(LootContext context, List<ItemStack> loot) {
        if (!context.hasParameter(LootContextParams.BLOCK_STATE)) return;

        BlockState state = context.getParameter(LootContextParams.BLOCK_STATE);
        Block block = state.getBlock();
        float roll = context.getRandom().nextFloat();

        if (isRiceGrass(block) && roll < DROP_CHANCE) {
            loot.add(new ItemStack(MFItems.RICE.asItem(), 1));
        }
    }

    private boolean isRiceGrass(Block block) {
        return block == Blocks.SHORT_GRASS || block == Blocks.FERN;
    }
}