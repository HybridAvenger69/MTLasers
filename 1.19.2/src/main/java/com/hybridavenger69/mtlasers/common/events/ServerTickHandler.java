package com.hybridavenger69.mtlasers.common.events;

import com.hybridavenger69.mtlasers.common.network.PacketHandler;
import com.hybridavenger69.mtlasers.common.network.packets.PacketNodeParticles;
import com.hybridavenger69.mtlasers.common.network.packets.PacketNodeParticlesFluid;
import com.hybridavenger69.mtlasers.util.ParticleData;
import com.hybridavenger69.mtlasers.util.ParticleDataFluid;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class ServerTickHandler {
    private static final List<ParticleData> particleList = new ArrayList<>();
    private static final List<ParticleDataFluid> particleListFluid = new ArrayList<>();
    private static Level serverWorld;

    @SubscribeEvent
    public static void handleTickEndEvent(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            if (!particleList.isEmpty()) {
                PacketHandler.sendToAll(new PacketNodeParticles(particleList), serverWorld);
                particleList.clear();
            }
            if (!particleListFluid.isEmpty()) {
                PacketHandler.sendToAll(new PacketNodeParticlesFluid(particleListFluid), serverWorld);
                particleListFluid.clear();
            }
        }
    }

    public static void addToList(ParticleData particleData, Level world) {
        particleList.add(particleData);
        serverWorld = world;
    }

    public static void addToListFluid(ParticleDataFluid particleData, Level world) {
        particleListFluid.add(particleData);
        serverWorld = world;
    }
}
