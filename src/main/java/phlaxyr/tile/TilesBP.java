package phlaxyr.tile;

import net.minecraft.tileentity.TileEntity;

import net.minecraftforge.fml.common.registry.GameRegistry;
import phlaxyr.Registrar;


public class TilesBP extends Registrar{
    public static void preInit() {
    	

    	// register Tiles here
    	
    	
    }
	/**
	 * Do it in preinit
	 * @param tileclass
	 * @param registryname
	 */
	protected static void registerTile(Class<? extends TileEntity> tileclass, String registryname){
		GameRegistry.registerTileEntity(tileclass, registryname);
		
	}
}
