package com.class10;

public class arrays {
	public static void main(String[] args) {
		char[] grade = new char[3];
		grade[0] = 'f';
		grade[1] = 'b';
		grade[2] = 'a';
		for (int i = 0; i < grade.length; i++) {
			System.out.println(grade[i]);
		}
		System.out.println("************************");
		char[] g2 = { 'A', 'B', 'C', 'D' };
		for (int i = 0; i < g2.length; i++) {
			System.out.println(g2[i]);

		}
		for (int i = g2.length-1;i>=0; i--) {
			System.out.println(g2[i]);

		}

		//********************* FOR EACH *************************
		
		for(char value:grade) {
			System.out.print(value);
		}
		
	}
}
