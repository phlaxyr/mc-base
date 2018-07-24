package phlaxyr;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import proxy.CommonProxy;

@Mod(modid = ModClass.MODID, name=ModClass.NAME, version = ModClass.VERSION)
public class ModClass
{
    public static final String MODID = "modid";
    public static final String VERSION = "1.0";
    public static final String NAME = "Mod Name";
    
    public static final CreativeTabs TAB = new CreativeTabs(MODID){
    	private ItemStack icon = new ItemStack(Items.IRON_DOOR);// new ItemStack(ItemRegistrar.item_craftingArrow);
    	@Override
    	public ItemStack getTabIconItem() {
    		return icon;
    	}
    };
    @Mod.Instance
    public static ModClass instance;
    
    @SidedProxy(clientSide="proxy.ClientProxy",
    		serverSide="proxy.ServerProxy")
    public static CommonProxy proxy;
    
    public static Logger lumberjack;
    static {
    	lumberjack = LogManager.getLogger(ModClass.MODID);
    	lumberjack.info("Testing logger!");
    	Lumber.registerLogger(lumberjack);
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//lumberjack = event.getModLog();
    	
    	proxy.preInit();
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit();
    }
    public static String prependModID(String name) {
    	return MODID+":"+name;
    }
}