package net.sduemmen.valcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab VALCRAFT_TOOLS_ITEM_GROUP = new CreativeModeTab("valcraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModTools.CRYSTAL_BATTLEAXE.get());
        }
    };
    public static final CreativeModeTab VALCRAFT_MATERIALS_ITEM_GROUP = new CreativeModeTab("valcraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CRYSTAL.get());
        }
    };
}
