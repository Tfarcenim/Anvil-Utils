package com.example.anvilutilities;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static com.example.anvilutilities.ModRecipes.register;

@Mod(modid = AnvilUtilities.MODID, name = AnvilUtilities.NAME, version = AnvilUtilities.VERSION)
public class AnvilUtilities
{
    public static final String MODID = "anvilutilities";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        register();
    }
}
