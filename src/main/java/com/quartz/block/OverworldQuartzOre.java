package com.quartz.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class OverworldQuartzOre extends Block {
    public OverworldQuartzOre(Properties properties) {
        super(properties
                .strength(3f)
                .sound(SoundType.STONE)
                .mapColor(MapColor.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
        );
    }
}
