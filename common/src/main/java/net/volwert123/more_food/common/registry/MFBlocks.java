package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.block.MFRiceCropBlock;

import java.util.function.Function;

public class MFBlocks {
    public static DeferredObject<Block> RICE_CROP;

    public static void initialize(BalmBlocks blocks) {
        BalmBlocks scoped = blocks.scoped(MoreFood.MOD_ID);

        RICE_CROP = registerBlock(scoped, "rice_crop", MFRiceCropBlock::new);
    }

    private static DeferredObject<Block> registerBlock(BalmBlocks blocks, String name, Function<Block.Properties, Block> factory) {
        return blocks.registerBlock(id -> factory.apply(BalmBlocks.blockProperties(id)), ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, name));
    }
}