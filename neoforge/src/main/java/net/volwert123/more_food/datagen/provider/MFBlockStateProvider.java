package net.volwert123.more_food.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.block.MFRiceCropBlock;
import net.volwert123.more_food.common.registry.MFBlocks;

import java.util.function.Function;

public class MFBlockStateProvider extends BlockStateProvider {
    public MFBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreFood.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeCrop(MFBlocks.RICE_CROP.get());
    }

    private void makeCrop(CropBlock block) {
        Function<BlockState, ConfiguredModel[]> function = this::cropStates;
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cropStates(BlockState state) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop("rice_crop_stage" + state.getValue(MFRiceCropBlock.AGE), ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, "block/rice_crop_stage" + state.getValue(MFRiceCropBlock.AGE))).renderType("cutout"));
        return models;
    }
}