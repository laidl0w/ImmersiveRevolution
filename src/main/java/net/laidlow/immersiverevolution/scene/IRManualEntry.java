package net.laidlow.immersiverevolution.scene;

import blusunrize.immersiveengineering.api.ManualHelper;
import blusunrize.immersiveengineering.client.manual.IEManualInstance;
import blusunrize.lib.manual.ManualEntry;
import blusunrize.lib.manual.Tree;
import net.minecraft.resources.ResourceLocation;

import static net.laidlow.immersiverevolution.backstage.ImmersiveRevolution.MOD_ID;


public class IRManualEntry {
    public static String CAT_REVOLUTION = "carrot";

    IEManualInstance irman = (IEManualInstance) ManualHelper.getManual();
    Tree.InnerNode<ResourceLocation, ManualEntry> revolutionCat = irman.getRoot().getOrCreateSubnode(new ResourceLocation(MOD_ID,
            IRManualEntry.CAT_REVOLUTION), 6);

}
