package com.speherh.diseaser.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.speherh.diseaser.Reference;

/**
 * com.speherh.init.diseaserItems 
 * @author Spencer
 * A class to run item initiation and rendering.
 * Goes hand-in-hand with com.speherh.proxy.ClientProxy
 *
 */

public class diseaserItems {
	
	public static Item tissue;
	
	public static void init()
	{
		tissue = new Item().setUnlocalizedName("tissue");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(tissue, tissue.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(tissue);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
