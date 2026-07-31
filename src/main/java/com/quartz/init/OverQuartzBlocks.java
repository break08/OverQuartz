package com.quartz.init;

import com.quartz.OverQuartz;
import com.quartz.block.DeepslateQuartzOre;
import com.quartz.block.OverworldQuartzOre;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class OverQuartzBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(OverQuartz.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Properties());
            Registry.register(BuiltInRegistries.ITEM, id, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(OverworldQuartzOre.OVERWORLD_QUARTZ_ORE.asItem());
            itemGroup.accept(DeepslateQuartzOre.DEEPSLATE_QUARTZ_ORE.asItem());
        });
    }
}
