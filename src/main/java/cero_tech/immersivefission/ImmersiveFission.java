package cero_tech.immersivefission;

import cero_tech.immersivefission.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ImmersiveFission.MODID, name = ImmersiveFission.NAME, version = ImmersiveFission.VERSION, dependencies = ImmersiveFission.DEPENDENCIES)
public class ImmersiveFission {

    public static final String MODID = "immersivefission";
    public static final String NAME = "Immersive ImmersiveFission";
    public static final String VERSION = "1.0.1";
    public static final String FORGE_VERSION = "14.23.5.2768";
    public static final String IE_VERSION = "0.12-88-508";
    public static final String DEPENDENCIES =
            "required-after:forge@[" + FORGE_VERSION + ",);" +
            "required-after:immersiveengineering@[" + IE_VERSION + ",);";

    @Mod.Instance(MODID)
    public static ImmersiveFission instance;

    @SidedProxy(clientSide = "cero_tech.immersivefission.proxy.ClientProxy", serverSide = "cero_tech.immersivefission.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Logger logger;

    @SubscribeEvent
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @SubscribeEvent
    public void init(FMLInitializationEvent event) {}

    @SubscribeEvent
    public void postInit(FMLPostInitializationEvent event) {}
}
