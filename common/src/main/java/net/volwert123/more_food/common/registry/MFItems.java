package net.volwert123.more_food.common.registry;

import net.blay09.mods.balm.world.item.BalmItemRegistrar;
import net.blay09.mods.balm.world.item.DeferredItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.volwert123.more_food.common.MFFoodValues;

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
        IRON_CARROT = registerItem(items, "iron_carrot", Item::new, properties -> properties.food(MFFoodValues.CARROT, MFFoodValues.Consumables.IRON_FOOD));
        DIAMOND_CARROT = registerItem(items, "diamond_carrot", Item::new, properties -> properties.food(MFFoodValues.CARROT, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_CARROT = registerItem(items, "emerald_carrot", Item::new, properties -> properties.food(MFFoodValues.CARROT, MFFoodValues.Consumables.EMERALD_FOOD));
        COOKED_CARROT = registerItem(items, "cooked_carrot", Item::new, properties -> properties.food(MFFoodValues.COOKED_CARROT));
        CARROT_PIECES = registerItem(items, "carrot_pieces", Item::new, properties -> properties);
        CARROT_SOUP = registerItem(items, "carrot_soup", Item::new, properties -> properties.food(MFFoodValues.CARROT_SOUP).usingConvertsTo(Items.BOWL));
        CARROT_BREAD = registerItem(items, "carrot_bread", Item::new, properties -> properties.food(MFFoodValues.CARROT_BREAD));
        CARROT_PIE = registerItem(items, "carrot_pie", Item::new, properties -> properties.food(MFFoodValues.CARROT_PIE));
        CHOCOLATE_CARROT = registerItem(items, "chocolate_carrot", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE_CARROT));

        // Apple Items
        IRON_APPLE = registerItem(items, "iron_apple", Item::new, properties -> properties.food(MFFoodValues.APPLE, MFFoodValues.Consumables.IRON_FOOD));
        DIAMOND_APPLE = registerItem(items, "diamond_apple", Item::new, properties -> properties.food(MFFoodValues.APPLE, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_APPLE = registerItem(items, "emerald_apple", Item::new, properties -> properties.food(MFFoodValues.APPLE, MFFoodValues.Consumables.EMERALD_FOOD));
        COOKED_APPLE = registerItem(items, "cooked_apple", Item::new, properties -> properties.food(MFFoodValues.COOKED_APPLE));
        APPLE_PIECES = registerItem(items, "apple_pieces", Item::new, properties -> properties);
        APPLE_SOUP = registerItem(items, "apple_soup", Item::new, properties -> properties.food(MFFoodValues.APPLE_SOUP).usingConvertsTo(Items.BOWL));
        APPLE_BREAD = registerItem(items, "apple_bread", Item::new, properties -> properties.food(MFFoodValues.APPLE_BREAD));
        APPLE_PIE = registerItem(items, "apple_pie", Item::new, properties -> properties.food(MFFoodValues.APPLE_PIE));
        CHOCOLATE_APPLE = registerItem(items, "chocolate_apple", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE_APPLE));

        // Kelp Items
        IRON_KELP = registerItem(items, "iron_kelp", Item::new, properties -> properties.food(MFFoodValues.KELP, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_KELP = registerItem(items, "golden_kelp", Item::new, properties -> properties.food(MFFoodValues.KELP, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_KELP = registerItem(items, "diamond_kelp", Item::new, properties -> properties.food(MFFoodValues.KELP, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_KELP = registerItem(items, "emerald_kelp", Item::new, properties -> properties.food(MFFoodValues.KELP, MFFoodValues.Consumables.EMERALD_FOOD));
        KELP_PIECES = registerItem(items, "kelp_pieces", Item::new, properties -> properties);
        KELP_SOUP = registerItem(items, "kelp_soup", Item::new, properties -> properties.food(MFFoodValues.KELP_SOUP).usingConvertsTo(Items.BOWL));
        CHOCOLATE_DRIED_KELP = registerItem(items, "chocolate_dried_kelp", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE_DRIED_KELP));

        // Potato Items
        IRON_POTATO = registerItem(items, "iron_potato", Item::new, properties -> properties.food(MFFoodValues.POTATO, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_POTATO = registerItem(items, "golden_potato", Item::new, properties -> properties.food(MFFoodValues.POTATO, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_POTATO = registerItem(items, "diamond_potato", Item::new, properties -> properties.food(MFFoodValues.POTATO, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_POTATO = registerItem(items, "emerald_potato", Item::new, properties -> properties.food(MFFoodValues.POTATO, MFFoodValues.Consumables.EMERALD_FOOD));
        POTATO_PIECES = registerItem(items, "potato_pieces", Item::new, properties -> properties);
        POTATO_SOUP = registerItem(items, "potato_soup", Item::new, properties -> properties.food(MFFoodValues.POTATO_SOUP).usingConvertsTo(Items.BOWL));
        POTATO_BREAD = registerItem(items, "potato_bread", Item::new, properties -> properties.food(MFFoodValues.POTATO_BREAD));

        // Sweet Berries Items
        CHOCOLATE_SWEET_BERRIES = registerItem(items, "chocolate_sweet_berries", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE_SWEET_BERRIES));

        // Phantom Items
        COOKED_PHANTOM = registerItem(items, "cooked_phantom", Item::new, properties -> properties.food(MFFoodValues.COOKED_PHANTOM));
        PHANTOM_PIECES = registerItem(items, "phantom_pieces", Item::new, properties -> properties);
        PHANTOM_SOUP = registerItem(items, "phantom_soup", Item::new, properties -> properties.food(MFFoodValues.PHANTOM_SOUP).usingConvertsTo(Items.BOWL));

        // Pufferfish Items
        COOKED_PUFFERFISH = registerItem(items, "cooked_pufferfish", Item::new, properties -> properties.food(MFFoodValues.COOKED_PUFFERFISH));
        PUFFERFISH_PIECES = registerItem(items, "pufferfish_pieces", Item::new, properties -> properties);
        PUFFERFISH_SOUP = registerItem(items, "pufferfish_soup", Item::new, properties -> properties.food(MFFoodValues.PUFFERFISH_SOUP, MFFoodValues.Consumables.PUFFERFISH_FOOD).usingConvertsTo(Items.BOWL));

        // Pumpkin Items
        PUMPKING_SOUP = registerItem(items, "pumpking_soup", Item::new, properties -> properties.food(MFFoodValues.PUMPKIN_SOUP).usingConvertsTo(Items.BOWL));
        PUMPKING_BREAD = registerItem(items, "pumpking_bread", Item::new, properties -> properties.food(MFFoodValues.PUMPKIN_PIE));

        // Bamboo Items
        COOKED_BAMBOO = registerItem(items, "cooked_bamboo", Item::new, properties -> properties.food(MFFoodValues.COOKED_BAMBOO));
        BAMBOO_PIECES = registerItem(items, "bamboo_pieces", Item::new, properties -> properties);
        BAMBOO_SOUP = registerItem(items, "bamboo_soup", Item::new, properties -> properties.food(MFFoodValues.BAMBOO_SOUP).usingConvertsTo(Items.BOWL));

        // Melon Slice Items
        IRON_MELON_SLICE = registerItem(items, "iron_melon_slice", Item::new, properties -> properties.food(MFFoodValues.MELON_SLICE, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_MELON_SLICE = registerItem(items, "golden_melon_slice", Item::new, properties -> properties.food(MFFoodValues.MELON_SLICE, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_MELON_SLICE = registerItem(items, "diamond_melon_slice", Item::new, properties -> properties.food(MFFoodValues.MELON_SLICE, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_MELON_SLICE = registerItem(items, "emerald_melon_slice", Item::new, properties -> properties.food(MFFoodValues.MELON_SLICE, MFFoodValues.Consumables.EMERALD_FOOD));

        // Cooked Rabbit Items
        IRON_COOKED_RABBIT = registerItem(items, "iron_cooked_rabbit", Item::new, properties -> properties.food(MFFoodValues.COOKED_RABBIT, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_COOKED_RABBIT = registerItem(items, "golden_cooked_rabbit", Item::new, properties -> properties.food(MFFoodValues.COOKED_RABBIT, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_COOKED_RABBIT = registerItem(items, "diamond_cooked_rabbit", Item::new, properties -> properties.food(MFFoodValues.COOKED_RABBIT, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_COOKED_RABBIT = registerItem(items, "emerald_cooked_rabbit", Item::new, properties -> properties.food(MFFoodValues.COOKED_RABBIT, MFFoodValues.Consumables.EMERALD_FOOD));

        // Cooked Chicken Items
        IRON_COOKED_CHICKEN = registerItem(items, "iron_cooked_chicken", Item::new, properties -> properties.food(MFFoodValues.COOKED_CHICKEN, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_COOKED_CHICKEN = registerItem(items, "golden_cooked_chicken", Item::new, properties -> properties.food(MFFoodValues.COOKED_CHICKEN, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_COOKED_CHICKEN = registerItem(items, "diamond_cooked_chicken", Item::new, properties -> properties.food(MFFoodValues.COOKED_CHICKEN, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_COOKED_CHICKEN = registerItem(items, "emerald_cooked_chicken", Item::new, properties -> properties.food(MFFoodValues.COOKED_CHICKEN, MFFoodValues.Consumables.EMERALD_FOOD));

        // Cooked Mutton Items
        IRON_COOKED_MUTTON = registerItem(items, "iron_cooked_mutton", Item::new, properties -> properties.food(MFFoodValues.COOKED_MUTTON, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_COOKED_MUTTON = registerItem(items, "golden_cooked_mutton", Item::new, properties -> properties.food(MFFoodValues.COOKED_MUTTON, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_COOKED_MUTTON = registerItem(items, "diamond_cooked_mutton", Item::new, properties -> properties.food(MFFoodValues.COOKED_MUTTON, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_COOKED_MUTTON = registerItem(items, "emerald_cooked_mutton", Item::new, properties -> properties.food(MFFoodValues.COOKED_MUTTON, MFFoodValues.Consumables.EMERALD_FOOD));

        // Cooked Porkchop Items
        IRON_COOKED_PORKCHOP = registerItem(items, "iron_cooked_porkchop", Item::new, properties -> properties.food(MFFoodValues.COOKED_PORKCHOP, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_COOKED_PORKCHOP = registerItem(items, "golden_cooked_porkchop", Item::new, properties -> properties.food(MFFoodValues.COOKED_PORKCHOP, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_COOKED_PORKCHOP = registerItem(items, "diamond_cooked_porkchop", Item::new, properties -> properties.food(MFFoodValues.COOKED_PORKCHOP, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_COOKED_PORKCHOP = registerItem(items, "emerald_cooked_porkchop", Item::new, properties -> properties.food(MFFoodValues.COOKED_PORKCHOP, MFFoodValues.Consumables.EMERALD_FOOD));

        // Cooked Beef Items
        IRON_COOKED_BEEF = registerItem(items, "iron_cooked_beef", Item::new, properties -> properties.food(MFFoodValues.COOKED_BEEF, MFFoodValues.Consumables.IRON_FOOD));
        GOLDEN_COOKED_BEEF = registerItem(items, "golden_cooked_beef", Item::new, properties -> properties.food(MFFoodValues.COOKED_BEEF, MFFoodValues.Consumables.GOLDEN_FOOD));
        DIAMOND_COOKED_BEEF = registerItem(items, "diamond_cooked_beef", Item::new, properties -> properties.food(MFFoodValues.COOKED_BEEF, MFFoodValues.Consumables.DIAMOND_FOOD));
        EMERALD_COOKED_BEEF = registerItem(items, "emerald_cooked_beef", Item::new, properties -> properties.food(MFFoodValues.COOKED_BEEF, MFFoodValues.Consumables.EMERALD_FOOD));

        // Rice Items
        RICE = registerItem(items, "rice", properties -> new BlockItem(MFBlocks.RICE_CROP.asBlock(), properties), Item.Properties::useBlockDescriptionPrefix);
        RICE_CHICKEN_BOWL = registerItem(items, "rice_chicken_bowl", Item::new, properties -> properties.food(MFFoodValues.RICE_CHICKEN_BOWL).usingConvertsTo(Items.BOWL));
        RICE_SALMON_BOWL = registerItem(items, "rice_salmon_bowl", Item::new, properties -> properties.food(MFFoodValues.RICE_SALMON_BOWL).usingConvertsTo(Items.BOWL));
        RICE_COD_BOWL = registerItem(items, "rice_cod_bowl", Item::new, properties -> properties.food(MFFoodValues.RICE_COD_BOWL).usingConvertsTo(Items.BOWL));
        RICE_VEGETABLE_BOWL = registerItem(items, "rice_vegetable_bowl", Item::new, properties -> properties.food(MFFoodValues.RICE_VEGETABLE_BOWL).usingConvertsTo(Items.BOWL));
        RICE_PUDDING = registerItem(items, "rice_pudding", Item::new, properties -> properties.food(MFFoodValues.RICE_PUDDING).usingConvertsTo(Items.BOWL));
        RICE_HONEY_PUDDING = registerItem(items, "rice_honey_pudding", Item::new, properties -> properties.food(MFFoodValues.RICE_HONEY_PUDDING).usingConvertsTo(Items.BOWL));

        // Sushi Items
        SUSHI_BAMBOO = registerItem(items, "sushi_bamboo", Item::new, properties -> properties.food(MFFoodValues.SUSHI));
        SUSHI_CARROT = registerItem(items, "sushi_carrot", Item::new, properties -> properties.food(MFFoodValues.SUSHI));
        SUSHI_BEETROOT = registerItem(items, "sushi_beetroot", Item::new, properties -> properties.food(MFFoodValues.SUSHI));
        SUSHI_SALMON = registerItem(items, "sushi_salmon", Item::new, properties -> properties.food(MFFoodValues.SUSHI));

        // Egg & Bacon Items
        COOKED_EGG = registerItem(items, "cooked_egg", Item::new, properties -> properties.food(MFFoodValues.COOKED_EGG));
        RAW_BACON = registerItem(items, "raw_bacon", Item::new, properties -> properties.food(MFFoodValues.RAW_BACON));
        COOKED_BACON = registerItem(items, "cooked_bacon", Item::new, properties -> properties.food(MFFoodValues.COOKED_BACON));
        COOKED_BACON_EGG = registerItem(items, "cooked_bacon_egg", Item::new, properties -> properties.food(MFFoodValues.COOKED_BACON_EGG));

        // Chocolate Items
        CHOCOLATE = registerItem(items, "chocolate", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE));
        CHOCOLATE_BAR = registerItem(items, "chocolate_bar", Item::new, properties -> properties.food(MFFoodValues.CHOCOLATE_BAR));
    }

    private static DeferredItem registerItem(BalmItemRegistrar items, String name, Function<Item.Properties, Item> constructor, Function<Item.Properties, Item.Properties> propertiesBuilder) {
        DeferredItem item = items.register(name, constructor, propertiesBuilder).asDeferredItem();
        ITEMS.add(item);
        return item;
    }
}