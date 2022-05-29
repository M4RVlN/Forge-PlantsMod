package com.m4rvln.plants.common.registries;

import com.m4rvln.plants.PlantsMod;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PlantsMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PlantsMod.MOD_ID);

    public static void init() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        // Class load registry classes to initialize statics
        try {
            Class.forName(BlockRegistry.class.getName());
            Class.forName(ItemRegistry.class.getName());
        } catch (ClassNotFoundException e) {
            LogUtils.getLogger().error(e.getMessage(), e.getException());
        }
    }
}
