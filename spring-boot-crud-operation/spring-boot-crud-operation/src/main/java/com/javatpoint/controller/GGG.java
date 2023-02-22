package com.javatpoint.controller;

import java.util.HashSet;
import java.util.stream.Collectors;

public class GGG {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//			System.out.print("kk");
//		}
//		finally {
//			System.out.print("kk");
//		}
		String a="nayan";
		HashSet<Character> c=new HashSet<Character>();
		long l=a.chars().distinct().count();
		System.out.print(l);
		

	}

}
