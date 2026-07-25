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
        add(MFItems.IRON_CARROT.asItem(), "Железная морковь");
        add(MFItems.DIAMOND_CARROT.asItem(), "Алмазная морковь");
        add(MFItems.EMERALD_CARROT.asItem(), "Изумрудная морковь");
        add(MFItems.COOKED_CARROT.asItem(), "Жареная морковь");
        add(MFItems.CARROT_PIECES.asItem(), "Кусочки моркови");
        add(MFItems.CARROT_SOUP.asItem(), "Морковный суп");
        add(MFItems.CARROT_BREAD.asItem(), "Морковный хлеб");
        add(MFItems.CARROT_PIE.asItem(), "Морковный пирог");
        add(MFItems.CHOCOLATE_CARROT.asItem(), "Шоколадная морковь");

        // Apple Items
        add(MFItems.IRON_APPLE.asItem(), "Железное яблоко");
        add(MFItems.DIAMOND_APPLE.asItem(), "Алмазное яблоко");
        add(MFItems.EMERALD_APPLE.asItem(), "Изумрудное яблоко");
        add(MFItems.COOKED_APPLE.asItem(), "Жареное яблоко");
        add(MFItems.APPLE_PIECES.asItem(), "Кусочки яблока");
        add(MFItems.APPLE_SOUP.asItem(), "Яблочный суп");
        add(MFItems.APPLE_BREAD.asItem(), "Яблочный хлеб");
        add(MFItems.APPLE_PIE.asItem(), "Яблочный пирог");
        add(MFItems.CHOCOLATE_APPLE.asItem(), "Шоколадное яблоко");

        // Kelp Items
        add(MFItems.IRON_KELP.asItem(), "Железный ламинария");
        add(MFItems.GOLDEN_KELP.asItem(), "Золотистая ламинария");
        add(MFItems.DIAMOND_KELP.asItem(), "Алмазная ламинария");
        add(MFItems.EMERALD_KELP.asItem(), "Изумрудная ламинария");
        add(MFItems.KELP_PIECES.asItem(), "Кусочки ламинарии");
        add(MFItems.KELP_SOUP.asItem(), "Ламинарийный суп");
        add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Сушёная шоколадная ламинария");

        // Potato Items
        add(MFItems.IRON_POTATO.asItem(), "Железный картофель");
        add(MFItems.GOLDEN_POTATO.asItem(), "Золотой картофель");
        add(MFItems.DIAMOND_POTATO.asItem(), "Алмазный картофель");
        add(MFItems.EMERALD_POTATO.asItem(), "Изумрудный картофель");
        add(MFItems.POTATO_PIECES.asItem(), "Кусочки картофеля");
        add(MFItems.POTATO_SOUP.asItem(), "Картофельный суп");
        add(MFItems.POTATO_BREAD.asItem(), "Картофельный хлеб");

        // Sweet Berries Items
        add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Шоколадные сладкие ягоды");

        // Phantom Items
        add(MFItems.COOKED_PHANTOM.asItem(), "Жареный фантом");
        add(MFItems.PHANTOM_PIECES.asItem(), "Кусочки фантома");
        add(MFItems.PHANTOM_SOUP.asItem(), "Фантомный суп");

        // Pufferfish Items
        add(MFItems.COOKED_PUFFERFISH.asItem(), "Жареный иглобрюх");
        add(MFItems.PUFFERFISH_PIECES.asItem(), "Кусочки иглобрюха");
        add(MFItems.PUFFERFISH_SOUP.asItem(), "Иглобрюховый суп");

        // Pumpkin Items
        add(MFItems.PUMPKING_SOUP.asItem(), "Тыквенный суп");
        add(MFItems.PUMPKING_BREAD.asItem(), "Тыквенный хлеб");

        // Bamboo Items
        add(MFItems.COOKED_BAMBOO.asItem(), "Жареный бамбук");
        add(MFItems.BAMBOO_PIECES.asItem(), "Кусочки бамбука");
        add(MFItems.BAMBOO_SOUP.asItem(), "Бамбук суп");

        // Melon Slice Items
        add(MFItems.IRON_MELON_SLICE.asItem(), "Железный ломтик арбуза");
        add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Золотой ломтик арбуза");
        add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Алмазный ломтик арбуза");
        add(MFItems.EMERALD_MELON_SLICE.asItem(), "Изумрудный ломтик арбуза");

        // Cooked Rabbit Items
        add(MFItems.IRON_COOKED_RABBIT.asItem(), "Железная жареная крольчатина");
        add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Золотая жареная крольчатина");
        add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Алмазная жареная крольчатина");
        add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Изумрудная жареная крольчатина");

        // Cooked Chicken Items
        add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Железная жареная курятина");
        add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Золотая жареная курятина");
        add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Алмазная жареная курятина");
        add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Изумрудная жареная курятина");

        // Cooked Mutton Items
        add(MFItems.IRON_COOKED_MUTTON.asItem(), "Железная жареная баранина");
        add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Золотая жареная баранина");
        add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Алмазная жареная баранина");
        add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Изумрудная жареная баранина");

        // Cooked Porkchop Items
        add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Железная жареная свинина");
        add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Золотая жареная свинина");
        add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Алмазная жареная свинина");
        add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Изумрудная жареная свинина");

        // Cooked Beef Items
        add(MFItems.IRON_COOKED_BEEF.asItem(), "Железная жареная говядина");
        add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Золотая жареная говядина");
        add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Алмазная жареная говядина");
        add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Изумрудная жареная говядина");

        // Rice Items
        add(MFItems.RICE.asItem(), "Рис");
        add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Рисовая миска с курицей");
        add(MFItems.RICE_SALMON_BOWL.asItem(), "Рисовая миска с лососем");
        add(MFItems.RICE_COD_BOWL.asItem(), "Рисовая миска с треской");
        add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Рисовая миска с овощами");
        add(MFItems.RICE_PUDDING.asItem(), "Рисовый пудинг");
        add(MFItems.RICE_HONEY_PUDDING.asItem(), "Рисовый медовый пудинг");

        // Sushi Items
        add(MFItems.SUSHI_BAMBOO.asItem(), "Суши с бамбука");
        add(MFItems.SUSHI_CARROT.asItem(), "Суши с моркови");
        add(MFItems.SUSHI_BEETROOT.asItem(), "Суши с свёклы");
        add(MFItems.SUSHI_SALMON.asItem(), "Суши с лососем");

        // Egg & Bacon Items
        add(MFItems.COOKED_EGG.asItem(), "Варёное яйцо");
        add(MFItems.RAW_BACON.asItem(), "Сырой бекон");
        add(MFItems.COOKED_BACON.asItem(), "Жареный бекон");
        add(MFItems.COOKED_BACON_EGG.asItem(), "Варёное яйцо с беконом");

        // Chocolate Items
        add(MFItems.CHOCOLATE.asItem(), "Шоколад");
        add(MFItems.CHOCOLATE_BAR.asItem(), "Шоколадная плитка");

        // Creative Mode Tab
        add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Моркови");
        add(MFTags.Items.FOODS_VEGETABLES_KELP, "Ламинарии");
        add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Картофели");

        // Fruit Food Tags
        add(MFTags.Items.FOODS_FRUITS_APPLE, "Яблоки");
        add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Ломтики арбуза");

        // Cooked Meat Food Tags
        add(MFTags.Items.FOODS_COOKED_RABBIT, "Жареная крольчатина");
        add(MFTags.Items.FOODS_COOKED_CHICKEN, "Жареная курятина");
        add(MFTags.Items.FOODS_COOKED_MUTTON, "Жареная баранина");
        add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Жареная свинина");
        add(MFTags.Items.FOODS_COOKED_BEEF, "Жареная говядина");
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