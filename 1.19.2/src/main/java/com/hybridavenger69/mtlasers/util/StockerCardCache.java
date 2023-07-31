package com.hybridavenger69.mtlasers.util;

import com.hybridavenger69.mtlasers.common.blockentities.LaserNodeBE;
import com.hybridavenger69.mtlasers.common.items.cards.BaseCard;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;

public class StockerCardCache extends ExtractorCardCache {
    public boolean regulate;

    public StockerCardCache(Direction direction, ItemStack cardItem, int cardSlot, LaserNodeBE be) {
        super(direction, cardItem, cardSlot, be);
        this.regulate = BaseCard.getRegulate(cardItem);
    }
}
