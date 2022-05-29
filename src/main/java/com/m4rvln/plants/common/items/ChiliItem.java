package com.m4rvln.plants.common.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ChiliItem extends Item {

    public ChiliItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        livingEntity.setSecondsOnFire(1);
        return super.finishUsingItem(itemStack, level, livingEntity);
    }
}
