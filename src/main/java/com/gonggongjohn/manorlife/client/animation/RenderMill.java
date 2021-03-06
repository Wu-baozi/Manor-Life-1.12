package com.gonggongjohn.manorlife.client.animation;

import com.gonggongjohn.manorlife.ManorLife;
import com.gonggongjohn.manorlife.tile.TEMill;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMill extends TileEntitySpecialRenderer<TEMill> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ManorLife.MODID, "textures/blocks/marble.png");
    private final ModelMill MODEL = new ModelMill();

    @Override
    public void render(TEMill te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        GlStateManager.enableDepth();
        GlStateManager.depthFunc(515);
        GlStateManager.depthMask(true);

        ModelMill model = MODEL;
        if(destroyStage >= 0){
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0F, 4.0F, 1.0F);
            GlStateManager.translate(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
        }
        else this.bindTexture(TEXTURE);

        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GlStateManager.scale(1.0F, -1.0F, -1.0F);
        //GlStateManager.translate(0.5F, 0.5F, 0.5F);
        //GlStateManager.translate(-0.5F, -0.5F, -0.5F);

        float f = te.prevRotationAngle + (te.rotationAngle - te.prevRotationAngle) * partialTicks;
        f = 1.0F - f;
        f = 1.0F - f * f * f;
        model.mill.rotateAngleY = -(f * ((float)Math.PI / 2F));
        model.renderAll();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        if(destroyStage >= 0){
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
    }
}
