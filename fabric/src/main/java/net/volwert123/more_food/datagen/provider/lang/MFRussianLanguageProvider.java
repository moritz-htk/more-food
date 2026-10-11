package net.volwert123.more_food.datagen.provider.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.concurrent.CompletableFuture;

public class MFRussianLanguageProvider extends FabricLanguageProvider {
    public MFRussianLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        // Carrot Items
        translationBuilder.add(MFItems.IRON_CARROT.asItem(), "Железная морковь");
        translationBuilder.add(MFItems.DIAMOND_CARROT.asItem(), "Алмазная морковь");
        translationBuilder.add(MFItems.EMERALD_CARROT.asItem(), "Изумрудная морковь");
        translationBuilder.add(MFItems.COOKED_CARROT.asItem(), "Жареная морковь");
        translationBuilder.add(MFItems.CARROT_PIECES.asItem(), "Кусочки моркови");
        translationBuilder.add(MFItems.CARROT_SOUP.asItem(), "Морковный суп");
        translationBuilder.add(MFItems.CARROT_BREAD.asItem(), "Морковный хлеб");
        translationBuilder.add(MFItems.CARROT_PIE.asItem(), "Морковный пирог");
        translationBuilder.add(MFItems.CHOCOLATE_CARROT.asItem(), "Шоколадная морковь");

        // Apple Items
        translationBuilder.add(MFItems.IRON_APPLE.asItem(), "Железное яблоко");
        translationBuilder.add(MFItems.DIAMOND_APPLE.asItem(), "Алмазное яблоко");
        translationBuilder.add(MFItems.EMERALD_APPLE.asItem(), "Изумрудное яблоко");
        translationBuilder.add(MFItems.COOKED_APPLE.asItem(), "Жареное яблоко");
        translationBuilder.add(MFItems.APPLE_PIECES.asItem(), "Кусочки яблока");
        translationBuilder.add(MFItems.APPLE_SOUP.asItem(), "Яблочный суп");
        translationBuilder.add(MFItems.APPLE_BREAD.asItem(), "Яблочный хлеб");
        translationBuilder.add(MFItems.APPLE_PIE.asItem(), "Яблочный пирог");
        translationBuilder.add(MFItems.CHOCOLATE_APPLE.asItem(), "Шоколадное яблоко");

        // Kelp Items
        translationBuilder.add(MFItems.IRON_KELP.asItem(), "Железный ламинария");
        translationBuilder.add(MFItems.GOLDEN_KELP.asItem(), "Золотистая ламинария");
        translationBuilder.add(MFItems.DIAMOND_KELP.asItem(), "Алмазная ламинария");
        translationBuilder.add(MFItems.EMERALD_KELP.asItem(), "Изумрудная ламинария");
        translationBuilder.add(MFItems.KELP_PIECES.asItem(), "Кусочки ламинарии");
        translationBuilder.add(MFItems.KELP_SOUP.asItem(), "Ламинарийный суп");
        translationBuilder.add(MFItems.CHOCOLATE_DRIED_KELP.asItem(), "Сушёная шоколадная ламинария");

        // Potato Items
        translationBuilder.add(MFItems.IRON_POTATO.asItem(), "Железный картофель");
        translationBuilder.add(MFItems.GOLDEN_POTATO.asItem(), "Золотой картофель");
        translationBuilder.add(MFItems.DIAMOND_POTATO.asItem(), "Алмазный картофель");
        translationBuilder.add(MFItems.EMERALD_POTATO.asItem(), "Изумрудный картофель");
        translationBuilder.add(MFItems.POTATO_PIECES.asItem(), "Кусочки картофеля");
        translationBuilder.add(MFItems.POTATO_SOUP.asItem(), "Картофельный суп");
        translationBuilder.add(MFItems.POTATO_BREAD.asItem(), "Картофельный хлеб");

        // Sweet Berries Items
        translationBuilder.add(MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), "Шоколадные сладкие ягоды");

        // Phantom Items
        translationBuilder.add(MFItems.COOKED_PHANTOM.asItem(), "Жареный фантом");
        translationBuilder.add(MFItems.PHANTOM_PIECES.asItem(), "Кусочки фантома");
        translationBuilder.add(MFItems.PHANTOM_SOUP.asItem(), "Фантомный суп");

        // Pufferfish Items
        translationBuilder.add(MFItems.COOKED_PUFFERFISH.asItem(), "Жареный иглобрюх");
        translationBuilder.add(MFItems.PUFFERFISH_PIECES.asItem(), "Кусочки иглобрюха");
        translationBuilder.add(MFItems.PUFFERFISH_SOUP.asItem(), "Иглобрюховый суп");

        // Pumpkin Items
        translationBuilder.add(MFItems.PUMPKING_SOUP.asItem(), "Тыквенный суп");
        translationBuilder.add(MFItems.PUMPKING_BREAD.asItem(), "Тыквенный хлеб");

        // Bamboo Items
        translationBuilder.add(MFItems.COOKED_BAMBOO.asItem(), "Жареный бамбук");
        translationBuilder.add(MFItems.BAMBOO_PIECES.asItem(), "Кусочки бамбука");
        translationBuilder.add(MFItems.BAMBOO_SOUP.asItem(), "Бамбук суп");

        // Melon Slice Items
        translationBuilder.add(MFItems.IRON_MELON_SLICE.asItem(), "Железный ломтик арбуза");
        translationBuilder.add(MFItems.GOLDEN_MELON_SLICE.asItem(), "Золотой ломтик арбуза");
        translationBuilder.add(MFItems.DIAMOND_MELON_SLICE.asItem(), "Алмазный ломтик арбуза");
        translationBuilder.add(MFItems.EMERALD_MELON_SLICE.asItem(), "Изумрудный ломтик арбуза");

        // Cooked Rabbit Items
        translationBuilder.add(MFItems.IRON_COOKED_RABBIT.asItem(), "Железная жареная крольчатина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_RABBIT.asItem(), "Золотая жареная крольчатина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_RABBIT.asItem(), "Алмазная жареная крольчатина");
        translationBuilder.add(MFItems.EMERALD_COOKED_RABBIT.asItem(), "Изумрудная жареная крольчатина");

        // Cooked Chicken Items
        translationBuilder.add(MFItems.IRON_COOKED_CHICKEN.asItem(), "Железная жареная курятина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_CHICKEN.asItem(), "Золотая жареная курятина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_CHICKEN.asItem(), "Алмазная жареная курятина");
        translationBuilder.add(MFItems.EMERALD_COOKED_CHICKEN.asItem(), "Изумрудная жареная курятина");

        // Cooked Mutton Items
        translationBuilder.add(MFItems.IRON_COOKED_MUTTON.asItem(), "Железная жареная баранина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_MUTTON.asItem(), "Золотая жареная баранина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_MUTTON.asItem(), "Алмазная жареная баранина");
        translationBuilder.add(MFItems.EMERALD_COOKED_MUTTON.asItem(), "Изумрудная жареная баранина");

        // Cooked Porkchop Items
        translationBuilder.add(MFItems.IRON_COOKED_PORKCHOP.asItem(), "Железная жареная свинина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), "Золотая жареная свинина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), "Алмазная жареная свинина");
        translationBuilder.add(MFItems.EMERALD_COOKED_PORKCHOP.asItem(), "Изумрудная жареная свинина");

        // Cooked Beef Items
        translationBuilder.add(MFItems.IRON_COOKED_BEEF.asItem(), "Железная жареная говядина");
        translationBuilder.add(MFItems.GOLDEN_COOKED_BEEF.asItem(), "Золотая жареная говядина");
        translationBuilder.add(MFItems.DIAMOND_COOKED_BEEF.asItem(), "Алмазная жареная говядина");
        translationBuilder.add(MFItems.EMERALD_COOKED_BEEF.asItem(), "Изумрудная жареная говядина");

        // Rice Items
        translationBuilder.add(MFItems.RICE.asItem(), "Рис");
        translationBuilder.add(MFItems.RICE_CHICKEN_BOWL.asItem(), "Рисовая миска с курицей");
        translationBuilder.add(MFItems.RICE_SALMON_BOWL.asItem(), "Рисовая миска с лососем");
        translationBuilder.add(MFItems.RICE_COD_BOWL.asItem(), "Рисовая миска с треской");
        translationBuilder.add(MFItems.RICE_VEGETABLE_BOWL.asItem(), "Рисовая миска с овощами");
        translationBuilder.add(MFItems.RICE_PUDDING.asItem(), "Рисовый пудинг");
        translationBuilder.add(MFItems.RICE_HONEY_PUDDING.asItem(), "Рисовый медовый пудинг");

        // Sushi Items
        translationBuilder.add(MFItems.SUSHI_BAMBOO.asItem(), "Суши с бамбука");
        translationBuilder.add(MFItems.SUSHI_CARROT.asItem(), "Суши с моркови");
        translationBuilder.add(MFItems.SUSHI_BEETROOT.asItem(), "Суши с свёклы");
        translationBuilder.add(MFItems.SUSHI_SALMON.asItem(), "Суши с лососем");

        // Egg & Bacon Items
        translationBuilder.add(MFItems.COOKED_EGG.asItem(), "Варёное яйцо");
        translationBuilder.add(MFItems.RAW_BACON.asItem(), "Сырой бекон");
        translationBuilder.add(MFItems.COOKED_BACON.asItem(), "Жареный бекон");
        translationBuilder.add(MFItems.COOKED_BACON_EGG.asItem(), "Варёное яйцо с беконом");

        // Chocolate Items
        translationBuilder.add(MFItems.CHOCOLATE.asItem(), "Шоколад");
        translationBuilder.add(MFItems.CHOCOLATE_BAR.asItem(), "Шоколадная плитка");

        // Creative Mode Tab
        translationBuilder.add("itemGroup.more_food.main", "More Food");

        // Vegetable Food Tags
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_CARROT, "Моркови");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_KELP, "Ламинарии");
        translationBuilder.add(MFTags.Items.FOODS_VEGETABLES_POTATO, "Картофели");

        // Fruit Food Tags
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_APPLE, "Яблоки");
        translationBuilder.add(MFTags.Items.FOODS_FRUITS_MELON_SLICE, "Ломтики арбуза");

        // Cooked Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_COOKED_RABBIT, "Жареная крольчатина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_CHICKEN, "Жареная курятина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_MUTTON, "Жареная баранина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_PORKCHOP, "Жареная свинина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BEEF, "Жареная говядина");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_BACON, "Жареный бекон");

        // Raw Meat Food Tags
        translationBuilder.add(MFTags.Items.FOODS_RAW_BACON, "Сырой бекон");

        // Miscellaneous Food Tags
        translationBuilder.add(MFTags.Items.FOODS_SUSHI, "Суши");
        translationBuilder.add(MFTags.Items.FOODS_COOKED_EGG, "Варёные яйца");

        // Crop and Seed Tags
        translationBuilder.add(MFTags.Items.CROPS_RICE, "Рис");
        translationBuilder.add(MFTags.Items.SEEDS_RICE, "Семена риса");
    }
}