package com.quartz;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;

public class OverQuartzWorldgen {
    public static void generate() {
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                ResourceKey.create(
                        Registries.PLACED_FEATURE,
                        ResourceLocation.fromNamespaceAndPath("overquartz", "overworld_quartz_ore")
                )
        );

        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.UNDERGROUND_ORES,
                ResourceKey.create(
                        Registries.PLACED_FEATURE,
                        ResourceLocation.fromNamespaceAndPath("overquartz", "deepslate_quartz_ore")
                )
        );
    }
}
