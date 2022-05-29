package com.m4rvln.plants.common.registries;

import com.m4rvln.plants.client.ColorHandlers;
import com.m4rvln.plants.common.blocks.ModCropBlock;
import com.m4rvln.plants.common.items.ChiliItem;
import com.m4rvln.plants.common.items.SeedItem;
import java.util.function.Supplier;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

public enum Crops {
    CHILI,
    CAULIFLOWER,
    BROCCOLI,
    CABBAGE,
    EGGPLANT,
    BELL_PEPPER,
    TOMATO,
    RADISH,
    LEEK,
    CORN,
    GINGER,
    PEA,
    CELERY,
    GARLIC,
    ONION,
    BEAN,
    RICE,
    CUCUMBER,
    MINT,
    SPINACH,
    CORIANDER,
    LEMONGRASS,
    KALE,
    ASPARAGUS,
    LETTUCE,
    ZUCCHINI,
    MUSTARD;

    static {
        Item.Properties defaultSeedProperties = new Item.Properties().tab(ModCreativeModeTabs.TAB_SEEDS);
        BlockBehaviour.Properties defaultCropProperties = BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                .randomTicks().instabreak().sound(SoundType.CROP);
        /*
         * Fruit Items
         */
        CHILI.setFruitItem(new ChiliItem(defaultFoodProperty(FoodRegistry.CHILI)));
        CAULIFLOWER.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CAULIFLOWER)));
        BROCCOLI.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.BROCCOLI)));
        CABBAGE.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CABBAGE)));
        EGGPLANT.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.EGGPLANT)));
        BELL_PEPPER.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.BELL_PEPPER)));
        TOMATO.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.TOMATO)));
        RADISH.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.RADISH)));
        LEEK.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.LEEK)));
        CORN.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CORN)));
        GINGER.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.GINGER)));
        PEA.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.PEA)));
        CELERY.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CELERY)));
        GARLIC.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.GARLIC)));
        ONION.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.ONION)));
        BEAN.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.BEAN)));
        RICE.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.RICE)));
        CUCUMBER.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CUCUMBER)));
        MINT.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.MINT)));
        SPINACH.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.SPINACH)));
        CORIANDER.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.CORIANDER)));
        LEMONGRASS.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.LEMONGRASS)));
        KALE.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.KALE)));
        ASPARAGUS.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.ASPARAGUS)));
        LETTUCE.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.LETTUCE)));
        ZUCCHINI.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.ZUCCHINI)));
        MUSTARD.setFruitItem(new Item(defaultFoodProperty(FoodRegistry.MUSTARD)));

        /*
         * Seed Items
         */
        CHILI.setSeedItem(new SeedItem(BlockRegistry.CHILI.get(), defaultSeedProperties, 0x00DFB15D));
        CAULIFLOWER.setSeedItem(new SeedItem(BlockRegistry.CAULIFLOWER.get(), defaultSeedProperties, 0x00A67F54));
        BROCCOLI.setSeedItem(new SeedItem(BlockRegistry.BROCCOLI.get(), defaultSeedProperties, 0x00695853));
        CABBAGE.setSeedItem(new SeedItem(BlockRegistry.CABBAGE.get(), defaultSeedProperties, 0x007F7873));
        EGGPLANT.setSeedItem(new SeedItem(BlockRegistry.EGGPLANT.get(), defaultSeedProperties, 0x00CE9358));
        BELL_PEPPER.setSeedItem(new SeedItem(BlockRegistry.BELL_PEPPER.get(), defaultSeedProperties, 0x00B5A451));
        TOMATO.setSeedItem(new SeedItem(BlockRegistry.TOMATO.get(), defaultSeedProperties, 0x00C6A186));
        RADISH.setSeedItem(new SeedItem(BlockRegistry.RADISH.get(), defaultSeedProperties, 0x00B04336));
        LEEK.setSeedItem(new SeedItem(BlockRegistry.LEEK.get(), defaultSeedProperties, 0x00161817));
        CORN.setSeedItem(new SeedItem(BlockRegistry.CORN.get(), defaultSeedProperties, 0x00E39827));
        GINGER.setSeedItem(new SeedItem(BlockRegistry.GINGER.get(), defaultSeedProperties, 0x009D7047));
        PEA.setSeedItem(new SeedItem(BlockRegistry.PEA.get(), defaultSeedProperties, 0x00918765));
        CELERY.setSeedItem(new SeedItem(BlockRegistry.CELERY.get(), defaultSeedProperties, 0x00725B38));
        GARLIC.setSeedItem(new SeedItem(BlockRegistry.GARLIC.get(), defaultSeedProperties, 0x00E8C983));
        ONION.setSeedItem(new SeedItem(BlockRegistry.ONION.get(), defaultSeedProperties, 0x00222E46));
        BEAN.setSeedItem(new SeedItem(BlockRegistry.BEAN.get(), defaultSeedProperties, 0x0088962A));
        RICE.setSeedItem(new SeedItem(BlockRegistry.RICE.get(), defaultSeedProperties, 0x00E8E5D9));
        CUCUMBER.setSeedItem(new SeedItem(BlockRegistry.CUCUMBER.get(), defaultSeedProperties, 0x00E7D2C2));
        MINT.setSeedItem(new SeedItem(BlockRegistry.MINT.get(), defaultSeedProperties, 0x00653535));
        SPINACH.setSeedItem(new SeedItem(BlockRegistry.SPINACH.get(), defaultSeedProperties, 0x00E2C49A));
        CORIANDER.setSeedItem(new SeedItem(BlockRegistry.CORIANDER.get(), defaultSeedProperties, 0x00E6C976));
        LEMONGRASS.setSeedItem(new SeedItem(BlockRegistry.LEMONGRASS.get(), defaultSeedProperties, 0x00594A40));
        KALE.setSeedItem(new SeedItem(BlockRegistry.KALE.get(), defaultSeedProperties, 0x00FFFFFF));
        ASPARAGUS.setSeedItem(new SeedItem(BlockRegistry.ASPARAGUS.get(), defaultSeedProperties, 0x00545857));
        LETTUCE.setSeedItem(new SeedItem(BlockRegistry.LETTUCE.get(), defaultSeedProperties, 0x00E7D9D0));
        ZUCCHINI.setSeedItem(new SeedItem(BlockRegistry.ZUCCHINI.get(), defaultSeedProperties, 0x00E5D9CD));
        MUSTARD.setSeedItem(new SeedItem(BlockRegistry.MUSTARD.get(), defaultSeedProperties, 0x00FFFF00));

        /*
         * Crop Blocks
         */
        CHILI.setCropBlock(new ModCropBlock(defaultCropProperties));
        CAULIFLOWER.setCropBlock(new ModCropBlock(defaultCropProperties));
        BROCCOLI.setCropBlock(new ModCropBlock(defaultCropProperties));
        CABBAGE.setCropBlock(new ModCropBlock(defaultCropProperties));
        EGGPLANT.setCropBlock(new ModCropBlock(defaultCropProperties));
        BELL_PEPPER.setCropBlock(new ModCropBlock(defaultCropProperties));
        TOMATO.setCropBlock(new ModCropBlock(defaultCropProperties));
        RADISH.setCropBlock(new ModCropBlock(defaultCropProperties));
        LEEK.setCropBlock(new ModCropBlock(defaultCropProperties));
        CORN.setCropBlock(new ModCropBlock(defaultCropProperties));
        GINGER.setCropBlock(new ModCropBlock(defaultCropProperties));
        PEA.setCropBlock(new ModCropBlock(defaultCropProperties));
        CELERY.setCropBlock(new ModCropBlock(defaultCropProperties));
        GARLIC.setCropBlock(new ModCropBlock(defaultCropProperties));
        ONION.setCropBlock(new ModCropBlock(defaultCropProperties));
        BEAN.setCropBlock(new ModCropBlock(defaultCropProperties));
        RICE.setCropBlock(new ModCropBlock(defaultCropProperties));
        CUCUMBER.setCropBlock(new ModCropBlock(defaultCropProperties));
        MINT.setCropBlock(new ModCropBlock(defaultCropProperties));
        SPINACH.setCropBlock(new ModCropBlock(defaultCropProperties));
        CORIANDER.setCropBlock(new ModCropBlock(defaultCropProperties));
        LEMONGRASS.setCropBlock(new ModCropBlock(defaultCropProperties));
        KALE.setCropBlock(new ModCropBlock(defaultCropProperties));
        ASPARAGUS.setCropBlock(new ModCropBlock(defaultCropProperties));
        LETTUCE.setCropBlock(new ModCropBlock(defaultCropProperties));
        ZUCCHINI.setCropBlock(new ModCropBlock(defaultCropProperties));
        MUSTARD.setCropBlock(new ModCropBlock(defaultCropProperties));
    }

    private final String id;

    private RegistryObject<? extends Item> fruitItem;
    private RegistryObject<? extends SeedItem> seedItem;
    private RegistryObject<? extends ModCropBlock> cropBlock;

    Crops() {
        this.id = this.name().toLowerCase();
    }

    Crops(Item fruitItem, SeedItem seedItem, ModCropBlock cropBlock) {
        this();
        this.setFruitItem(fruitItem);
        this.setSeedItem(seedItem);
        this.setCropBlock(cropBlock);
    }

    //<editor-fold desc="Setter">
    private void setFruitItem(Item fruitItem) {
        this.fruitItem = registerItem(this.getId(), () -> fruitItem);
    }

    private void setSeedItem(SeedItem seedItem) {
        this.seedItem = registerItemWithColor(this.getSeedId(), () -> seedItem);
    }

    private void setCropBlock(ModCropBlock cropBlock) {
        this.cropBlock = registerBlock(this.getId(), () -> cropBlock);
    }
    //</editor-fold>

    //<editor-fold desc="Getter">
    public String getId() {
        return this.id;
    }

    public String getSeedId() {
        return this.id + "_seed";
    }

    public RegistryObject<? extends Item> getFruitItemRO() {
        return this.fruitItem;
    }

    public RegistryObject<? extends SeedItem> getSeedItemRO() {
        return this.seedItem;
    }

    public RegistryObject<? extends ModCropBlock> getCropBlockRO() {
        return this.cropBlock;
    }

    public Item getFruitItem() {
        return this.fruitItem.get();
    }

    public SeedItem getSeedItem() {
        return this.seedItem.get();
    }

    public ModCropBlock getCropBlock() {
        return this.cropBlock.get();
    }
    //</editor-fold>

    private static Item.Properties defaultFoodProperty(FoodProperties foodProperties) {
        return new Item.Properties().tab(ModCreativeModeTabs.TAB_FRUITS).food(foodProperties);
    }

    public static <T extends Item & ItemColor> RegistryObject<T> registerItemWithColor(String name, Supplier<T> item) {
        RegistryObject<T> ret = registerItem(name, item);
        ColorHandlers.registerItem(ret);
        return ret;
    }

    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        return Registration.ITEMS.register(name, item);
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }
}
