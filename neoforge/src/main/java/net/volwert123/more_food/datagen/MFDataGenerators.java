package net.volwert123.more_food.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.datagen.provider.*;
import net.volwert123.more_food.datagen.provider.lang.MFEnglishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFFrenchLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFGermanLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFRussianLanguageProvider;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MoreFood.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MFDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.createProvider(MFEnglishLanguageProvider::new);
        event.createProvider(MFFrenchLanguageProvider::new);
        event.createProvider(MFGermanLanguageProvider::new);
        event.createProvider(MFRussianLanguageProvider::new);

        event.addProvider(new MFGlobalLootModifierProvider(packOutput, lookupProvider));
        event.addProvider(MFLootTableProvider.create(packOutput, lookupProvider));
        event.createProvider(MFModelProvider::new);
        event.addProvider(new MFTagsProvider.Items(packOutput, lookupProvider));
        event.addProvider(new MFRecipeProvider.Runner(packOutput, lookupProvider));
        event.addProvider(new MFTagsProvider.Blocks(packOutput, lookupProvider));
    }
}