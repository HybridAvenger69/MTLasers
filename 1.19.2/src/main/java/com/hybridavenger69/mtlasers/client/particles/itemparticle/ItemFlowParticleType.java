package com.hybridavenger69.mtlasers.client.particles.itemparticle;


import com.mojang.serialization.Codec;
import net.minecraft.core.particles.ParticleType;

public class ItemFlowParticleType extends ParticleType<ItemFlowParticleData> {
    public ItemFlowParticleType() {
        super(false, ItemFlowParticleData.DESERIALIZER);
    }

    @Override
    public Codec<ItemFlowParticleData> codec() {
        return null;
    }

}
