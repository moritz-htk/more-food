package net.volwert123.more_food.datagen.provider.lang;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFTags;

public class MFRussianLanguageProvider extends LanguageProvider {
    public MFRussianLanguageProvider(PackOutput output) {
        super(output, MoreFood.MOD_ID, "ru_ru");
    }

    @Override
    protected void addTranslations() {
        // Carrot Items
        add(MFItems.COOKED_CARROT.get(), "Жареная морковь");
        add(MFItems.CARROT_PIECES.get(), "Кусочки моркови");
        add(MFItems.CARROT_SOUP.get(), "Морковный суп");
        add(MFItems.CARROT_BREAD.get(), "Морковный хлеб");
        add(MFItems.CARROT_PIE.get(), "Морковный пирог");
        add(MFItems.CHOCOLATE_CARROT.get(), "Шоколадная морковь");

        // Apple Items
        add(MFItems.COOKED_APPLE.get(), "Жареное яблоко");
        add(MFItems.APPLE_PIECES.get(), "Кусочки яблока");
        add(MFItems.APPLE_SOUP.get(), "Яблочный суп");
        add(MFItems.APPLE_BREAD.get(), "Яблочный хлеб");
        add(MFItems.APPLE_PIE.get(), "Яблочный пирог");
        add(MFItems.CHOCOLATE_APPLE.get(), "Шоколадное яблоко");

        // Kelp Items
        add(MFItems.KELP_PIECES.get(), "Кусочки ламинарии");
        add(MFItems.KELP_SOUP.get(), "Ламинарийный суп");
        add(MFItems.CHOCOLATE_DRIED_KELP.get(), "Сушёная шоколадная ламинария");

        // Potato Items
        add(MFItems.POTATO_PIECES.get(), "Кусочки картофеля");
        add(MFItems.POTATO_SOUP.get(), "Картофельный суп");
        add(MFItems.POTATO_BREAD.get(), "Картофельный хлеб");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.get(), "Жареный фантом");
        add(MFItems.PHANTOM_PIECES.get(), "Кусочки фантома");
        add(MFItems.PHANTOM_SOUP.get(), "Фантомный суп");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.get(), "Жареный иглобрюх");
        add(MFItems.PUFFERFISH_PIECES.get(), "Кусочки иглобрюха");
        add(MFItems.PUFFERFISH_SOUP.get(), "Иглобрюховый суп");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.get(), "Тыквенный суп");
        add(MFItems.PUMPKING_BREAD.get(), "Тыквенный хлеб");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.get(), "Жареный бамбук");
        add(MFItems.BAMBOO_PIECES.get(), "Кусочки бамбука");
        add(MFItems.BAMBOO_SOUP.get(), "Бамбук суп");

        // Rice Items
        add(MFItems.RICE.get(), "Рис");
        add(MFItems.RICE_CHICKEN_BOWL.get(), "Рисовая миска с курицей");
        add(MFItems.RICE_SALMON_BOWL.get(), "Рисовая миска с лососем");
        add(MFItems.RICE_COD_BOWL.get(), "Рисовая миска с треской");
        add(MFItems.RICE_VEGETABLE_BOWL.get(), "Рисовая миска с овощами");
        add(MFItems.RICE_PUDDING.get(), "Рисовый пудинг");
        add(MFItems.RICE_HONEY_PUDDING.get(), "Рисовый медовый пудинг");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.get(), "Суши с бамбука");
        add(MFItems.SUSHI_CARROT.get(), "Суши с моркови");
        add(MFItems.SUSHI_BEETROOT.get(), "Суши с свёклы");
        add(MFItems.SUSHI_SALMON.get(), "Суши с лососем");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.get(), "Варёное яйцо");
        add(MFItems.RAW_BACON.get(), "Сырой бекон");
        add(MFItems.COOKED_BACON.get(), "Жареный бекон");
        add(MFItems.COOKED_BACON_EGG.get(), "Варёное яйцо с беконом");

        // Chocolate Items
        add(MFItems.CHOCOLATE.get(), "Шоколад");
        add(MFItems.CHOCOLATE_BAR.get(), "Шоколадная плитка");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.get(), "Шоколадные сладкие ягоды");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Моркови");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Ламинарии");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Картофели");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Яблоки");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_BACON, "Жареный бекон");

        // Raw Meat Food Tags
        add(MFTags.Items.FOODS_RAW_BACON, "Сырой бекон");

        // Miscellaneous Food Tags
        add(MFTags.Items.FOODS_SUSHI, "Суши");
        add(MFTags.Items.FOODS_COOKED_EGG, "Варёные яйца");

        // Crop and Seed Tags
        add(MFTags.Items.CROPS_RICE, "Рис");
        add(MFTags.Items.SEEDS_RICE, "Семена риса");
    }
}