package com.m4rvln.plants.common.registries;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTabs {

    public static final CreativeModeTab TAB_GENERAL = new CreativeModeTab("plantsGeneral") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.SUNFLOWER);
        }
    };

    public static final CreativeModeTab TAB_SEEDS = new CreativeModeTab("plantsSeeds") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.PUMPKIN_SEEDS);
        }
    };

    public static final CreativeModeTab TAB_FRUITS = new CreativeModeTab("plantsFruits") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.BEETROOT);
        }
    };

    public static final CreativeModeTab TAB_DISHES = new CreativeModeTab("plantsDishes") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.BEETROOT_SOUP);
        }
    };
}
