package net.colin.bajak.item;

import net.colin.bajak.Bajak;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bajak.MOD_ID);

    public static final RegistryObject<Item> WOOD_SPEAR = ITEMS.register("wood_spear",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> METEOR_SPEAR = ITEMS.register("meteor_spear",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> METEOR_SPLINTER = ITEMS.register("meteor_splinter",
            () -> new Item(new Item.Properties().stacksTo(16)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
