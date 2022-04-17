package net.sduemmen.valcraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier CRYSTAL_BATTLEAXE = new ForgeTier(3, 1000, 0.0f,  0.0f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.CRYSTAL.get()));
}
