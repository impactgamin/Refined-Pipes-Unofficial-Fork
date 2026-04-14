package com.refinedmods.refinedpipes.util;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.items.ItemHandlerHelper;
import org.apache.commons.lang3.tuple.Pair;

public class FluidUtil {
    private static final int BUCKET_VOLUME_MB = 1000;

    public static Pair<ItemStack, FluidStack> getFromStack(ItemStack stack, boolean simulate) {
        if (stack.isEmpty()) {
            return Pair.of(ItemStack.EMPTY, FluidStack.EMPTY);
        }

        if (stack.getCount() > 1) {
            stack = ItemHandlerHelper.copyStackWithSize(stack, 1);
        }

        IFluidHandlerItem handler = stack.getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM, null).orElse(null);
        if (handler == null) {
            return Pair.of(ItemStack.EMPTY, FluidStack.EMPTY);
        }

        FluidStack result = handler.drain(BUCKET_VOLUME_MB, simulate ? IFluidHandler.FluidAction.SIMULATE : IFluidHandler.FluidAction.EXECUTE);

        return Pair.of(handler.getContainer(), result);
    }
}
