package day10;

import java.util.Scanner;

/*
 * 
 * 
 * 
 * 
 */

public class Ex1001 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		
		int a=1;
		int b=1;
		
		
		for(int i=1;i<=num;i++) {
			
			if(i==1)
				System.out.print(a+" ");
				
			
			if(i==2)
				System.out.print(b+" ");
			
			if(i>2) {
			int c=a+b;
			System.out.print(c+" ");
			
			a=b;
			b=c;
			}
			
		}
		
		}
		
	
}
