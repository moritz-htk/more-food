package net.volwert123.more_food.datagen.provider;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.registry.MFTags;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MFTagsProvider {
    public static class Items extends TagsProvider<Item> {
        public Items(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, Registries.ITEM, registries, MoreFood.MOD_ID);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            addCarrotTags();
            addAppleTags();
            addKelpTags();
            addPotatoTags();
            addPhantomTags();
            addPufferfishTags();
            addPumpkinTags();
            addBambooTags();
            addRiceTags();
            addSushiTags();
            addEggAndBaconTags();
            addChocolateTags();
            addSweetBerriesTags();
            addSereneSeasonCropTags();
        }

        private void addCarrotTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_CARROT);
            tag(MFTags.Items.FOODS_VEGETABLES_CARROT).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("carrot")),
                    getKey(MFItems.COOKED_CARROT)));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.CARROT_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.CARROT_BREAD));
            tag(Tags.Items.FOODS_PIE).add(getKey(MFItems.CARROT_PIE));
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_CARROT));
        }

        private void addAppleTags() {
            tag(Tags.Items.FOODS_FRUIT).addTag(MFTags.Items.FOODS_FRUITS_APPLE);
            tag(MFTags.Items.FOODS_FRUITS_APPLE).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("apple")),
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("golden_apple")),
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("enchanted_golden_apple")),
                    getKey(MFItems.COOKED_APPLE)));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.APPLE_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.APPLE_BREAD));
            tag(Tags.Items.FOODS_PIE).add(getKey(MFItems.APPLE_PIE));
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_APPLE));
        }

        private void addKelpTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.KELP_SOUP));
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_DRIED_KELP));
        }

        private void addPotatoTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.POTATO_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.POTATO_BREAD));
        }

        private void addPhantomTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).add(getKey(MFItems.COOKED_PHANTOM));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.PHANTOM_SOUP));
        }

        private void addPufferfishTags() {
            tag(Tags.Items.FOODS_COOKED_FISH).add(getKey(MFItems.COOKED_PUFFERFISH));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.PUFFERFISH_SOUP));
            tag(Tags.Items.FOODS_FOOD_POISONING).add(getKey(MFItems.PUFFERFISH_SOUP));
        }

        private void addPumpkinTags() {
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.PUMPKING_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.PUMPKING_BREAD));
        }

        private void addBambooTags() {
            tag(Tags.Items.FOODS).add(getKey(MFItems.COOKED_BAMBOO));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.BAMBOO_SOUP));
        }

        private void addRiceTags() {
            tag(Tags.Items.CROPS).addTag(MFTags.Items.CROPS_RICE);
            tag(MFTags.Items.CROPS_RICE).add(getKey(MFItems.RICE));
            tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(Tags.Items.SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(MFTags.Items.SEEDS_RICE).add(getKey(MFItems.RICE));
            tag(Tags.Items.FOODS).addAll(List.of(
                    getKey(MFItems.RICE_CHICKEN_BOWL),
                    getKey(MFItems.RICE_SALMON_BOWL),
                    getKey(MFItems.RICE_COD_BOWL),
                    getKey(MFItems.RICE_VEGETABLE_BOWL),
                    getKey(MFItems.RICE_PUDDING),
                    getKey(MFItems.RICE_HONEY_PUDDING)));
        }

        private void addSushiTags() {
            tag(Tags.Items.FOODS).addTag(MFTags.Items.FOODS_SUSHI);
            tag(MFTags.Items.FOODS_SUSHI).addAll(List.of(
                    getKey(MFItems.SUSHI_BAMBOO),
                    getKey(MFItems.SUSHI_CARROT),
                    getKey(MFItems.SUSHI_BEETROOT),
                    getKey(MFItems.SUSHI_SALMON)));
        }

        private void addEggAndBaconTags() {
            tag(Tags.Items.FOODS).addTag(MFTags.Items.FOODS_COOKED_EGG);
            tag(MFTags.Items.FOODS_COOKED_EGG).add(getKey(MFItems.COOKED_EGG));
            tag(Tags.Items.FOODS_RAW_MEAT).addTag(MFTags.Items.FOODS_RAW_BACON);
            tag(MFTags.Items.FOODS_RAW_BACON).add(getKey(MFItems.RAW_BACON));
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_BACON);
            tag(MFTags.Items.FOODS_COOKED_BACON).add(getKey(MFItems.COOKED_BACON));
            tag(Tags.Items.FOODS).add(getKey(MFItems.COOKED_BACON_EGG));
        }

        private void addChocolateTags() {
            tag(Tags.Items.FOODS_CANDY).addAll(List.of(
                    getKey(MFItems.CHOCOLATE),
                    getKey(MFItems.CHOCOLATE_BAR)));
        }

        private void addSweetBerriesTags() {
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_SWEET_BERRIES));
        }

        private void addSereneSeasonCropTags() {
            tag(MFTags.Items.SERENE_SEASON_SUMMER_CROPS).add(getKey(MFItems.RICE));
        }

        private TagAppender<ResourceKey<Item>, Item> tag(TagKey<Item> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private ResourceKey<Item> getKey(DeferredObject<Item> item) {
            return BalmItems.itemId(item.getIdentifier());
        }
    }

    public static class Blocks extends TagsProvider<Block> {
        public Blocks(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, Registries.BLOCK, registries, MoreFood.MOD_ID);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(BlockTags.CROPS).add(getKey(MFBlocks.RICE_CROP));
            tag(BlockTags.MAINTAINS_FARMLAND).add(getKey(MFBlocks.RICE_CROP));
            tag(MFTags.Blocks.SERENE_SEASON_SUMMER_CROPS).add(getKey(MFBlocks.RICE_CROP));
        }

        private TagAppender<ResourceKey<Block>, Block> tag(TagKey<Block> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private ResourceKey<Block> getKey(DeferredObject<Block> block) {
            return BalmBlocks.blockId(block.getIdentifier());
        }
    }
}