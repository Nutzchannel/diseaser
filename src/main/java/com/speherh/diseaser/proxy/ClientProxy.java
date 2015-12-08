package com.speherh.diseaser.proxy;

import com.speherh.diseaser.init.diseaserItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders()
	{
		diseaserItems.registerRenders();
	}
}
