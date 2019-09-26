/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render.models.blocks;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import net.minecraftforge.fml.client.FMLClientHandler;
import train.common.library.Info;

public class ModelRing extends ModelBase  {
private IModelCustom ring;
	
	public ModelRing() {
		ring = new AdvancedModelLoader().loadModel(new ResourceLocation(Info.modelPrefix + "ring.obj"));
	}
	
	public void render() {
		ring.renderAll();
	}
	
	public void render(int color) {
		//GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
		GL11.glColor4f(1, 1, 1, 1);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "ring.png"));
		render();
		GL11.glPopMatrix();
	}
}
