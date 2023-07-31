package com.hybridavenger69.mtlasers.common.containers.customhandler;

import com.hybridavenger69.mtlasers.common.items.filters.FilterBasic;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

public class FilterBasicHandler extends ItemStackHandler {
    public ItemStack stack;

    public FilterBasicHandler(int size, ItemStack itemStack) {
        super(size);
        this.stack = itemStack;
    }

    @Override
    protected void onContentsChanged(int slot) {
        if (!stack.equals(ItemStack.EMPTY))
            FilterBasic.setInventory(stack, this);
    }

    @Override
    public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
        return super.isItemValid(slot, stack);
    }

    @Override
    public int getSlotLimit(int slot) {
        return 1;
    }
}
