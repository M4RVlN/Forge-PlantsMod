package com.m4rvln.plants.common.registries;

import com.m4rvln.plants.client.ColorHandlers;
import com.m4rvln.plants.common.items.ChiliItem;
import com.m4rvln.plants.common.items.SeedItem;
import java.util.function.Supplier;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final RegistryObject<ChiliItem> CHILI;
    public static final RegistryObject<Item> CAULIFLOWER;
    public static final RegistryObject<Item> BROCCOLI;
    public static final RegistryObject<Item> CABBAGE;
    public static final RegistryObject<Item> EGGPLANT;
    public static final RegistryObject<Item> BELL_PEPPER;
    public static final RegistryObject<Item> TOMATO;
    public static final RegistryObject<Item> RADISH;
    public static final RegistryObject<Item> LEEK;
    public static final RegistryObject<Item> CORN;
    public static final RegistryObject<Item> GINGER;
    public static final RegistryObject<Item> PEA;
    public static final RegistryObject<Item> CELERY;
    public static final RegistryObject<Item> GARLIC;
    public static final RegistryObject<Item> ONION;
    public static final RegistryObject<Item> BEAN;
    public static final RegistryObject<Item> RICE;
    public static final RegistryObject<Item> CUCUMBER;
    public static final RegistryObject<Item> MINT;
    public static final RegistryObject<Item> SPINACH;
    public static final RegistryObject<Item> CORIANDER;
    public static final RegistryObject<Item> LEMONGRASS;
    public static final RegistryObject<Item> KALE;
    public static final RegistryObject<Item> ASPARAGUS;
    public static final RegistryObject<Item> LETTUCE;
    public static final RegistryObject<Item> ZUCCHINI;
    public static final RegistryObject<Item> MUSTARD;

    public static final RegistryObject<SeedItem> CHILI_SEED;
    public static final RegistryObject<SeedItem> CAULIFLOWER_SEED;
    public static final RegistryObject<SeedItem> BROCCOLI_SEED;
    public static final RegistryObject<SeedItem> CABBAGE_SEED;
    public static final RegistryObject<SeedItem> EGGPLANT_SEED;
    public static final RegistryObject<SeedItem> BELL_PEPPER_SEED;
    public static final RegistryObject<SeedItem> TOMATO_SEED;
    public static final RegistryObject<SeedItem> RADISH_SEED;
    public static final RegistryObject<SeedItem> LEEK_SEED;
    public static final RegistryObject<SeedItem> CORN_SEED;
    public static final RegistryObject<SeedItem> GINGER_SEED;
    public static final RegistryObject<SeedItem> PEA_SEED;
    public static final RegistryObject<SeedItem> CELERY_SEED;
    public static final RegistryObject<SeedItem> GARLIC_SEED;
    public static final RegistryObject<SeedItem> ONION_SEED;
    public static final RegistryObject<SeedItem> BEAN_SEED;
    public static final RegistryObject<SeedItem> RICE_SEED;
    public static final RegistryObject<SeedItem> CUCUMBER_SEED;
    public static final RegistryObject<SeedItem> MINT_SEED;
    public static final RegistryObject<SeedItem> SPINACH_SEED;
    public static final RegistryObject<SeedItem> CORIANDER_SEED;
    public static final RegistryObject<SeedItem> LEMONGRASS_SEED;
    public static final RegistryObject<SeedItem> KALE_SEED;
    public static final RegistryObject<SeedItem> ASPARAGUS_SEED;
    public static final RegistryObject<SeedItem> LETTUCE_SEED;
    public static final RegistryObject<SeedItem> ZUCCHINI_SEED;
    public static final RegistryObject<SeedItem> MUSTARD_SEED;

    static {
        Item.Properties defaultSeedProperties = new Item.Properties().tab(ModCreativeModeTabs.TAB_SEEDS);

        // @formatter:off
        CHILI = register("chili", () -> new ChiliItem(defaultFoodProperty(FoodRegistry.CHILI)));
        CAULIFLOWER = register("cauliflower", () -> new Item(defaultFoodProperty(FoodRegistry.CAULIFLOWER)));
        BROCCOLI = register("broccoli", () -> new Item(defaultFoodProperty(FoodRegistry.BROCCOLI)));
        CABBAGE = register("cabbage", () -> new Item(defaultFoodProperty(FoodRegistry.CABBAGE)));
        EGGPLANT = register("eggplant", () -> new Item(defaultFoodProperty(FoodRegistry.EGGPLANT)));
        BELL_PEPPER = register("bell_pepper", () -> new Item(defaultFoodProperty(FoodRegistry.BELL_PEPPER)));
        TOMATO = register("tomato", () -> new Item(defaultFoodProperty(FoodRegistry.TOMATO)));
        RADISH = register("radish", () -> new Item(defaultFoodProperty(FoodRegistry.RADISH)));
        LEEK = register("leek", () -> new Item(defaultFoodProperty(FoodRegistry.LEEK)));
        CORN = register("corn", () -> new Item(defaultFoodProperty(FoodRegistry.CORN)));
        GINGER = register("ginger", () -> new Item(defaultFoodProperty(FoodRegistry.GINGER)));
        PEA = register("pea", () -> new Item(defaultFoodProperty(FoodRegistry.PEA)));
        CELERY = register("celery", () -> new Item(defaultFoodProperty(FoodRegistry.CELERY)));
        GARLIC = register("garlic", () -> new Item(defaultFoodProperty(FoodRegistry.GARLIC)));
        ONION = register("onion", () -> new Item(defaultFoodProperty(FoodRegistry.ONION)));
        BEAN = register("bean", () -> new Item(defaultFoodProperty(FoodRegistry.BEAN)));
        RICE = register("rice", () -> new Item(defaultFoodProperty(FoodRegistry.RICE)));
        CUCUMBER = register("cucumber", () -> new Item(defaultFoodProperty(FoodRegistry.CUCUMBER)));
        MINT = register("mint", () -> new Item(defaultFoodProperty(FoodRegistry.MINT)));
        SPINACH = register("spinach", () -> new Item(defaultFoodProperty(FoodRegistry.SPINACH)));
        CORIANDER = register("coriander", () -> new Item(defaultFoodProperty(FoodRegistry.CORIANDER)));
        LEMONGRASS = register("lemongrass", () -> new Item(defaultFoodProperty(FoodRegistry.LEMONGRASS)));
        KALE = register("kale", () -> new Item(defaultFoodProperty(FoodRegistry.KALE)));
        ASPARAGUS = register("asparagus", () -> new Item(defaultFoodProperty(FoodRegistry.ASPARAGUS)));
        LETTUCE = register("lettuce", () -> new Item(defaultFoodProperty(FoodRegistry.LETTUCE)));
        ZUCCHINI = register("zucchini", () -> new Item(defaultFoodProperty(FoodRegistry.ZUCCHINI)));
        MUSTARD = register("mustard", () -> new Item(defaultFoodProperty(FoodRegistry.MUSTARD)));

        CHILI_SEED = registerWithColor("chili_seed", () -> new SeedItem(BlockRegistry.CHILI.get(), defaultSeedProperties, 0x00DFB15D));
        CAULIFLOWER_SEED = registerWithColor("cauliflower_seed", () -> new SeedItem(BlockRegistry.CAULIFLOWER.get(), defaultSeedProperties, 0x00A67F54));
        BROCCOLI_SEED = registerWithColor("broccoli_seed", () -> new SeedItem(BlockRegistry.BROCCOLI.get(), defaultSeedProperties, 0x00695853));
        CABBAGE_SEED = registerWithColor("cabbage_seed", () -> new SeedItem(BlockRegistry.CABBAGE.get(), defaultSeedProperties, 0x007F7873));
        EGGPLANT_SEED = registerWithColor("eggplant_seed", () -> new SeedItem(BlockRegistry.EGGPLANT.get(), defaultSeedProperties, 0x00CE9358));
        BELL_PEPPER_SEED = registerWithColor("bell_pepper_seed", () -> new SeedItem(BlockRegistry.BELL_PEPPER.get(), defaultSeedProperties, 0x00B5A451));
        TOMATO_SEED = registerWithColor("tomato_seed", () -> new SeedItem(BlockRegistry.TOMATO.get(), defaultSeedProperties, 0x00C6A186));
        RADISH_SEED = registerWithColor("radish_seed", () -> new SeedItem(BlockRegistry.RADISH.get(), defaultSeedProperties, 0x00B04336));
        LEEK_SEED = registerWithColor("leek_seed", () -> new SeedItem(BlockRegistry.LEEK.get(), defaultSeedProperties, 0x00161817));
        CORN_SEED = registerWithColor("corn_seed", () -> new SeedItem(BlockRegistry.CORN.get(), defaultSeedProperties, 0x00E39827));
        GINGER_SEED = registerWithColor("ginger_seed", () -> new SeedItem(BlockRegistry.GINGER.get(), defaultSeedProperties, 0x009D7047));
        PEA_SEED = registerWithColor("pea_seed", () -> new SeedItem(BlockRegistry.PEA.get(), defaultSeedProperties, 0x00918765));
        CELERY_SEED = registerWithColor("celery_seed", () -> new SeedItem(BlockRegistry.CELERY.get(), defaultSeedProperties, 0x00725B38));
        GARLIC_SEED = registerWithColor("garlic_seed", () -> new SeedItem(BlockRegistry.GARLIC.get(), defaultSeedProperties, 0x00E8C983));
        ONION_SEED = registerWithColor("onion_seed", () -> new SeedItem(BlockRegistry.ONION.get(), defaultSeedProperties, 0x00222E46));
        BEAN_SEED = registerWithColor("bean_seed", () -> new SeedItem(BlockRegistry.BEAN.get(), defaultSeedProperties, 0x0088962A));
        RICE_SEED = registerWithColor("rice_seed", () -> new SeedItem(BlockRegistry.RICE.get(), defaultSeedProperties, 0x00E8E5D9));
        CUCUMBER_SEED = registerWithColor("cucumber_seed", () -> new SeedItem(BlockRegistry.CUCUMBER.get(), defaultSeedProperties, 0x00E7D2C2));
        MINT_SEED = registerWithColor("mint_seed", () -> new SeedItem(BlockRegistry.MINT.get(), defaultSeedProperties, 0x00653535));
        SPINACH_SEED = registerWithColor("spinach_seed", () -> new SeedItem(BlockRegistry.SPINACH.get(), defaultSeedProperties, 0x00E2C49A));
        CORIANDER_SEED = registerWithColor("coriander_seed", () -> new SeedItem(BlockRegistry.CORIANDER.get(), defaultSeedProperties, 0x00E6C976));
        LEMONGRASS_SEED = registerWithColor("lemongrass_seed", () -> new SeedItem(BlockRegistry.LEMONGRASS.get(), defaultSeedProperties, 0x00594A40));
        KALE_SEED = registerWithColor("kale_seed", () -> new SeedItem(BlockRegistry.KALE.get(), defaultSeedProperties, 0x00FFFFFF));
        ASPARAGUS_SEED = registerWithColor("asparagus_seed", () -> new SeedItem(BlockRegistry.ASPARAGUS.get(), defaultSeedProperties, 0x00545857));
        LETTUCE_SEED = registerWithColor("lettuce_seed", () -> new SeedItem(BlockRegistry.LETTUCE.get(), defaultSeedProperties, 0x00E7D9D0));
        ZUCCHINI_SEED = registerWithColor("zucchini_seed", () -> new SeedItem(BlockRegistry.ZUCCHINI.get(), defaultSeedProperties, 0x00E5D9CD));
        MUSTARD_SEED = registerWithColor("mustard_seed", () -> new SeedItem(BlockRegistry.MUSTARD.get(), defaultSeedProperties, 0x00FFFF00));
        // @formatter:on
    }

    private static Item.Properties defaultFoodProperty(FoodProperties foodProperties) {
        return new Item.Properties().tab(ModCreativeModeTabs.TAB_FRUITS).food(foodProperties);
    }

    public static <T extends Item & ItemColor> RegistryObject<T> registerWithColor(String name, Supplier<T> item) {
        RegistryObject<T> ret = register(name, item);
        ColorHandlers.registerItem(ret);
        return ret;
    }

    public static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item) {
        return Registration.ITEMS.register(name, item);
    }
}
