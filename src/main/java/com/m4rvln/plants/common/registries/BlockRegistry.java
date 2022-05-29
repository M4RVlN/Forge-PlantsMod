package com.m4rvln.plants.common.registries;

import com.m4rvln.plants.common.blocks.ModCropBlock;
import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public final class BlockRegistry {

    public static final RegistryObject<ModCropBlock> CHILI;
    public static final RegistryObject<ModCropBlock> CAULIFLOWER;
    public static final RegistryObject<ModCropBlock> BROCCOLI;
    public static final RegistryObject<ModCropBlock> CABBAGE;
    public static final RegistryObject<ModCropBlock> EGGPLANT;
    public static final RegistryObject<ModCropBlock> BELL_PEPPER;
    public static final RegistryObject<ModCropBlock> TOMATO;
    public static final RegistryObject<ModCropBlock> RADISH;
    public static final RegistryObject<ModCropBlock> LEEK;
    public static final RegistryObject<ModCropBlock> CORN;
    public static final RegistryObject<ModCropBlock> GINGER;
    public static final RegistryObject<ModCropBlock> PEA;
    public static final RegistryObject<ModCropBlock> CELERY;
    public static final RegistryObject<ModCropBlock> GARLIC;
    public static final RegistryObject<ModCropBlock> ONION;
    public static final RegistryObject<ModCropBlock> BEAN;
    public static final RegistryObject<ModCropBlock> RICE;
    public static final RegistryObject<ModCropBlock> CUCUMBER;
    public static final RegistryObject<ModCropBlock> MINT;
    public static final RegistryObject<ModCropBlock> SPINACH;
    public static final RegistryObject<ModCropBlock> CORIANDER;
    public static final RegistryObject<ModCropBlock> LEMONGRASS;
    public static final RegistryObject<ModCropBlock> KALE;
    public static final RegistryObject<ModCropBlock> ASPARAGUS;
    public static final RegistryObject<ModCropBlock> LETTUCE;
    public static final RegistryObject<ModCropBlock> ZUCCHINI;
    public static final RegistryObject<ModCropBlock> MUSTARD;

/*    public static final RegistryObject<ModCropBlock> PINEAPPLE;
    public static final RegistryObject<ModCropBlock> GRAPE;
    public static final RegistryObject<ModCropBlock> LEMON;
    public static final RegistryObject<ModCropBlock> LIME;
    public static final RegistryObject<ModCropBlock> ORANGE;*/

    static {
        Properties defaultItemProperties = new Properties().tab(ModCreativeModeTabs.TAB_GENERAL);
        BlockBehaviour.Properties defaultCropProperties = BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks()
                .instabreak().sound(SoundType.CROP);

        // @formatter:off
        CHILI = register("chili", () -> new ModCropBlock(defaultCropProperties));
        CAULIFLOWER = register("cauliflower", () -> new ModCropBlock(defaultCropProperties));
        BROCCOLI = register("broccoli", () -> new ModCropBlock(defaultCropProperties));
        CABBAGE = register("cabbage", () -> new ModCropBlock(defaultCropProperties));
        EGGPLANT = register("eggplant", () -> new ModCropBlock(defaultCropProperties));
        BELL_PEPPER = register("bell_pepper", () -> new ModCropBlock(defaultCropProperties));
        TOMATO = register("tomato", () -> new ModCropBlock(defaultCropProperties));
        RADISH = register("radish", () -> new ModCropBlock(defaultCropProperties));
        LEEK = register("leek", () -> new ModCropBlock(defaultCropProperties));
        CORN = register("corn", () -> new ModCropBlock(defaultCropProperties));
        GINGER = register("ginger", () -> new ModCropBlock(defaultCropProperties));
        PEA = register("pea", () -> new ModCropBlock(defaultCropProperties));
        CELERY = register("celery", () -> new ModCropBlock(defaultCropProperties));
        GARLIC = register("garlic", () -> new ModCropBlock(defaultCropProperties));
        ONION = register("onion", () -> new ModCropBlock(defaultCropProperties));
        BEAN = register("bean", () -> new ModCropBlock(defaultCropProperties));
        RICE = register("rice", () -> new ModCropBlock(defaultCropProperties));
        CUCUMBER = register("cucumber", () -> new ModCropBlock(defaultCropProperties));
        MINT = register("mint", () -> new ModCropBlock(defaultCropProperties));
        SPINACH = register("spinach", () -> new ModCropBlock(defaultCropProperties));
        CORIANDER = register("coriander", () -> new ModCropBlock(defaultCropProperties));
        LEMONGRASS = register("lemongrass", () -> new ModCropBlock(defaultCropProperties));
        KALE = register("kale", () -> new ModCropBlock(defaultCropProperties));
        ASPARAGUS = register("asparagus", () -> new ModCropBlock(defaultCropProperties));
        LETTUCE = register("lettuce", () -> new ModCropBlock(defaultCropProperties));
        ZUCCHINI = register("zucchini", () -> new ModCropBlock(defaultCropProperties));
        MUSTARD = register("mustard", () -> new ModCropBlock(defaultCropProperties));
        // @formatter:on
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Properties itemProperties) {
        RegistryObject<T> ret = register(name, block);
        ItemRegistry.register(name, () -> new BlockItem(ret.get(), itemProperties));
        return ret;
    }
}
