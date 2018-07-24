package phlaxyr.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBP extends Block{
	public BlockBP(Material material, CreativeTabs creativeTab) {
		super(material);
		this.setCreativeTab(creativeTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		BlockBP.initModel(this);
	}
	@SideOnly(Side.CLIENT)
	public static void initModel(Block b) {
		ModelLoader.setCustomModelResourceLocation(
				Item.getItemFromBlock(b), 0, new ModelResourceLocation(b.getRegistryName(), "inventory"));
	}
}
