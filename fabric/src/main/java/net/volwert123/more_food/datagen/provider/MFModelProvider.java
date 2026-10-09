package net.volwert123.more_food.datagen.provider;

import net.blay09.mods.balm.world.item.DeferredItem;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.volwert123.more_food.common.block.MFRiceCropBlock;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;

import java.util.Set;

public class MFModelProvider extends FabricModelProvider {
    public MFModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createCropBlock(MFBlocks.RICE_CROP.asBlock(), MFRiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        for (DeferredItem item : MFItems.ITEMS) {
            Set<Item> excludedItems = Set.of(MFItems.RICE.asItem());
            if (!excludedItems.contains(item.asItem())) {
                itemModelGenerators.generateFlatItem(item.asItem(), ModelTemplates.FLAT_ITEM);
            }
        }
    }
}