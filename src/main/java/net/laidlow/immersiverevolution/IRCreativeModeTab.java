package net.laidlow.immersiverevolution;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IRCreativeModeTab {
    public static final CreativeModeTab TAB_REVOLUTION = new CreativeModeTab("revolution") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(IRItems.FUELPELLET.get());
        }
    };
}
