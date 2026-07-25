package net.volwert123.more_food.client;

import net.blay09.mods.balm.client.platform.module.BalmClientModule;
import net.blay09.mods.balm.client.renderer.chunk.BalmBlockRenderTypeRegistrar;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.resources.Identifier;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFBlocks;

public class MFClient implements BalmClientModule {
    @Override
    public void registerBlockRenderTypes(BalmBlockRenderTypeRegistrar blockRenderTypes) {
        blockRenderTypes.setRenderLayer(MFBlocks.RICE_CROP, ChunkSectionLayer.CUTOUT);
    }

    @Override
    public Identifier getId() {
        return Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, "client");
    }
}