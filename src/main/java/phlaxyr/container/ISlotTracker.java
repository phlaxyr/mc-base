package phlaxyr.container;

import net.minecraft.entity.player.InventoryPlayer;

public interface ISlotTracker {

    public void addInventories(IContainerSlotAddeable c, InventoryPlayer playerInv);
}
