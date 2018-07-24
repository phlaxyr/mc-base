package phlaxyr.machines;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MachinesBP {
	/**
	 * Called in preinit
	 */
	public static void registerTiles() {
		
	}


    public static void registerBlocks(Register<Block> event) {
    	
    	
    }
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	
    }
    public static void registerItems(Register<Item> event) {
    	
    
    }
    
    /**
	 * Helper
	 * Do it in preinit
	 * @param tileclass
	 * @param registryname
	 */
    public static void registerTile(Class<? extends TileEntity> tileclass, String registryname){
		GameRegistry.registerTileEntity(tileclass, registryname);

	}
}
