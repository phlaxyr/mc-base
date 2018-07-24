package phlaxyr.container;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public interface IContainerSlotAddeable {
    
    public Slot addSlotToContainer(Slot s);
    
    public Container getThis();
    
}
