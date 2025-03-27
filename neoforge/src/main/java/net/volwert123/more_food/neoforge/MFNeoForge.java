package net.volwert123.more_food.neoforge;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.neoforge.loot.MFLootModifiers;

@Mod(MoreFood.MOD_ID)
public class MFNeoForge {
    public MFNeoForge(IEventBus modEventBus) {
        MoreFood.init();
        MFLootModifiers.LOOT_MODIFIER_SERIALIZERS.register(modEventBus);
    }

    @EventBusSubscriber(modid = MoreFood.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class BMMClientEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(MFBlocks.RICE_CROP.get(), RenderType.CUTOUT);
        }
    }
}