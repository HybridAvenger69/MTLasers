package com.hybridavenger69.mtlasers.datagen;

import com.hybridavenger69.mtlasers.common.MTLasers;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MTLasersBlockStates extends BlockStateProvider {
    public MTLasersBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, MTLasers.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(Registration.LaserConnector.get());
        //simpleBlock(Registration.LaserNode.get(), models().getExistingFile(modLoc("block/laser_node")));
    }
}
