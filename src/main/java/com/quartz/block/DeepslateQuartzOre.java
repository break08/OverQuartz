package com.quartz.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class DeepslateQuartzOre extends Block {
    public DeepslateQuartzOre(Properties properties) {
        super(properties
                .strength(4.5f)
                .sound(SoundType.DEEPSLATE)
                .mapColor(MapColor.DEEPSLATE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
        );
    }
}
