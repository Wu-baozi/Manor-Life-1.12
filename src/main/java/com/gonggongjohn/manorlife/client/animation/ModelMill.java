package com.gonggongjohn.manorlife.client.animation;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelMill extends ModelBase {
	public ModelRenderer basement;
	public ModelRenderer mill;

	public ModelMill() {
		textureWidth = 32;
		textureHeight = 32;

		basement = new ModelRenderer(this);
		basement.setRotationPoint(0.0F, 24.0F, 0.0F);
		basement.cubeList.add(new ModelBox(basement, 0, 0, -7.0F, -1.0F, -2.0F, 14, 1, 4, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -6.0F, -1.0F, -3.0F, 12, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -6.0F, -1.0F, 2.0F, 12, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -5.0F, -1.0F, -4.0F, 10, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -5.0F, -1.0F, 3.0F, 10, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -4.0F, -1.0F, -5.0F, 8, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -4.0F, -1.0F, 4.0F, 8, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -3.0F, -1.0F, -6.0F, 6, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -3.0F, -1.0F, 5.0F, 6, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -2.0F, -1.0F, -7.0F, 4, 1, 1, 0.0F, false));
		basement.cubeList.add(new ModelBox(basement, 0, 0, -2.0F, -1.0F, 6.0F, 4, 1, 1, 0.0F, false));

		mill = new ModelRenderer(this);
		mill.setRotationPoint(0.0F, 24.0F, 0.0F);
		mill.cubeList.add(new ModelBox(mill, 12, 28, -4.0F, -3.0F, -1.0F, 7, 2, 2, 0.0F, false));
		mill.cubeList.add(new ModelBox(mill, 20, 29, -3.0F, -3.0F, 1.0F, 5, 2, 1, 0.0F, false));
		mill.cubeList.add(new ModelBox(mill, 20, 29, -3.0F, -3.0F, -2.0F, 5, 2, 1, 0.0F, false));
		mill.cubeList.add(new ModelBox(mill, 24, 29, -2.0F, -3.0F, 2.0F, 3, 2, 1, 0.0F, false));
		mill.cubeList.add(new ModelBox(mill, 24, 29, -2.0F, -3.0F, -3.0F, 3, 2, 1, 0.0F, false));
	}

	public void renderAll(){
		this.basement.render(0.0625f);
		this.mill.render(0.0625f);
	}
}