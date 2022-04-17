package net.sduemmen.valcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sduemmen.valcraft.Valcraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Valcraft.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_BARK = ITEMS.register("ancient_bark", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BARLEY_FLOUR = ITEMS.register("barley_flour", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BLACKMETAL_INGOT = ITEMS.register("blackmetal_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BLACKMETAL_SCRAP = ITEMS.register("blackmetal_scrap", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BLOODBAG = ITEMS.register("bloodbag", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BONE_FRAGMENT = ITEMS.register("bone_fragment", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> BRONZE_NAILS = ITEMS.register("bronze_nails", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> CHITIN = ITEMS.register("chitin", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> CORE_WOOD = ITEMS.register("core_wood", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> DEER_HIDE = ITEMS.register("deer_hide", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> DRAGON_TEAR = ITEMS.register("dragon_tear", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> ENTRAILS = ITEMS.register("entrails", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> FINE_WOOD = ITEMS.register("fine_wood", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> FLAMETAL_INGOT = ITEMS.register("flametal_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> FLAMETAL_ORE = ITEMS.register("flametal_ore", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> FLAX = ITEMS.register("flax", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> FREEZE_GLAND = ITEMS.register("freeze_gland", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> GREYDWARF_EYE = ITEMS.register("greydwarf_eye", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> GUCK = ITEMS.register("guck", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> HARD_ANTLER = ITEMS.register("hard_antler", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> IRON_NAILS = ITEMS.register("iron_nails", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> LEATHER_SCRAPS = ITEMS.register("leather_scraps", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> LINEN_THREAD = ITEMS.register("linen_thread", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> LOX_PELT = ITEMS.register("lox_pelt", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> NEEDLE = ITEMS.register("needle", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> RESIN = ITEMS.register("resin", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> SCRAP_IRON = ITEMS.register("scrap_iron", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> SERPENT_SCALE = ITEMS.register("serpent_scale", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> SILVER_ORE = ITEMS.register("silver_ore", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> STONE = ITEMS.register("stone", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> SURTLING_CORE = ITEMS.register("surtling_core", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> THISTLE = ITEMS.register("thistle", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> TIN_ORE = ITEMS.register("tin_ore", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> TROLL_HIDE = ITEMS.register("troll_hide", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> WOLF_FANG = ITEMS.register("wolf_fang", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> WOLF_PELT = ITEMS.register("wolf_pelt", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static final RegistryObject<Item> WOOD = ITEMS.register("wood", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.VALCRAFT_MATERIALS_ITEM_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
