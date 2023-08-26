package net.laidlow.immersiverevolution.scene;

import net.laidlow.immersiverevolution.backstage.FluidRegistryContainer;
import net.laidlow.immersiverevolution.backstage.ImmersiveRevolution;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.laidlow.immersiverevolution.scene.IRCreativeModeTab.TAB_REVOLUTION;

public class IRFluids {
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ImmersiveRevolution.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, ImmersiveRevolution.MOD_ID);

    public static final FluidRegistryContainer EXAMPLE_FLUID = dummy("buggy_mess");

    private static FluidRegistryContainer dummy (String name) {
        return new FluidRegistryContainer(
                name,
                FluidType.Properties.create().canSwim(true).canDrown(true).canPushEntity(true).supportsBoating(true),
                () -> FluidRegistryContainer.createExtension(
                        new FluidRegistryContainer.ClientExtensions(
                                ImmersiveRevolution.MOD_ID,
                                name
                        ).tint(0xFF44AA)
                                .fogColor(1.0f, 0.2f, 0.5f)
                ),
                BlockBehaviour.Properties.copy(Blocks.WATER),
                new Item.Properties()
                        .tab(TAB_REVOLUTION)
                        .stacksTo(1)
        );
    }
}