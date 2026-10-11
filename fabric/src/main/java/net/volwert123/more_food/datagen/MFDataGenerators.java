package net.volwert123.more_food.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.volwert123.more_food.datagen.provider.MFLootTableProvider;
import net.volwert123.more_food.datagen.provider.MFModelProvider;
import net.volwert123.more_food.datagen.provider.MFRecipeProvider;
import net.volwert123.more_food.datagen.provider.MFTagsProvider;
import net.volwert123.more_food.datagen.provider.lang.MFEnglishLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFFrenchLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFGermanLanguageProvider;
import net.volwert123.more_food.datagen.provider.lang.MFRussianLanguageProvider;

public class MFDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(MFLootTableProvider::new);
        pack.addProvider(MFModelProvider::new);
        pack.addProvider(MFRecipeProvider::new);
        pack.addProvider(MFTagsProvider.Items::new);
        pack.addProvider(MFTagsProvider.Blocks::new);

        pack.addProvider(MFEnglishLanguageProvider::new);
        pack.addProvider(MFFrenchLanguageProvider::new);
        pack.addProvider(MFGermanLanguageProvider::new);
        pack.addProvider(MFRussianLanguageProvider::new);
    }
}