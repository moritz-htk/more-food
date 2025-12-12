package net.volwert123.more_food.client;

import net.blay09.mods.balm.api.client.module.BalmClientModule;
import net.blay09.mods.balm.api.client.rendering.BalmRenderers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.resources.ResourceLocation;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFBlocks;

public class MFClient implements BalmClientModule {
    @Override
    public void registerRenderers(BalmRenderers renderers) {
        renderers.setBlockRenderType(() -> MFBlocks.RICE_CROP.get(), ChunkSectionLayer.CUTOUT);
    }

    @Override
    public ResourceLocation getId() {
        return ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, "client");
    }
}