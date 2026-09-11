package com.quartz.item;

import com.quartz.block.OverQuartzBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.quartz.OverQuartz.MODID;

public class OverQuartzBlockItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> OVERWORLD_QUARTZ_ORE_ITEM = ITEMS.register(
            "overworld_quartz_ore",
            () -> new BlockItem(OverQuartzBlocks.OVERWORLD_QUARTZ_ORE_BLOCK.get(), new Item.Properties())
    );

    public static final RegistryObject<Item> DEEPSLATE_QUARTZ_ORE_ITEM = ITEMS.register(
            "deepslate_quartz_ore",
            () -> new BlockItem(OverQuartzBlocks.DEEPSLATE_QUARTZ_ORE_BLOCK.get(), new Item.Properties())
    );
}
