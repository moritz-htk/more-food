package net.volwert123.more_food.forge;

import net.blay09.mods.balm.Balm;
import net.blay09.mods.balm.client.BalmClient;
import net.blay09.mods.balm.forge.platform.runtime.ForgeLoadContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.volwert123.more_food.client.MFClient;
import net.volwert123.more_food.common.MoreFood;

@Mod(value = MoreFood.MOD_ID)
public class MFForge {
    public MFForge(FMLJavaModLoadingContext context) {
        final var loadContext = new ForgeLoadContext(context.getModBusGroup());
        Balm.initializeMod(MoreFood.MOD_ID, loadContext, new MoreFood());

        if (FMLEnvironment.dist.isClient()) {
            BalmClient.initializeMod(MoreFood.MOD_ID, loadContext, new MFClient());
        }
    }
}