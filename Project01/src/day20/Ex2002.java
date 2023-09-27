package day20;

import java.util.Scanner;

/*
 * Factorial
 * 5!=5*4*3*2*1;
 * --왜 재귀호출로 할 수 있었을까?
 * 		5
 * 
 */
public class Ex2002 {
	
	static int fact(int n) {
		if(n==1)return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		System.out.println(n+"! = "+fact(n));
	}
}
