package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFTags;

public class MFEnglishLanguageProvider extends LanguageProvider {
    public MFEnglishLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.COOKED_CARROT.get(), "Cooked Carrot");
        add(MFItems.CARROT_PIECES.get(), "Carrot Pieces");
        add(MFItems.CARROT_SOUP.get(), "Carrot Soup");
        add(MFItems.CARROT_BREAD.get(), "Carrot Bread");
        add(MFItems.CARROT_PIE.get(), "Carrot Pie");
        add(MFItems.CHOCOLATE_CARROT.get(), "Chocolate Carrot");

        // Apple Items
        add(MFItems.COOKED_APPLE.get(), "Cooked Apple");
        add(MFItems.APPLE_PIECES.get(), "Apple Pieces");
        add(MFItems.APPLE_SOUP.get(), "Apple Soup");
        add(MFItems.APPLE_BREAD.get(), "Apple Bread");
        add(MFItems.APPLE_PIE.get(), "Apple Pie");
        add(MFItems.CHOCOLATE_APPLE.get(), "Chocolate Apple");

        // Kelp Items
        add(MFItems.KELP_PIECES.get(), "Kelp Pieces");
        add(MFItems.KELP_SOUP.get(), "Kelp Soup");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Chocolate Dried Kelp");

        // Potato Items
        add(MFItems.POTATO_PIECES.get(), "Potato Pieces");
        add(MFItems.POTATO_SOUP.get(), "Potato Soup");
        add(MFItems.POTATO_BREAD.get(), "Potato Bread");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Cooked Phantom");
        add(MFItems.PHANTOM_PIECES.get(), "Phantom Pieces");
        add(MFItems.PHANTOM_SOUP.get(), "Phantom Soup");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Cooked Pufferfish");
        add(MFItems.PUFFERFISH_PIECES.get(), "Pufferfish Pieces");
        add(MFItems.PUFFERFISH_SOUP.get(), "Pufferfish Soup");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Pumpkin Soup");
        add(MFItems.PUMPKING_BREAD.get(), "Pumpkin Bread");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Cooked Bamboo");
        add(MFItems.BAMBOO_PIECES.get(), "Bamboo Pieces");
        add(MFItems.BAMBOO_SOUP.get(), "Bamboo Soup");

        // Rice Items
        add(MFItems.RICE.get(), "Rice");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Rice Chicken Bowl");
        add(MFItems.RICE_SALMON_BOWL.get(), "Rice Salmon Bowl");
        add(MFItems.RICE_COD_BOWL.get(), "Rice Cod Bowl");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Rice Vegetable Bowl");
        add(MFItems.RICE_PUDDING.get(), "Rice Pudding");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Rice Honey Pudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Sushi Bamboo");
        add(MFItems.SUSHI_CARROT.get(), "Sushi Carrot");
        add(MFItems.SUSHI_BEETROOT.get(), "Sushi Beetroot");
        add(MFItems.SUSHI_SALMON.get(), "Sushi Salmon");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Cooked Egg");
        add(MFItems.RAW_BACON.get(), "Raw Bacon");
        add(MFItems.COOKED_BACON.get(), "Cooked Bacon");
        add(MFItems.COOKED_BACON_EGG.get(), "Cooked Bacon Egg");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Chocolate");
        add(MFItems.CHOCOLATE_BAR.get(), "Chocolate Bar");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Chocolate Sweet Berries");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carrots");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Kelps");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Potatoes");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Apples");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_BACON, "Cooked Bacons");

        // Raw Meat Food Tags
        add(MFTags.Items.FOODS_RAW_BACON, "Raw Bacons");

        // Miscellaneous Food Tags
        add(MFTags.Items.FOODS_SUSHI, "Sushi");
        add(MFTags.Items.FOODS_COOKED_EGG, "Cooked Eggs");

        // Crop and Seed Tags
        add(MFTags.Items.CROPS_RICE, "Rice");
        add(MFTags.Items.SEEDS_RICE, "Rice Seeds");
    }
}