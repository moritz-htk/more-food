package net.volwert123.more_food.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.volwert123.more_food.common.registry.MFBlocks;

public class MFFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(MFBlocks.RICE_CROP.get(), ChunkSectionLayer.CUTOUT);
    }
}