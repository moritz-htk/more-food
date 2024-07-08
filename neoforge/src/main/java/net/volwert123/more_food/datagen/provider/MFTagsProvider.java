package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class MFTagsProvider {
    public static class Items extends TagsProvider<Item> {
        public static final TagKey<Item> FOODS_VEGETABLES_CARROT = registerKey("foods/vegetables/carrot");
        public static final TagKey<Item> PIECES = registerKey("pieces");
        public static final TagKey<Item> FOODS_PIE = registerKey("foods/pie");
        public static final TagKey<Item> FOODS_FRUITS_APPLE = registerKey("foods/fruits/apple");
        public static final TagKey<Item> FOODS_VEGETABLES_KELP = registerKey("foods/vegetables/kelp");
        public static final TagKey<Item> FOODS_VEGETABLES_POTATO = registerKey("foods/vegetables/potato");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_RABBIT = registerKey("foods/cooked_meats/cooked_rabbit");
        public static final TagKey<Item> FOODS_VEGETABLES_MELON_SLICE = registerKey("foods/vegetables/melon_slice");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_CHICKEN = registerKey("foods/cooked_meats/cooked_chicken");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_MUTTON = registerKey("foods/cooked_meats/cooked_mutton");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_PORKCHOP = registerKey("foods/cooked_meats/cooked_porkchop");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_BEEF = registerKey("foods/cooked_meats/cooked_beef");
        public static final TagKey<Item> CROPS_RICE = registerKey("crops/rice");
        public static final TagKey<Item> FOODS_SUSHI = registerKey("foods/sushi");

        public Items(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.ITEM, registries, MoreFood.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(Tags.Items.FOODS_VEGETABLE).addOptionalTag(FOODS_VEGETABLES_CARROT).addOptionalTag(FOODS_VEGETABLES_KELP).addOptionalTag(FOODS_VEGETABLES_POTATO).addOptionalTag(FOODS_VEGETABLES_MELON_SLICE);
            tag(FOODS_VEGETABLES_CARROT).add(TagEntry.element(MFItems.IRON_CARROT.getId())).add(TagEntry.element(MFItems.DIAMOND_CARROT.getId())).add(TagEntry.element(MFItems.EMERALD_CARROT.getId())).add(TagEntry.element(MFItems.COOKED_CARROT.getId()));
            tag(PIECES).add(TagEntry.element(MFItems.CARROT_PIECES.getId())).add(TagEntry.element(MFItems.APPLE_PIECES.getId())).add(TagEntry.element(MFItems.KELP_PIECES.getId())).add(TagEntry.element(MFItems.POTATO_PIECES.getId())).add(TagEntry.element(MFItems.PHANTOM_PIECES.getId())).add(TagEntry.element(MFItems.PUFFERFISH_PIECES.getId())).add(TagEntry.element(MFItems.BAMBOO_PIECES.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.CARROT_SOUP.getId())).add(TagEntry.element(MFItems.APPLE_SOUP.getId())).add(TagEntry.element(MFItems.KELP_SOUP.getId())).add(TagEntry.element(MFItems.POTATO_SOUP.getId())).add(TagEntry.element(MFItems.PHANTOM_SOUP.getId())).add(TagEntry.element(MFItems.PUMPKING_SOUP.getId())).add(TagEntry.element(MFItems.BAMBOO_SOUP.getId()));
            tag(Tags.Items.FOODS_BREAD).add(TagEntry.element(MFItems.CARROT_BREAD.getId())).add(TagEntry.element(MFItems.APPLE_BREAD.getId())).add(TagEntry.element(MFItems.POTATO_BREAD.getId())).add(TagEntry.element(MFItems.PUMPKING_BREAD.getId()));
            tag(FOODS_PIE).add(TagEntry.element(MFItems.CARROT_PIE.getId())).add(TagEntry.element(MFItems.APPLE_PIE.getId()));
            tag(Tags.Items.FOODS_FRUIT).addOptionalTag(FOODS_FRUITS_APPLE);
            tag(FOODS_FRUITS_APPLE).add(TagEntry.element(MFItems.IRON_APPLE.getId())).add(TagEntry.element(MFItems.DIAMOND_APPLE.getId())).add(TagEntry.element(MFItems.EMERALD_APPLE.getId())).add(TagEntry.element(MFItems.COOKED_APPLE.getId()));
            tag(FOODS_VEGETABLES_KELP).add(TagEntry.element(MFItems.IRON_KELP.getId())).add(TagEntry.element(MFItems.GOLDEN_KELP.getId())).add(TagEntry.element(MFItems.DIAMOND_KELP.getId())).add(TagEntry.element(MFItems.EMERALD_KELP.getId()));
            tag(FOODS_VEGETABLES_POTATO).add(TagEntry.element(MFItems.IRON_POTATO.getId())).add(TagEntry.element(MFItems.GOLDEN_POTATO.getId())).add(TagEntry.element(MFItems.DIAMOND_POTATO.getId())).add(TagEntry.element(MFItems.EMERALD_POTATO.getId()));
            tag(Tags.Items.FOODS_FOOD_POISONING).add(TagEntry.element(MFItems.PUFFERFISH_SOUP.getId()));
            tag(Tags.Items.FOODS_COOKED_MEAT).add(TagEntry.element(MFItems.COOKED_PHANTOM.getId())).add(TagEntry.element(MFItems.COOKED_BACON.getId())).addOptionalTag(FOODS_COOKED_MEATS_COOKED_RABBIT).addOptionalTag(FOODS_COOKED_MEATS_COOKED_CHICKEN).addOptionalTag(FOODS_COOKED_MEATS_COOKED_MUTTON).addOptionalTag(FOODS_COOKED_MEATS_COOKED_PORKCHOP).addOptionalTag(FOODS_COOKED_MEATS_COOKED_BEEF);
            tag(FOODS_COOKED_MEATS_COOKED_RABBIT).add(TagEntry.element(MFItems.IRON_COOKED_RABBIT.getId())).add(TagEntry.element(MFItems.GOLDEN_COOKED_RABBIT.getId())).add(TagEntry.element(MFItems.DIAMOND_COOKED_RABBIT.getId())).add(TagEntry.element(MFItems.EMERALD_COOKED_RABBIT.getId()));
            tag(FOODS_VEGETABLES_MELON_SLICE).add(TagEntry.element(MFItems.IRON_MELON_SLICE.getId())).add(TagEntry.element(MFItems.GOLDEN_MELON_SLICE.getId())).add(TagEntry.element(MFItems.DIAMOND_MELON_SLICE.getId())).add(TagEntry.element(MFItems.EMERALD_MELON_SLICE.getId()));
            tag(FOODS_COOKED_MEATS_COOKED_CHICKEN).add(TagEntry.element(MFItems.IRON_COOKED_CHICKEN.getId())).add(TagEntry.element(MFItems.GOLDEN_COOKED_CHICKEN.getId())).add(TagEntry.element(MFItems.DIAMOND_COOKED_CHICKEN.getId())).add(TagEntry.element(MFItems.EMERALD_COOKED_CHICKEN.getId()));
            tag(FOODS_COOKED_MEATS_COOKED_MUTTON).add(TagEntry.element(MFItems.IRON_COOKED_MUTTON.getId())).add(TagEntry.element(MFItems.GOLDEN_COOKED_MUTTON.getId())).add(TagEntry.element(MFItems.DIAMOND_COOKED_MUTTON.getId())).add(TagEntry.element(MFItems.EMERALD_COOKED_MUTTON.getId()));
            tag(FOODS_COOKED_MEATS_COOKED_PORKCHOP).add(TagEntry.element(MFItems.IRON_COOKED_PORKCHOP.getId())).add(TagEntry.element(MFItems.GOLDEN_COOKED_PORKCHOP.getId())).add(TagEntry.element(MFItems.DIAMOND_COOKED_PORKCHOP.getId())).add(TagEntry.element(MFItems.EMERALD_COOKED_PORKCHOP.getId()));
            tag(FOODS_COOKED_MEATS_COOKED_BEEF).add(TagEntry.element(MFItems.IRON_COOKED_BEEF.getId())).add(TagEntry.element(MFItems.GOLDEN_COOKED_BEEF.getId())).add(TagEntry.element(MFItems.DIAMOND_COOKED_BEEF.getId())).add(TagEntry.element(MFItems.EMERALD_COOKED_BEEF.getId()));
            tag(Tags.Items.CROPS).addOptionalTag(CROPS_RICE);
            tag(CROPS_RICE).add(TagEntry.element(MFItems.RICE.getId()));
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.RICE_CHICKEN_BOWL.getId())).add(TagEntry.element(MFItems.RICE_SALMON_BOWL.getId())).add(TagEntry.element(MFItems.RICE_COD_BOWL.getId())).add(TagEntry.element(MFItems.RICE_VEGETABLE_BOWL.getId())).add(TagEntry.element(MFItems.RICE_PUDDING.getId())).add(TagEntry.element(MFItems.RICE_HONEY_PUDDING.getId())).add(TagEntry.element(MFItems.COOKED_EGG.getId())).add(TagEntry.element(MFItems.COOKED_BACON_EGG.getId())).addOptionalTag(FOODS_PIE).addOptionalTag(FOODS_SUSHI);
            tag(FOODS_SUSHI).add(TagEntry.element(MFItems.SUSHI_BAMBOO.getId())).add(TagEntry.element(MFItems.SUSHI_CARROT.getId())).add(TagEntry.element(MFItems.SUSHI_BEETROOT.getId())).add(TagEntry.element(MFItems.SUSHI_SALMON.getId()));
            tag(Tags.Items.FOODS_RAW_MEAT).add(TagEntry.element(MFItems.RAW_BACON.getId()));
            tag(Tags.Items.FOODS_CANDY).add(TagEntry.element(MFItems.CHOCOLATE.getId())).add(TagEntry.element(MFItems.CHOCOLATE_BAR.getId()));
        }

        private static TagKey<Item> registerKey(String path) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }

    public static class Blocks extends TagsProvider<Block> {
        public Blocks(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.BLOCK, registries, MoreFood.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(BlockTags.CROPS).add(TagEntry.element(MFBlocks.RICE_CROP.getId()));
        }
    }
}