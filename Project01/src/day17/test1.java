package day17;

import java.util.Scanner;

public class test1 {
	
	static void showSum(int a, int b) {
		
	
		System.out.println("합 = "+(a+b));
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("a 입력: ");
		int a=sc.nextInt();
		
		System.out.print("b 입력: ");
		int b=sc.nextInt();
		showSum(a,b);
		
		
	}
}
