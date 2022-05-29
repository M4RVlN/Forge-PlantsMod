package com.m4rvln.plants.common.items;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class SeedItem extends BlockItem implements ItemColor {

    private final int color;

    public SeedItem(Block block, Properties properties, int color) {
        super(block, properties);
        this.color = color;
    }

    @Override
    public int getColor(ItemStack itemStack, int tintIndex) {
        return tintIndex == 0 ? this.color : 0x00FFFFFF;
    }
}
