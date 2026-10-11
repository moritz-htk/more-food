package net.volwert123.more_food.common;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class MFFoodValues {
    // Carrot Items
    public static final FoodProperties CARROT = registerFoodValues(3, 1.5f);
    public static final FoodProperties COOKED_CARROT = registerFoodValues(5, 2.5f);
    public static final FoodProperties CARROT_SOUP = registerFoodValues(6, 3f);
    public static final FoodProperties CARROT_BREAD = registerFoodValues(6, 3f);
    public static final FoodProperties CARROT_PIE = registerFoodValues(10, 5f);
    public static final FoodProperties CHOCOLATE_CARROT = registerFoodValues(6, 3f);

    // Apple Items
    public static final FoodProperties APPLE = registerFoodValues(4, 2f);
    public static final FoodProperties COOKED_APPLE = registerFoodValues(5, 2.5f);
    public static final FoodProperties APPLE_SOUP = registerFoodValues(6, 3f);
    public static final FoodProperties APPLE_BREAD = registerFoodValues(6, 3f);
    public static final FoodProperties APPLE_PIE = registerFoodValues(10, 5f);
    public static final FoodProperties CHOCOLATE_APPLE = registerFoodValues(6, 3f);

    // Kelp Items
    public static final FoodProperties KELP = registerFoodValues(5, 2.5f);
    public static final FoodProperties KELP_SOUP = registerFoodValues(6, 3f);
    public static final FoodProperties CHOCOLATE_DRIED_KELP = registerFoodValues(6, 3f);

    // Potato Items
    public static final FoodProperties POTATO = registerFoodValues(5, 2.5f);
    public static final FoodProperties POTATO_SOUP = registerFoodValues(6, 3f);
    public static final FoodProperties POTATO_BREAD = registerFoodValues(6, 3f);

    // Sweet Berries Items
    public static final FoodProperties CHOCOLATE_SWEET_BERRIES = registerFoodValues(6, 3f);

    // Phantom Items
    public static final FoodProperties COOKED_PHANTOM = registerFoodValues(5, 2.5f);
    public static final FoodProperties PHANTOM_SOUP = registerFoodValues(6, 3f);

    // Pufferfish Items
    public static final FoodProperties COOKED_PUFFERFISH = registerFoodValues(5, 2.5f);
    public static final FoodProperties PUFFERFISH_SOUP = registerFoodValues(6, 3f);

    // Pumpkin Items
    public static final FoodProperties PUMPKIN_SOUP = registerFoodValues(6, 3f);
    public static final FoodProperties PUMPKIN_PIE = registerFoodValues(6, 3f);

    // Bamboo Items
    public static final FoodProperties COOKED_BAMBOO = registerFoodValues(5, 2.5f);
    public static final FoodProperties BAMBOO_SOUP = registerFoodValues(6, 3f);

    // Melon Slice Items
    public static final FoodProperties MELON_SLICE = registerFoodValues(5, 2.5f);

    // Cooked Rabbit Items
    public static final FoodProperties COOKED_RABBIT = registerFoodValues(5, 2.5f);

    // Cooked Chicken Items
    public static final FoodProperties COOKED_CHICKEN = registerFoodValues(6, 3f);

    // Cooked Mutton Items
    public static final FoodProperties COOKED_MUTTON = registerFoodValues(6, 3f);

    // Cooked Porkchop Items
    public static final FoodProperties COOKED_PORKCHOP = registerFoodValues(8, 4f);

    // Cooked Beef Items
    public static final FoodProperties COOKED_BEEF = registerFoodValues(8, 4f);

    // Rice Items
    public static final FoodProperties RICE_CHICKEN_BOWL = registerFoodValues(10, 5f);
    public static final FoodProperties RICE_SALMON_BOWL = registerFoodValues(10, 5f);
    public static final FoodProperties RICE_COD_BOWL = registerFoodValues(10, 5f);
    public static final FoodProperties RICE_VEGETABLE_BOWL = registerFoodValues(9, 4.5f);
    public static final FoodProperties RICE_PUDDING = registerFoodValues(9, 4.5f);
    public static final FoodProperties RICE_HONEY_PUDDING = registerFoodValues(10, 5f);

    // Sushi Items
    public static final FoodProperties SUSHI = registerFoodValues(5, 2.5f);

    // Egg & Bacon Items
    public static final FoodProperties COOKED_EGG = registerFoodValues(3, 1.5f);
    public static final FoodProperties RAW_BACON = registerFoodValues(2, 1f);
    public static final FoodProperties COOKED_BACON = registerFoodValues(5, 2.5f);
    public static final FoodProperties COOKED_BACON_EGG = registerFoodValues(7, 3.5f);

    // Chocolate Items
    public static final FoodProperties CHOCOLATE = registerFoodValues(6, 3f);
    public static final FoodProperties CHOCOLATE_BAR = registerFoodValues(8, 4f);

    private static FoodProperties registerFoodValues(int nutrition, float saturation) {
        return new FoodProperties.Builder().nutrition(nutrition).saturationModifier(saturation).build();
    }

    public static class Consumables {
        public static final Consumable IRON_FOOD = foodWithEffects(600, 0);
        public static final Consumable GOLDEN_FOOD = foodWithEffects(800, 1);
        public static final Consumable DIAMOND_FOOD = foodWithEffects(1000, 2);
        public static final Consumable EMERALD_FOOD = foodWithEffects(1200, 3);
        public static final Consumable PUFFERFISH_FOOD = foodWithPoison();

        private static Consumable foodWithEffects(int duration, int absorptionAmplifier) {
            return createBaseFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, duration),
                            new MobEffectInstance(MobEffects.ABSORPTION, duration, absorptionAmplifier))))
                    .build();
        }

        private static Consumable foodWithPoison() {
            return createBaseFood()
                    .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                            new MobEffectInstance(MobEffects.BLINDNESS, 600),
                            new MobEffectInstance(MobEffects.SLOWNESS, 700))))
                    .build();
        }

        private static Consumable.Builder createBaseFood() {
            return Consumable.builder()
                    .consumeSeconds(1.6F)
                    .animation(ItemUseAnimation.EAT)
                    .sound(SoundEvents.GENERIC_EAT)
                    .hasConsumeParticles(true);
        }
    }
}