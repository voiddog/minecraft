package com.voiddog.creatSpace;

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
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=clearSpace.modid, name="苏菲婆婆", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired = false)
public class clearSpace {
	public static Item clearItem;
	public static final String modid = "sufei";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		clearItem = new clearSpaceItem(5007);
		
	GameRegistry.addRecipe(new ItemStack(clearItem, 64), new Object[]{" ##","## ","# #",Character.valueOf('#'), Block.dirt});
		
		GameRegistry.registerItem(clearItem, "clearSpace");
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
    
}
