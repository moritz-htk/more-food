package net.volwert123.more_food.datagen.provider;

import net.blay09.mods.balm.world.item.DeferredItem;
import net.blay09.mods.balm.world.level.block.DeferredBlock;
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
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_CARROT);
            tag(MFTags.Items.FOODS_VEGETABLES_CARROT).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("carrot")),
                    getKey(MFItems.IRON_CARROT),
                    getKey(MFItems.DIAMOND_CARROT),
                    getKey(MFItems.EMERALD_CARROT),
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
                    getKey(MFItems.IRON_APPLE),
                    getKey(MFItems.DIAMOND_APPLE),
                    getKey(MFItems.EMERALD_APPLE),
                    getKey(MFItems.COOKED_APPLE)));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.APPLE_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.APPLE_BREAD));
            tag(Tags.Items.FOODS_PIE).add(getKey(MFItems.APPLE_PIE));
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_APPLE));
        }

        private void addKelpTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(MFTags.Items.FOODS_VEGETABLES_KELP).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("dried_kelp")),
                    getKey(MFItems.IRON_KELP),
                    getKey(MFItems.GOLDEN_KELP),
                    getKey(MFItems.DIAMOND_KELP),
                    getKey(MFItems.EMERALD_KELP)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_KELP));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.KELP_SOUP));
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_DRIED_KELP));
        }

        private void addPotatoTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTag(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(MFTags.Items.FOODS_VEGETABLES_POTATO).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("potato")),
                    getKey(MFItems.IRON_POTATO),
                    getKey(MFItems.GOLDEN_POTATO),
                    getKey(MFItems.DIAMOND_POTATO),
                    getKey(MFItems.EMERALD_POTATO)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_POTATO));
            tag(Tags.Items.FOODS_SOUP).add(getKey(MFItems.POTATO_SOUP));
            tag(Tags.Items.FOODS_BREAD).add(getKey(MFItems.POTATO_BREAD));
        }

        private void addSweetBerriesTags() {
            tag(Tags.Items.FOODS).add(getKey(MFItems.CHOCOLATE_SWEET_BERRIES));
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

        private void addMelonSliceTags() {
            tag(Tags.Items.FOODS_FRUIT).addTag(MFTags.Items.FOODS_FRUITS_MELON_SLICE);
            tag(MFTags.Items.FOODS_FRUITS_MELON_SLICE).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("melon_slice")),
                    getKey(MFItems.IRON_MELON_SLICE),
                    getKey(MFItems.GOLDEN_MELON_SLICE),
                    getKey(MFItems.DIAMOND_MELON_SLICE),
                    getKey(MFItems.EMERALD_MELON_SLICE)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_MELON_SLICE));
        }

        private void addCookedRabbitTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_RABBIT);
            tag(MFTags.Items.FOODS_COOKED_RABBIT).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_rabbit")),
                    getKey(MFItems.IRON_COOKED_RABBIT),
                    getKey(MFItems.GOLDEN_COOKED_RABBIT),
                    getKey(MFItems.DIAMOND_COOKED_RABBIT),
                    getKey(MFItems.EMERALD_COOKED_RABBIT)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_COOKED_RABBIT));
        }

        private void addCookedChickenTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_CHICKEN);
            tag(MFTags.Items.FOODS_COOKED_CHICKEN).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_chicken")),
                    getKey(MFItems.IRON_COOKED_CHICKEN),
                    getKey(MFItems.GOLDEN_COOKED_CHICKEN),
                    getKey(MFItems.DIAMOND_COOKED_CHICKEN),
                    getKey(MFItems.EMERALD_COOKED_CHICKEN)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_COOKED_CHICKEN));
        }

        private void addCookedMuttonTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_MUTTON);
            tag(MFTags.Items.FOODS_COOKED_MUTTON).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_mutton")),
                    getKey(MFItems.IRON_COOKED_MUTTON),
                    getKey(MFItems.GOLDEN_COOKED_MUTTON),
                    getKey(MFItems.DIAMOND_COOKED_MUTTON),
                    getKey(MFItems.EMERALD_COOKED_MUTTON)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_COOKED_MUTTON));
        }

        private void addCookedPorkchopTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_PORKCHOP);
            tag(MFTags.Items.FOODS_COOKED_PORKCHOP).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_porkchop")),
                    getKey(MFItems.IRON_COOKED_PORKCHOP),
                    getKey(MFItems.GOLDEN_COOKED_PORKCHOP),
                    getKey(MFItems.DIAMOND_COOKED_PORKCHOP),
                    getKey(MFItems.EMERALD_COOKED_PORKCHOP)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_COOKED_PORKCHOP));
        }

        private void addCookedBeefTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTag(MFTags.Items.FOODS_COOKED_BEEF);
            tag(MFTags.Items.FOODS_COOKED_BEEF).addAll(List.of(
                    ResourceKey.create(Registries.ITEM, ResourceLocation.withDefaultNamespace("cooked_beef")),
                    getKey(MFItems.IRON_COOKED_BEEF),
                    getKey(MFItems.GOLDEN_COOKED_BEEF),
                    getKey(MFItems.DIAMOND_COOKED_BEEF),
                    getKey(MFItems.EMERALD_COOKED_BEEF)));
            tag(Tags.Items.FOODS_GOLDEN).add(getKey(MFItems.GOLDEN_COOKED_BEEF));
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

        private void addSereneSeasonCropTags() {
            tag(MFTags.Items.SERENE_SEASON_SUMMER_CROPS).add(getKey(MFItems.RICE));
        }

        private TagAppender<ResourceKey<Item>, Item> tag(TagKey<Item> tag) {
            TagBuilder tagbuilder = this.getOrCreateRawBuilder(tag);
            return TagAppender.forBuilder(tagbuilder);
        }

        private ResourceKey<Item> getKey(DeferredItem item) {
            return item.getKey();
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

        private ResourceKey<Block> getKey(DeferredBlock block) {
            return block.getKey();
        }
    }
}