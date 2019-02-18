package cero_tech.immersivefission.recipes;

import blusunrize.immersiveengineering.api.crafting.MultiblockRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidStack;

import java.util.ArrayList;

public class RecipePressurizer extends MultiblockRecipe {

    public static ArrayList<RecipePressurizer> recipeList = new ArrayList<>();

    public final FluidStack input;
    public final FluidStack output;
    public final int ticks;

    protected RecipePressurizer(FluidStack input, FluidStack output, int ticks) {
        this.input = input;
        this.output = output;
        this.ticks = ticks;
    }

    public static RecipePressurizer addRecipe(FluidStack input, FluidStack output, int ticks) {
        if (input == null || output == null) {
            return null;
        }

        RecipePressurizer recipe = new RecipePressurizer(input, output, ticks);
        recipeList.add(recipe);
        return recipe;
    }

    public static RecipePressurizer findRecipeByInput(FluidStack input) {
        for (RecipePressurizer recipe : recipeList) {
            if (input != null && recipe.input != null && recipe.input.isFluidEqual(input)) {
                return recipe;
            }
        }
        return null;
    }

    public static RecipePressurizer findRecipeByOutput(FluidStack output) {
        for (RecipePressurizer recipe : recipeList) {
            if (output != null && recipe.output != null && recipe.output.isFluidEqual(output)) {
                return recipe;
            }
        }
        return null;
    }

    @Override
    public int getMultipleProcessTicks() {
        return 0;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTagCompound) {
        nbtTagCompound.setTag("input", input.writeToNBT(new NBTTagCompound()));
        return nbtTagCompound;
    }

    public static RecipePressurizer readFromNBT(NBTTagCompound nbtTagCompound) {
        if (!nbtTagCompound.hasKey("input")) {
            return null;
        }
        return findRecipeByInput(FluidStack.loadFluidStackFromNBT(nbtTagCompound.getCompoundTag("input")));
    }
}
