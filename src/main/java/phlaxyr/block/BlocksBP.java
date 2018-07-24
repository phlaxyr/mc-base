package phlaxyr.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import phlaxyr.Registrar;



public class BlocksBP extends Registrar {
    /*
    @GameRegistry.ObjectHolder(LargeTents.MODID + ":m_workbench")
    public static BlockCrafter block_mWorkbench;*/ 
    // TemplateRegistrar d


    public static void registerBlocks(Register<Block> event) {
    	
    	
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
    	// block.initModel()
    	
    }
    // some registering is in machineregistrar

    public static void registerItems(Register<Item> event) {
    	
    	
    }
    public static void registerBlock(Register<Block> event, Block newBlock) {
    	event.getRegistry().register(newBlock);
    	// store.add(newBlock);
    }
//    public static void registerBlock(Register<Block> event, Block2 newBlock2) {
//    	event.getRegistry().register(newBlock2);
//    	// store2.add(newBlock2);
//    }


}
