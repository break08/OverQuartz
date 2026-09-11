package com.quartz;

import com.quartz.block.OverQuartzBlocks;
import com.quartz.item.OverQuartzBlockItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(OverQuartz.MODID)
public class OverQuartz {
    public static final String MODID = "overquartz";

    public static final Logger LOGGER = LogUtils.getLogger();

    public OverQuartz(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup); NeoForge.EVENT_BUS.register(this);
        OverQuartzBlocks.BLOCKS.register(modEventBus);
        OverQuartzBlockItems.ITEMS.register(modEventBus);
    }

    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(OverQuartzBlockItems.OVERWORLD_QUARTZ_BLOCK_ITEM.get());
            event.accept(OverQuartzBlockItems.DEEPSLATE_QUARTZ_BLOCK_ITEM.get());
        }
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("OverQuartz loaded!");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("OverQuartz server starting!");
    }
}
