package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class MFRecipeProvider extends RecipeProvider {
    private final HolderGetter<Item> items;

    public MFRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        items = registries.lookupOrThrow(Registries.ITEM);
    }

    @Override
    protected void buildRecipes() {
        // Carrot Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_CARROT.asItem(), Items.CARROT, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_CARROT.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_CARROT.asItem(), Items.CARROT, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_CARROT.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_CARROT.asItem(), Items.CARROT, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_CARROT.asItem()));
        createCookingRecipes(MFItems.COOKED_CARROT.asItem(), Items.CARROT, output);
        createPiecesRecipe(items, MFItems.CARROT_PIECES.asItem(), Items.CARROT).save(output, registerRecipe(MFItems.CARROT_PIECES.asItem()));
        createSoupRecipe(items, MFItems.CARROT_SOUP.asItem(), Items.CARROT, MFItems.CARROT_PIECES.asItem()).save(output, registerRecipe(MFItems.CARROT_SOUP.asItem()));
        createBreadRecipe(items, MFItems.CARROT_BREAD.asItem(), Items.CARROT, MFItems.CARROT_PIECES.asItem()).save(output, registerRecipe(MFItems.CARROT_BREAD.asItem()));
        createPieRecipe(items, MFItems.CARROT_PIE.asItem(), Items.CARROT).save(output, registerRecipe(MFItems.CARROT_PIE.asItem()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_CARROT.asItem(), Items.CARROT).save(output, registerRecipe(MFItems.CHOCOLATE_CARROT.asItem()));

        // Apple Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_APPLE.asItem(), Items.APPLE, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_APPLE.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_APPLE.asItem(), Items.APPLE, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_APPLE.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_APPLE.asItem(), Items.APPLE, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_APPLE.asItem()));
        createCookingRecipes(MFItems.COOKED_APPLE.asItem(), Items.APPLE, output);
        createPiecesRecipe(items, MFItems.APPLE_PIECES.asItem(), Items.APPLE).save(output, registerRecipe(MFItems.APPLE_PIECES.asItem()));
        createSoupRecipe(items, MFItems.APPLE_SOUP.asItem(), Items.APPLE, MFItems.APPLE_PIECES.asItem()).save(output, registerRecipe(MFItems.APPLE_SOUP.asItem()));
        createBreadRecipe(items, MFItems.APPLE_BREAD.asItem(), Items.APPLE, MFItems.APPLE_PIECES.asItem()).save(output, registerRecipe(MFItems.APPLE_BREAD.asItem()));
        createPieRecipe(items, MFItems.APPLE_PIE.asItem(), Items.APPLE).save(output, registerRecipe(MFItems.APPLE_PIE.asItem()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_APPLE.asItem(), Items.APPLE).save(output, registerRecipe(MFItems.CHOCOLATE_APPLE.asItem()));

        // Kelp Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_KELP.asItem(), Items.DRIED_KELP, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_KELP.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_KELP.asItem(), Items.DRIED_KELP, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_KELP.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_KELP.asItem(), Items.DRIED_KELP, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_KELP.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_KELP.asItem(), Items.DRIED_KELP, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_KELP.asItem()));
        createPiecesRecipe(items, MFItems.KELP_PIECES.asItem(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.KELP_PIECES.asItem()));
        createSoupRecipe(items, MFItems.KELP_SOUP.asItem(), Items.DRIED_KELP, MFItems.KELP_PIECES.asItem()).save(output, registerRecipe(MFItems.KELP_SOUP.asItem()));
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_DRIED_KELP.asItem(), Items.DRIED_KELP).save(output, registerRecipe(MFItems.CHOCOLATE_DRIED_KELP.asItem()));

        // Potato Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_POTATO.asItem(), Items.POTATO, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_POTATO.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_POTATO.asItem(), Items.POTATO, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_POTATO.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_POTATO.asItem(), Items.POTATO, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_POTATO.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_POTATO.asItem(), Items.POTATO, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_POTATO.asItem()));
        createPiecesRecipe(items, MFItems.POTATO_PIECES.asItem(), Items.POTATO).save(output, registerRecipe(MFItems.POTATO_PIECES.asItem()));
        createSoupRecipe(items, MFItems.POTATO_SOUP.asItem(), Items.POTATO, MFItems.POTATO_PIECES.asItem()).save(output, registerRecipe(MFItems.POTATO_SOUP.asItem()));
        createBreadRecipe(items, MFItems.POTATO_BREAD.asItem(), Items.POTATO, MFItems.POTATO_PIECES.asItem()).save(output, registerRecipe(MFItems.POTATO_BREAD.asItem()));

        // Sweet Berries Recipes
        createChocolateFoodRecipe(items, MFItems.CHOCOLATE_SWEET_BERRIES.asItem(), Items.SWEET_BERRIES).save(output, registerRecipe(MFItems.CHOCOLATE_SWEET_BERRIES.asItem()));

        // Phantom Recipes
        createCookingRecipes(MFItems.COOKED_PHANTOM.asItem(), Items.PHANTOM_MEMBRANE, output);
        createPiecesRecipe(items, MFItems.PHANTOM_PIECES.asItem(), Items.PHANTOM_MEMBRANE).save(output, registerRecipe(MFItems.PHANTOM_PIECES.asItem()));
        createSoupRecipe(items, MFItems.PHANTOM_SOUP.asItem(), Items.PHANTOM_MEMBRANE, MFItems.PHANTOM_PIECES.asItem()).save(output, registerRecipe(MFItems.PHANTOM_SOUP.asItem()));

        // Pufferfish Recipes
        createPiecesRecipe(items, MFItems.PUFFERFISH_PIECES.asItem(), Items.PUFFERFISH).save(output, registerRecipe(MFItems.PUFFERFISH_PIECES.asItem()));
        createSoupRecipe(items, MFItems.PUFFERFISH_SOUP.asItem(), Items.PUFFERFISH, MFItems.PUFFERFISH_PIECES.asItem()).save(output, registerRecipe(MFItems.PUFFERFISH_SOUP.asItem()));
        createCookingRecipes(MFItems.COOKED_PUFFERFISH.asItem(), Items.PUFFERFISH, output);

        // Pumpkin Recipes
        createSoupRecipe(items, MFItems.PUMPKING_SOUP.asItem(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, registerRecipe(MFItems.PUMPKING_SOUP.asItem()));
        createBreadRecipe(items, MFItems.PUMPKING_BREAD.asItem(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, registerRecipe(MFItems.PUMPKING_BREAD.asItem()));

        // Bamboo Recipes
        createCookingRecipes(MFItems.COOKED_BAMBOO.asItem(), Items.BAMBOO, output);
        createPiecesRecipe(items, MFItems.BAMBOO_PIECES.asItem(), Items.BAMBOO).save(output, registerRecipe(MFItems.BAMBOO_PIECES.asItem()));
        createSoupRecipe(items, MFItems.BAMBOO_SOUP.asItem(), Items.BAMBOO, MFItems.BAMBOO_PIECES.asItem()).save(output, registerRecipe(MFItems.BAMBOO_SOUP.asItem()));

        // Melon Slice Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_MELON_SLICE.asItem(), Items.MELON_SLICE, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_MELON_SLICE.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_MELON_SLICE.asItem(), Items.MELON_SLICE, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_MELON_SLICE.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_MELON_SLICE.asItem(), Items.MELON_SLICE, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_MELON_SLICE.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_MELON_SLICE.asItem(), Items.MELON_SLICE, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_MELON_SLICE.asItem()));

        // Rabbit Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_COOKED_RABBIT.asItem(), Items.COOKED_RABBIT, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_COOKED_RABBIT.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_COOKED_RABBIT.asItem(), Items.COOKED_RABBIT, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_RABBIT.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_COOKED_RABBIT.asItem(), Items.COOKED_RABBIT, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_COOKED_RABBIT.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_COOKED_RABBIT.asItem(), Items.COOKED_RABBIT, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_COOKED_RABBIT.asItem()));

        // Cooked Chicken Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_COOKED_CHICKEN.asItem(), Items.COOKED_CHICKEN, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_COOKED_CHICKEN.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_COOKED_CHICKEN.asItem(), Items.COOKED_CHICKEN, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_CHICKEN.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_COOKED_CHICKEN.asItem(), Items.COOKED_CHICKEN, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_COOKED_CHICKEN.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_COOKED_CHICKEN.asItem(), Items.COOKED_CHICKEN, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_COOKED_CHICKEN.asItem()));

        // Cooked Mutton Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_COOKED_MUTTON.asItem(), Items.COOKED_MUTTON, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_COOKED_MUTTON.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_COOKED_MUTTON.asItem(), Items.COOKED_MUTTON, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_MUTTON.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_COOKED_MUTTON.asItem(), Items.COOKED_MUTTON, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_COOKED_MUTTON.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_COOKED_MUTTON.asItem(), Items.COOKED_MUTTON, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_COOKED_MUTTON.asItem()));

        // Cooked Porkchop Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_COOKED_PORKCHOP.asItem(), Items.COOKED_PORKCHOP, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_COOKED_PORKCHOP.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_COOKED_PORKCHOP.asItem(), Items.COOKED_PORKCHOP, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_PORKCHOP.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_COOKED_PORKCHOP.asItem(), Items.COOKED_PORKCHOP, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_COOKED_PORKCHOP.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_COOKED_PORKCHOP.asItem(), Items.COOKED_PORKCHOP, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_COOKED_PORKCHOP.asItem()));

        // Cooked Beef Recipes
        createMaterialFoodRecipe(items, MFItems.IRON_COOKED_BEEF.asItem(), Items.COOKED_BEEF, Items.IRON_INGOT).save(output, registerRecipe(MFItems.IRON_COOKED_BEEF.asItem()));
        createMaterialFoodRecipe(items, MFItems.GOLDEN_COOKED_BEEF.asItem(), Items.COOKED_BEEF, Items.GOLD_INGOT).save(output, registerRecipe(MFItems.GOLDEN_COOKED_BEEF.asItem()));
        createMaterialFoodRecipe(items, MFItems.DIAMOND_COOKED_BEEF.asItem(), Items.COOKED_BEEF, Items.DIAMOND).save(output, registerRecipe(MFItems.DIAMOND_COOKED_BEEF.asItem()));
        createMaterialFoodRecipe(items, MFItems.EMERALD_COOKED_BEEF.asItem(), Items.COOKED_BEEF, Items.EMERALD).save(output, registerRecipe(MFItems.EMERALD_COOKED_BEEF.asItem()));

        // Rice Bowl Recipes
        createRiceBowlRecipe(items, MFItems.RICE_CHICKEN_BOWL.asItem(), Items.COOKED_CHICKEN).save(output, registerRecipe(MFItems.RICE_CHICKEN_BOWL.asItem()));
        createRiceBowlRecipe(items, MFItems.RICE_SALMON_BOWL.asItem(), Items.COOKED_SALMON).save(output, registerRecipe(MFItems.RICE_SALMON_BOWL.asItem()));
        createRiceBowlRecipe(items, MFItems.RICE_COD_BOWL.asItem(), Items.COOKED_COD).save(output, registerRecipe(MFItems.RICE_COD_BOWL.asItem()));
        createRiceVegetableBowlRecipe(items).save(output, registerRecipe(MFItems.RICE_VEGETABLE_BOWL.asItem()));
        createRiceBowlRecipe(items, MFItems.RICE_PUDDING.asItem(), Items.MILK_BUCKET).save(output, registerRecipe(MFItems.RICE_PUDDING.asItem()));
        createRiceHoneyPuddingRecipe(items).save(output, registerRecipe(MFItems.RICE_HONEY_PUDDING.asItem()));

        // Sushi Recipes
        createSushiRecipe(items, MFItems.SUSHI_BAMBOO.asItem(), Items.BAMBOO).save(output, registerRecipe(MFItems.SUSHI_BAMBOO.asItem()));
        createSushiRecipe(items, MFItems.SUSHI_CARROT.asItem(), Items.CARROT).save(output, registerRecipe(MFItems.SUSHI_CARROT.asItem()));
        createSushiRecipe(items, MFItems.SUSHI_BEETROOT.asItem(), Items.BEETROOT).save(output, registerRecipe(MFItems.SUSHI_BEETROOT.asItem()));
        createSushiRecipe(items, MFItems.SUSHI_SALMON.asItem(), Items.SALMON).save(output, registerRecipe(MFItems.SUSHI_SALMON.asItem()));

        // Egg Recipes
        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.EGG), RecipeCategory.FOOD, MFItems.COOKED_EGG.asItem(), 1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(MFItems.COOKED_EGG.asItem()), has(Items.EGG)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(MFItems.COOKED_EGG.asItem()) + getItemName(Items.EGG) + "_smelting")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.BROWN_EGG), RecipeCategory.FOOD, MFItems.COOKED_EGG.asItem(), 1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(MFItems.COOKED_EGG.asItem()), has(Items.BROWN_EGG)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(MFItems.COOKED_EGG.asItem()) + getItemName(Items.BROWN_EGG) + "_smelting")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(Items.BLUE_EGG), RecipeCategory.FOOD, MFItems.COOKED_EGG.asItem(), 1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(MFItems.COOKED_EGG.asItem()), has(Items.BLUE_EGG)).save(output, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(MFItems.COOKED_EGG.asItem()) + getItemName(Items.BLUE_EGG) + "_smelting")));

        // Bacon Recipes
        createRawBaconRecipe(items).save(output, registerRecipe(MFItems.RAW_BACON.asItem()));
        createCookingRecipes(MFItems.COOKED_BACON.asItem(), MFItems.RAW_BACON.asItem(), output);
        createCookedBaconEggRecipe(items).save(output, registerRecipe(MFItems.COOKED_BACON_EGG.asItem()));

        // Chocolate Recipes
        createChocolateRecipe(items).save(output, registerRecipe(MFItems.CHOCOLATE.asItem()));
        createChocolateBarRecipe(items).save(output, registerRecipe(MFItems.CHOCOLATE_BAR.asItem()));
    }

    private ShapedRecipeBuilder createMaterialFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input, ItemLike material) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('#', input)
                .define('*', material)
                .pattern("***")
                .pattern("*#*")
                .pattern("***")
                .unlockedBy(getHasName(material), has(material))
                .unlockedBy(getHasName(input), has(input));
    }

    private void createCookingRecipes(ItemLike output, ItemLike input, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_smelting")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,100, RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_smoking")));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(output) + "_campfire_cooking")));
    }

    private ShapelessRecipeBuilder createPiecesRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, output, 4)
                .requires(input)
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapelessRecipeBuilder createSoupRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(Items.BOWL)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private ShapelessRecipeBuilder createBreadRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(Items.WHEAT, 2)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private ShapelessRecipeBuilder createPieRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, output)
                .requires(input)
                .requires(Tags.Items.EGGS)
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.EGG), has(Tags.Items.EGGS))
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR));
    }

    private ShapedRecipeBuilder createRiceBowlRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.asItem())
                .define('#', input)
                .pattern("  #")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.asItem()), has(MFItems.RICE.asItem()))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapedRecipeBuilder createRiceVegetableBowlRecipe(HolderGetter<Item> items) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, MFItems.RICE_VEGETABLE_BOWL.asItem())
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.asItem())
                .define('A', MFItems.COOKED_BAMBOO.asItem())
                .define('C', Items.CARROT)
                .pattern(" AC")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.asItem()), has(MFItems.RICE.asItem()))
                .unlockedBy(getHasName(MFItems.COOKED_BAMBOO.asItem()), has(MFItems.COOKED_BAMBOO.asItem()))
                .unlockedBy(getHasName(Items.CARROT), has(Items.CARROT));
    }

    private ShapelessRecipeBuilder createRiceHoneyPuddingRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.RICE_HONEY_PUDDING.asItem())
                .requires(MFItems.RICE_PUDDING.asItem())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy(getHasName(MFItems.RICE_HONEY_PUDDING.asItem()), has(MFItems.RICE_HONEY_PUDDING.asItem()))
                .unlockedBy(getHasName(Items.HONEY_BOTTLE), has(Items.HONEY_BOTTLE));
    }

    private ShapedRecipeBuilder createSushiRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('D', Items.DRIED_KELP)
                .define('R', MFItems.RICE.asItem())
                .define('#', input)
                .pattern("R#R")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DRIED_KELP), has(Items.DRIED_KELP))
                .unlockedBy(getHasName(MFItems.RICE.asItem()), has(MFItems.RICE.asItem()))
                .unlockedBy(getHasName(input), has(input));
    }

    private ShapelessRecipeBuilder createRawBaconRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.RAW_BACON.asItem())
                .requires(Items.PORKCHOP)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP));
    }

    private ShapelessRecipeBuilder createCookedBaconEggRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.COOKED_BACON_EGG.asItem())
                .requires(MFItems.COOKED_BACON.asItem())
                .requires(MFItems.COOKED_EGG.asItem())
                .unlockedBy(getHasName(MFItems.COOKED_BACON.asItem()), has(MFItems.COOKED_BACON.asItem()))
                .unlockedBy(getHasName(MFItems.COOKED_EGG.asItem()), has(MFItems.COOKED_EGG.asItem()));
    }

    private ShapelessRecipeBuilder createChocolateRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.CHOCOLATE.asItem())
                .requires(Items.MILK_BUCKET)
                .requires(Items.COCOA_BEANS)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                .unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS));
    }

    private ShapelessRecipeBuilder createChocolateBarRecipe(HolderGetter<Item> items) {
        return ShapelessRecipeBuilder.shapeless(items, RecipeCategory.FOOD, MFItems.CHOCOLATE_BAR.asItem())
                .requires(Items.PAPER)
                .requires(MFItems.CHOCOLATE.asItem())
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .unlockedBy(getHasName(MFItems.CHOCOLATE.asItem()), has(MFItems.CHOCOLATE.asItem()));
    }

    private ShapedRecipeBuilder createChocolateFoodRecipe(HolderGetter<Item> items, ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(items, RecipeCategory.FOOD, output)
                .define('C', MFItems.CHOCOLATE.asItem())
                .define('#', input)
                .pattern("   ")
                .pattern(" # ")
                .pattern(" C ")
                .unlockedBy(getHasName(MFItems.CHOCOLATE.asItem()), has(MFItems.CHOCOLATE.asItem()))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ResourceKey<Recipe<?>> registerRecipe(ItemLike item) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(MoreFood.MOD_ID, getItemName(item)));
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NotNull Provider registries, @NotNull RecipeOutput output) {
            return new MFRecipeProvider(registries, output);
        }

        @Override
        public @NotNull String getName() {
            return MoreFood.MOD_ID + " recipes";
        }
    }
}