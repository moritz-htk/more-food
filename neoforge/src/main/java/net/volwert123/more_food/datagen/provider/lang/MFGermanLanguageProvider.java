package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFTags;

public class MFGermanLanguageProvider extends LanguageProvider {
    public MFGermanLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "de_de");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.IRON_CARROT.asItem(), "Eisenkarotte");
        add(MFItems.DIAMOND_CARROT.asItem(), "Diamantkarotte");
        add(MFItems.EMERALD_CARROT.asItem(), "Smaragdkarotte");
        add(MFItems.COOKED_CARROT.asItem(), "Gebratene Karotte");
        add(MFItems.CARROT_PIECES.asItem(), "Karottenstücke");
        add(MFItems.CARROT_SOUP.asItem(), "Karottensuppe");
        add(MFItems.CARROT_BREAD.asItem(), "Karottenbrot");
        add(MFItems.CARROT_PIE.asItem(), "Karottenkuchen");
        add(MFItems.CHOCOLATE_CARROT.asItem(), "Schokoladenkarotte");

        // Apple Items
        add(MFItems.IRON_APPLE.asItem(), "Eisenapfel");
        add(MFItems.DIAMOND_APPLE.asItem(), "Diamantapfel");
        add(MFItems.EMERALD_APPLE.asItem(), "Smaragdapfel");
        add(MFItems.COOKED_APPLE.asItem(), "Gebratener Apfel");
        add(MFItems.APPLE_PIECES.asItem(), "Apfelstücke");
        add(MFItems.APPLE_SOUP.asItem(), "Apfelsuppe");
        add(MFItems.APPLE_BREAD.asItem(), "Apfelbrot");
        add(MFItems.APPLE_PIE.asItem(), "Apfelkuchen");
        add(MFItems.CHOCOLATE_APPLE.asItem(), "Schokoladenapfel");

        // Kelp Items
        add(MFItems.IRON_KELP.asItem(), "Eisenseetang");
        add(MFItems.GOLDEN_KELP.asItem(), "Goldener Seetang");
        add(MFItems.DIAMOND_KELP.asItem(), "Diamantseetang");
        add(MFItems.EMERALD_KELP.asItem(), "Smaragdseetang");
        add(MFItems.KELP_PIECES.asItem(), "Seetangstücke");
        add(MFItems.KELP_SOUP.asItem(), "Seetangsuppe");
        add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Getrockneter Schokoladenseetang");

        // Potato Items
        add(MFItems.IRON_POTATO.asItem(), "Eisenkartoffel");
        add(MFItems.GOLDEN_POTATO.asItem(), "Goldene Kartoffel");
        add(MFItems.DIAMOND_POTATO.asItem(), "Diamantkartoffel");
        add(MFItems.EMERALD_POTATO.asItem(), "Smaragdkartoffel");
        add(MFItems.POTATO_PIECES.asItem(), "Kartoffelstücke");
        add(MFItems.POTATO_SOUP.asItem(), "Kartoffelsuppe");
        add(MFItems.POTATO_BREAD.asItem(), "Kartoffelbrot");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Schokoladensüßbeeren");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.asItem(), "Gebratenes Phantom");
        add(MFItems.PHANTOM_PIECES.asItem(), "Phantomstücke");
        add(MFItems.PHANTOM_SOUP.asItem(), "Phantomsuppe");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.asItem(), "Gebratener Kugelfisch");
        add(MFItems.PUFFERFISH_PIECES.asItem(), "Kugelfischstücke");
        add(MFItems.PUFFERFISH_SOUP.asItem(), "Kugelfischsuppe");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.asItem(), "Kürbissuppe");
        add(MFItems.PUMPKING_BREAD.asItem(), "Kürbisbrot");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.asItem(), "Gebratener Bambus");
        add(MFItems.BAMBOO_PIECES.asItem(), "Bambusstücke");
        add(MFItems.BAMBOO_SOUP.asItem(), "Bambussuppe");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.asItem(), "Eisenmelonenscheibe");
        add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Goldene Melonenscheibe");
        add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Diamantmelonenscheibe");
        add(MFItems.EMERALD_MELON_SLICE.asItem(), "Smaragdmelonenscheibe");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.asItem(), "Gebratenes Eisenkaninchen");
        add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Goldenes Gebratenes Kaninchen");
        add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Gebratenes Diamantkaninchen");
        add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Gebratenes Smaragdkaninchen");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Gebratenes Eisenhühnchen");
        add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Goldenes Gebratenes Hühnchen");
        add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Gebratenes Diamanthühnchen");
        add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Gebratenes Smaragdhühnchen");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.asItem(), "Gebratenes Eisenhammelfleisch");
        add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Goldenes Gebratenes Hammelfleisch");
        add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Gebratenes Diamanthammelfleisch");
        add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Gebratenes Smaragdhammelfleisch");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Gebratenes Eisenschweinefleisch");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Goldenes Gebratenes Schweinefleisch");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Gebratenes Diamantschweinefleisch");
        add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Gebratenes Smaragdschweinefleisch");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.asItem(), "Eisensteak");
        add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Goldenes Steak");
        add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Diamantsteak");
        add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Smaragdsteak");

        // Rice Items
        add(MFItems.RICE.asItem(), "Reis");
        add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Reis-Hühnchenschüssel");
        add(MFItems.RICE_SALMON_BOWL.asItem(), "Reis-Lachsschüssel");
        add(MFItems.RICE_COD_BOWL.asItem(), "Reis-Kabeljauschüssel");
        add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Reis-Gemüseschüssel");
        add(MFItems.RICE_PUDDING.asItem(), "Reispudding");
        add(MFItems.RICE_HONEY_PUDDING.asItem(), "Reis-Honigpudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.asItem(), "Bambus Sushi");
        add(MFItems.SUSHI_CARROT.asItem(), "Karotten Sushi");
        add(MFItems.SUSHI_BEETROOT.asItem(), "Rote Bete Sushi");
        add(MFItems.SUSHI_SALMON.asItem(), "Lachs Sushi");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.asItem(), "Gekochtes Ei");
        add(MFItems.RAW_BACON.asItem(), "Roher Speck");
        add(MFItems.COOKED_BACON.asItem(), "Gebratener Speck");
        add(MFItems.COOKED_BACON_EGG.asItem(), "Gebratenes Speckei");

        // Chocolate Items
        add(MFItems.CHOCOLATE.asItem(), "Schokolade");
        add(MFItems.CHOCOLATE_BAR.asItem(), "Schokoladentafel");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Karotten");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Seetange");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Kartoffeln");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Äpfel");
        add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Melonenscheiben");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_RABBIT, "Gebratene Kaninchen");
        add(MFTags.Items.FOODS_COOKED_CHICKEN, "Gebratene Hühnchen");
        add(MFTags.Items.FOODS_COOKED_MUTTON, "Gebratenes Hammelfleisch");
        add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Gebratenes Schweinefleisch");
        add(MFTags.Items.FOODS_COOKED_BEEF, "Steaks");
        add(MFTags.Items.FOODS_COOKED_BACON, "Gebratener Speck");

        // Raw Meat Food Tags
        add(MFTags.Items.FOODS_RAW_BACON, "Roher Speck");

        // Miscellaneous Food Tags
        add(MFTags.Items.FOODS_SUSHI, "Sushi");
        add(MFTags.Items.FOODS_COOKED_EGG, "Gekochte Eier");

        // Crop and Seed Tags
        add(MFTags.Items.CROPS_RICE, "Reis");
        add(MFTags.Items.SEEDS_RICE, "Reissamen");
    }
}