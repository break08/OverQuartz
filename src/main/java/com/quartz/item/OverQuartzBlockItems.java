package com.quartz.item;

import com.quartz.OverQuartz;
import com.quartz.block.OverQuartzBlocks;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class OverQuartzBlockItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OverQuartz.MODID);
    public static final Supplier<BlockItem> OVERWORLD_QUARTZ_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "overworld_quartz_ore",
            OverQuartzBlocks.OVERWORLD_QUARTZ_ORE
    );
    public static final Supplier<BlockItem> DEEPSLATE_QUARTZ_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
            "deepslate_quartz_ore",
            OverQuartzBlocks.DEEPSLATE_QUARTZ_ORE
    );
}