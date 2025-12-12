package net.volwert123.more_food.client;

import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.resources.ResourceLocation;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFBlocks;

public class MFClient implements BalmClientModule {
    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar blockRenderTypes) {
        blockRenderTypes.setRenderLayer(MFBlocks.RICE_CROP, ChunkSectionLayer.CUTOUT);
    }

    @Override
    public ResourceLocation getId() {
        return ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, "client");
    }
}