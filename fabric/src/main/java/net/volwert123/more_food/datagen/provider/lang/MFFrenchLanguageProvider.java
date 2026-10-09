package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFFrenchLanguageProvider extends FabricLanguageProvider {
    public MFFrenchLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Carotte de fer");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Carotte de diamant");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Carotte d'émeraude");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Carotte cuite");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Morceaux de carotte");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Soupe de carotte");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Pain à la carotte");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Tarte à la carotte");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Carotte en chocolat");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Pomme de fer");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Pomme de diamant");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Pomme d'émeraude");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Pomme cuite");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Morceaux de pomme");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Soupe de pomme");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Pain à la pomme");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Tarte à la pommes");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Pomme en chocolat");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Algue de fer");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Algue dorée");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Algue de diamant");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Algue d'émeraude");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Morceaux d'algue");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Soupe d'algue");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Algue séchée au chocolat");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Pomme de terre de fer");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Pomme de terre dorée");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Pomme de terre de diamant");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Pomme de terre d'émeraude");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Morceaux de pomme de terre");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Soupe de pommes de terre");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Pain à la pommes de terre");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Baies sucrées au chocolat");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Phantom cuit");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Morceaux de phantom");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Soupe de phantom");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Poisson-globe cuit");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Morceaux de poisson-globe");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Soupe de poisson-globe");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Soupe de citrouille");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Pain à la citrouille");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Bambou cuit");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Morceaux de bambou");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Soupe de bambou");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Tranche de pastèque de fer");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Tranche de pastèque dorée");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Tranche de pastèque de diamant");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Tranche de pastèque d'émeraude");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Lapin cuit de fer");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Lapin cuit doré");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Lapin cuit de diamant");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Lapin cuit d'émeraude");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Poulet rôti de fer");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Poulet rôti doré");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Poulet rôti de diamant");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Poulet rôti d'émeraude");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Mouton cuit de fer");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Mouton cuit doré");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Mouton cuit de diamant");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Mouton cuit d'émeraude");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite de fer");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite dorée");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite de diamant");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Côtelette de porc cuite d'émeraude");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Steak de fer");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Steak doré");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Steak de diamant");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Steak d'émeraude");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Riz");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Bol de riz au poulet");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Bol de riz au saumon");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Bol de riz au morue");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Bol de riz aux légumes");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Riz au lait");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Riz au lait et au miel");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Sushi de bambou");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Sushi de carotte");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Sushi de betterave");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Sushi de saumon");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Œuf cuit");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Bacon cru");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Bacon cuit");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Œuf au bacon cuit");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Chocolat");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Tablette de chocolat");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Carottes");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Algues");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Pommes de terre");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Pommes");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Tranches de pastèque");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Lapins cuit");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Poulets cuit");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Moutons cuit");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Côtelettes de porc cuite");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Steaks cuit");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Bacon cuit");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Bacon cru");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Œufs cuit");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Riz");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Graines de riz");
    }
}