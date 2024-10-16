package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFItems;
import net.volwert123.more_food.registry.MFTags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unchecked")
public class MFTagsProvider {
    public static class Items extends TagsProvider<Item> {
        public Items(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.ITEM, registries, MoreFood.MOD_ID, existingFileHelper);
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
            addCookedRabbitTags();
            addMelonSliceTags();
            addCookedChickenTags();
            addCookedMuttonTags();
            addCookedPorkchopTags();
            addCookedBeefTags();
            addRiceTags();
            addSushiTags();
            addEggAndBaconTags();
            addChocolateTags();
            addSweetBerriesTags();
        }

        private void addCarrotTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_CARROT);
            tag(MFTags.Items.FOODS_VEGETABLES_CARROT)
                    .add(TagEntry.element(MFItems.IRON_CARROT.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_CARROT.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_CARROT.getId()))
                    .add(TagEntry.element(MFItems.COOKED_CARROT.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.CARROT_SOUP.getId()));
            tag(Tags.Items.FOODS_BREAD).add(TagEntry.element(MFItems.CARROT_BREAD.getId()));
            tag(Tags.Items.FOODS_PIE).add(TagEntry.element(MFItems.CARROT_PIE.getId()));
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.CHOCOLATE_CARROT.getId()));
        }

        private void addAppleTags() {
            tag(Tags.Items.FOODS_FRUIT).addTags(MFTags.Items.FOODS_FRUITS_APPLE);
            tag(MFTags.Items.FOODS_FRUITS_APPLE)
                    .add(TagEntry.element(MFItems.IRON_APPLE.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_APPLE.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_APPLE.getId()))
                    .add(TagEntry.element(MFItems.COOKED_APPLE.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.APPLE_SOUP.getId()));
            tag(Tags.Items.FOODS_BREAD).add(TagEntry.element(MFItems.APPLE_BREAD.getId()));
            tag(Tags.Items.FOODS_PIE).add(TagEntry.element(MFItems.APPLE_PIE.getId()));
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.CHOCOLATE_APPLE.getId()));
        }

        private void addKelpTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_KELP);
            tag(MFTags.Items.FOODS_VEGETABLES_KELP)
                    .add(TagEntry.element(MFItems.IRON_KELP.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_KELP.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_KELP.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_KELP.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.KELP_SOUP.getId()));
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.CHOCOLATE_DRIED_KELP.getId()));
        }

        private void addPotatoTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_POTATO);
            tag(MFTags.Items.FOODS_VEGETABLES_POTATO)
                    .add(TagEntry.element(MFItems.IRON_POTATO.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_POTATO.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_POTATO.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_POTATO.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.POTATO_SOUP.getId()));
            tag(Tags.Items.FOODS_BREAD).add(TagEntry.element(MFItems.POTATO_BREAD.getId()));
        }

        private void addPhantomTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).add(TagEntry.element(MFItems.COOKED_PHANTOM.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.PHANTOM_SOUP.getId()));
        }

        private void addPufferfishTags() {
            tag(Tags.Items.FOODS_COOKED_FISH).add(TagEntry.element(MFItems.COOKED_PUFFERFISH.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.PUFFERFISH_SOUP.getId()));
            tag(Tags.Items.FOODS_FOOD_POISONING).add(TagEntry.element(MFItems.PUFFERFISH_SOUP.getId()));
        }

        private void addPumpkinTags() {
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.PUMPKING_SOUP.getId()));
            tag(Tags.Items.FOODS_BREAD).add(TagEntry.element(MFItems.PUMPKING_BREAD.getId()));
        }

        private void addBambooTags() {
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.COOKED_BAMBOO.getId()));
            tag(Tags.Items.FOODS_SOUP).add(TagEntry.element(MFItems.BAMBOO_SOUP.getId()));
        }

        private void addCookedRabbitTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_RABBIT);
            tag(MFTags.Items.FOODS_COOKED_RABBIT)
                    .add(TagEntry.element(MFItems.IRON_COOKED_RABBIT.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_COOKED_RABBIT.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_COOKED_RABBIT.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_COOKED_RABBIT.getId()));
        }

        private void addMelonSliceTags() {
            tag(Tags.Items.FOODS_VEGETABLE).addTags(MFTags.Items.FOODS_VEGETABLES_MELON_SLICE);
            tag(MFTags.Items.FOODS_VEGETABLES_MELON_SLICE)
                    .add(TagEntry.element(MFItems.IRON_MELON_SLICE.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_MELON_SLICE.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_MELON_SLICE.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_MELON_SLICE.getId()));
        }

        private void addCookedChickenTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_CHICKEN);
            tag(MFTags.Items.FOODS_COOKED_CHICKEN)
                    .add(TagEntry.element(MFItems.IRON_COOKED_CHICKEN.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_COOKED_CHICKEN.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_COOKED_CHICKEN.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_COOKED_CHICKEN.getId()));
        }

        private void addCookedMuttonTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_MUTTON);
            tag(MFTags.Items.FOODS_COOKED_MUTTON)
                    .add(TagEntry.element(MFItems.IRON_COOKED_MUTTON.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_COOKED_MUTTON.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_COOKED_MUTTON.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_COOKED_MUTTON.getId()));
        }

        private void addCookedPorkchopTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_PORKCHOP);
            tag(MFTags.Items.FOODS_COOKED_PORKCHOP)
                    .add(TagEntry.element(MFItems.IRON_COOKED_PORKCHOP.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_COOKED_PORKCHOP.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_COOKED_PORKCHOP.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_COOKED_PORKCHOP.getId()));
        }

        private void addCookedBeefTags() {
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_BEEF);
            tag(MFTags.Items.FOODS_COOKED_BEEF)
                    .add(TagEntry.element(MFItems.IRON_COOKED_BEEF.getId()))
                    .add(TagEntry.element(MFItems.GOLDEN_COOKED_BEEF.getId()))
                    .add(TagEntry.element(MFItems.DIAMOND_COOKED_BEEF.getId()))
                    .add(TagEntry.element(MFItems.EMERALD_COOKED_BEEF.getId()));
        }

        private void addRiceTags() {
            tag(Tags.Items.CROPS).addTags(MFTags.Items.CROPS_RICE);
            tag(MFTags.Items.CROPS_RICE).add(TagEntry.element(MFItems.RICE.getId()));
            tag(ItemTags.VILLAGER_PLANTABLE_SEEDS).addTags(MFTags.Items.SEEDS_RICE);
            tag(Tags.Items.SEEDS).addTags(MFTags.Items.SEEDS_RICE);
            tag(MFTags.Items.SEEDS_RICE).add(TagEntry.element(MFItems.RICE.getId()));
            tag(Tags.Items.FOODS)
                    .add(TagEntry.element(MFItems.RICE_CHICKEN_BOWL.getId()))
                    .add(TagEntry.element(MFItems.RICE_SALMON_BOWL.getId()))
                    .add(TagEntry.element(MFItems.RICE_COD_BOWL.getId()))
                    .add(TagEntry.element(MFItems.RICE_VEGETABLE_BOWL.getId()))
                    .add(TagEntry.element(MFItems.RICE_PUDDING.getId()))
                    .add(TagEntry.element(MFItems.RICE_HONEY_PUDDING.getId()));
        }

        private void addSushiTags() {
            tag(Tags.Items.FOODS).addTags(MFTags.Items.FOODS_SUSHI);
            tag(MFTags.Items.FOODS_SUSHI)
                    .add(TagEntry.element(MFItems.SUSHI_BAMBOO.getId()))
                    .add(TagEntry.element(MFItems.SUSHI_CARROT.getId()))
                    .add(TagEntry.element(MFItems.SUSHI_BEETROOT.getId()))
                    .add(TagEntry.element(MFItems.SUSHI_SALMON.getId()));
        }

        private void addEggAndBaconTags() {
            tag(Tags.Items.FOODS).addTags(MFTags.Items.FOODS_COOKED_EGG);
            tag(MFTags.Items.FOODS_COOKED_EGG).add(TagEntry.element(MFItems.COOKED_EGG.getId()));
            tag(Tags.Items.FOODS_RAW_MEAT).addTags(MFTags.Items.FOODS_RAW_BACON);
            tag(MFTags.Items.FOODS_RAW_BACON).add(TagEntry.element(MFItems.RAW_BACON.getId()));
            tag(Tags.Items.FOODS_COOKED_MEAT).addTags(MFTags.Items.FOODS_COOKED_BACON);
            tag(MFTags.Items.FOODS_COOKED_BACON).add(TagEntry.element(MFItems.COOKED_BACON.getId()));
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.COOKED_BACON_EGG.getId()));
        }

        private void addChocolateTags() {
            tag(Tags.Items.FOODS_CANDY)
                    .add(TagEntry.element(MFItems.CHOCOLATE.getId()))
                    .add(TagEntry.element(MFItems.CHOCOLATE_BAR.getId()));
        }

        private void addSweetBerriesTags() {
            tag(Tags.Items.FOODS).add(TagEntry.element(MFItems.CHOCOLATE_SWEET_BERRIES.getId()));
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