package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.api.DeferredObject;
import net.blay09.mods.balm.api.item.BalmItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.item.MFPufferfishSoupItem;
import net.volwert123.more_food.common.item.MFRiceBowlItem;
import net.volwert123.more_food.common.item.MFSoupItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MFItems {
    // Carrot Items
    public static DeferredObject<Item> COOKED_CARROT;
    public static DeferredObject<Item> CARROT_PIECES;
    public static DeferredObject<Item> CARROT_SOUP;
    public static DeferredObject<Item> CARROT_BREAD;
    public static DeferredObject<Item> CARROT_PIE;
    public static DeferredObject<Item> CHOCOLATE_CARROT;

    // Apple Items
    public static DeferredObject<Item> COOKED_APPLE;
    public static DeferredObject<Item> APPLE_PIECES;
    public static DeferredObject<Item> APPLE_SOUP;
    public static DeferredObject<Item> APPLE_BREAD;
    public static DeferredObject<Item> APPLE_PIE;
    public static DeferredObject<Item> CHOCOLATE_APPLE;

    // Kelp Items
    public static DeferredObject<Item> KELP_PIECES;
    public static DeferredObject<Item> KELP_SOUP;
    public static DeferredObject<Item> CHOCOLATE_DRIED_KELP;

    // Potato Items
    public static DeferredObject<Item> POTATO_PIECES;
    public static DeferredObject<Item> POTATO_SOUP;
    public static DeferredObject<Item> POTATO_BREAD;

    // Phantom Items
    public static DeferredObject<Item> COOKED_PHANTOM;
    public static DeferredObject<Item> PHANTOM_PIECES;
    public static DeferredObject<Item> PHANTOM_SOUP;

    // Pufferfish Items
    public static DeferredObject<Item> COOKED_PUFFERFISH;
    public static DeferredObject<Item> PUFFERFISH_PIECES;
    public static DeferredObject<Item> PUFFERFISH_SOUP;

    // Pumpkin Items
    public static DeferredObject<Item> PUMPKING_SOUP;
    public static DeferredObject<Item> PUMPKING_BREAD;

    // Bamboo Items
    public static DeferredObject<Item> COOKED_BAMBOO;
    public static DeferredObject<Item> BAMBOO_PIECES;
    public static DeferredObject<Item> BAMBOO_SOUP;

    // Rice Items
    public static DeferredObject<Item> RICE;
    public static DeferredObject<Item> RICE_CHICKEN_BOWL;
    public static DeferredObject<Item> RICE_SALMON_BOWL;
    public static DeferredObject<Item> RICE_COD_BOWL;
    public static DeferredObject<Item> RICE_VEGETABLE_BOWL;
    public static DeferredObject<Item> RICE_PUDDING;
    public static DeferredObject<Item> RICE_HONEY_PUDDING;

    // Sushi Items
    public static DeferredObject<Item> SUSHI_BAMBOO;
    public static DeferredObject<Item> SUSHI_CARROT;
    public static DeferredObject<Item> SUSHI_BEETROOT;
    public static DeferredObject<Item> SUSHI_SALMON;

    // Egg & Bacon Items
    public static DeferredObject<Item> COOKED_EGG;
    public static DeferredObject<Item> RAW_BACON;
    public static DeferredObject<Item> COOKED_BACON;
    public static DeferredObject<Item> COOKED_BACON_EGG;

    // Chocolate Items
    public static DeferredObject<Item> CHOCOLATE;
    public static DeferredObject<Item> CHOCOLATE_BAR;

    // Sweet Berries Items
    public static DeferredObject<Item> CHOCOLATE_SWEET_BERRIES;

    // Creative Mode Tab
    public static DeferredObject<CreativeModeTab> MORE_FOOD_MAIN;

    public static final List<DeferredObject<Item>> ITEMS = new ArrayList<>();

    public static void initialize(BalmItems items) {
        BalmItems scoped = items.scoped(MoreFood.MOD_ID);

        // Carrot Items
        COOKED_CARROT = registerItem(scoped, "cooked_carrot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        CARROT_PIECES = registerItem(scoped, "carrot_pieces", Item::new);
        CARROT_SOUP = registerItem(scoped, "carrot_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CARROT_BREAD = registerItem(scoped, "carrot_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        CARROT_PIE = registerItem(scoped, "carrot_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_CARROT = registerItem(scoped, "chocolate_carrot", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Apple Items
        COOKED_APPLE = registerItem(scoped, "cooked_apple", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        APPLE_PIECES = registerItem(scoped, "apple_pieces", Item::new);
        APPLE_SOUP = registerItem(scoped, "apple_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        APPLE_BREAD = registerItem(scoped, "apple_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        APPLE_PIE = registerItem(scoped, "apple_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_APPLE = registerItem(scoped, "chocolate_apple", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Kelp Items
        KELP_PIECES = registerItem(scoped, "kelp_pieces", Item::new);
        KELP_SOUP = registerItem(scoped, "kelp_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CHOCOLATE_DRIED_KELP = registerItem(scoped, "chocolate_dried_kelp", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Potato Items
        POTATO_PIECES = registerItem(scoped, "potato_pieces", Item::new);
        POTATO_SOUP = registerItem(scoped, "potato_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        POTATO_BREAD = registerItem(scoped, "potato_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Phantom Items
        COOKED_PHANTOM = registerItem(scoped, "cooked_phantom", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        PHANTOM_PIECES = registerItem(scoped, "phantom_pieces", Item::new);
        PHANTOM_SOUP = registerItem(scoped, "phantom_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));

        // Pufferfish Items
        COOKED_PUFFERFISH = registerItem(scoped, "cooked_pufferfish", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        PUFFERFISH_PIECES = registerItem(scoped, "pufferfish_pieces", Item::new);
        PUFFERFISH_SOUP = registerItem(scoped, "pufferfish_soup", properties -> new MFPufferfishSoupItem(properties, registerFoodValues(6, 3f)));

        // Pumpkin Items
        PUMPKING_SOUP = registerItem(scoped, "pumpking_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        PUMPKING_BREAD = registerItem(scoped, "pumpking_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Bamboo Items
        COOKED_BAMBOO = registerItem(scoped, "cooked_bamboo", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        BAMBOO_PIECES = registerItem(scoped, "bamboo_pieces", Item::new);
        BAMBOO_SOUP = registerItem(scoped, "bamboo_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));

        // Rice Items
        RICE = registerItem(scoped, "rice", properties -> new BlockItem(MFBlocks.RICE_CROP.get(), properties.useBlockDescriptionPrefix()));
        RICE_CHICKEN_BOWL = registerItem(scoped, "rice_chicken_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_SALMON_BOWL = registerItem(scoped, "rice_salmon_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_COD_BOWL = registerItem(scoped, "rice_cod_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_VEGETABLE_BOWL = registerItem(scoped, "rice_vegetable_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(9, 4.5f)));
        RICE_PUDDING = registerItem(scoped, "rice_pudding", properties -> new MFRiceBowlItem(properties, registerFoodValues(9, 4.5f)));
        RICE_HONEY_PUDDING = registerItem(scoped, "rice_honey_pudding", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));

        // Sushi Items
        SUSHI_BAMBOO = registerItem(scoped, "sushi_bamboo", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_CARROT = registerItem(scoped, "sushi_carrot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_BEETROOT = registerItem(scoped, "sushi_beetroot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_SALMON = registerItem(scoped, "sushi_salmon", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));

        // Egg & Bacon Items
        COOKED_EGG = registerItem(scoped, "cooked_egg", properties -> new Item(properties.food(registerFoodValues(3, 1.5f))));
        RAW_BACON = registerItem(scoped, "raw_bacon", properties -> new Item(properties.food(registerFoodValues(2,1f))));
        COOKED_BACON = registerItem(scoped, "cooked_bacon", properties -> new Item(properties.food(registerFoodValues(5,2.5f))));
        COOKED_BACON_EGG = registerItem(scoped, "cooked_bacon_egg", properties -> new Item(properties.food(registerFoodValues(7, 3.5f))));

        // Chocolate Items
        CHOCOLATE = registerItem(scoped, "chocolate", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        CHOCOLATE_BAR = registerItem(scoped, "chocolate_bar", properties -> new Item(properties.food(registerFoodValues(8, 4f))));

        // Sweet Berries Items
        CHOCOLATE_SWEET_BERRIES = registerItem(scoped, "chocolate_sweet_berries", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Creative Mode Tab
        MORE_FOOD_MAIN = items.registerCreativeModeTab(() -> new ItemStack(COOKED_CARROT.get()), ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, "main"));
        for (DeferredObject<Item> item : ITEMS) {
            items.addToCreativeModeTab(MORE_FOOD_MAIN.getIdentifier(), () -> new Item[]{item.get()});
        }
    }

    private static DeferredObject<Item> registerItem(BalmItems items, String name, Function<Item.Properties, Item> factory) {
        DeferredObject<Item> item = items.registerItem(id -> factory.apply(BalmItems.itemProperties(id)), ResourceLocation.fromNamespaceAndPath(MoreFood.MOD_ID, name));
        ITEMS.add(item);
        return item;
    }

    private static FoodProperties registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }
}