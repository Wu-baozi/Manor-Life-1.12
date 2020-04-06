package com.gonggongjohn.manorlife.client.animation;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelStoneMillDone extends ModelBase {
	
	public ModelRenderer stoneMillDoneTop;
	public ModelRenderer stoneMillDoneBase;

	public ModelStoneMillDone () {
		
		textureWidth = 16;
		textureHeight = 16;

		stoneMillDoneTop = new ModelRenderer(this);
		stoneMillDoneTop.setRotationPoint(0.0F, 24.0F, 0.0F);
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 0, 4, -4.0F, -6.2F, 2.0F, 8, 4, 2, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 2, 3, -1.0F, -6.2F, 0.0F, 5, 4, 2, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 2, 0, 4.0F, -6.2F, -3.0F, 1, 4, 6, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 2, 0, -3.0F, -6.2F, -5.0F, 6, 4, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 0, 0, -5.0F, -6.2F, -3.0F, 1, 4, 6, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 0, 3, -3.0F, -6.2F, 4.0F, 6, 4, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 6, 3, -4.0F, -6.2F, 0.0F, 1, 4, 2, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 0, 0, -4.0F, -6.2F, -4.0F, 8, 4, 4, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 0, 11, 2.0F, -7.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 2, 11, 2.0F, -8.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 4, 11, 2.0F, -9.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 6, 11, 2.0F, -10.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 10, 11, 2.0F, -11.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 12, 11, 2.0F, -12.2F, -3.0F, 1, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 10, 14, -3.0F, -3.2F, 1.0F, 2, 1, 1, 0.0F, false));
		stoneMillDoneTop.cubeList.add(new ModelBox(stoneMillDoneTop, 10, 14, -3.0F, -3.2F, 0.0F, 2, 1, 1, 0.0F, false));

		stoneMillDoneBase = new ModelRenderer(this);
		stoneMillDoneBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -4.0F, -2.0F, -6.0F, 8, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -4.0F, -2.0F, 5.0F, 8, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -5.0F, -2.0F, -5.0F, 10, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -5.0F, -2.0F, 4.0F, 10, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, -4.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, -3.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, -2.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, -1.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, 0.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, 1.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, 2.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -6.0F, -2.0F, 3.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 14, -1.0F, -2.0F, -8.0F, 2, 1, 2, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 6, -3.0F, -2.2F, 0.0F, 6, 1, 3, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 6, -3.0F, -2.2F, -3.0F, 6, 1, 3, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -5.0F, -1.0F, 4.0F, 10, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -6.0F, -1.0F, 0.0F, 12, 1, 3, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -6.0F, -1.0F, 3.0F, 12, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 5, -4.0F, -1.0F, 5.0F, 8, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -6.0F, -1.0F, -4.0F, 12, 1, 4, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -5.0F, -1.0F, -5.0F, 10, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 1.0F, -1.0F, -6.0F, 3, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 4.0F, -3.0F, -6.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 5.0F, -3.0F, -5.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -6.0F, -3.0F, -5.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -6.0F, -3.0F, 4.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 5.0F, -3.0F, 4.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 4.0F, -3.0F, 5.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -5.0F, -3.0F, 5.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -4.0F, -3.0F, 6.0F, 8, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 0, -7.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 6, 0, -7.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, -5.0F, -3.0F, -6.0F, 1, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 5, 2, 6.0F, -3.0F, 0.0F, 1, 3, 4, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 1, 3, 6.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 3, 1.0F, -3.0F, -7.0F, 3, 3, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 4, 5, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 0, 6, -4.0F, -1.0F, -6.0F, 3, 1, 1, 0.0F, false));
		stoneMillDoneBase.cubeList.add(new ModelBox(stoneMillDoneBase, 4, 1, -4.0F, -3.0F, -7.0F, 3, 3, 1, 0.0F, false));
	}

	public void renderAll() {
		
		this.stoneMillDoneBase.render(0.0625f);
		this.stoneMillDoneTop.render(0.0625f);
	}
}