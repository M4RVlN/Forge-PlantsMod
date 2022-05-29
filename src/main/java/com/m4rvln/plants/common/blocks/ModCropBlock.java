package com.m4rvln.plants.common.blocks;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class ModCropBlock extends CropBlock {

    public ModCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return this;
    }
}
