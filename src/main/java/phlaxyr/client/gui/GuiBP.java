package phlaxyr.client.gui;

import java.awt.Color;


import javax.annotation.Nullable;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import phlaxyr.container.ContainerBP;
import phlaxyr.tile.TileBP;


@SideOnly(Side.CLIENT)
public abstract class GuiBP<T extends TileBP, C extends ContainerBP<T>> extends GuiContainer{

	/**
	 * 
	 */
	@Nullable
	protected final ResourceLocation tex;
	
    protected TileBP tile;

	
	public GuiBP(int textureSizeX, int textureSizeY, ContainerBP<T> cont, ResourceLocation tex) {
		super(cont);
		this.tile = cont.getTile();
		this.tex=tex;
    	this.xSize = textureSizeX;
    	this.ySize = textureSizeY;
	}
	// standard stuffs
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        this.mc.renderEngine.bindTexture(tex);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        //change
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int i, int j)
    {
		this.fontRenderer.drawString(tile.getDisplayName().getUnformattedText(), 5, 5, Color.darkGray.getRGB());
        //this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }
	@Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    	this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
