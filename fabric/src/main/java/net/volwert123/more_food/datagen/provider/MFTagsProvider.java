package net.volwert123.more_food.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
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
                    MFItems.IRON_CARROT.asResourceKey(),
                    MFItems.DIAMOND_CARROT.asResourceKey(),
                    MFItems.EMERALD_CARROT.asResourceKey(),
                    MFItems.COOKED_CARROT.asResourceKey()));
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.CARROT_SOUP.asResourceKey());
            tag(ConventionalItemTags.BREAD_FOODS).add(MFItems.CARROT_BREAD.asResourceKey());
            tag(ConventionalItemTags.PIE_FOODS).add(MFItems.CARROT_PIE.asResourceKey());
            tag(ConventionalItemTags.FOODS).add(MFItems.CHOCOLATE_CARROT.asResourceKey());
        }

        private void addAppleTags() {
            tag(ConventionalItemTags.FRUIT_FOODS).addTag(MFTags.Items.FOODS_FRUITS_APPLE);
            tag(MFTags.Items.FOODS_FRUITS_APPLE).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.APPLE),
                    getKey(net.minecraft.world.item.Items.GOLDEN_APPLE),
                    getKey(net.minecraft.world.item.Items.ENCHANTED_GOLDEN_APPLE),
                    MFItems.IRON_APPLE.asResourceKey(),
                    MFItems.DIAMOND_APPLE.asResourceKey(),
                    MFItems.EMERALD_APPLE.asResourceKey(),
                    MFItems.COOKED_APPLE.asResourceKey()));
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.APPLE_SOUP.asResourceKey());
            tag(ConventionalItemTags.BREAD_FOODS).add(MFItems.APPLE_BREAD.asResourceKey());
            tag(ConventionalItemTags.PIE_FOODS).add(MFItems.APPLE_PIE.asResourceKey());
            tag(ConventionalItemTags.FOODS).add(MFItems.CHOCOLATE_APPLE.asResourceKey());
        }

        private void addKelpTags() {
            tag(ConventionalItemTags.VEGETABLE_FOODS).addTag(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(MFTags.Items.FOODS_VEGETABLES_KELP).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.DRIED_KELP),
                    MFItems.IRON_KELP.asResourceKey(),
                    MFItems.GOLDEN_KELP.asResourceKey(),
                    MFItems.DIAMOND_KELP.asResourceKey(),
                    MFItems.EMERALD_KELP.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_KELP.asResourceKey());
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.KELP_SOUP.asResourceKey());
            tag(ConventionalItemTags.FOODS).add(MFItems.CHOCOLATE_DRIED_KELP.asResourceKey());
        }

        private void addPotatoTags() {
            tag(ConventionalItemTags.VEGETABLE_FOODS).addTag(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(MFTags.Items.FOODS_VEGETABLES_POTATO).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.POTATO),
                    MFItems.IRON_POTATO.asResourceKey(),
                    MFItems.GOLDEN_POTATO.asResourceKey(),
                    MFItems.DIAMOND_POTATO.asResourceKey(),
                    MFItems.EMERALD_POTATO.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_POTATO.asResourceKey());
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.POTATO_SOUP.asResourceKey());
            tag(ConventionalItemTags.BREAD_FOODS).add(MFItems.POTATO_BREAD.asResourceKey());
        }

        private void addSweetBerriesTags() {
            tag(ConventionalItemTags.FOODS).add(MFItems.CHOCOLATE_SWEET_BERRIES.asResourceKey());
        }

        private void addPhantomTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).add(MFItems.COOKED_PHANTOM.asResourceKey());
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.PHANTOM_SOUP.asResourceKey());
        }

        private void addPufferfishTags() {
            tag(ConventionalItemTags.COOKED_FISH_FOODS).add(MFItems.COOKED_PUFFERFISH.asResourceKey());
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.PUFFERFISH_SOUP.asResourceKey());
            tag(ConventionalItemTags.FOOD_POISONING_FOODS).add(MFItems.PUFFERFISH_SOUP.asResourceKey());
        }

        private void addPumpkinTags() {
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.PUMPKING_SOUP.asResourceKey());
            tag(ConventionalItemTags.BREAD_FOODS).add(MFItems.PUMPKING_BREAD.asResourceKey());
        }

        private void addBambooTags() {
            tag(ConventionalItemTags.FOODS).add(MFItems.COOKED_BAMBOO.asResourceKey());
            tag(ConventionalItemTags.SOUP_FOODS).add(MFItems.BAMBOO_SOUP.asResourceKey());
        }

        private void addMelonSliceTags() {
            tag(ConventionalItemTags.FRUIT_FOODS).addTag(MFTags.Items.FOODS_FRUITS_MELON_SLICE);
            tag(MFTags.Items.FOODS_FRUITS_MELON_SLICE).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.MELON_SLICE),
                    MFItems.IRON_MELON_SLICE.asResourceKey(),
                    MFItems.GOLDEN_MELON_SLICE.asResourceKey(),
                    MFItems.DIAMOND_MELON_SLICE.asResourceKey(),
                    MFItems.EMERALD_MELON_SLICE.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_MELON_SLICE.asResourceKey());
        }

        private void addCookedRabbitTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_RABBIT);
            tag(MFTags.Items.FOODS_COOKED_RABBIT).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_RABBIT),
                    MFItems.IRON_COOKED_RABBIT.asResourceKey(),
                    MFItems.GOLDEN_COOKED_RABBIT.asResourceKey(),
                    MFItems.DIAMOND_COOKED_RABBIT.asResourceKey(),
                    MFItems.EMERALD_COOKED_RABBIT.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_COOKED_RABBIT.asResourceKey());
        }

        private void addCookedChickenTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_CHICKEN);
            tag(MFTags.Items.FOODS_COOKED_CHICKEN).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_CHICKEN),
                    MFItems.IRON_COOKED_CHICKEN.asResourceKey(),
                    MFItems.GOLDEN_COOKED_CHICKEN.asResourceKey(),
                    MFItems.DIAMOND_COOKED_CHICKEN.asResourceKey(),
                    MFItems.EMERALD_COOKED_CHICKEN.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_COOKED_CHICKEN.asResourceKey());
        }

        private void addCookedMuttonTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_MUTTON);
            tag(MFTags.Items.FOODS_COOKED_MUTTON).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_MUTTON),
                    MFItems.IRON_COOKED_MUTTON.asResourceKey(),
                    MFItems.GOLDEN_COOKED_MUTTON.asResourceKey(),
                    MFItems.DIAMOND_COOKED_MUTTON.asResourceKey(),
                    MFItems.EMERALD_COOKED_MUTTON.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_COOKED_MUTTON.asResourceKey());
        }

        private void addCookedPorkchopTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_PORKCHOP);
            tag(MFTags.Items.FOODS_COOKED_PORKCHOP).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_PORKCHOP),
                    MFItems.IRON_COOKED_PORKCHOP.asResourceKey(),
                    MFItems.GOLDEN_COOKED_PORKCHOP.asResourceKey(),
                    MFItems.DIAMOND_COOKED_PORKCHOP.asResourceKey(),
                    MFItems.EMERALD_COOKED_PORKCHOP.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_COOKED_PORKCHOP.asResourceKey());
        }

        private void addCookedBeefTags() {
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_BEEF);
            tag(MFTags.Items.FOODS_COOKED_BEEF).addAll(List.of(
                    getKey(net.minecraft.world.item.Items.COOKED_BEEF),
                    MFItems.IRON_COOKED_BEEF.asResourceKey(),
                    MFItems.GOLDEN_COOKED_BEEF.asResourceKey(),
                    MFItems.DIAMOND_COOKED_BEEF.asResourceKey(),
                    MFItems.EMERALD_COOKED_BEEF.asResourceKey()));
            tag(ConventionalItemTags.GOLDEN_FOODS).add(MFItems.GOLDEN_COOKED_BEEF.asResourceKey());
        }

        private void addRiceTags() {
            tag(ConventionalItemTags.CROPS).addTag(MFTags.Items.CROPS_RICE);
            tag(MFTags.Items.CROPS_RICE).add(MFItems.RICE.asResourceKey());
            tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(ConventionalItemTags.SEEDS).addTag(MFTags.Items.SEEDS_RICE);
            tag(MFTags.Items.SEEDS_RICE).add(MFItems.RICE.asResourceKey());
            tag(ConventionalItemTags.FOODS).addAll(List.of(
                    MFItems.RICE_CHICKEN_BOWL.asResourceKey(),
                    MFItems.RICE_SALMON_BOWL.asResourceKey(),
                    MFItems.RICE_COD_BOWL.asResourceKey(),
                    MFItems.RICE_VEGETABLE_BOWL.asResourceKey(),
                    MFItems.RICE_PUDDING.asResourceKey(),
                    MFItems.RICE_HONEY_PUDDING.asResourceKey()));
        }

        private void addSushiTags() {
            tag(ConventionalItemTags.FOODS).addTag(MFTags.Items.FOODS_SUSHI);
            tag(MFTags.Items.FOODS_SUSHI).addAll(List.of(
                    MFItems.SUSHI_BAMBOO.asResourceKey(),
                    MFItems.SUSHI_CARROT.asResourceKey(),
                    MFItems.SUSHI_BEETROOT.asResourceKey(),
                    MFItems.SUSHI_SALMON.asResourceKey()));
        }

        private void addEggAndBaconTags() {
            tag(ConventionalItemTags.FOODS).addTag(MFTags.Items.FOODS_COOKED_EGG);
            tag(MFTags.Items.FOODS_COOKED_EGG).add(MFItems.COOKED_EGG.asResourceKey());
            tag(ConventionalItemTags.RAW_MEAT_FOODS).addTag(MFTags.Items.FOODS_RAW_BACON);
            tag(MFTags.Items.FOODS_RAW_BACON).add(MFItems.RAW_BACON.asResourceKey());
            tag(ConventionalItemTags.COOKED_MEAT_FOODS).addTag(MFTags.Items.FOODS_COOKED_BACON);
            tag(MFTags.Items.FOODS_COOKED_BACON).add(MFItems.COOKED_BACON.asResourceKey());
            tag(ConventionalItemTags.FOODS).add(MFItems.COOKED_BACON_EGG.asResourceKey());
        }

        private void addChocolateTags() {
            tag(ConventionalItemTags.CANDY_FOODS).addAll(List.of(
                    MFItems.CHOCOLATE.asResourceKey(),
                    MFItems.CHOCOLATE_BAR.asResourceKey()));
        }

        private void addSereneSeasonCropTags() {
            tag(MFTags.Items.SERENE_SEASON_SUMMER_CROPS).add(MFItems.RICE.asResourceKey());
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
            tag(BlockTags.CROPS).add(MFBlocks.RICE_CROP.asResourceKey());
            tag(BlockTags.MAINTAINS_FARMLAND).add(MFBlocks.RICE_CROP.asResourceKey());
            tag(MFTags.Blocks.SERENE_SEASON_SUMMER_CROPS).add(MFBlocks.RICE_CROP.asResourceKey());
        }
    }
}