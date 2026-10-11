package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFEnglishLanguageProvider extends FabricLanguageProvider {
    public MFEnglishLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Iron Carrot");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Diamond Carrot");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Emerald Carrot");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Cooked Carrot");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Carrot Pieces");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Carrot Soup");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Carrot Bread");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Carrot Pie");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Chocolate Carrot");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Iron Apple");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Diamond Apple");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Emerald Apple");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Cooked Apple");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Apple Pieces");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Apple Soup");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Apple Bread");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Apple Pie");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Chocolate Apple");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Iron Kelp");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Golden Kelp");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Diamond Kelp");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Emerald Kelp");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Kelp Pieces");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Kelp Soup");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Chocolate Dried Kelp");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Iron Potato");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Golden Potato");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Diamond Potato");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Emerald Potato");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Potato Pieces");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Potato Soup");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Potato Bread");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Chocolate Sweet Berries");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Cooked Phantom");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Phantom Pieces");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Phantom Soup");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Cooked Pufferfish");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Pufferfish Pieces");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Pufferfish Soup");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Pumpkin Soup");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pumpkin Bread");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Cooked Bamboo");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Bamboo Pieces");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Bamboo Soup");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Iron Melon Slice");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Golden Melon Slice");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamond Melon Slice");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Emerald Melon Slice");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Iron Cooked Rabbit");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Golden Cooked Rabbit");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Diamond Cooked Rabbit");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Emerald Cooked Rabbit");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Iron Cooked Chicken");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Golden Cooked Chicken");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Diamond Cooked Chicken");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Emerald Cooked Chicken");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Iron Cooked Mutton");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Golden Cooked Mutton");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Diamond Cooked Mutton");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Emerald Cooked Mutton");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Iron Cooked Porkchop");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Golden Cooked Porkchop");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Diamond Cooked Porkchop");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Emerald Cooked Porkchop");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Iron Cooked Beef");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Golden Cooked Beef");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamond Cooked Beef");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Emerald Cooked Beef");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Rice");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Rice Chicken Bowl");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Rice Salmon Bowl");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Rice Cod Bowl");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Rice Vegetable Bowl");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Rice Pudding");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Rice Honey Pudding");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi Bamboo");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Sushi Carrot");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi Beetroot");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Sushi Salmon");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Cooked Egg");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Raw Bacon");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Cooked Bacon");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Cooked Bacon Egg");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Chocolate");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Chocolate Bar");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carrots");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Kelps");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Potatoes");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Apples");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Melon Slices");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Cooked Rabbits");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Cooked Chickens");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Cooked Muttons");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Cooked Porkchops");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Cooked Beefs");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Cooked Bacons");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Raw Bacons");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Cooked Eggs");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Rice");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Rice Seeds");
    }
}