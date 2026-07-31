package com.quartz.block;

import com.quartz.init.OverQuartzBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class OverworldQuartzOre {
    public static final Block OVERWORLD_QUARTZ_ORE = OverQuartzBlocks.register(
            new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE)),
            "overworld_quartz_ore",
            true
    );
}