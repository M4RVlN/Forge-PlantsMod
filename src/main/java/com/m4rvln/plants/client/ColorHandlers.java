package com.m4rvln.plants.client;

import java.util.ArrayList;
import java.util.function.Supplier;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ColorHandlerEvent;

public final class ColorHandlers {

    private static final ArrayList<Supplier<?>> itemsToRegister = new ArrayList<>();
    private static final ArrayList<Supplier<?>> blocksToRegister = new ArrayList<>();

    public static void setupItemColors(ColorHandlerEvent.Item event) {
        ItemColors colors = event.getItemColors();
        for (Supplier<?> supplier : itemsToRegister) {
            Object item = supplier.get();
            colors.register((ItemColor) item, (ItemLike) item);
        }
        itemsToRegister.clear();
    }

    public static void setupBlockColors(ColorHandlerEvent.Block event) {
        BlockColors colors = event.getBlockColors();
        for (Supplier<?> supplier : blocksToRegister) {
            Object block = supplier.get();
            colors.register((BlockColor)block, (Block)block);
        }
        blocksToRegister.clear();
    }

    public static <T extends ItemLike & ItemColor> void registerItem(Supplier<T> item) {
        itemsToRegister.add(item);
    }

    public static <T extends Block & BlockColor> void registerBlock(Supplier<T> block) {
        blocksToRegister.add(block);
    }
}
