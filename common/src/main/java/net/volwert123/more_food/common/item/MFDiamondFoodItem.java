package net.volwert123.more_food.common.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MFDiamondFoodItem extends Item {
    private final FoodProperties foodProperties;

    public MFDiamondFoodItem(Properties properties, FoodProperties foodProperties) {
        super(properties.food(foodProperties));
        this.foodProperties = foodProperties;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        Player player = user instanceof Player ? (Player) user : null;
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, stack);
        }
        if (level.isClientSide) user.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000));
        if (level.isClientSide) user.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1000, 2));
        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(foodProperties);
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }
        return stack;
    }
}