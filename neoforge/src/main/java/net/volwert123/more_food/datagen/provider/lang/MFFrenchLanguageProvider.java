package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFTags;

public class MFFrenchLanguageProvider extends LanguageProvider {
    public MFFrenchLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.asItem(), "Carotte de fer");
        add(MFItems.DIAMOND_CARROT.asItem(), "Carotte de diamant");
        add(MFItems.EMERALD_CARROT.asItem(), "Carotte d'émeraude");
        add(MFItems.COOKED_CARROT.asItem(), "Carotte cuite");
        add(MFItems.CARROT_PIECES.asItem(), "Morceaux de carotte");
        add(MFItems.CARROT_SOUP.asItem(), "Soupe de carotte");
        add(MFItems.CARROT_BREAD.asItem(), "Pain à la carotte");
        add(MFItems.CARROT_PIE.asItem(), "Tarte à la carotte");
        add(MFItems.CHOCOLATE_CARROT.asItem(), "Carotte en chocolat");

        // Apple Items
        add(MFItems.IRON_APPLE.asItem(), "Pomme de fer");
        add(MFItems.DIAMOND_APPLE.asItem(), "Pomme de diamant");
        add(MFItems.EMERALD_APPLE.asItem(), "Pomme d'émeraude");
        add(MFItems.COOKED_APPLE.asItem(), "Pomme cuite");
        add(MFItems.APPLE_PIECES.asItem(), "Morceaux de pomme");
        add(MFItems.APPLE_SOUP.asItem(), "Soupe de pomme");
        add(MFItems.APPLE_BREAD.asItem(), "Pain à la pomme");
        add(MFItems.APPLE_PIE.asItem(), "Tarte à la pommes");
        add(MFItems.CHOCOLATE_APPLE.asItem(), "Pomme en chocolat");

        // Kelp Items
        add(MFItems.IRON_KELP.asItem(), "Algue de fer");
        add(MFItems.GOLDEN_KELP.asItem(), "Algue dorée");
        add(MFItems.DIAMOND_KELP.asItem(), "Algue de diamant");
        add(MFItems.EMERALD_KELP.asItem(), "Algue d'émeraude");
        add(MFItems.KELP_PIECES.asItem(), "Morceaux d'algue");
        add(MFItems.KELP_SOUP.asItem(), "Soupe d'algue");
        add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Algue séchée au chocolat");

        // Potato Items
        add(MFItems.IRON_POTATO.asItem(), "Pomme de terre de fer");
        add(MFItems.GOLDEN_POTATO.asItem(), "Pomme de terre dorée");
        add(MFItems.DIAMOND_POTATO.asItem(), "Pomme de terre de diamant");
        add(MFItems.EMERALD_POTATO.asItem(), "Pomme de terre d'émeraude");
        add(MFItems.POTATO_PIECES.asItem(), "Morceaux de pomme de terre");
        add(MFItems.POTATO_SOUP.asItem(), "Soupe de pommes de terre");
        add(MFItems.POTATO_BREAD.asItem(), "Pain à la pommes de terre");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Baies sucrées au chocolat");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.asItem(), "Phantom cuit");
        add(MFItems.PHANTOM_PIECES.asItem(), "Morceaux de phantom");
        add(MFItems.PHANTOM_SOUP.asItem(), "Soupe de phantom");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.asItem(), "Poisson-globe cuit");
        add(MFItems.PUFFERFISH_PIECES.asItem(), "Morceaux de poisson-globe");
        add(MFItems.PUFFERFISH_SOUP.asItem(), "Soupe de poisson-globe");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.asItem(), "Soupe de citrouille");
        add(MFItems.PUMPKING_BREAD.asItem(), "Pain à la citrouille");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.asItem(), "Bambou cuit");
        add(MFItems.BAMBOO_PIECES.asItem(), "Morceaux de bambou");
        add(MFItems.BAMBOO_SOUP.asItem(), "Soupe de bambou");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.asItem(), "Tranche de pastèque de fer");
        add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Tranche de pastèque dorée");
        add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Tranche de pastèque de diamant");
        add(MFItems.EMERALD_MELON_SLICE.asItem(), "Tranche de pastèque d'émeraude");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.asItem(), "Lapin cuit de fer");
        add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Lapin cuit doré");
        add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Lapin cuit de diamant");
        add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Lapin cuit d'émeraude");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Poulet rôti de fer");
        add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Poulet rôti doré");
        add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Poulet rôti de diamant");
        add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Poulet rôti d'émeraude");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.asItem(), "Mouton cuit de fer");
        add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Mouton cuit doré");
        add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Mouton cuit de diamant");
        add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Mouton cuit d'émeraude");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite de fer");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite dorée");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite de diamant");
        add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite d'émeraude");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.asItem(), "Steak de fer");
        add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Steak doré");
        add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Steak de diamant");
        add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Steak d'émeraude");

        // Rice Items
        add(MFItems.RICE.asItem(), "Riz");
        add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Bol de riz au poulet");
        add(MFItems.RICE_SALMON_BOWL.asItem(), "Bol de riz au saumon");
        add(MFItems.RICE_COD_BOWL.asItem(), "Bol de riz au morue");
        add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Bol de riz aux légumes");
        add(MFItems.RICE_PUDDING.asItem(), "Riz au lait");
        add(MFItems.RICE_HONEY_PUDDING.asItem(), "Riz au lait et au miel");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi de bambou");
        add(MFItems.SUSHI_CARROT.asItem(), "Sushi de carotte");
        add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi de betterave");
        add(MFItems.SUSHI_SALMON.asItem(), "Sushi de saumon");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.asItem(), "Œuf cuit");
        add(MFItems.RAW_BACON.asItem(), "Bacon cru");
        add(MFItems.COOKED_BACON.asItem(), "Bacon cuit");
        add(MFItems.COOKED_BACON_EGG.asItem(), "Œuf au bacon cuit");

        // Chocolate Items
        add(MFItems.CHOCOLATE.asItem(), "Chocolat");
        add(MFItems.CHOCOLATE_BAR.asItem(), "Tablette de chocolat");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carottes");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Algues");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Pommes de terre");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Pommes");
        add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Tranches de pastèque");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_RABBIT, "Lapins cuit");
        add(MFTags.Items.FOODS_COOKED_CHICKEN, "Poulets cuit");
        add(MFTags.Items.FOODS_COOKED_MUTTON, "Moutons cuit");
        add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Côtelettes de porc cuite");
        add(MFTags.Items.FOODS_COOKED_BEEF, "Steaks cuit");
        add(MFTags.Items.FOODS_COOKED_BACON, "Bacon cuit");

        // Raw Meat Food Tags
        add(MFTags.Items.FOODS_RAW_BACON, "Bacon cru");

        // Miscellaneous Food Tags
        add(MFTags.Items.FOODS_SUSHI, "Sushi");
        add(MFTags.Items.FOODS_COOKED_EGG, "Œufs cuit");

        // Crop and Seed Tags
        add(MFTags.Items.CROPS_RICE, "Riz");
        add(MFTags.Items.SEEDS_RICE, "Graines de riz");
    }
}