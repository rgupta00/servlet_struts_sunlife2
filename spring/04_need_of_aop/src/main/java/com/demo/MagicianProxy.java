package com.demo;

public class MagicianProxy extends Magician {
	private AudianceAspect audiance=new AudianceAspect();
	public void doMagic() {
			super.doMagic();
			audiance.clapping();
	}
}
