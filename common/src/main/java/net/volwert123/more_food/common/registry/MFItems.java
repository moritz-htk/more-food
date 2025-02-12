package net.volwert123.more_food.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.volwert123.more_food.common.MoreFood;
import net.volwert123.more_food.common.item.*;

public class MFItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MoreFood.MOD_ID, Registries.ITEM);

    // Carrot Items
    public static final RegistrySupplier<Item> IRON_CARROT = ITEMS.register("iron_carrot", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(3, 1.5f)));
    public static final RegistrySupplier<Item> DIAMOND_CARROT = ITEMS.register("diamond_carrot", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(3, 1.5f)));
    public static final RegistrySupplier<Item> EMERALD_CARROT = ITEMS.register("emerald_carrot", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(3, 1.5f)));
    public static final RegistrySupplier<Item> COOKED_CARROT = ITEMS.register("cooked_carrot", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> CARROT_PIECES = ITEMS.register("carrot_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> CARROT_SOUP = ITEMS.register("carrot_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> CARROT_BREAD = ITEMS.register("carrot_bread", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));
    public static final RegistrySupplier<Item> CARROT_PIE = ITEMS.register("carrot_pie", () -> new Item(registerItemProperties().food(registerFoodValues(10, 5f))));
    public static final RegistrySupplier<Item> CHOCOLATE_CARROT = ITEMS.register("chocolate_carrot", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    // Apple Items
    public static final RegistrySupplier<Item> IRON_APPLE = ITEMS.register("iron_apple", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(4, 2f)));
    public static final RegistrySupplier<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(4, 2f)));
    public static final RegistrySupplier<Item> EMERALD_APPLE = ITEMS.register("emerald_apple", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(4, 2f)));
    public static final RegistrySupplier<Item> COOKED_APPLE = ITEMS.register("cooked_apple", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> APPLE_PIECES = ITEMS.register("apple_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> APPLE_SOUP = ITEMS.register("apple_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> APPLE_BREAD = ITEMS.register("apple_bread", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));
    public static final RegistrySupplier<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(registerItemProperties().food(registerFoodValues(10, 5f))));
    public static final RegistrySupplier<Item> CHOCOLATE_APPLE = ITEMS.register("chocolate_apple", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    // Kelp Items
    public static final RegistrySupplier<Item> IRON_KELP = ITEMS.register("iron_kelp", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> GOLDEN_KELP = ITEMS.register("golden_kelp", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> DIAMOND_KELP = ITEMS.register("diamond_kelp", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> EMERALD_KELP = ITEMS.register("emerald_kelp", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> KELP_PIECES = ITEMS.register("kelp_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> KELP_SOUP = ITEMS.register("kelp_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> CHOCOLATE_DRIED_KELP = ITEMS.register("chocolate_dried_kelp", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    // Potato Items
    public static final RegistrySupplier<Item> IRON_POTATO = ITEMS.register("iron_potato", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> DIAMOND_POTATO = ITEMS.register("diamond_potato", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> EMERALD_POTATO = ITEMS.register("emerald_potato", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(4, 2f)));
    public static final RegistrySupplier<Item> POTATO_PIECES = ITEMS.register("potato_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> POTATO_SOUP = ITEMS.register("potato_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> POTATO_BREAD = ITEMS.register("potato_bread", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    // Phantom Items
    public static final RegistrySupplier<Item> COOKED_PHANTOM = ITEMS.register("cooked_phantom", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> PHANTOM_PIECES = ITEMS.register("phantom_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> PHANTOM_SOUP = ITEMS.register("phantom_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));

    // Pufferfish Items
    public static final RegistrySupplier<Item> COOKED_PUFFERFISH = ITEMS.register("cooked_pufferfish", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> PUFFERFISH_PIECES = ITEMS.register("pufferfish_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> PUFFERFISH_SOUP = ITEMS.register("pufferfish_soup", () -> new MFPufferfishSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));

    // Pumpkin Items
    public static final RegistrySupplier<Item> PUMPKING_SOUP = ITEMS.register("pumpking_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> PUMPKING_BREAD = ITEMS.register("pumpking_bread", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    // Bamboo Items
    public static final RegistrySupplier<Item> COOKED_BAMBOO = ITEMS.register("cooked_bamboo", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> BAMBOO_PIECES = ITEMS.register("bamboo_pieces", () -> new Item(registerItemProperties()));
    public static final RegistrySupplier<Item> BAMBOO_SOUP = ITEMS.register("bamboo_soup", () -> new MFSoupItem(registerItemProperties(), registerFoodValues(6, 3f)));

    // Cooked Rabbit Items
    public static final RegistrySupplier<Item> IRON_COOKED_RABBIT = ITEMS.register("iron_cooked_rabbit", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> GOLDEN_COOKED_RABBIT = ITEMS.register("golden_cooked_rabbit", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> DIAMOND_COOKED_RABBIT = ITEMS.register("diamond_cooked_rabbit", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> EMERALD_COOKED_RABBIT = ITEMS.register("emerald_cooked_rabbit", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));

    // Melon Slice Items
    public static final RegistrySupplier<Item> IRON_MELON_SLICE = ITEMS.register("iron_melon_slice", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> GOLDEN_MELON_SLICE = ITEMS.register("golden_melon_slice", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> DIAMOND_MELON_SLICE = ITEMS.register("diamond_melon_slice", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));
    public static final RegistrySupplier<Item> EMERALD_MELON_SLICE = ITEMS.register("emerald_melon_slice", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(5, 2.5f)));

    // Cooked Chicken Items
    public static final RegistrySupplier<Item> IRON_COOKED_CHICKEN = ITEMS.register("iron_cooked_chicken", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> GOLDEN_COOKED_CHICKEN = ITEMS.register("golden_cooked_chicken", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> DIAMOND_COOKED_CHICKEN = ITEMS.register("diamond_cooked_chicken", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> EMERALD_COOKED_CHICKEN = ITEMS.register("emerald_cooked_chicken", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));

    // Cooked Mutton Items
    public static final RegistrySupplier<Item> IRON_COOKED_MUTTON = ITEMS.register("iron_cooked_mutton", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> GOLDEN_COOKED_MUTTON = ITEMS.register("golden_cooked_mutton", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> DIAMOND_COOKED_MUTTON = ITEMS.register("diamond_cooked_mutton", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));
    public static final RegistrySupplier<Item> EMERALD_COOKED_MUTTON = ITEMS.register("emerald_cooked_mutton", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(6, 3f)));

    // Cooked Porkchop Items
    public static final RegistrySupplier<Item> IRON_COOKED_PORKCHOP = ITEMS.register("iron_cooked_porkchop", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> GOLDEN_COOKED_PORKCHOP = ITEMS.register("golden_cooked_porkchop", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> DIAMOND_COOKED_PORKCHOP = ITEMS.register("diamond_cooked_porkchop", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> EMERALD_COOKED_PORKCHOP = ITEMS.register("emerald_cooked_porkchop", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));

    // Cooked Beef Items
    public static final RegistrySupplier<Item> IRON_COOKED_BEEF = ITEMS.register("iron_cooked_beef", () -> new MFIronFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> GOLDEN_COOKED_BEEF = ITEMS.register("golden_cooked_beef", () -> new MFGoldenFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> DIAMOND_COOKED_BEEF = ITEMS.register("diamond_cooked_beef", () -> new MFDiamondFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));
    public static final RegistrySupplier<Item> EMERALD_COOKED_BEEF = ITEMS.register("emerald_cooked_beef", () -> new MFEmeraldFoodItem(registerItemProperties(), registerFoodValues(8, 4f)));

    // Rice Items
    public static final RegistrySupplier<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(MFBlocks.RICE_CROP.get(), registerItemProperties()));
    public static final RegistrySupplier<Item> RICE_CHICKEN_BOWL = ITEMS.register("rice_chicken_bowl", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(10, 5f)));
    public static final RegistrySupplier<Item> RICE_SALMON_BOWL = ITEMS.register("rice_salmon_bowl", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(10, 5f)));
    public static final RegistrySupplier<Item> RICE_COD_BOWL = ITEMS.register("rice_cod_bowl", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(10, 5f)));
    public static final RegistrySupplier<Item> RICE_VEGETABLE_BOWL = ITEMS.register("rice_vegetable_bowl", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(9, 4.5f)));
    public static final RegistrySupplier<Item> RICE_PUDDING = ITEMS.register("rice_pudding", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(9, 4.5f)));
    public static final RegistrySupplier<Item> RICE_HONEY_PUDDING = ITEMS.register("rice_honey_pudding", () -> new MFRiceBowlItem(registerItemProperties(), registerFoodValues(10, 5f)));

    // Sushi Items
    public static final RegistrySupplier<Item> SUSHI_BAMBOO = ITEMS.register("sushi_bamboo", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> SUSHI_CARROT = ITEMS.register("sushi_carrot", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> SUSHI_BEETROOT = ITEMS.register("sushi_beetroot", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));
    public static final RegistrySupplier<Item> SUSHI_SALMON = ITEMS.register("sushi_salmon", () -> new Item(registerItemProperties().food(registerFoodValues(5, 2.5f))));

    // Egg & Bacon Items
    public static final RegistrySupplier<Item> COOKED_EGG = ITEMS.register("cooked_egg", () -> new Item(registerItemProperties().food(registerFoodValues(3, 1.5f))));
    public static final RegistrySupplier<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(registerItemProperties().food(registerFoodValues(2,1f))));
    public static final RegistrySupplier<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(registerItemProperties().food(registerFoodValues(5,2.5f))));
    public static final RegistrySupplier<Item> COOKED_BACON_EGG = ITEMS.register("cooked_bacon_egg", () -> new Item(registerItemProperties().food(registerFoodValues(7, 3.5f))));

    // Chocolate Items
    public static final RegistrySupplier<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(registerItemProperties().food(registerFoodValues(6,3f))));
    public static final RegistrySupplier<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new Item(registerItemProperties().food(registerFoodValues(8,4f))));

    // Sweet Berries Items
    public static final RegistrySupplier<Item> CHOCOLATE_SWEET_BERRIES = ITEMS.register("chocolate_sweet_berries", () -> new Item(registerItemProperties().food(registerFoodValues(6, 3f))));

    private static Item.Properties registerItemProperties() {
        return new Item.Properties().arch$tab(MFCreativeTabs.MORE_FOOD_MAIN);
    }

    private static FoodProperties registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }
}