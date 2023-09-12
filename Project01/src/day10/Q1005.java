package day10;
/*
 * 피보나치 수열의 값을 입력 : 8
 * 8은 6번째 항입니다.
 * 
 * 피보나치 수열의 값을 입력 : 56
 * 56이라는 값은 없습니다.
 * 
 */

import java.util.Scanner;

public class Q1005 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("피보나치 수열의 값을 입력: ");
		int num=sc.nextInt();
		
		int a=1;
		int b=1;
		
		int cnt=2;
		
		while(true) {
			
			cnt++;
			
			if(num==1) {
				System.out.print(num+"은 1번째, 2번째 항입니다.");
				break;
			}
			
			int c=a+b;
			a=b;
			b=c;
			
			if(num==c) {
				
				System.out.print(num+"은 "+cnt+"번째 항입니다.");
				break;
			}
			
			if(c>num) {
				
				System.out.println(num+"이라는 값은 없습니다!");
				break;
			}
			
			
		}
		
		
		
	}
}
