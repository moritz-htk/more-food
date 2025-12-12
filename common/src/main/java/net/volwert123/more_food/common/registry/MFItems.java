package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.volwert123.more_food.common.item.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MFItems {
    // Carrot Items
    public static DeferredItem IRON_CARROT;
    public static DeferredItem DIAMOND_CARROT;
    public static DeferredItem EMERALD_CARROT;
    public static DeferredItem COOKED_CARROT;
    public static DeferredItem CARROT_PIECES;
    public static DeferredItem CARROT_SOUP;
    public static DeferredItem CARROT_BREAD;
    public static DeferredItem CARROT_PIE;
    public static DeferredItem CHOCOLATE_CARROT;

    // Apple Items
    public static DeferredItem IRON_APPLE;
    public static DeferredItem DIAMOND_APPLE;
    public static DeferredItem EMERALD_APPLE;
    public static DeferredItem COOKED_APPLE;
    public static DeferredItem APPLE_PIECES;
    public static DeferredItem APPLE_SOUP;
    public static DeferredItem APPLE_BREAD;
    public static DeferredItem APPLE_PIE;
    public static DeferredItem CHOCOLATE_APPLE;

    // Kelp Items
    public static DeferredItem IRON_KELP;
    public static DeferredItem GOLDEN_KELP;
    public static DeferredItem DIAMOND_KELP;
    public static DeferredItem EMERALD_KELP;
    public static DeferredItem KELP_PIECES;
    public static DeferredItem KELP_SOUP;
    public static DeferredItem CHOCOLATE_DRIED_KELP;

    // Potato Items
    public static DeferredItem IRON_POTATO;
    public static DeferredItem GOLDEN_POTATO;
    public static DeferredItem DIAMOND_POTATO;
    public static DeferredItem EMERALD_POTATO;
    public static DeferredItem POTATO_PIECES;
    public static DeferredItem POTATO_SOUP;
    public static DeferredItem POTATO_BREAD;

    // Sweet Berries Items
    public static DeferredItem CHOCOLATE_SWEET_BERRIES;

    // Phantom Items
    public static DeferredItem COOKED_PHANTOM;
    public static DeferredItem PHANTOM_PIECES;
    public static DeferredItem PHANTOM_SOUP;

    // Pufferfish Items
    public static DeferredItem COOKED_PUFFERFISH;
    public static DeferredItem PUFFERFISH_PIECES;
    public static DeferredItem PUFFERFISH_SOUP;

    // Pumpkin Items
    public static DeferredItem PUMPKING_SOUP;
    public static DeferredItem PUMPKING_BREAD;

    // Bamboo Items
    public static DeferredItem COOKED_BAMBOO;
    public static DeferredItem BAMBOO_PIECES;
    public static DeferredItem BAMBOO_SOUP;

    // Melon Slice Items
    public static DeferredItem IRON_MELON_SLICE;
    public static DeferredItem GOLDEN_MELON_SLICE;
    public static DeferredItem DIAMOND_MELON_SLICE;
    public static DeferredItem EMERALD_MELON_SLICE;

    // Cooked Rabbit Items
    public static DeferredItem IRON_COOKED_RABBIT;
    public static DeferredItem GOLDEN_COOKED_RABBIT;
    public static DeferredItem DIAMOND_COOKED_RABBIT;
    public static DeferredItem EMERALD_COOKED_RABBIT;

    // Cooked Chicken Items
    public static DeferredItem IRON_COOKED_CHICKEN;
    public static DeferredItem GOLDEN_COOKED_CHICKEN;
    public static DeferredItem DIAMOND_COOKED_CHICKEN;
    public static DeferredItem EMERALD_COOKED_CHICKEN;

    // Cooked Mutton Items
    public static DeferredItem IRON_COOKED_MUTTON;
    public static DeferredItem GOLDEN_COOKED_MUTTON;
    public static DeferredItem DIAMOND_COOKED_MUTTON;
    public static DeferredItem EMERALD_COOKED_MUTTON;

    // Cooked Porkchop Items
    public static DeferredItem IRON_COOKED_PORKCHOP;
    public static DeferredItem GOLDEN_COOKED_PORKCHOP;
    public static DeferredItem DIAMOND_COOKED_PORKCHOP;
    public static DeferredItem EMERALD_COOKED_PORKCHOP;

    // Cooked Beef Items
    public static DeferredItem IRON_COOKED_BEEF;
    public static DeferredItem GOLDEN_COOKED_BEEF;
    public static DeferredItem DIAMOND_COOKED_BEEF;
    public static DeferredItem EMERALD_COOKED_BEEF;

    // Rice Items
    public static DeferredItem RICE;
    public static DeferredItem RICE_CHICKEN_BOWL;
    public static DeferredItem RICE_SALMON_BOWL;
    public static DeferredItem RICE_COD_BOWL;
    public static DeferredItem RICE_VEGETABLE_BOWL;
    public static DeferredItem RICE_PUDDING;
    public static DeferredItem RICE_HONEY_PUDDING;

    // Sushi Items
    public static DeferredItem SUSHI_BAMBOO;
    public static DeferredItem SUSHI_CARROT;
    public static DeferredItem SUSHI_BEETROOT;
    public static DeferredItem SUSHI_SALMON;

    // Egg & Bacon Items
    public static DeferredItem COOKED_EGG;
    public static DeferredItem RAW_BACON;
    public static DeferredItem COOKED_BACON;
    public static DeferredItem COOKED_BACON_EGG;

    // Chocolate Items
    public static DeferredItem CHOCOLATE;
    public static DeferredItem CHOCOLATE_BAR;

    public static final List<DeferredItem> ITEMS = new ArrayList<>();

    public static void initialize(BalmItemRegistrar items) {
        // Carrot Items
        IRON_CARROT = registerItem(items, "iron_carrot", properties -> new MFIronFoodItem(properties, registerFoodValues(3, 1.5f)));
        DIAMOND_CARROT = registerItem(items, "diamond_carrot", properties -> new MFDiamondFoodItem(properties, registerFoodValues(3, 1.5f)));
        EMERALD_CARROT = registerItem(items, "emerald_carrot", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(3, 1.5f)));
        COOKED_CARROT = registerItem(items, "cooked_carrot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        CARROT_PIECES = registerItem(items, "carrot_pieces", Item::new);
        CARROT_SOUP = registerItem(items, "carrot_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CARROT_BREAD = registerItem(items, "carrot_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        CARROT_PIE = registerItem(items, "carrot_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_CARROT = registerItem(items, "chocolate_carrot", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Apple Items
        IRON_APPLE = registerItem(items, "iron_apple", properties -> new MFIronFoodItem(properties, registerFoodValues(4, 2f)));
        DIAMOND_APPLE = registerItem(items, "diamond_apple", properties -> new MFDiamondFoodItem(properties, registerFoodValues(4, 2f)));
        EMERALD_APPLE = registerItem(items, "emerald_apple", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(4, 2f)));
        COOKED_APPLE = registerItem(items, "cooked_apple", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        APPLE_PIECES = registerItem(items, "apple_pieces", Item::new);
        APPLE_SOUP = registerItem(items, "apple_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        APPLE_BREAD = registerItem(items, "apple_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        APPLE_PIE = registerItem(items, "apple_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_APPLE = registerItem(items, "chocolate_apple", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Kelp Items
        IRON_KELP = registerItem(items, "iron_kelp", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_KELP = registerItem(items, "golden_kelp", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_KELP = registerItem(items, "diamond_kelp", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_KELP = registerItem(items, "emerald_kelp", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));
        KELP_PIECES = registerItem(items, "kelp_pieces", Item::new);
        KELP_SOUP = registerItem(items, "kelp_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CHOCOLATE_DRIED_KELP = registerItem(items, "chocolate_dried_kelp", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Potato Items
        IRON_POTATO = registerItem(items, "iron_potato", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_POTATO = registerItem(items, "golden_potato", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_POTATO = registerItem(items, "diamond_potato", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_POTATO = registerItem(items, "emerald_potato", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));
        POTATO_PIECES = registerItem(items, "potato_pieces", Item::new);
        POTATO_SOUP = registerItem(items, "potato_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        POTATO_BREAD = registerItem(items, "potato_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Sweet Berries Items
        CHOCOLATE_SWEET_BERRIES = registerItem(items, "chocolate_sweet_berries", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Phantom Items
        COOKED_PHANTOM = registerItem(items, "cooked_phantom", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        PHANTOM_PIECES = registerItem(items, "phantom_pieces", Item::new);
        PHANTOM_SOUP = registerItem(items, "phantom_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));

        // Pufferfish Items
        COOKED_PUFFERFISH = registerItem(items, "cooked_pufferfish", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        PUFFERFISH_PIECES = registerItem(items, "pufferfish_pieces", Item::new);
        PUFFERFISH_SOUP = registerItem(items, "pufferfish_soup", properties -> new MFPufferfishSoupItem(properties, registerFoodValues(6, 3f)));

        // Pumpkin Items
        PUMPKING_SOUP = registerItem(items, "pumpking_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        PUMPKING_BREAD = registerItem(items, "pumpking_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Bamboo Items
        COOKED_BAMBOO = registerItem(items, "cooked_bamboo", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        BAMBOO_PIECES = registerItem(items, "bamboo_pieces", Item::new);
        BAMBOO_SOUP = registerItem(items, "bamboo_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));

        // Melon Slice Items
        IRON_MELON_SLICE = registerItem(items, "iron_melon_slice", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_MELON_SLICE = registerItem(items, "golden_melon_slice", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_MELON_SLICE = registerItem(items, "diamond_melon_slice", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_MELON_SLICE = registerItem(items, "emerald_melon_slice", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));

        // Cooked Rabbit Items
        IRON_COOKED_RABBIT = registerItem(items, "iron_cooked_rabbit", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_COOKED_RABBIT = registerItem(items, "golden_cooked_rabbit", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_COOKED_RABBIT = registerItem(items, "diamond_cooked_rabbit", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_COOKED_RABBIT = registerItem(items, "emerald_cooked_rabbit", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));

        // Cooked Chicken Items
        IRON_COOKED_CHICKEN = registerItem(items, "iron_cooked_chicken", properties -> new MFIronFoodItem(properties, registerFoodValues(6, 3f)));
        GOLDEN_COOKED_CHICKEN = registerItem(items, "golden_cooked_chicken", properties -> new MFGoldenFoodItem(properties, registerFoodValues(6, 3f)));
        DIAMOND_COOKED_CHICKEN = registerItem(items, "diamond_cooked_chicken", properties -> new MFDiamondFoodItem(properties, registerFoodValues(6, 3f)));
        EMERALD_COOKED_CHICKEN = registerItem(items, "emerald_cooked_chicken", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(6, 3f)));

        // Cooked Mutton Items
        IRON_COOKED_MUTTON = registerItem(items, "iron_cooked_mutton", properties -> new MFIronFoodItem(properties, registerFoodValues(6, 3f)));
        GOLDEN_COOKED_MUTTON = registerItem(items, "golden_cooked_mutton", properties -> new MFGoldenFoodItem(properties, registerFoodValues(6, 3f)));
        DIAMOND_COOKED_MUTTON = registerItem(items, "diamond_cooked_mutton", properties -> new MFDiamondFoodItem(properties, registerFoodValues(6, 3f)));
        EMERALD_COOKED_MUTTON = registerItem(items, "emerald_cooked_mutton", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(6, 3f)));

        // Cooked Porkchop Items
        IRON_COOKED_PORKCHOP = registerItem(items, "iron_cooked_porkchop", properties -> new MFIronFoodItem(properties, registerFoodValues(8, 4f)));
        GOLDEN_COOKED_PORKCHOP = registerItem(items, "golden_cooked_porkchop", properties -> new MFGoldenFoodItem(properties, registerFoodValues(8, 4f)));
        DIAMOND_COOKED_PORKCHOP = registerItem(items, "diamond_cooked_porkchop", properties -> new MFDiamondFoodItem(properties, registerFoodValues(8, 4f)));
        EMERALD_COOKED_PORKCHOP = registerItem(items, "emerald_cooked_porkchop", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(8, 4f)));

        // Cooked Beef Items
        IRON_COOKED_BEEF = registerItem(items, "iron_cooked_beef", properties -> new MFIronFoodItem(properties, registerFoodValues(8, 4f)));
        GOLDEN_COOKED_BEEF = registerItem(items, "golden_cooked_beef", properties -> new MFGoldenFoodItem(properties, registerFoodValues(8, 4f)));
        DIAMOND_COOKED_BEEF = registerItem(items, "diamond_cooked_beef", properties -> new MFDiamondFoodItem(properties, registerFoodValues(8, 4f)));
        EMERALD_COOKED_BEEF = registerItem(items, "emerald_cooked_beef", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(8, 4f)));

        // Rice Items
        RICE = registerItem(items, "rice", properties -> new BlockItem(MFBlocks.RICE_CROP.asBlock(), properties.useBlockDescriptionPrefix()));
        RICE_CHICKEN_BOWL = registerItem(items, "rice_chicken_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_SALMON_BOWL = registerItem(items, "rice_salmon_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_COD_BOWL = registerItem(items, "rice_cod_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));
        RICE_VEGETABLE_BOWL = registerItem(items, "rice_vegetable_bowl", properties -> new MFRiceBowlItem(properties, registerFoodValues(9, 4.5f)));
        RICE_PUDDING = registerItem(items, "rice_pudding", properties -> new MFRiceBowlItem(properties, registerFoodValues(9, 4.5f)));
        RICE_HONEY_PUDDING = registerItem(items, "rice_honey_pudding", properties -> new MFRiceBowlItem(properties, registerFoodValues(10, 5f)));

        // Sushi Items
        SUSHI_BAMBOO = registerItem(items, "sushi_bamboo", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_CARROT = registerItem(items, "sushi_carrot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_BEETROOT = registerItem(items, "sushi_beetroot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        SUSHI_SALMON = registerItem(items, "sushi_salmon", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));

        // Egg & Bacon Items
        COOKED_EGG = registerItem(items, "cooked_egg", properties -> new Item(properties.food(registerFoodValues(3, 1.5f))));
        RAW_BACON = registerItem(items, "raw_bacon", properties -> new Item(properties.food(registerFoodValues(2,1f))));
        COOKED_BACON = registerItem(items, "cooked_bacon", properties -> new Item(properties.food(registerFoodValues(5,2.5f))));
        COOKED_BACON_EGG = registerItem(items, "cooked_bacon_egg", properties -> new Item(properties.food(registerFoodValues(7, 3.5f))));

        // Chocolate Items
        CHOCOLATE = registerItem(items, "chocolate", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        CHOCOLATE_BAR = registerItem(items, "chocolate_bar", properties -> new Item(properties.food(registerFoodValues(8, 4f))));
    }

    private static DeferredItem registerItem(BalmItemRegistrar items, String name, Function<Item.Properties, Item> factory) {
        DeferredItem item = items.register(name, factory, new Item.Properties()).asDeferredItem();
        ITEMS.add(item);
        return item;
    }

    private static FoodProperties registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }
}