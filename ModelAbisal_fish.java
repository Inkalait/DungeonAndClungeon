//Made with Blockbench
//Paste this code into your mod.

public static class ModelAbisal_fish extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer Tail;
	private final ModelRenderer aleta1;
	private final ModelRenderer aleta2;
	private final ModelRenderer lantern;

	public ModelAbisal_fish() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 2.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -8.0F, -8.0F, 6, 6,
				8, 0.0F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(mouth, 0.1745F, 0.0F, 0.0F);
		body.addChild(mouth);
		mouth.cubeList.add(new ModelBox(mouth, 0, 14, -3.0F, -3.0F, -8.0F, 6,
				2, 7, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 13, 14, -2.0F, -3.0F, 0.0F, 4, 0,
				6, 0.0F, false));

		aleta1 = new ModelRenderer(this);
		aleta1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(aleta1);
		aleta1.cubeList.add(new ModelBox(aleta1, 19, 0, 3.0F, -4.0F, -4.0F, 2,
				0, 5, 0.0F, false));

		aleta2 = new ModelRenderer(this);
		aleta2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(aleta2);
		aleta2.cubeList.add(new ModelBox(aleta2, 15, 0, -5.0F, -4.0F, -4.0F, 2,
				0, 5, 0.0F, false));

		lantern = new ModelRenderer(this);
		lantern.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(lantern);
		lantern.cubeList.add(new ModelBox(lantern, 0, 0, -1.0F, -12.0F, -8.0F,
				1, 4, 0, 0.0F, false));
		lantern.cubeList.add(new ModelBox(lantern, 0, 0, -1.0F, -12.0F, -11.0F,
				1, 0, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		body.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y,
			float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.mouth.rotateAngleY = f4 / (180F / (float) Math.PI);
		this.body.rotateAngleZ = f3 / (180F / (float) Math.PI);
	}
}