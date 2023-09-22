package day18;

import java.util.Scanner;

public class Ex1801 {
	
	
	public static void showAllsum(int a, int b, int c) {
		
		System.out.print(a+"+"+b+"+"+c+"="+(a+b+c));
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수1: ");
		int num1=sc.nextInt();
		
		System.out.println("정수2: ");
		int num2=sc.nextInt();
		
		System.out.println("정수3: ");
		int num3=sc.nextInt();
		
		showAllsum(num1,num2,num3);
		
	}
}
