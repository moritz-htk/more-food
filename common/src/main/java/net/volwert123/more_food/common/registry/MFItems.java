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
import net.volwert123.more_food.common.item.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MFItems {
    // Carrot Items
    public static DeferredObject<Item> IRON_CARROT;
    public static DeferredObject<Item> DIAMOND_CARROT;
    public static DeferredObject<Item> EMERALD_CARROT;
    public static DeferredObject<Item> COOKED_CARROT;
    public static DeferredObject<Item> CARROT_PIECES;
    public static DeferredObject<Item> CARROT_SOUP;
    public static DeferredObject<Item> CARROT_BREAD;
    public static DeferredObject<Item> CARROT_PIE;
    public static DeferredObject<Item> CHOCOLATE_CARROT;

    // Apple Items
    public static DeferredObject<Item> IRON_APPLE;
    public static DeferredObject<Item> DIAMOND_APPLE;
    public static DeferredObject<Item> EMERALD_APPLE;
    public static DeferredObject<Item> COOKED_APPLE;
    public static DeferredObject<Item> APPLE_PIECES;
    public static DeferredObject<Item> APPLE_SOUP;
    public static DeferredObject<Item> APPLE_BREAD;
    public static DeferredObject<Item> APPLE_PIE;
    public static DeferredObject<Item> CHOCOLATE_APPLE;

    // Kelp Items
    public static DeferredObject<Item> IRON_KELP;
    public static DeferredObject<Item> GOLDEN_KELP;
    public static DeferredObject<Item> DIAMOND_KELP;
    public static DeferredObject<Item> EMERALD_KELP;
    public static DeferredObject<Item> KELP_PIECES;
    public static DeferredObject<Item> KELP_SOUP;
    public static DeferredObject<Item> CHOCOLATE_DRIED_KELP;

    // Potato Items
    public static DeferredObject<Item> IRON_POTATO;
    public static DeferredObject<Item> GOLDEN_POTATO;
    public static DeferredObject<Item> DIAMOND_POTATO;
    public static DeferredObject<Item> EMERALD_POTATO;
    public static DeferredObject<Item> POTATO_PIECES;
    public static DeferredObject<Item> POTATO_SOUP;
    public static DeferredObject<Item> POTATO_BREAD;

    // Sweet Berries Items
    public static DeferredObject<Item> CHOCOLATE_SWEET_BERRIES;

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

    // Melon Slice Items
    public static DeferredObject<Item> IRON_MELON_SLICE;
    public static DeferredObject<Item> GOLDEN_MELON_SLICE;
    public static DeferredObject<Item> DIAMOND_MELON_SLICE;
    public static DeferredObject<Item> EMERALD_MELON_SLICE;

    // Cooked Rabbit Items
    public static DeferredObject<Item> IRON_COOKED_RABBIT;
    public static DeferredObject<Item> GOLDEN_COOKED_RABBIT;
    public static DeferredObject<Item> DIAMOND_COOKED_RABBIT;
    public static DeferredObject<Item> EMERALD_COOKED_RABBIT;

    // Cooked Chicken Items
    public static DeferredObject<Item> IRON_COOKED_CHICKEN;
    public static DeferredObject<Item> GOLDEN_COOKED_CHICKEN;
    public static DeferredObject<Item> DIAMOND_COOKED_CHICKEN;
    public static DeferredObject<Item> EMERALD_COOKED_CHICKEN;

    // Cooked Mutton Items
    public static DeferredObject<Item> IRON_COOKED_MUTTON;
    public static DeferredObject<Item> GOLDEN_COOKED_MUTTON;
    public static DeferredObject<Item> DIAMOND_COOKED_MUTTON;
    public static DeferredObject<Item> EMERALD_COOKED_MUTTON;

    // Cooked Porkchop Items
    public static DeferredObject<Item> IRON_COOKED_PORKCHOP;
    public static DeferredObject<Item> GOLDEN_COOKED_PORKCHOP;
    public static DeferredObject<Item> DIAMOND_COOKED_PORKCHOP;
    public static DeferredObject<Item> EMERALD_COOKED_PORKCHOP;

    // Cooked Beef Items
    public static DeferredObject<Item> IRON_COOKED_BEEF;
    public static DeferredObject<Item> GOLDEN_COOKED_BEEF;
    public static DeferredObject<Item> DIAMOND_COOKED_BEEF;
    public static DeferredObject<Item> EMERALD_COOKED_BEEF;

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

    // Creative Mode Tab
    public static DeferredObject<CreativeModeTab> MORE_FOOD_MAIN;

    public static final List<DeferredObject<Item>> ITEMS = new ArrayList<>();

    public static void initialize(BalmItems items) {
        BalmItems scoped = items.scoped(MoreFood.MOD_ID);

        // Carrot Items
        IRON_CARROT = registerItem(scoped, "iron_carrot", properties -> new MFIronFoodItem(properties, registerFoodValues(3, 1.5f)));
        DIAMOND_CARROT = registerItem(scoped, "diamond_carrot", properties -> new MFDiamondFoodItem(properties, registerFoodValues(3, 1.5f)));
        EMERALD_CARROT = registerItem(scoped, "emerald_carrot", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(3, 1.5f)));
        COOKED_CARROT = registerItem(scoped, "cooked_carrot", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        CARROT_PIECES = registerItem(scoped, "carrot_pieces", Item::new);
        CARROT_SOUP = registerItem(scoped, "carrot_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CARROT_BREAD = registerItem(scoped, "carrot_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        CARROT_PIE = registerItem(scoped, "carrot_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_CARROT = registerItem(scoped, "chocolate_carrot", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Apple Items
        IRON_APPLE = registerItem(scoped, "iron_apple", properties -> new MFIronFoodItem(properties, registerFoodValues(4, 2f)));
        DIAMOND_APPLE = registerItem(scoped, "diamond_apple", properties -> new MFDiamondFoodItem(properties, registerFoodValues(4, 2f)));
        EMERALD_APPLE = registerItem(scoped, "emerald_apple", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(4, 2f)));
        COOKED_APPLE = registerItem(scoped, "cooked_apple", properties -> new Item(properties.food(registerFoodValues(5, 2.5f))));
        APPLE_PIECES = registerItem(scoped, "apple_pieces", Item::new);
        APPLE_SOUP = registerItem(scoped, "apple_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        APPLE_BREAD = registerItem(scoped, "apple_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));
        APPLE_PIE = registerItem(scoped, "apple_pie", properties -> new Item(properties.food(registerFoodValues(10, 5f))));
        CHOCOLATE_APPLE = registerItem(scoped, "chocolate_apple", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Kelp Items
        IRON_KELP = registerItem(scoped, "iron_kelp", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_KELP = registerItem(scoped, "golden_kelp", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_KELP = registerItem(scoped, "diamond_kelp", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_KELP = registerItem(scoped, "emerald_kelp", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));
        KELP_PIECES = registerItem(scoped, "kelp_pieces", Item::new);
        KELP_SOUP = registerItem(scoped, "kelp_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        CHOCOLATE_DRIED_KELP = registerItem(scoped, "chocolate_dried_kelp", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Potato Items
        IRON_POTATO = registerItem(scoped, "iron_potato", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_POTATO = registerItem(scoped, "golden_potato", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_POTATO = registerItem(scoped, "diamond_potato", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_POTATO = registerItem(scoped, "emerald_potato", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));
        POTATO_PIECES = registerItem(scoped, "potato_pieces", Item::new);
        POTATO_SOUP = registerItem(scoped, "potato_soup", properties -> new MFSoupItem(properties, registerFoodValues(6, 3f)));
        POTATO_BREAD = registerItem(scoped, "potato_bread", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

        // Sweet Berries Items
        CHOCOLATE_SWEET_BERRIES = registerItem(scoped, "chocolate_sweet_berries", properties -> new Item(properties.food(registerFoodValues(6, 3f))));

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

        // Melon Slice Items
        IRON_MELON_SLICE = registerItem(scoped, "iron_melon_slice", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_MELON_SLICE = registerItem(scoped, "golden_melon_slice", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_MELON_SLICE = registerItem(scoped, "diamond_melon_slice", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_MELON_SLICE = registerItem(scoped, "emerald_melon_slice", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));

        // Cooked Rabbit Items
        IRON_COOKED_RABBIT = registerItem(scoped, "iron_cooked_rabbit", properties -> new MFIronFoodItem(properties, registerFoodValues(5, 2.5f)));
        GOLDEN_COOKED_RABBIT = registerItem(scoped, "golden_cooked_rabbit", properties -> new MFGoldenFoodItem(properties, registerFoodValues(5, 2.5f)));
        DIAMOND_COOKED_RABBIT = registerItem(scoped, "diamond_cooked_rabbit", properties -> new MFDiamondFoodItem(properties, registerFoodValues(5, 2.5f)));
        EMERALD_COOKED_RABBIT = registerItem(scoped, "emerald_cooked_rabbit", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(5, 2.5f)));

        // Cooked Chicken Items
        IRON_COOKED_CHICKEN = registerItem(scoped, "iron_cooked_chicken", properties -> new MFIronFoodItem(properties, registerFoodValues(6, 3f)));
        GOLDEN_COOKED_CHICKEN = registerItem(scoped, "golden_cooked_chicken", properties -> new MFGoldenFoodItem(properties, registerFoodValues(6, 3f)));
        DIAMOND_COOKED_CHICKEN = registerItem(scoped, "diamond_cooked_chicken", properties -> new MFDiamondFoodItem(properties, registerFoodValues(6, 3f)));
        EMERALD_COOKED_CHICKEN = registerItem(scoped, "emerald_cooked_chicken", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(6, 3f)));

        // Cooked Mutton Items
        IRON_COOKED_MUTTON = registerItem(scoped, "iron_cooked_mutton", properties -> new MFIronFoodItem(properties, registerFoodValues(6, 3f)));
        GOLDEN_COOKED_MUTTON = registerItem(scoped, "golden_cooked_mutton", properties -> new MFGoldenFoodItem(properties, registerFoodValues(6, 3f)));
        DIAMOND_COOKED_MUTTON = registerItem(scoped, "diamond_cooked_mutton", properties -> new MFDiamondFoodItem(properties, registerFoodValues(6, 3f)));
        EMERALD_COOKED_MUTTON = registerItem(scoped, "emerald_cooked_mutton", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(6, 3f)));

        // Cooked Porkchop Items
        IRON_COOKED_PORKCHOP = registerItem(scoped, "iron_cooked_porkchop", properties -> new MFIronFoodItem(properties, registerFoodValues(8, 4f)));
        GOLDEN_COOKED_PORKCHOP = registerItem(scoped, "golden_cooked_porkchop", properties -> new MFGoldenFoodItem(properties, registerFoodValues(8, 4f)));
        DIAMOND_COOKED_PORKCHOP = registerItem(scoped, "diamond_cooked_porkchop", properties -> new MFDiamondFoodItem(properties, registerFoodValues(8, 4f)));
        EMERALD_COOKED_PORKCHOP = registerItem(scoped, "emerald_cooked_porkchop", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(8, 4f)));

        // Cooked Beef Items
        IRON_COOKED_BEEF = registerItem(scoped, "iron_cooked_beef", properties -> new MFIronFoodItem(properties, registerFoodValues(8, 4f)));
        GOLDEN_COOKED_BEEF = registerItem(scoped, "golden_cooked_beef", properties -> new MFGoldenFoodItem(properties, registerFoodValues(8, 4f)));
        DIAMOND_COOKED_BEEF = registerItem(scoped, "diamond_cooked_beef", properties -> new MFDiamondFoodItem(properties, registerFoodValues(8, 4f)));
        EMERALD_COOKED_BEEF = registerItem(scoped, "emerald_cooked_beef", properties -> new MFEmeraldFoodItem(properties, registerFoodValues(8, 4f)));

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