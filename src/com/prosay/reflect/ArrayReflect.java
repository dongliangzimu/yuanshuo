package com.prosay.reflect;

import java.util.ArrayList;

public class ArrayReflect {
    public static void main(String[] args) {
		ArrayList arr = null;
		try {
			Class cl = Class.forName("java.util.ArrayList");
			try {
				arr = (ArrayList)cl.newInstance();
				arr.add("a");
				arr.add("b");
				arr.add("c");
				System.out.println(arr);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
