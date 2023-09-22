package day17;

import java.util.Random;
import java.util.Scanner;

public class test5 {
	
	static int retX10(int x){





		return x*10;



		}



		static void printVar(int x){





		System.out.println("10배가 된 값 : "+x);



		}
	
	
	
	
	public static void main(String[] args) {
		
		
		int a=1, b=3, c=5;
		
		a= retX10(a);
		printVar(a);
		
		b= retX10(b);
		printVar(b);
		
		
		c= retX10(c);
		printVar(c);
		
		Scanner sc=new Scanner(System.in);

		Random rd=new Random();
		
		System.out.println(rd.nextInt(10)+1);
		
	}
	

	
	
}
