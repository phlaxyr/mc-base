package phlaxyr.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import phlaxyr.ModClass;
import phlaxyr.Registrar;


public class Items2 extends Registrar {
	
	static final String prefix = ModClass.MODID + ":";

	
	
	public static void preInit() {
	}
	
	public static void registerItems(Register<Item> event) {
		
	}

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	// initModel() here
    }
	@SideOnly(Side.CLIENT)
	public static void initModel(Item i) {
		ModelLoader.setCustomModelResourceLocation(
				i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
	}
	
	public static void init() {

	}
}
