package cero_tech.immersivefission;

import net.minecraftforge.common.config.Config;

@Config(modid = ImmersiveFission.MODID)
public class IFConfig {

    public static ConfigPressurizer pressurizer = new ConfigPressurizer();
    public static ConfigHeatExchanger heatExchanger = new ConfigHeatExchanger();

    /**
     * All configuration options for the Heat Exchanger
     **/
    public static class ConfigHeatExchanger {
        @Config.Comment({
                "Whether or not the secondary fluid will gain/lose temperature.",
                "Default value = false"
        })
        public static boolean secondaryTempChanges = true;

        @Config.Comment({
                "Amount of temperature exchanged per tick.",
                "Default value = 1"
        })
        public static int temperatureRate = 1;

        @Config.Comment({
                "Amount of fluid that can be stored (in buckets).",
                "Default value = 8"
        })
        public static int fluidCapacity = 8;
    }

    /**
     * All configuration options for the Pressurizer
     **/
    public static class ConfigPressurizer {
        @Config.Comment({
                "Amount of energy used per tick when operating.",
                "Default value = 250"
        })
        public static int energyUsage = 250;

        @Config.Comment({
                "Maximum amount of energy stored.",
                "Default value = 50000"
        })
        public static int energyCapacity = 50000;

        @Config.Comment({
                "Maximum amount of energy accepted per tick.",
                "Default value = 4096"
        })
        public static int energyTransfer = 4096;

        @Config.Comment({
                "Amount of pressure added per tick.",
                "Default value = 0.2d"
        })
        public static double pressureRate = 0.2d;

        @Config.Comment({
                "Amount of fluid that can be stored (in buckets).",
                "Default value = 16"
        })
        public static int fluidCapacity = 16;
    }

    /**
     * All configuration options for the Reactor Chamber
     **/
    public static class ConfigReactorChamber {}

    /**
     * All configuration options for the Turbine
     **/
    public static class ConfigTurbine {}
}
