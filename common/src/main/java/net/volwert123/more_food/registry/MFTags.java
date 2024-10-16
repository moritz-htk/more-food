package net.volwert123.more_food.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class MFTags {
    public static class Items {
        public static final TagKey<Item> FOODS_VEGETABLES_CARROT = registerCommonKey("foods/vegetables/carrot");
        public static final TagKey<Item> FOODS_FRUITS_APPLE = registerCommonKey("foods/fruits/apple");
        public static final TagKey<Item> FOODS_VEGETABLES_KELP = registerCommonKey("foods/vegetables/kelp");
        public static final TagKey<Item> FOODS_VEGETABLES_POTATO = registerCommonKey("foods/vegetables/potato");
        public static final TagKey<Item> FOODS_COOKED_RABBIT = registerCommonKey("foods/cooked_meat/cooked_rabbit");
        public static final TagKey<Item> FOODS_VEGETABLES_MELON_SLICE = registerCommonKey("foods/vegetables/melon_slice");
        public static final TagKey<Item> FOODS_COOKED_CHICKEN = registerCommonKey("foods/cooked_meat/cooked_chicken");
        public static final TagKey<Item> FOODS_COOKED_MUTTON = registerCommonKey("foods/cooked_meat/cooked_mutton");
        public static final TagKey<Item> FOODS_COOKED_PORKCHOP = registerCommonKey("foods/cooked_meat/cooked_porkchop");
        public static final TagKey<Item> FOODS_COOKED_BEEF = registerCommonKey("foods/cooked_meat/cooked_beef");
        public static final TagKey<Item> CROPS_RICE = registerCommonKey("crops/rice");
        public static final TagKey<Item> SEEDS_RICE = registerCommonKey("seeds/rice");
        public static final TagKey<Item> FOODS_SUSHI = registerCommonKey("foods/sushi");
        public static final TagKey<Item> FOODS_COOKED_EGG = registerCommonKey("foods/cooked_egg");
        public static final TagKey<Item> FOODS_RAW_BACON = registerCommonKey("foods/raw_meat/raw_bacon");
        public static final TagKey<Item> FOODS_COOKED_BACON = registerCommonKey("foods/cooked_meat/cooked_bacon");
        public static final TagKey<Item> SERENE_SEASON_SUMMER_CROPS = registerCompatibilityKey("sereneseasons", "summer_crops");

        private static TagKey<Item> registerCommonKey(String path) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
        }

        private static TagKey<Item> registerCompatibilityKey(String namespace, String path) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> SERENE_SEASON_SUMMER_CROPS = registerCompatibilityKey("sereneseasons", "summer_crops");

        private static TagKey<Block> registerCompatibilityKey(String namespace, String path) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}