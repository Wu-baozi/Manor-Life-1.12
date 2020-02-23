package com.gonggongjohn.manorlife.client.animation;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelStoneMill extends ModelBase {
	
	public ModelRenderer stoneMillTop;
	public ModelRenderer stoneMillBase;

	public ModelStoneMill() {
		
		textureWidth = 16;
		textureHeight = 16;

		stoneMillTop = new ModelRenderer(this);
		stoneMillTop.setRotationPoint(0.0F, 24.0F, 0.0F);
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -6.0F, -4.2F, 2.0F, 12, 2, 2, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -5.0F, -4.2F, 4.0F, 10, 2, 1, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -1.0F, -4.2F, 0.0F, 7, 2, 2, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -6.0F, -4.2F, 0.0F, 3, 2, 2, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -4.0F, -4.2F, 5.0F, 8, 2, 1, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -6.0F, -4.2F, -4.0F, 12, 2, 4, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -5.0F, -4.2F, -5.0F, 10, 2, 1, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 0, 9, -4.0F, -4.2F, -6.0F, 8, 2, 1, 0.0F, false));
		stoneMillTop.cubeList.add(new ModelBox(stoneMillTop, 3, 8, 3.0F, -8.2F, -4.0F, 1, 4, 1, 0.0F, false));

		stoneMillBase = new ModelRenderer(this);
		stoneMillBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 6, -4.0F, -2.5F, 3.0F, 8, 1, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 6, -3.0F, -2.5F, 4.0F, 6, 1, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 6, -4.0F, -2.5F, 0.0F, 8, 1, 3, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 6, -3.0F, -2.5F, -5.0F, 6, 1, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 6, -4.0F, -2.5F, -4.0F, 8, 1, 4, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -5.0F, -2.0F, 4.0F, 10, 2, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -6.0F, -2.0F, 0.0F, 12, 2, 3, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -6.0F, -2.0F, 3.0F, 12, 2, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -4.0F, -2.0F, 5.0F, 8, 2, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -6.0F, -2.0F, -4.0F, 12, 2, 4, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, -5.0F, -2.0F, -5.0F, 10, 2, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 0, 3, 1.0F, -2.0F, -6.0F, 3, 2, 1, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 8, 13, -1.0F, -1.0F, -7.0F, 2, 1, 2, 0.0F, false));
		stoneMillBase.cubeList.add(new ModelBox(stoneMillBase, 4, 1, -4.0F, -2.0F, -6.0F, 3, 2, 1, 0.0F, false));
	}
	
	public void renderAll() {
		
		this.stoneMillBase.render(0.0625f);
		this.stoneMillTop.render(0.0625f);
	}
}