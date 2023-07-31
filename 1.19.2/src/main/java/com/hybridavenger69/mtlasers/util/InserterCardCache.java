package com.hybridavenger69.mtlasers.util;

import com.hybridavenger69.mtlasers.common.blockentities.LaserNodeBE;
import com.hybridavenger69.mtlasers.common.items.cards.BaseCard;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;

public class InserterCardCache extends BaseCardCache {
    public final BlockPos relativePos;
    public final short priority;

    public InserterCardCache(BlockPos relativePos, Direction direction, ItemStack cardItem, LaserNodeBE be, int cardSlot) {
        super(direction, cardItem, cardSlot, be);
        this.relativePos = relativePos;
        this.priority = BaseCard.getPriority(cardItem);
    }

    public short getPriority() {
        return priority;
    }

    public double getDistance() {
        return relativePos.distSqr(BlockPos.ZERO);
    }
}
