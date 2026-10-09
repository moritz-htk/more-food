package net.volwert123.more_food.datagen.provider;

import net.blay09.mods.balm.world.level.block.DeferredBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.volwert123.more_food.common.registry.MFBlocks;
import net.volwert123.more_food.common.registry.MFItems;
import net.volwert123.more_food.common.tags.MFTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MFTagsProvider {
    public static class Items extends FabricTagsProvider.ItemTagsProvider {
        public Items(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture, new Blocks(output, registryLookupFuture));
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {
            addCarrotTags();
            addAppleTags();
            addKelpTags();
            addPotatoTags();
            addPhantomTags();
            addPufferfishTags();
            addPumpkinTags();
            addBambooTags();
            addMelonSliceTags();
            addCookedRabbitTags();
            addCookedChickenTags();
            addCookedMuttonTags();
            addCookedPorkchopTags();
            addCookedBeefTags();
            addRiceTags();
            addSushiTags();
            addEggAndBaconTags();
            addChocolateTags();
            addSweetBerriesTags();
            addSereneSeasonCropTags();
        }

        private void addCarrotTags() {
            tag(ConventionalItemTags.VEGETABLE_FOODS).addTag(MFTags.Items.FOODS_VEGETABLES_CARROT);
            tag(MFTags.Items.FOODS_VEGETABLES_CARROT).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.CARROT),
                    getKey(MFItems.IRON_CARROT),
                    getKey(MFItems.DIAMOND_CARROT),
                    getKey(MFItems.EMERALD_CARROT),
                    getKey(MFItems.COOKED_CARROT)));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.CARROT_SOUP));
            tag(ConventionalItemTags.BREAD_FOODS).add(getKey(MFItems.CARROT_BREAD));
            tag(ConventionalItemTags.PIE_FOODS).add(getKey(MFItems.CARROT_PIE));
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.CHOCOLATE_CARROT));
        }

        private void addAppleTags() {
            tag(ConventionalItemTags.FRUIT_FOODS).addTag(MFTags.Items.FOODS_FRUITS_APPLE);
            tag(MFTags.Items.FOODS_FRUITS_APPLE).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.APPLE),
                    getKey(net.minecraft.world.item.Items.GOLDEN_APPLE),
                    getKey(net.minecraft.world.item.Items.ENCHANTED_GOLDEN_APPLE),
                    getKey(MFItems.IRON_APPLE),
                    getKey(MFItems.DIAMOND_APPLE),
                    getKey(MFItems.EMERALD_APPLE),
                    getKey(MFItems.COOKED_APPLE)));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.APPLE_SOUP));
            tag(ConventionalItemTags.BREAD_FOODS).add(getKey(MFItems.APPLE_BREAD));
            tag(ConventionalItemTags.PIE_FOODS).add(getKey(MFItems.APPLE_PIE));
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.CHOCOLATE_APPLE));
        }

        private void addKelpTags() {
            tag(ConventionalItemTags.VEGETABLE_FOODS).addTag(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(MFTags.Items.FOODS_VEGETABLES_KELP).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.DRIED_KELP),
                    getKey(MFItems.IRON_KELP),
                    getKey(MFItems.GOLDEN_KELP),
                    getKey(MFItems.DIAMOND_KELP),
                    getKey(MFItems.EMERALD_KELP)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_KELP));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.KELP_SOUP));
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.CHOCOLATE_DRIED_KELP));
        }

        private void addPotatoTags() {
            tag(ConventionalItemTags.VEGETABLE_FOODS).addTag(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(MFTags.Items.FOODS_VEGETABLES_POTATO).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.POTATO),
                    getKey(MFItems.IRON_POTATO),
                    getKey(MFItems.GOLDEN_POTATO),
                    getKey(MFItems.DIAMOND_POTATO),
                    getKey(MFItems.EMERALD_POTATO)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_POTATO));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.POTATO_SOUP));
            tag(ConventionalItemTags.BREAD_FOODS).add(getKey(MFItems.POTATO_BREAD));
        }

        private void addSweetBerriesTags() {
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.CHOCOLATE_SWEET_BERRIES));
        }

        private void addPhantomTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).add(getKey(MFItems.COOKED_PHANTOM));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.PHANTOM_SOUP));
        }

        private void addPufferfishTags() {
            tag(ConventionalItemTags.COOKED_FISH_FOODS).add(getKey(MFItems.COOKED_PUFFERFISH));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.PUFFERFISH_SOUP));
            tag(ConventionalItemTags.FOOD_POISONING_FOODS).add(getKey(MFItems.PUFFERFISH_SOUP));
        }

        private void addPumpkinTags() {
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.PUMPKING_SOUP));
            tag(ConventionalItemTags.BREAD_FOODS).add(getKey(MFItems.PUMPKING_BREAD));
        }

        private void addBambooTags() {
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.COOKED_BAMBOO));
            tag(ConventionalItemTags.SOUP_FOODS).add(getKey(MFItems.BAMBOO_SOUP));
        }

        private void addMelonSliceTags() {
            tag(ConventionalItemTags.FRUIT_FOODS).addTag(MFTags.Items.FOODS_FRUITS_MELON_SLICE);
            tag(MFTags.Items.FOODS_FRUITS_MELON_SLICE).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.MELON_SLICE),
                    getKey(MFItems.IRON_MELON_SLICE),
                    getKey(MFItems.GOLDEN_MELON_SLICE),
                    getKey(MFItems.DIAMOND_MELON_SLICE),
                    getKey(MFItems.EMERALD_MELON_SLICE)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_MELON_SLICE));
        }

        private void addCookedRabbitTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_RABBIT);
            tag(MFTags.Items.FOODS_COOKED_RABBIT).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_RABBIT),
                    getKey(MFItems.IRON_COOKED_RABBIT),
                    getKey(MFItems.GOLDEN_COOKED_RABBIT),
                    getKey(MFItems.DIAMOND_COOKED_RABBIT),
                    getKey(MFItems.EMERALD_COOKED_RABBIT)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_COOKED_RABBIT));
        }

        private void addCookedChickenTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_CHICKEN);
            tag(MFTags.Items.FOODS_COOKED_CHICKEN).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_CHICKEN),
                    getKey(MFItems.IRON_COOKED_CHICKEN),
                    getKey(MFItems.GOLDEN_COOKED_CHICKEN),
                    getKey(MFItems.DIAMOND_COOKED_CHICKEN),
                    getKey(MFItems.EMERALD_COOKED_CHICKEN)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_COOKED_CHICKEN));
        }

        private void addCookedMuttonTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_MUTTON);
            tag(MFTags.Items.FOODS_COOKED_MUTTON).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_MUTTON),
                    getKey(MFItems.IRON_COOKED_MUTTON),
                    getKey(MFItems.GOLDEN_COOKED_MUTTON),
                    getKey(MFItems.DIAMOND_COOKED_MUTTON),
                    getKey(MFItems.EMERALD_COOKED_MUTTON)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_COOKED_MUTTON));
        }

        private void addCookedPorkchopTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_PORKCHOP);
            tag(MFTags.Items.FOODS_COOKED_PORKCHOP).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_PORKCHOP),
                    getKey(MFItems.IRON_COOKED_PORKCHOP),
                    getKey(MFItems.GOLDEN_COOKED_PORKCHOP),
                    getKey(MFItems.DIAMOND_COOKED_PORKCHOP),
                    getKey(MFItems.EMERALD_COOKED_PORKCHOP)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_COOKED_PORKCHOP));
        }

        private void addCookedBeefTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_BEEF);
            tag(MFTags.Items.FOODS_COOKED_BEEF).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_BEEF),
                    getKey(MFItems.IRON_COOKED_BEEF),
                    getKey(MFItems.GOLDEN_COOKED_BEEF),
                    getKey(MFItems.DIAMOND_COOKED_BEEF),
                    getKey(MFItems.EMERALD_COOKED_BEEF)));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(getKey(MFItems.GOLDEN_COOKED_BEEF));
        }

        private void addRiceTags() {
            tag(ConventionalItemTags.CROPS).addTag(MFTags.Items.CROPS_RICE);
            tag(MFTags.Items.CROPS_RICE).add(getKey(MFItems.RICE));
            tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(ConventionalItemTags.SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(MFTags.Items.SEEDS_RICE).add(getKey(MFItems.RICE));
            tag(ConventionalItemTags.FOODS).addAll(List.of(
                    getKey(MFItems.RICE_CHICKEN_BOWL),
                    getKey(MFItems.RICE_SALMON_BOWL),
                    getKey(MFItems.RICE_COD_BOWL),
                    getKey(MFItems.RICE_VEGETABLE_BOWL),
                    getKey(MFItems.RICE_PUDDING),
                    getKey(MFItems.RICE_HONEY_PUDDING)));
        }

        private void addSushiTags() {
            tag(ConventionalItemTags.FOODS).addTag(MFTags.Items.FOODS_SUSHI);
            tag(MFTags.Items.FOODS_SUSHI).addAll(List.of(
                    getKey(MFItems.SUSHI_BAMBOO),
                    getKey(MFItems.SUSHI_CARROT),
                    getKey(MFItems.SUSHI_BEETROOT),
                    getKey(MFItems.SUSHI_SALMON)));
        }

        private void addEggAndBaconTags() {
            tag(ConventionalItemTags.FOODS).addTag(MFTags.Items.FOODS_COOKED_EGG);
            tag(MFTags.Items.FOODS_COOKED_EGG).add(getKey(MFItems.COOKED_EGG));
            tag(ConventionalItemTags.RAW_MEAT_FOODS).addTag(MFTags.Items.FOODS_RAW_BACON);
            tag(MFTags.Items.FOODS_RAW_BACON).add(getKey(MFItems.RAW_BACON));
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_BACON);
            tag(MFTags.Items.FOODS_COOKED_BACON).add(getKey(MFItems.COOKED_BACON));
            tag(ConventionalItemTags.FOODS).add(getKey(MFItems.COOKED_BACON_EGG));
        }

        private void addChocolateTags() {
            tag(ConventionalItemTags.CANDY_FOODS).addAll(List.of(
                    getKey(MFItems.CHOCOLATE),
                    getKey(MFItems.CHOCOLATE_BAR)));
        }

        private void addSereneSeasonCropTags() {
            tag(MFTags.Items.SERENE_SEASON_SUMMER_CROPS).add(getKey(MFItems.RICE));
        }

        private TagAppender<ResourceKey<Item>, Item> tag(TagKey<Item> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private ResourceKey<Item> getKey(ItemLike item) {
            return item.asItem().builtInRegistryHolder().key();
        }
    }

    public static class Blocks extends FabricTagsProvider.BlockTagsProvider {
        public Blocks(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
            super(output, registryLookupFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider registries) {
            tag(BlockTags.CROPS).add(getKey(MFBlocks.RICE_CROP));
            tag(BlockTags.MAINTAINS_FARMLAND).add(getKey(MFBlocks.RICE_CROP));
            tag(MFTags.Blocks.SERENE_SEASON_SUMMER_CROPS).add(getKey(MFBlocks.RICE_CROP));
        }

        private TagAppender<ResourceKey<Block>, Block> tag(TagKey<Block> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private ResourceKey<Block> getKey(DeferredBlock block) {
            return block.unwrapKey().get();
        }
    }
}