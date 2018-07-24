package proxy;


import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import phlaxyr.block.BlocksBP;
import phlaxyr.item.Items2;
import phlaxyr.machines.MachinesBP;
import phlaxyr.tile.TilesBP;

@Mod.EventBusSubscriber
public abstract class CommonProxy {
	
	public void preInit() {
		// test for crashs
    	// net.minecraft.client.gui.GuiScreen testclient = new net.minecraft.client.gui.GuiScreen(){};
		// good, it crashes
		
		BlocksBP.preInit();
		Items2.preInit();

		TilesBP.preInit();
		MachinesBP.registerTiles();
		// TemplateRegistrar.preInit();
		
		// PacketHandler.preinit(LargeTents.MODID);
		
	}
	public void init() {
		BlocksBP.init();
		Items2.init();
		
		TilesBP.init();
		// TemplateRegistrar.preInit();
		
		// Craft5by5Manager.getInstance().init();
		// ArrowManager.init();
		// MinecraftForge.EVENT_BUS.register(new ArrowManager.EventHandlerCommon());

	}
	public void postInit() {
		BlocksBP.postInit();
		Items2.postInit();

		TilesBP.postInit();
		// TemplateRegistrar.postInit();
	}
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		BlocksBP.registerBlocks(event);
		MachinesBP.registerBlocks(event);
		// TemplateRegistrar.registerBlocks(event);
	}
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		Items2.registerItems(event);
		BlocksBP.registerItems(event);
		MachinesBP.registerItems(event);
		// TemplateRegistrar.registerItems(event);
	}


	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	abstract public boolean isDedicatedServer();
}
