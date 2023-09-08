package day6;

import java.util.Scanner;

/*
 * 누적곱 계산기
 * 몇부터? 5
 * 몇까지? 3
 * 3*4*5=60
 * 
 * 몇부터? 3
 * 몇까지? 5
 * 3*4*5=60
 * 
 */
public class Q605 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇부터?");
		int num1=sc.nextInt();
		
		System.out.print("몇까지?");
		int num2=sc.nextInt();
		
		int mul=1;
		
		if(num1>num2) {
			int temp=0;
			temp=num1;
			num1=num2;
			num2=temp;
			
		}
		
		for(int i=num1;i<=num2;i++) {
			
			mul*=i;
			if(i<num2)
			{System.out.print(i);
			System.out.print("*");}
			
			if(i==num2) {
				System.out.print(i);
				System.out.print("=");
				System.out.print(mul);
			}
		}
		
	}
}
