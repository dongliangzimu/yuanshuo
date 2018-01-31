package com.prosay.reflect;

public class Test {
    public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		h.setName("张三");
		h.setAge(16);
		Class c =  h.getClass();
		
		
			/*HelloWorld h1 = (HelloWorld) c.newInstance();
			h1.setName("李四");
			h1.setAge(18);*/
			//h.sayHello();
			//h1.sayHello();
		try {
			Class c2 = Class.forName("com.prosay.reflect.HelloWorld");
			System.out.println("getName:"+c2.getName());
			System.out.println("superClass:"+c2.getSuperclass());
			HelloWorld h2 = (HelloWorld)c2.newInstance();
			h2.setAge(19);
			h2.setName("小王");
			h2.sayHello();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}
