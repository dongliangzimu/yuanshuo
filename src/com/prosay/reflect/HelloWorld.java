package com.prosay.reflect;

public class HelloWorld {
    private String name;
    private int age;
    public HelloWorld(){
    	
    }
    public HelloWorld(String name,int age){
    	this.name = name;
    	this.age = age;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void sayHello(){
		System.out.println("name: "+name +" ,age: "+age);
	}
    
}
