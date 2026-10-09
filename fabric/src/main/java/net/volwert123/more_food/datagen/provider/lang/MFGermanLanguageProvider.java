package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFGermanLanguageProvider extends FabricLanguageProvider {
    public MFGermanLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Eisenkarotte");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Diamantkarotte");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Smaragdkarotte");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Gebratene Karotte");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Karottenstücke");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Karottensuppe");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Karottenbrot");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Karottenkuchen");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Schokoladenkarotte");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Eisenapfel");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Diamantapfel");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Smaragdapfel");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Gebratener Apfel");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Apfelstücke");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Apfelsuppe");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Apfelbrot");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Apfelkuchen");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Schokoladenapfel");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Eisenseetang");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Goldener Seetang");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Diamantseetang");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Smaragdseetang");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Seetangstücke");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Seetangsuppe");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Getrockneter Schokoladenseetang");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Eisenkartoffel");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Goldene Kartoffel");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Diamantkartoffel");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Smaragdkartoffel");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Kartoffelstücke");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Kartoffelsuppe");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Kartoffelbrot");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Schokoladensüßbeeren");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Gebratenes Phantom");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Phantomstücke");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Phantomsuppe");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Gebratener Kugelfisch");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Kugelfischstücke");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Kugelfischsuppe");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Kürbissuppe");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Kürbisbrot");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Gebratener Bambus");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Bambusstücke");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Bambussuppe");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Eisenmelonenscheibe");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Goldene Melonenscheibe");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamantmelonenscheibe");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Smaragdmelonenscheibe");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Gebratenes Eisenkaninchen");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Goldenes Gebratenes Kaninchen");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Gebratenes Diamantkaninchen");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Gebratenes Smaragdkaninchen");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Gebratenes Eisenhühnchen");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Goldenes Gebratenes Hühnchen");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Gebratenes Diamanthühnchen");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Gebratenes Smaragdhühnchen");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Gebratenes Eisenhammelfleisch");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Goldenes Gebratenes Hammelfleisch");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Gebratenes Diamanthammelfleisch");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Gebratenes Smaragdhammelfleisch");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Gebratenes Eisenschweinefleisch");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Goldenes Gebratenes Schweinefleisch");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Gebratenes Diamantschweinefleisch");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Gebratenes Smaragdschweinefleisch");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Eisensteak");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Goldenes Steak");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamantsteak");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Smaragdsteak");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Reis");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Reis-Hühnchenschüssel");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Reis-Lachsschüssel");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Reis-Kabeljauschüssel");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Reis-Gemüseschüssel");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Reispudding");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Reis-Honigpudding");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Bambus Sushi");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Karotten Sushi");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Rote Bete Sushi");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Lachs Sushi");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Gekochtes Ei");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Roher Speck");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Gebratener Speck");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Gebratenes Speckei");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Schokolade");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Schokoladentafel");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Karotten");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Seetange");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Kartoffeln");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Äpfel");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Melonenscheiben");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Gebratene Kaninchen");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Gebratene Hühnchen");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Gebratenes Hammelfleisch");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Gebratenes Schweinefleisch");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Steaks");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Gebratener Speck");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Roher Speck");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Sushi");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Gekochte Eier");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Reis");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Reissamen");
    }
}