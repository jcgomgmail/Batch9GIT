package com.class3;
/*
 * Task

Declare variable and increase by 500 using shorthand operator
Declare variable and decrease by 67 using shorthand operator
Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
Declare variable cake=25 and divide cake between 7 people . Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people

 */
public class CompoundOperator {
	public static void main(String[] args) {
		
		int num1=0, num2=0,cake=25;
		float cakePiece= 11.00f;
		System.out.println("Increase 500= "+(num1+=500)+" decrease 67= "+ (num2-=67));
		System.out.println("Divide/4= "+(cakePiece/4)+" Mod 7= "+(25%7));
		
		
		
	}

}
