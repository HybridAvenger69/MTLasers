package com.hybridavenger69.mtlasers.client.blockentityrenders.baseberender;

import com.hybridavenger69.mtlasers.client.renderer.DelayedRenderer;
import com.hybridavenger69.mtlasers.common.blockentities.basebe.BaseLaserBE;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class BaseLaserBERender<T extends BaseLaserBE> implements BlockEntityRenderer<T> {
    public BaseLaserBERender(BlockEntityRendererProvider.Context p_173636_) {

    }

    @Override
    public void render(T blockentity, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int combinedLightsIn, int combinedOverlayIn) {
        if (blockentity.getRenderedConnections().size() > 0) DelayedRenderer.add(blockentity);
    }
}
