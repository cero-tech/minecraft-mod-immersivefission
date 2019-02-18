package cero_tech.immersivefission;

import blusunrize.immersiveengineering.api.MultiblockHandler;
import blusunrize.immersiveengineering.common.IEContent;
import blusunrize.immersiveengineering.common.blocks.BlockIEBase;
import blusunrize.immersiveengineering.common.blocks.BlockIEFluid;
import cero_tech.immersivefission.blocks.BlockMultiblockMachine;
import cero_tech.immersivefission.blocks.BlockTypes_IFMultiblockMachines;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockHeatExchanger;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockPressurizer;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockReactorChamber;
import cero_tech.immersivefission.blocks.multiblocks.MultiblockTurbine;
import cero_tech.immersivefission.items.ItemIFBase;
import cero_tech.immersivefission.tileentities.TileEntityHeatExchanger;
import cero_tech.immersivefission.tileentities.TileEntityPressurizer;
import cero_tech.immersivefission.tileentities.TileEntityReactorChamber;
import cero_tech.immersivefission.tileentities.TileEntityTurbine;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class IFContent {

    private static final ResourceLocation STEAM_RESOURCE = new ResourceLocation(ImmersiveFission.MODID + ":blocks/fluid/steam");

    // Items
    public static ItemIFBase fuelRod;
    public static ItemIFBase controlRod;

    // Multiblocks
    public static BlockIEBase<BlockTypes_IFMultiblockMachines> blockMultiblockMachines;

    // Fluids
    public static Fluid fluidSteam;
    public static BlockIEFluid blockFluidSteam;

    static {
        // Items
        fuelRod = new ItemIFBase("fuel_rod", 1, 1000);
        controlRod = new ItemIFBase("control_rod", 8, 0);

        // Multiblocks
        blockMultiblockMachines = new BlockMultiblockMachine();

        // Fluids
        fluidSteam = IEContent.setupFluid(new Fluid("steam", STEAM_RESOURCE, STEAM_RESOURCE).setGaseous(true).setViscosity(20).setDensity(-1).setTemperature(400));
        blockFluidSteam = new BlockIEFluid("fluidSteam", fluidSteam, Material.AIR);
    }

    public static void init() {
        // Tile Entities
        registerTile(TileEntityHeatExchanger.class);
        registerTile(TileEntityPressurizer.class);
        registerTile(TileEntityReactorChamber.class);
        registerTile(TileEntityTurbine.class);

        // Multiblocks
        MultiblockHandler.registerMultiblock(MultiblockHeatExchanger.instance);
        MultiblockHandler.registerMultiblock(MultiblockPressurizer.instance);
        MultiblockHandler.registerMultiblock(MultiblockReactorChamber.instance);
        MultiblockHandler.registerMultiblock(MultiblockTurbine.instance);
    }

    public static void registerTile(Class<? extends TileEntity> tile)
    {
        String s = tile.getSimpleName();
        s = s.substring(s.indexOf("TileEntity") + "TileEntity".length());
        GameRegistry.registerTileEntity(tile, new ResourceLocation(ImmersiveFission.MODID + ":" + s));
        IEContent.registeredIETiles.add(tile);
    }
}
