package com.quartz.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.quartz.OverQuartz.MODID;

public class OverQuartzBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> OVERWORLD_QUARTZ_ORE_BLOCK = BLOCKS.register(
            "overworld_quartz_ore",
            () -> new OverworldQuartzOre(BlockBehaviour.Properties.of())
    );

    public static final RegistryObject<Block> DEEPSLATE_QUARTZ_ORE_BLOCK = BLOCKS.register(
            "deepslate_quartz_ore",
            () -> new OverworldQuartzOre(BlockBehaviour.Properties.of())
    );
}
