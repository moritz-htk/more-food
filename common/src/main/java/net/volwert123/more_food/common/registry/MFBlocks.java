package net.volwert123.more_food.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.block.MFRiceCropBlock;

public class MFBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MoreFood.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<MFRiceCropBlock> RICE_CROP = BLOCKS.register("rice_crop", () -> new MFRiceCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).setId(registerBlockId("rice_crop")).noCollission().noOcclusion()));

    private static ResourceKey<Block> registerBlockId(String id) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, id));
    }
}