package com.demo;

import org.springframework.stereotype.Component;
//aop is creating a new class by extendsing Magician class to create a dynamic proxy
@Component(value = "m")
public class Magician {

	public void doMagic() {
		System.out.println("abra ka dabra....");
	}
}
