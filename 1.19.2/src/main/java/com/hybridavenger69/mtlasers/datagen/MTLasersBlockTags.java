package com.hybridavenger69.mtlasers.datagen;

import com.hybridavenger69.mtlasers.common.MTLasers;
import com.hybridavenger69.mtlasers.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MTLasersBlockTags extends BlockTagsProvider {

    public MTLasersBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MTLasers.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.LaserNode.get())
                .add(Registration.LaserConnector.get());
    }

    @Override
    public String getName() {
        return "mtlasers Tags";
    }
}