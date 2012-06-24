package com.williamYang

import org.williamYang.Hello

class HelloTest extends GroovyTestCase {
	void testProperty(){
		Hello h = new Hello(name:"yangyang",sex:"male");
		println("name is:"+h.getName());
	}
}
