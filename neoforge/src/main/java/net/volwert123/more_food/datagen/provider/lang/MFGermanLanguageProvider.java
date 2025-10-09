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
        add(MFItems.COOKED_CARROT.get(), "Gebratene Karotte");
        add(MFItems.CARROT_PIECES.get(), "Karottenstücke");
        add(MFItems.CARROT_SOUP.get(), "Karottensuppe");
        add(MFItems.CARROT_BREAD.get(), "Karottenbrot");
        add(MFItems.CARROT_PIE.get(), "Karottenkuchen");
        add(MFItems.CHOCOLATE_CARROT.get(), "Schokoladenkarotte");

        // Apple Items
        add(MFItems.COOKED_APPLE.get(), "Gebratener Apfel");
        add(MFItems.APPLE_PIECES.get(), "Apfelstücke");
        add(MFItems.APPLE_SOUP.get(), "Apfelsuppe");
        add(MFItems.APPLE_BREAD.get(), "Apfelbrot");
        add(MFItems.APPLE_PIE.get(), "Apfelkuchen");
        add(MFItems.CHOCOLATE_APPLE.get(), "Schokoladenapfel");

        // Kelp Items
        add(MFItems.KELP_PIECES.get(), "Seetangstücke");
        add(MFItems.KELP_SOUP.get(), "Seetangsuppe");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Getrockneter Schokoladenseetang");

        // Potato Items
        add(MFItems.POTATO_PIECES.get(), "Kartoffelstücke");
        add(MFItems.POTATO_SOUP.get(), "Kartoffelsuppe");
        add(MFItems.POTATO_BREAD.get(), "Kartoffelbrot");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Gebratenes Phantom");
        add(MFItems.PHANTOM_PIECES.get(), "Phantomstücke");
        add(MFItems.PHANTOM_SOUP.get(), "Phantomsuppe");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Gebratener Kugelfisch");
        add(MFItems.PUFFERFISH_PIECES.get(), "Kugelfischstücke");
        add(MFItems.PUFFERFISH_SOUP.get(), "Kugelfischsuppe");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Kürbissuppe");
        add(MFItems.PUMPKING_BREAD.get(), "Kürbisbrot");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Gebratener Bambus");
        add(MFItems.BAMBOO_PIECES.get(), "Bambusstücke");
        add(MFItems.BAMBOO_SOUP.get(), "Bambussuppe");

        // Rice Items
        add(MFItems.RICE.get(), "Reis");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Reis-Hühnchenschüssel");
        add(MFItems.RICE_SALMON_BOWL.get(), "Reis-Lachsschüssel");
        add(MFItems.RICE_COD_BOWL.get(), "Reis-Kabeljauschüssel");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Reis-Gemüseschüssel");
        add(MFItems.RICE_PUDDING.get(), "Reispudding");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Reis-Honigpudding");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Bambus Sushi");
        add(MFItems.SUSHI_CARROT.get(), "Karotten Sushi");
        add(MFItems.SUSHI_BEETROOT.get(), "Rote Bete Sushi");
        add(MFItems.SUSHI_SALMON.get(), "Lachs Sushi");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Gekochtes Ei");
        add(MFItems.RAW_BACON.get(), "Roher Speck");
        add(MFItems.COOKED_BACON.get(), "Gebratener Speck");
        add(MFItems.COOKED_BACON_EGG.get(), "Gebratenes Speckei");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Schokolade");
        add(MFItems.CHOCOLATE_BAR.get(), "Schokoladentafel");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Schokoladensüßbeeren");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Karotten");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Seetange");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Kartoffeln");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Äpfel");

        // Cooked Meat Food Tags
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