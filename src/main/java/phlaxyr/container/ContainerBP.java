package phlaxyr.container;

import net.minecraft.block.BlockContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import phlaxyr.Lumber;
import phlaxyr.tile.TileBP;


public abstract class ContainerBP<T extends TileBP> extends Container implements IContainerSlotAddeable{
    
	private T tile;
    protected EntityPlayer player;
    protected final World world;
    /** Position of the workbench */
    protected final BlockPos pos;
    
    public T getTile(){
    	return tile;
    }
    
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.world.getBlockState(this.pos).getBlock() 
        		instanceof BlockContainer ? withinVicinity(playerIn) : false;
    }
    public ContainerBP(InventoryPlayer playerInv, T tile, World world, BlockPos pos) {
    	// this.clump = clump;
    	if(playerInv.player == null) Lumber.jack.error("NULL Player");
    	this.player = playerInv.player;
    	this.tile = tile;
    	this.world = world;
    	this.pos = pos;
    	addSlots(playerInv, tile, world, pos);
    }
    
    /**
     * A friendly reminder that slots need to be added on. 
     * <br>
     * This method is called in the constructor of ContainerTile.
     * <br>
     * If you need a playerslottracker, 
     * you can always put it in your child constructor and save it, and on overriding this method, use the field
     */
    public abstract void addSlots(InventoryPlayer playerInv, T tile, World world, BlockPos pos);
    
    /**
     * helper method
     * @param t
     * @param trackers
     */
    public static void addSlots(ContainerBP<?> t, ISlotTracker...trackers) {
    	for(ISlotTracker tr : trackers) {
    		tr.addInventories(t, t.player.inventory);
    		
    	}
    }
    // allows my package and thus IPlayerTracker to see this and thus be able to call this
    @Override
    public Slot addSlotToContainer(Slot s) {
    	return super.addSlotToContainer(s);
    }
    
    @Override
    public ContainerBP<T> getThis() {
    	return this;
    }
    
    public boolean withinVicinity(EntityPlayer playerIn) {
    	 return playerIn.getDistanceSq(
    			 (double)this.pos.getX() + 0.5D, 
    			 (double)this.pos.getY() + 0.5D, 
    			 (double)this.pos.getZ() + 0.5D
    			 ) <= 64.0D;
    }
    
    

}
