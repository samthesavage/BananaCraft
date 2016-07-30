package com.pikachu923.BananaCraft;

import com.pikachu923.BananaCraft.Handler.ConfigurationHandler;
import com.pikachu923.BananaCraft.init.ModBlock;
import com.pikachu923.BananaCraft.init.ModItems;
import com.pikachu923.BananaCraft.init.ModTools;
import com.pikachu923.BananaCraft.init.Recipes;
import com.pikachu923.BananaCraft.proxy.IProxy;
import com.pikachu923.BananaCraft.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by pikachu on 6/20/2016.
 * Main Class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GuiFactory)
public class BananaCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static BananaCraft instance;

    @SidedProxy(clientSide = Reference.PROXYCLIENT, serverSide = Reference.PROXYSERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlock.init();
        ModTools.init();
        
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
    	Recipes.init();

    }

    @Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event){

    }
}
