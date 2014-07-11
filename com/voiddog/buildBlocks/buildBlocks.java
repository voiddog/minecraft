package com.voiddog.buildBlocks;

import com.voiddog.creatSpace.clearSpaceItem;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=buildBlocks.modid, name="上帝的屌", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired = false)
public class buildBlocks {
	public static final String modid = "godHand";
	public static Item buildItem;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		buildItem = new buildBlocksItem(5013);
		
		GameRegistry.addRecipe(new ItemStack(buildItem, 64), new Object[]{"###","###","  #",Character.valueOf('#'), Block.dirt});
		
		GameRegistry.registerItem(buildItem, "buildBlocks");
	}
}