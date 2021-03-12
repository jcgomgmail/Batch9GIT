package com.class11;

public class HW7 {
	
	public static void main(String[] args) {
		int num1=0,num2=1,fb=0;
		System.out.print(num2+" ");
		for (int i = 0; i < 9; i++) {
			fb=num1+num2;
			num1=num2;
			num2=fb;
			System.out.print(fb+" ");
		}
		System.out.println();
	}

}
//1 1 2 3 5 8 13 21 34 55