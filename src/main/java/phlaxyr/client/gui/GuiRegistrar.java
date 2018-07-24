package phlaxyr.client.gui;

import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import phlaxyr.ModClass;
import phlaxyr.Registrar;


public class GuiRegistrar extends Registrar{
	public static void preInit() {
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(ModClass.instance,GuiHandlerRegistrar.getInstance());
    	


	} 
	protected static void registerGui(IGuiHandler handler, int ID) { 
		GuiHandlerRegistrar.getInstance().registerGuiHandler(handler, ID);
	}
}
