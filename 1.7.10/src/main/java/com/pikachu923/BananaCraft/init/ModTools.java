package com.pikachu923.BananaCraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.pikachu923.BananaCraft.armor.BananaArmor;
import com.pikachu923.BananaCraft.items.BananaAxe;
import com.pikachu923.BananaCraft.items.BananaHoe;
import com.pikachu923.BananaCraft.items.BananaPickaxe;
import com.pikachu923.BananaCraft.items.BananaShovel;
import com.pikachu923.BananaCraft.items.BananaSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModTools {
	public static ToolMaterial Banana = EnumHelper.addToolMaterial("Banana", 3, 2222, 10.0F, 7.0F, 11);
	public static ArmorMaterial BananaArmor = EnumHelper.addArmorMaterial("BananaArmor", 2222, new int[] {3, 8, 6, 3}, 11);
	public static final BananaPickaxe BananaPickaxe = new BananaPickaxe("BananaPickaxe");
	public static final BananaSword BananaSword = new BananaSword("BananaSword");
	public static final BananaAxe BananaAxe = new BananaAxe("BananaAxe");
	public static final BananaShovel BananaShovel = new BananaShovel("BananaShovel");
	public static final BananaHoe BananaHoe = new BananaHoe("BananaHoe");
	public static Item BananaHelmet;
	public static Item BananaChestplate;
	public static Item BananaLeggings;
	public static Item BananaBoots;
	

	public static void init(){
		GameRegistry.registerItem(BananaPickaxe, "BananaPickaxe");
		GameRegistry.registerItem(BananaSword, "BananaSword");
		GameRegistry.registerItem(BananaAxe, "BananaAxe");
		GameRegistry.registerItem(BananaShovel, "BananaShovel");
		GameRegistry.registerItem(BananaHoe, "BananaHoe");
		GameRegistry.registerItem(BananaHelmet = new BananaArmor("BananaHelmet", BananaArmor, "BananaArmor", 0), "Banana_helmet"); //0 for helmet
		GameRegistry.registerItem(BananaChestplate = new BananaArmor("BananaChestplate", BananaArmor, "BananaArmor", 1), "Banana_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(BananaLeggings = new BananaArmor("BananaLeggings", BananaArmor, "BananaArmor", 2), "Banana_leggings"); // 2 for leggings
		GameRegistry.registerItem(BananaBoots = new BananaArmor("BananaBoots", BananaArmor, "BananaArmor", 3), "Banana_boots"); // 3 for boots
	}
}
