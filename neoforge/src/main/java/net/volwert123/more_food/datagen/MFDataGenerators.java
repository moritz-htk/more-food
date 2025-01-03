package net.volwert123.more_food.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.datagen.provider.*;
import net.volwert123.more_food.datagen.provider.lang.*;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MoreFood.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class MFDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new MFEnglishLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFFrenchLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFGermanLanguageProvider(packOutput));
        generator.addProvider(event.includeClient(), new MFRussianLanguageProvider(packOutput));

        generator.addProvider(event.includeClient(), new MFBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new MFItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new MFGlobalLootModifierProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new MFTagsProvider.Items(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new MFTagsProvider.Blocks(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), MFLootTableProvider.create(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new MFRecipeProvider(packOutput, lookupProvider));
    }
}