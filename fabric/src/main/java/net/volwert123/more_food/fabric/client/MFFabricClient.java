package net.volwert123.more_food.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.volwert123.more_food.common.registry.MFBlocks;

public class MFFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(MFBlocks.RICE_CROP.get(), RenderType.cutout());
    }
}