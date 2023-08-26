package net.laidlow.immersiverevolution.scene;

import blusunrize.immersiveengineering.api.EnumMetals;
import blusunrize.immersiveengineering.common.register.IEItems;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import static net.minecraft.world.InteractionHand.MAIN_HAND;

public class Radiation {

    public void inventoryTick(ItemStack stack, Entity entityIn, int itemSlot, boolean isSelected) {
        if (entityIn instanceof Player player) {
            if (player.getItemInHand(MAIN_HAND).getItem().equals(IRItems.DUST_FLUORITE)) {
                player.addEffect(new MobEffectInstance(MobEffects.POISON, 500));
            }
        }
    }

    private void effecttest(Player player) {
            ItemStack itemstack = player.getItemInHand(MAIN_HAND);
            if (itemstack.is(Items.GLOWSTONE_DUST)) {
                player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0, false, false, true));
        }
    }
}
