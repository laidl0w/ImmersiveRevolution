package net.laidlow.immersiverevolution;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IRItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImmersiveRevolution.MOD_ID);


        public static final RegistryObject<Item> FUELPELLET = dummy("fuel_pellet");
        public static final RegistryObject<Item> FLUORITE = dummy("crystal_fluorite");
        public static final RegistryObject<Item> DUST_FLUORITE = dummy("dust_fluorite");
        public static final RegistryObject<Item> LUMP_SILICON = dummy("lump_silicon");
        public static final RegistryObject<Item> DUST_SILICON = dummy("dust_silicon");
        public static final RegistryObject<Item> SALT = dummy("salt");


    private static RegistryObject<Item> dummy (String name) {
        return IRItems.ITEMS.register(name, () -> new Item(new Item.Properties().tab(IRCreativeModeTab.TAB_REVOLUTION)));}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
