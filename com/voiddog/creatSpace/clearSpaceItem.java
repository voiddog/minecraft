package com.voiddog.creatSpace;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class clearSpaceItem extends Item{

	public clearSpaceItem(int par1){
		super(par1);
		maxStackSize = 64;
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName("clearSpaceItem");
	}

	@EventHandler
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10){
		int dir[][] = {{0,1,0}, {0,-1,0}, {0,0,1}, {0,0,-1}, {1,0,0}, {-1,0,0}};
		int len = par1ItemStack.stackSize+1;
		int airX = par4, airY = par5, airZ = par6;
		for(int i=0; i<len; i++){
			par3World.setBlockToAir(airX, airY, airZ);
			airX += dir[par7][0];
			airY += dir[par7][1];
			airZ += dir[par7][2];
		}
		return true;
	}
	
	@EventHandler
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
    	return par1ItemStack;
    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
    	this.itemIcon = par1IconRegister.registerIcon(clearSpace.modid+":"+(this.getUnlocalizedName().substring(5)));
    }
	
}
