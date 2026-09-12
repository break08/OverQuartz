package com.quartz.init;

import com.quartz.OverQuartz;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class OverQuartzBlockItemId {

    public static final BlockItemId OVERWORLD_QUARTZ_ORE_ID = create(
            "overworld_quartz_ore"
    );

    public static final BlockItemId DEEPSLATE_QUARTZ_ORE_ID = create(
            "deepslate_quartz_ore"
    );

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(OverQuartz.MOD_ID, name);
        return BlockItemId.create(id, id);
    }
}
