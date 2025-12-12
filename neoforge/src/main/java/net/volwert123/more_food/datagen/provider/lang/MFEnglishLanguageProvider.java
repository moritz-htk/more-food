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
        add(MFItems.IRON_CARROT.asItem(), "Iron Carrot");
        add(MFItems.DIAMOND_CARROT.asItem(), "Diamond Carrot");
        add(MFItems.EMERALD_CARROT.asItem(), "Emerald Carrot");
        add(MFItems.COOKED_CARROT.asItem(), "Cooked Carrot");
        add(MFItems.CARROT_PIECES.asItem(), "Carrot Pieces");
        add(MFItems.CARROT_SOUP.asItem(), "Carrot Soup");
        add(MFItems.CARROT_BREAD.asItem(), "Carrot Bread");
        add(MFItems.CARROT_PIE.asItem(), "Carrot Pie");
        add(MFItems.CHOCOLATE_CARROT.asItem(), "Chocolate Carrot");

        // Apple Items
        add(MFItems.IRON_APPLE.asItem(), "Iron Apple");
        add(MFItems.DIAMOND_APPLE.asItem(), "Diamond Apple");
        add(MFItems.EMERALD_APPLE.asItem(), "Emerald Apple");
        add(MFItems.COOKED_APPLE.asItem(), "Cooked Apple");
        add(MFItems.APPLE_PIECES.asItem(), "Apple Pieces");
        add(MFItems.APPLE_SOUP.asItem(), "Apple Soup");
        add(MFItems.APPLE_BREAD.asItem(), "Apple Bread");
        add(MFItems.APPLE_PIE.asItem(), "Apple Pie");
        add(MFItems.CHOCOLATE_APPLE.asItem(), "Chocolate Apple");

        // Kelp Items
        add(MFItems.IRON_KELP.asItem(), "Iron Kelp");
        add(MFItems.GOLDEN_KELP.asItem(), "Golden Kelp");
        add(MFItems.DIAMOND_KELP.asItem(), "Diamond Kelp");
        add(MFItems.EMERALD_KELP.asItem(), "Emerald Kelp");
        add(MFItems.KELP_PIECES.asItem(), "Kelp Pieces");
        add(MFItems.KELP_SOUP.asItem(), "Kelp Soup");
        add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Chocolate Dried Kelp");

        // Potato Items
        add(MFItems.IRON_POTATO.asItem(), "Iron Potato");
        add(MFItems.GOLDEN_POTATO.asItem(), "Golden Potato");
        add(MFItems.DIAMOND_POTATO.asItem(), "Diamond Potato");
        add(MFItems.EMERALD_POTATO.asItem(), "Emerald Potato");
        add(MFItems.POTATO_PIECES.asItem(), "Potato Pieces");
        add(MFItems.POTATO_SOUP.asItem(), "Potato Soup");
        add(MFItems.POTATO_BREAD.asItem(), "Potato Bread");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Chocolate Sweet Berries");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.asItem(), "Cooked Phantom");
        add(MFItems.PHANTOM_PIECES.asItem(), "Phantom Pieces");
        add(MFItems.PHANTOM_SOUP.asItem(), "Phantom Soup");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.asItem(), "Cooked Pufferfish");
        add(MFItems.PUFFERFISH_PIECES.asItem(), "Pufferfish Pieces");
        add(MFItems.PUFFERFISH_SOUP.asItem(), "Pufferfish Soup");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.asItem(), "Pumpkin Soup");
        add(MFItems.PUMPKING_BREAD.asItem(), "Pumpkin Bread");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.asItem(), "Cooked Bamboo");
        add(MFItems.BAMBOO_PIECES.asItem(), "Bamboo Pieces");
        add(MFItems.BAMBOO_SOUP.asItem(), "Bamboo Soup");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.asItem(), "Iron Melon Slice");
        add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Golden Melon Slice");
        add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamond Melon Slice");
        add(MFItems.EMERALD_MELON_SLICE.asItem(), "Emerald Melon Slice");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.asItem(), "Iron Cooked Rabbit");
        add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Golden Cooked Rabbit");
        add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Diamond Cooked Rabbit");
        add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Emerald Cooked Rabbit");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Iron Cooked Chicken");
        add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Golden Cooked Chicken");
        add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Diamond Cooked Chicken");
        add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Emerald Cooked Chicken");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.asItem(), "Iron Cooked Mutton");
        add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Golden Cooked Mutton");
        add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Diamond Cooked Mutton");
        add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Emerald Cooked Mutton");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Iron Cooked Porkchop");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Golden Cooked Porkchop");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Diamond Cooked Porkchop");
        add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Emerald Cooked Porkchop");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.asItem(), "Iron Cooked Beef");
        add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Golden Cooked Beef");
        add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamond Cooked Beef");
        add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Emerald Cooked Beef");

        // Rice Items
        add(MFItems.RICE.asItem(), "Rice");
        add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Rice Chicken Bowl");
        add(MFItems.RICE_SALMON_BOWL.asItem(), "Rice Salmon Bowl");
        add(MFItems.RICE_COD_BOWL.asItem(), "Rice Cod Bowl");
        add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Rice Vegetable Bowl");
        add(MFItems.RICE_PUDDING.asItem(), "Rice Pudding");
        add(MFItems.RICE_HONEY_PUDDING.asItem(), "Rice Honey Pudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi Bamboo");
        add(MFItems.SUSHI_CARROT.asItem(), "Sushi Carrot");
        add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi Beetroot");
        add(MFItems.SUSHI_SALMON.asItem(), "Sushi Salmon");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.asItem(), "Cooked Egg");
        add(MFItems.RAW_BACON.asItem(), "Raw Bacon");
        add(MFItems.COOKED_BACON.asItem(), "Cooked Bacon");
        add(MFItems.COOKED_BACON_EGG.asItem(), "Cooked Bacon Egg");

        // Chocolate Items
        add(MFItems.CHOCOLATE.asItem(), "Chocolate");
        add(MFItems.CHOCOLATE_BAR.asItem(), "Chocolate Bar");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carrots");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Kelps");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Potatoes");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Apples");
        add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Melon Slices");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_RABBIT, "Cooked Rabbits");
        add(MFTags.Items.FOODS_COOKED_CHICKEN, "Cooked Chickens");
        add(MFTags.Items.FOODS_COOKED_MUTTON, "Cooked Muttons");
        add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Cooked Porkchops");
        add(MFTags.Items.FOODS_COOKED_BEEF, "Cooked Beefs");
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