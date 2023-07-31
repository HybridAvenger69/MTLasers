package com.hybridavenger69.mtlasers.datagen;

import com.hybridavenger69.mtlasers.setup.Registration;
import net.minecraft.data.DataGenerator;

public class MTLasersLootTables extends BaseLootTableProvider {

    public MTLasersLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        lootTables.put(Registration.LaserNode.get(), createSimpleTable("lasernode", Registration.LaserNode.get()));
        lootTables.put(Registration.LaserConnector.get(), createSimpleTable("laserconnector", Registration.LaserConnector.get()));
    }
}
