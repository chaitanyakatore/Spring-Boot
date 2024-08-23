package com.ust.bean;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	public String sayHello(String name) {
		return "hello" + name;
	}
}
