package com.refinedmods.refinedpipes.screen.widget;

import com.mojang.blaze3d.systems.RenderSystem;
import com.refinedmods.refinedpipes.RefinedPipes;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class IconButton extends Button {
    private static final ResourceLocation RESOURCE = new ResourceLocation(RefinedPipes.ID, "textures/gui/extractor_attachment.png");

    private final IconButtonPreset preset;
    private int overlayTexX;
    private int overlayTexY;

    public IconButton(int x, int y, IconButtonPreset preset, int overlayTexX, int overlayTexY, Component text, OnPress onPress) {
        super(x, y, preset.getWidth(), preset.getHeight(), text, onPress, DEFAULT_NARRATION);

        this.preset = preset;
        this.overlayTexX = overlayTexX;
        this.overlayTexY = overlayTexY;
    }

    public void setOverlayTexX(int overlayTexX) {
        this.overlayTexX = overlayTexX;
    }

    @Override
    public void renderWidget(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        RenderSystem.setShaderTexture(0, RESOURCE);

        RenderSystem.disableDepthTest();

        int yTex = preset.getYTexNormal();
        if (!active) {
            yTex = preset.getYTexDisabled();
        } else if (isHovered()) {
            yTex = preset.getYTexHover();
        }

        guiGraphics.blit(RESOURCE, getX(), getY(), preset.getXTex(), yTex, this.width, this.height, 256, 256);

        guiGraphics.blit(RESOURCE, getX() + 1, getY() + 1, overlayTexX + 1, overlayTexY + 1, this.width - 2, this.height - 2, 256, 256);

        RenderSystem.enableDepthTest();
    }
}
