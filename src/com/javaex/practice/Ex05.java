package com.javaex.practice;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//문제14
		int a=3, b=4;
		double a1 = (double)(a*2)+(b*2);
		System.out.println(a1);
		double c = (double)(a*b);
		System.out.println(c);
		
		//문제15
		int x = 10;
		double y = 1.609;
		double d = (double)(x*y);
		System.out.println(d+"km");
		
		//문제16
		int v1 = 7500;
		int v2 = 10000;
		double v3 = (double) (v1/10);
		double v4 = (double)(v2-v1);
		System.out.println(v3);
		System.out.println(v4);
		
		//문제17
		int b1 = 5;
		double b2 = 3.14;
		double b3 = (double) 4/3*b2*(b1*b1*b1);
		System.out.println(b3);
		
		int c1 = 12;
		double c2 = (double) 4/3*b2*(c1*c1*c1);
		System.out.println(c2);
	}

}
