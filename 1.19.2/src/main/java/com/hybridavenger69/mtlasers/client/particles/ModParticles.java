package com.hybridavenger69.mtlasers.client.particles;

import com.hybridavenger69.mtlasers.client.particles.fluidparticle.FluidFlowParticleData;
import com.hybridavenger69.mtlasers.client.particles.fluidparticle.FluidFlowParticleType;
import com.hybridavenger69.mtlasers.client.particles.itemparticle.ItemFlowParticleData;
import com.hybridavenger69.mtlasers.client.particles.itemparticle.ItemFlowParticleType;
import com.hybridavenger69.mtlasers.common.MTLasers;
import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MTLasers.MODID);
    public static final RegistryObject<ParticleType<ItemFlowParticleData>> ITEMFLOWPARTICLE = PARTICLE_TYPES.register("itemflowparticle", ItemFlowParticleType::new);
    public static final RegistryObject<ParticleType<FluidFlowParticleData>> FLUIDFLOWPARTICLE = PARTICLE_TYPES.register("fluidflowparticle", FluidFlowParticleType::new);
}