package src.me.lim_bo56.settings.v1_9_R2;

import me.lim_bo56.settings.versionmanager.IItemGlower;
import net.minecraft.server.v1_9_R2.NBTTagCompound;
import net.minecraft.server.v1_9_R2.NBTTagList;
import org.bukkit.craftbukkit.v1_9_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

/**
 * Created by lim_bo56
 * On 9/2/2016
 * At 5:46 PM
 */
public class ItemGlower implements IItemGlower {

    @Override
    public ItemStack glow(ItemStack itemStack) {
        net.minecraft.server.v1_9_R2.ItemStack localItemStack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound localNBTTagCompound = null;
        if (!localItemStack.hasTag()) {
            localNBTTagCompound = new NBTTagCompound();
            localItemStack.setTag(localNBTTagCompound);
        }
        if (localNBTTagCompound == null)
            localNBTTagCompound = localItemStack.getTag();

        NBTTagList localNBTTagList = new NBTTagList();
        localNBTTagCompound.set("ench", localNBTTagList);
        localItemStack.setTag(localNBTTagCompound);
        return CraftItemStack.asCraftMirror(localItemStack);
    }

}