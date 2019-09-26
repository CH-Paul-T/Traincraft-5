package train.client.render.models;
//Exported java file
//Keep in mind that you still need to fill in some blanks
// - ZeuX

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import tmt.ModelBase;

public class ModelLocoDieselIC4_DSB_FH extends ModelBase
{
	//fields
	ModelRenderer Left1;
	ModelRenderer Left2;
	ModelRenderer Left3;
	ModelRenderer Left4;
	ModelRenderer Floor1;
	ModelRenderer Floor2;
	ModelRenderer Floor3;
	ModelRenderer Ceiling;
	ModelRenderer Right1;
	ModelRenderer Right2;
	ModelRenderer Right3;
	ModelRenderer Right4;
	ModelRenderer Wheels1;
	ModelRenderer Wheels2;
	ModelRenderer Bottom;
	ModelRenderer TranConnector1;
	ModelRenderer TranConnector2;
	ModelRenderer TranConnector3;
	ModelRenderer TranConnector4;
	ModelRenderer TrainConnector5;
	ModelRenderer TrainConnector6;
	ModelRenderer TrainConnector7;
	ModelRenderer TrainConnector8;
	ModelRenderer TrainConnector9;
	ModelRenderer TrainConnector10;
	ModelRenderer TranConnector11;
	ModelRenderer TranConnector12;
	ModelRenderer TrainConnector13;
	ModelRenderer TrainConnector14;
	ModelRenderer TranConnector15;
	ModelRenderer TranConnector16;
	ModelRenderer Stairs1;
	ModelRenderer Stairs2;
	ModelRenderer Stairs3;
	ModelRenderer Walls1;
	ModelRenderer Walls2;
	ModelRenderer Walls3;
	ModelRenderer Walls4;
	ModelRenderer Walls5;
	ModelRenderer Walls6;
	ModelRenderer Walls7;
	ModelRenderer Walls8;
	ModelRenderer Walls9;
	ModelRenderer Seats1;
	ModelRenderer Seats2;
	ModelRenderer Seats3;
	ModelRenderer Seats4;
	ModelRenderer Seats5;
	ModelRenderer Seats6;
	ModelRenderer Seats7;
	ModelRenderer Seats8;
	ModelRenderer Seats9;
	ModelRenderer Seats10;
	ModelRenderer Seats11;
	ModelRenderer Seats12;
	ModelRenderer Seats13;
	ModelRenderer Seats14;
	ModelRenderer Seats15;
	ModelRenderer Seats16;
	ModelRenderer Seats17;
	ModelRenderer Seats18;
	ModelRenderer Seats19;
	ModelRenderer Seats20;
	ModelRenderer Seats21;
	ModelRenderer Seats22;
	ModelRenderer Seats23;

	public ModelLocoDieselIC4_DSB_FH()
	{
		textureWidth = 256;
		textureHeight = 256;

		Left1 = new ModelRenderer(this, 203, 0);
		Left1.addBox(0F, 0F, 0F, 2, 111, 6);
		Left1.setRotationPoint(9F, 18F, -1F);
		Left1.setTextureSize(256, 256);
		Left1.mirror = true;
		setRotation(Left1, 1.570796F, 0F, 0.2230717F);
		Left2 = new ModelRenderer(this, 111, 0);
		Left2.addBox(0F, 0F, 0F, 2, 111, 15);
		Left2.setRotationPoint(10.1F, 13F, -1F);
		Left2.setTextureSize(256, 256);
		Left2.mirror = true;
		setRotation(Left2, 1.570796F, 0F, 0F);
		Left3 = new ModelRenderer(this, 146, 0);
		Left3.addBox(0F, 0F, 0F, 2, 111, 6);
		Left3.setRotationPoint(10.25F, -1F, -1F);
		Left3.setTextureSize(256, 256);
		Left3.mirror = true;
		setRotation(Left3, 1.570796F, 0F, -0.2230717F);
		Left4 = new ModelRenderer(this, 246, 146);
		Left4.addBox(0F, 0F, 0F, 1, 97, 4);
		Left4.setRotationPoint(9F, 22F, 6F);
		Left4.setTextureSize(256, 256);
		Left4.mirror = true;
		setRotation(Left4, 1.570796F, 0F, 0.2974289F);
		Floor1 = new ModelRenderer(this, 0, 0);
		Floor1.addBox(0F, 0F, 0F, 20, 117, 1);
		Floor1.setRotationPoint(-10F, 18F, -4F);
		Floor1.setTextureSize(256, 256);
		Floor1.mirror = true;
		setRotation(Floor1, 1.570796F, 0F, 0F);
		Floor2 = new ModelRenderer(this, 12, 172);
		Floor2.addBox(0F, 0F, 0F, 20, 14, 3);
		Floor2.setRotationPoint(-9F, 17F, -1F);
		Floor2.setTextureSize(256, 256);
		Floor2.mirror = true;
		setRotation(Floor2, 1.570796F, 0F, 0F);
		Floor3 = new ModelRenderer(this, 12, 202);
		Floor3.addBox(0F, 0F, 0F, 20, 22, 3);
		Floor3.setRotationPoint(-9F, 18F, 88F);
		Floor3.setTextureSize(256, 256);
		Floor3.mirror = true;
		setRotation(Floor3, 1.570796F, 0F, 0F);
		Ceiling = new ModelRenderer(this, 164, 0);
		Ceiling.addBox(0F, 0F, 0F, 18, 111, 1);
		Ceiling.setRotationPoint(-8F, -6F, -1F);
		Ceiling.setTextureSize(256, 256);
		Ceiling.mirror = true;
		setRotation(Ceiling, 1.570796F, 0F, 0F);
		Right1 = new ModelRenderer(this, 59, 0);
		Right1.addBox(0F, 0F, 0F, 2, 111, 6);
		Right1.setRotationPoint(-10F, 18.3F, -1F);
		Right1.setTextureSize(256, 256);
		Right1.mirror = true;
		setRotation(Right1, 1.570796F, 0F, -0.2230717F);
		Right2 = new ModelRenderer(this, 76, 0);
		Right2.addBox(0F, 0F, 0F, 2, 111, 15);
		Right2.setRotationPoint(-11.2F, 13F, -1F);
		Right2.setTextureSize(256, 256);
		Right2.mirror = true;
		setRotation(Right2, 1.570796F, 0F, 0F);
		Right3 = new ModelRenderer(this, 42, 0);
		Right3.addBox(0F, 0F, 0F, 2, 111, 6);
		Right3.setRotationPoint(-11F, -2F, -1F);
		Right3.setTextureSize(256, 256);
		Right3.mirror = true;
		setRotation(Right3, 1.570796F, 0F, 0.3346075F);
		Right4 = new ModelRenderer(this, 234, 146);
		Right4.addBox(0F, 0F, 0F, 1, 97, 4);
		Right4.setRotationPoint(-9F, 22F, 6F);
		Right4.setTextureSize(256, 256);
		Right4.mirror = true;
		setRotation(Right4, 1.570796F, 0F, -0.2974289F);
		Wheels1 = new ModelRenderer(this, 124, 186);
		Wheels1.addBox(0F, 0F, 0F, 6, 21, 10);
		Wheels1.setRotationPoint(11F, 18F, -5F);
		Wheels1.setTextureSize(256, 256);
		Wheels1.mirror = true;
		setRotation(Wheels1, 0F, 0F, 1.570796F);
		Wheels2 = new ModelRenderer(this, 134, 151);
		Wheels2.addBox(0F, 0F, 0F, 6, 21, 11);
		Wheels2.setRotationPoint(11F, 18F, 104F);
		Wheels2.setTextureSize(256, 256);
		Wheels2.mirror = true;
		setRotation(Wheels2, 0F, 0F, 1.570796F);
		Bottom = new ModelRenderer(this, 220, 0);
		Bottom.addBox(0F, 0F, 0F, 17, 95, 1);
		Bottom.setRotationPoint(-8F, 22F, 6F);
		Bottom.setTextureSize(256, 256);
		Bottom.mirror = true;
		setRotation(Bottom, 1.570796F, 0F, 0F);
		TranConnector1 = new ModelRenderer(this, 0, 114);
		TranConnector1.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector1.setRotationPoint(-11F, -2F, -4F);
		TranConnector1.setTextureSize(256, 256);
		TranConnector1.mirror = true;
		setRotation(TranConnector1, 0F, 0F, 0F);
		TranConnector2 = new ModelRenderer(this, 0, 114);
		TranConnector2.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector2.setRotationPoint(9.5F, -2F, -4F);
		TranConnector2.setTextureSize(256, 256);
		TranConnector2.mirror = true;
		setRotation(TranConnector2, 0F, 0F, 0F);
		TranConnector3 = new ModelRenderer(this, 0, 114);
		TranConnector3.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector3.setRotationPoint(-11F, -2F, 110F);
		TranConnector3.setTextureSize(256, 256);
		TranConnector3.mirror = true;
		setRotation(TranConnector3, 0F, 0F, 0F);
		TranConnector4 = new ModelRenderer(this, 0, 114);
		TranConnector4.addBox(0F, 0F, 0F, 2, 16, 3);
		TranConnector4.setRotationPoint(9.5F, -2F, 110F);
		TranConnector4.setTextureSize(256, 256);
		TranConnector4.mirror = true;
		setRotation(TranConnector4, 0F, 0F, 0F);
		TrainConnector5 = new ModelRenderer(this, 0, 134);
		TrainConnector5.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector5.setRotationPoint(-9F, -6F, -4F);
		TrainConnector5.setTextureSize(256, 256);
		TrainConnector5.mirror = true;
		setRotation(TrainConnector5, 0F, 0F, 0.4461433F);
		TrainConnector6 = new ModelRenderer(this, 0, 144);
		TrainConnector6.addBox(0F, 0F, 0F, 2, 3, 3);
		TrainConnector6.setRotationPoint(9.7F, 13F, -4F);
		TrainConnector6.setTextureSize(256, 256);
		TrainConnector6.mirror = true;
		setRotation(TrainConnector6, 0F, 0F, 0.4461433F);
		TrainConnector7 = new ModelRenderer(this, 0, 144);
		TrainConnector7.addBox(0F, 0F, 0F, 2, 3, 3);
		TrainConnector7.setRotationPoint(-11F, 14F, -4F);
		TrainConnector7.setTextureSize(256, 256);
		TrainConnector7.mirror = true;
		setRotation(TrainConnector7, 0F, 0F, -0.4461433F);
		TrainConnector8 = new ModelRenderer(this, 0, 144);
		TrainConnector8.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector8.setRotationPoint(-11F, 14F, 110F);
		TrainConnector8.setTextureSize(256, 256);
		TrainConnector8.mirror = true;
		setRotation(TrainConnector8, 0F, 0F, -0.4461433F);
		TrainConnector9 = new ModelRenderer(this, 0, 144);
		TrainConnector9.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector9.setRotationPoint(9.5F, 13F, 110F);
		TrainConnector9.setTextureSize(256, 256);
		TrainConnector9.mirror = true;
		setRotation(TrainConnector9, 0F, 0F, 0.4461433F);
		TrainConnector10 = new ModelRenderer(this, 0, 134);
		TrainConnector10.addBox(0F, 0F, 0F, 2, 5, 3);
		TrainConnector10.setRotationPoint(7.6F, -5F, -4F);
		TrainConnector10.setTextureSize(256, 256);
		TrainConnector10.mirror = true;
		setRotation(TrainConnector10, 0F, 0F, -0.4833219F);
		TranConnector11 = new ModelRenderer(this, 120, 154);
		TranConnector11.addBox(0F, 0F, 0F, 2, 18, 3);
		TranConnector11.setRotationPoint(9F, -6F, -4F);
		TranConnector11.setTextureSize(256, 256);
		TranConnector11.mirror = true;
		setRotation(TranConnector11, 0F, 0F, 1.570796F);
		TranConnector12 = new ModelRenderer(this, 0, 176);
		TranConnector12.addBox(0F, 0F, 0F, 2, 20, 3);
		TranConnector12.setRotationPoint(10.2F, 15F, -4F);
		TranConnector12.setTextureSize(256, 256);
		TranConnector12.mirror = true;
		setRotation(TranConnector12, 0F, 0F, 1.570796F);
		TrainConnector13 = new ModelRenderer(this, 0, 200);
		TrainConnector13.addBox(0F, 0F, 0F, 2, 4, 3);
		TrainConnector13.setRotationPoint(8.2F, -4F, 110F);
		TrainConnector13.setTextureSize(256, 256);
		TrainConnector13.mirror = true;
		setRotation(TrainConnector13, 0F, 0F, -0.4833219F);
		TrainConnector14 = new ModelRenderer(this, 0, 200);
		TrainConnector14.addBox(0F, 0F, 0F, 2, 4, 3);
		TrainConnector14.setRotationPoint(-9.4F, -5F, 110F);
		TrainConnector14.setTextureSize(256, 256);
		TrainConnector14.mirror = true;
		setRotation(TrainConnector14, 0F, 0F, 0.4833219F);
		TranConnector15 = new ModelRenderer(this, 0, 208);
		TranConnector15.addBox(0F, 0F, 0F, 2, 19, 3);
		TranConnector15.setRotationPoint(10F, -5F, 110F);
		TranConnector15.setTextureSize(256, 256);
		TranConnector15.mirror = true;
		setRotation(TranConnector15, 0F, 0F, 1.570796F);
		TranConnector16 = new ModelRenderer(this, 0, 176);
		TranConnector16.addBox(0F, 0F, 0F, 2, 19, 3);
		TranConnector16.setRotationPoint(10F, 16F, 110F);
		TranConnector16.setTextureSize(256, 256);
		TranConnector16.mirror = true;
		setRotation(TranConnector16, 0F, 0F, 1.570796F);
		Stairs1 = new ModelRenderer(this, 76, 140);
		Stairs1.addBox(0F, 0F, 0F, 7, 2, 2);
		Stairs1.setRotationPoint(3F, 17.6F, 13F);
		Stairs1.setTextureSize(256, 256);
		Stairs1.mirror = true;
		setRotation(Stairs1, 1.570796F, 0F, 0F);
		Stairs2 = new ModelRenderer(this, 96, 140);
		Stairs2.addBox(0F, 0F, 0F, 7, 1, 1);
		Stairs2.setRotationPoint(3F, 15.8F, 13F);
		Stairs2.setTextureSize(256, 256);
		Stairs2.mirror = true;
		setRotation(Stairs2, 1.570796F, 0F, 0F);
		Stairs3 = new ModelRenderer(this, 96, 140);
		Stairs3.addBox(0F, 0F, 0F, 7, 1, 1);
		Stairs3.setRotationPoint(3F, 17.2F, 15F);
		Stairs3.setTextureSize(256, 256);
		Stairs3.mirror = true;
		setRotation(Stairs3, 1.570796F, 0F, 0F);
		Walls1 = new ModelRenderer(this, 12, 146);
		Walls1.addBox(0F, 0F, 0F, 19, 23, 2);
		Walls1.setRotationPoint(-9F, -6F, -1F);
		Walls1.setTextureSize(256, 256);
		Walls1.mirror = true;
		setRotation(Walls1, 0F, 0F, 0F);
		Walls2 = new ModelRenderer(this, 12, 119);
		Walls2.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls2.setRotationPoint(-9F, -6F, 108F);
		Walls2.setTextureSize(256, 256);
		Walls2.mirror = true;
		setRotation(Walls2, 0F, 0F, 0F);
		Walls3 = new ModelRenderer(this, 60, 150);
		Walls3.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls3.setRotationPoint(-9F, -6F, 42F);
		Walls3.setTextureSize(256, 256);
		Walls3.mirror = true;
		setRotation(Walls3, 0F, 0F, 0F);
		Walls4 = new ModelRenderer(this, 60, 207);
		Walls4.addBox(0F, 0F, 0F, 19, 24, 2);
		Walls4.setRotationPoint(-9F, -6F, 74F);
		Walls4.setTextureSize(256, 256);
		Walls4.mirror = true;
		setRotation(Walls4, 0F, 0F, 0F);
		Walls5 = new ModelRenderer(this, 60, 178);
		Walls5.addBox(0F, 0F, 0F, 12, 24, 3);
		Walls5.setRotationPoint(-9F, -6F, 13F);
		Walls5.setTextureSize(256, 256);
		Walls5.mirror = true;
		setRotation(Walls5, 0F, 0F, 0F);
		Walls6 = new ModelRenderer(this, 91, 178);
		Walls6.addBox(0F, 0F, -1F, 15, 20, 1);
		Walls6.setRotationPoint(-6F, -6F, 1F);
		Walls6.setTextureSize(256, 256);
		Walls6.mirror = true;
		setRotation(Walls6, 0F, -1.003822F, 0F);
		Walls7 = new ModelRenderer(this, 104, 208);
		Walls7.addBox(0F, 0F, 0F, 7, 24, 1);
		Walls7.setRotationPoint(-4F, -6F, 60F);
		Walls7.setTextureSize(256, 256);
		Walls7.mirror = true;
		setRotation(Walls7, 0F, -0.7807508F, 0F);
		Walls8 = new ModelRenderer(this, 104, 150);
		Walls8.addBox(0F, 0F, 0F, 5, 24, 1);
		Walls8.setRotationPoint(-9F, -6F, 60F);
		Walls8.setTextureSize(256, 256);
		Walls8.mirror = true;
		setRotation(Walls8, 0F, 0F, 0F);
		Walls9 = new ModelRenderer(this, 160, 185);
		Walls9.addBox(0F, 0F, 0F, 1, 24, 9);
		Walls9.setRotationPoint(0F, -6F, 65F);
		Walls9.setTextureSize(256, 256);
		Walls9.mirror = true;
		setRotation(Walls9, 0F, 0F, 0F);
		Seats1 = new ModelRenderer(this, 56, 120);
		Seats1.addBox(0F, 0F, 0F, 3, 20, 1);
		Seats1.setRotationPoint(-9F, 17F, 20F);
		Seats1.setTextureSize(256, 256);
		Seats1.mirror = true;
		setRotation(Seats1, 1.570796F, 0F, 0F);
		Seats2 = new ModelRenderer(this, 66, 122);
		Seats2.addBox(0F, 0F, 0F, 3, 21, 1);
		Seats2.setRotationPoint(7F, 17F, 20F);
		Seats2.setTextureSize(256, 256);
		Seats2.mirror = true;
		setRotation(Seats2, 1.570796F, 0F, 0F);
		Seats3 = new ModelRenderer(this, 96, 132);
		Seats3.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats3.setRotationPoint(-9F, 18F, 85F);
		Seats3.setTextureSize(256, 256);
		Seats3.mirror = true;
		setRotation(Seats3, 1.570796F, 0F, 0F);
		Seats4 = new ModelRenderer(this, 76, 136);
		Seats4.addBox(0F, 0F, 0F, 4, 1, 1);
		Seats4.setRotationPoint(-9F, 18F, 78F);
		Seats4.setTextureSize(256, 256);
		Seats4.mirror = true;
		setRotation(Seats4, 1.570796F, 0F, 0F);
		Seats5 = new ModelRenderer(this, 96, 136);
		Seats5.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats5.setRotationPoint(-9F, 15F, 90F);
		Seats5.setTextureSize(256, 256);
		Seats5.mirror = true;
		setRotation(Seats5, 1.570796F, 0F, 0F);
		Seats6 = new ModelRenderer(this, 96, 136);
		Seats6.addBox(0F, 0F, -1F, 7, 1, 1);
		Seats6.setRotationPoint(3F, 14.3F, 98F);
		Seats6.setTextureSize(256, 256);
		Seats6.mirror = true;
		setRotation(Seats6, 1.570796F, 0F, 0F);
		Seats7 = new ModelRenderer(this, 96, 136);
		Seats7.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats7.setRotationPoint(-9F, 15.5F, 98F);
		Seats7.setTextureSize(256, 256);
		Seats7.mirror = true;
		setRotation(Seats7, 1.570796F, 0F, 0F);
		Seats8 = new ModelRenderer(this, 96, 136);
		Seats8.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats8.setRotationPoint(-9F, 15F, 106F);
		Seats8.setTextureSize(256, 256);
		Seats8.mirror = true;
		setRotation(Seats8, 1.570796F, 0F, 0F);
		Seats9 = new ModelRenderer(this, 96, 136);
		Seats9.addBox(0F, 0F, 0F, 7, 1, 1);
		Seats9.setRotationPoint(3F, 15F, 106F);
		Seats9.setTextureSize(256, 256);
		Seats9.mirror = true;
		setRotation(Seats9, 1.570796F, 0F, 0F);
		Seats10 = new ModelRenderer(this, 0, 232);
		Seats10.addBox(0F, 0F, 0F, 1, 4, 3);
		Seats10.setRotationPoint(-5F, 16F, 78F);
		Seats10.setTextureSize(256, 256);
		Seats10.mirror = true;
		setRotation(Seats10, 0F, 0F, 1.570796F);
		Seats11 = new ModelRenderer(this, 10, 232);
		Seats11.addBox(0F, 0F, 0F, 1, 7, 3);
		Seats11.setRotationPoint(-2F, 16F, 83F);
		Seats11.setTextureSize(256, 256);
		Seats11.mirror = true;
		setRotation(Seats11, 0F, 0F, 1.570796F);
		Seats12 = new ModelRenderer(this, 20, 232);
		Seats12.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats12.setRotationPoint(-2F, 13F, 104F);
		Seats12.setTextureSize(256, 256);
		Seats12.mirror = true;
		setRotation(Seats12, 0F, 0F, 1.570796F);
		Seats13 = new ModelRenderer(this, 20, 232);
		Seats13.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats13.setRotationPoint(11F, 13F, 104F);
		Seats13.setTextureSize(256, 256);
		Seats13.mirror = true;
		setRotation(Seats13, 0F, 0F, 1.570796F);
		Seats14 = new ModelRenderer(this, 30, 232);
		Seats14.addBox(0F, 0F, 0F, 1, 8, 5);
		Seats14.setRotationPoint(-2F, 13.6F, 96F);
		Seats14.setTextureSize(256, 256);
		Seats14.mirror = true;
		setRotation(Seats14, 0F, 0F, 1.570796F);
		Seats15 = new ModelRenderer(this, 54, 234);
		Seats15.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats15.setRotationPoint(11F, 13.2F, 98F);
		Seats15.setTextureSize(256, 256);
		Seats15.mirror = true;
		setRotation(Seats15, 0F, 0F, 1.570796F);
		Seats16 = new ModelRenderer(this, 44, 232);
		Seats16.addBox(0F, 0F, 0F, 1, 8, 3);
		Seats16.setRotationPoint(-2F, 13F, 90F);
		Seats16.setTextureSize(256, 256);
		Seats16.mirror = true;
		setRotation(Seats16, 0F, 0F, 1.570796F);
		Seats17 = new ModelRenderer(this, 70, 236);
		Seats17.addBox(0F, 0F, 0F, 4, 5, 1);
		Seats17.setRotationPoint(-9F, 11F, 78F);
		Seats17.setTextureSize(256, 256);
		Seats17.mirror = true;
		setRotation(Seats17, 0F, 0F, 0F);
		Seats18 = new ModelRenderer(this, 70, 244);
		Seats18.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats18.setRotationPoint(-9F, 11F, 85F);
		Seats18.setTextureSize(256, 256);
		Seats18.mirror = true;
		setRotation(Seats18, 0F, 0F, 0F);
		Seats19 = new ModelRenderer(this, 90, 244);
		Seats19.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats19.setRotationPoint(-9F, 8F, 90F);
		Seats19.setTextureSize(256, 256);
		Seats19.mirror = true;
		setRotation(Seats19, 0F, 0F, 0F);
		Seats20 = new ModelRenderer(this, 90, 244);
		Seats20.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats20.setRotationPoint(3F, 9F, 98F);
		Seats20.setTextureSize(256, 256);
		Seats20.mirror = true;
		setRotation(Seats20, 0F, 0F, 0F);
		Seats21 = new ModelRenderer(this, 70, 244);
		Seats21.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats21.setRotationPoint(3F, 8F, 106F);
		Seats21.setTextureSize(256, 256);
		Seats21.mirror = true;
		setRotation(Seats21, 0F, 0F, 0F);
		Seats22 = new ModelRenderer(this, 70, 244);
		Seats22.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats22.setRotationPoint(-9F, 8F, 106F);
		Seats22.setTextureSize(256, 256);
		Seats22.mirror = true;
		setRotation(Seats22, 0F, 0F, 0F);
		Seats23 = new ModelRenderer(this, 90, 236);
		Seats23.addBox(0F, 0F, 0F, 7, 5, 1);
		Seats23.setRotationPoint(-9F, 9F, 98F);
		Seats23.setTextureSize(256, 256);
		Seats23.mirror = true;
		setRotation(Seats23, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		GL11.glPushMatrix();
		GL11.glRotatef(90,0,1,0);
		GL11.glRotatef(180,0,0,1);
		GL11.glTranslated(0,-1.4f,-2.6);
		GL11.glScaled(0.7,0.9,1);
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Left1.render(f5);
		Left2.render(f5);
		Left3.render(f5);
		Left4.render(f5);
		Floor1.render(f5);
		Floor2.render(f5);
		Floor3.render(f5);
		Ceiling.render(f5);
		Right1.render(f5);
		Right2.render(f5);
		Right3.render(f5);
		Right4.render(f5);
		Wheels1.render(f5);
		Wheels2.render(f5);
		Bottom.render(f5);
		TranConnector1.render(f5);
		TranConnector2.render(f5);
		TranConnector3.render(f5);
		TranConnector4.render(f5);
		TrainConnector5.render(f5);
		TrainConnector6.render(f5);
		TrainConnector7.render(f5);
		TrainConnector8.render(f5);
		TrainConnector9.render(f5);
		TrainConnector10.render(f5);
		TranConnector11.render(f5);
		TranConnector12.render(f5);
		TrainConnector13.render(f5);
		TrainConnector14.render(f5);
		TranConnector15.render(f5);
		TranConnector16.render(f5);
		Stairs1.render(f5);
		Stairs2.render(f5);
		Stairs3.render(f5);
		Walls1.render(f5);
		Walls2.render(f5);
		Walls3.render(f5);
		Walls4.render(f5);
		Walls5.render(f5);
		Walls6.render(f5);
		Walls7.render(f5);
		Walls8.render(f5);
		Walls9.render(f5);
		Seats1.render(f5);
		Seats2.render(f5);
		Seats3.render(f5);
		Seats4.render(f5);
		Seats5.render(f5);
		Seats6.render(f5);
		Seats7.render(f5);
		Seats8.render(f5);
		Seats9.render(f5);
		Seats10.render(f5);
		Seats11.render(f5);
		Seats12.render(f5);
		Seats13.render(f5);
		Seats14.render(f5);
		Seats15.render(f5);
		Seats16.render(f5);
		Seats17.render(f5);
		Seats18.render(f5);
		Seats19.render(f5);
		Seats20.render(f5);
		Seats21.render(f5);
		Seats22.render(f5);
		Seats23.render(f5);
		GL11.glPopMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
