package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.world.level.block.BalmBlockRegistrar;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.volwert123.more_food.common.block.MFRiceCropBlock;

import java.util.function.Function;

public class MFBlocks {
    public static DeferredBlock RICE_CROP;

    public static void initialize(BalmBlockRegistrar blocks) {
        RICE_CROP = registerBlock(blocks, "rice_crop", MFRiceCropBlock::new);
    }

    private static DeferredBlock registerBlock(BalmBlockRegistrar blocks, String name, Function<BlockBehaviour.Properties, Block> factory) {
        return blocks.register(name, factory, BlockBehaviour.Properties.of()).asDeferredBlock();
    }
}