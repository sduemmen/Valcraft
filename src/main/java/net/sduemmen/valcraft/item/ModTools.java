package net.sduemmen.valcraft.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sduemmen.valcraft.Valcraft;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Valcraft.MOD_ID);

    public static final RegistryObject<Item> CRYSTAL_BATTLEAXE = ITEMS.register("crystal_battleaxe",
            () -> new AxeItem(ModTiers.CRYSTAL_BATTLEAXE, 9, -3.5f, new Item.Properties() // dmg = 1 + pAttackDamageModifier; speed = 4 + pAttackSpeedModifier
                    .tab(ModItemGroups.VALCRAFT_TOOLS_ITEM_GROUP)));

    public static  final RegistryObject<Item> BATTLEAXE = ITEMS.register("battleaxe",
            () -> new AxeItem());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
