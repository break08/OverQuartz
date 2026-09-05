package com.quartz.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OverQuartzBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("overquartz");

    public static final DeferredHolder<Block, Block> OVERWORLD_QUARTZ_ORE = BLOCKS.register(
            "overworld_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(3f)
                    .mapColor(MapColor.STONE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
            )
    );

    public static final DeferredHolder<Block, Block> DEEPSLATE_QUARTZ_ORE = BLOCKS.register(
            "deepslate_quartz_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .sound(SoundType.DEEPSLATE)
                    .strength(4.5f)
                    .mapColor(MapColor.DEEPSLATE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
            )
    );
}
