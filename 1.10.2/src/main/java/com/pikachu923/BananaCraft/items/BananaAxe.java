package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.ModTools;
import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class BananaAxe extends ItemAxe {

	public String Texture;
	public BananaAxe(String unlocalName) {
		super(ModTools.Banana);
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
