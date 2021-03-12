package com.class8;

public class repl {
	public static void main(String[] args){
		
		for(int i=1; i<=4; i++){
		    for(int c=1; c<=4; c++){
		      if((c==2 && i==2)||(c==2 && i==3)||(c==3 && i==2)||(c==3 && i==3)){
		       System.out.print(" ");
		      }else{
		        System.out.print("$");
		      }
		    }
		    System.out.println();
		  }
		}
}
