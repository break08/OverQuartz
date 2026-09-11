package com.quartz;

import com.quartz.item.OverQuartzBlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.quartz.block.OverQuartzBlocks.BLOCKS;
import static com.quartz.item.OverQuartzBlockItem.ITEMS;

@Mod(OverQuartz.MODID)
public class OverQuartz {
    public static final String MODID = "overquartz";

    public OverQuartz(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        BLOCKS.register(context.getModEventBus());
        ITEMS.register(context.getModEventBus());
    }

    @SubscribeEvent
    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(OverQuartzBlockItem.OVERWORLD_QUARTZ_ORE_ITEM);
            event.accept(OverQuartzBlockItem.DEEPSLATE_QUARTZ_ORE_ITEM);
        }
    }
}