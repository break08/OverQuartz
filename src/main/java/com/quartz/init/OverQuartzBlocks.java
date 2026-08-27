package com.quartz.init;

import com.quartz.OverQuartz;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class OverQuartzBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {

        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(OverQuartz.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Properties());
            Registry.register(BuiltInRegistries.ITEM, id, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    public static final Block OVERWORLD_QUARTZ_ORE = OverQuartzBlocks.register(
            new Block(
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.STONE)
                            .strength(3f)
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
            ),

            "overworld_quartz_ore",
            true
    );

    public static final Block DEEPSLATE_QUARTZ_ORE = OverQuartzBlocks.register(
            new Block(
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.DEEPSLATE)
                            .strength(4.5f)
                            .mapColor(MapColor.DEEPSLATE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
            ),
            "deepslate_quartz_ore",
            true
    );


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(OVERWORLD_QUARTZ_ORE.asItem());
            itemGroup.accept(DEEPSLATE_QUARTZ_ORE.asItem());
        });
    }
}
