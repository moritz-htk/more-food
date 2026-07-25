package net.volwert123.more_food.datagen.provider;

import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.block.MFRiceCropBlock;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class MFModelProvider extends ModelProvider {
    public MFModelProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID);
    }

    @Override
    protected void registerModels(@NotNull BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {
        generateBlockStateModels(blockModels);
        generateItemModels(itemModels);
    }

    private void generateBlockStateModels(BlockModelGenerators blockModels) {
        blockModels.createCropBlock(MFBlocks.RICE_CROP.asBlock(), MFRiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    private void generateItemModels(ItemModelGenerators itemModels) {
        for (DeferredItem item : MFItems.ITEMS) {
            Set<Item> excludedItems = Set.of(MFItems.RICE.asItem());
            if (!excludedItems.contains(item.asItem())) {
                itemModels.generateFlatItem(item.asItem(), ModelTemplates.FLAT_ITEM);
            }
        }
    }
}