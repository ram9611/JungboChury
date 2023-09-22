package day18;

import java.util.Scanner;

/*
 * 
 * 파라미터로 정수 값을 하나 받아서, 각 자릿수의 합을 리턴하는 메서드.
	(실행결과의 예) 정수 입력 : 365 (엔터)
			각 자릿수의 합 : 14
	(실행결과의 예) 정수 입력 : 3156 (엔터)
			각 자릿수의 합 : 15
 * 
 */
public class Q1804 {
	
	static int sum(int n) {
		
		
		int sum=0;
		
		while(true) {
			
			
			
			int a=n%10;
			sum+=a;
			n-=a;
			n/=10;
			
			if(n<10) {
				a=n%10;
				sum+=a;
				break;
			}
			
		}
		
		
		
		
		
		
	
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		System.out.println(sum(num));//14
		
	}
}
