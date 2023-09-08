package day7;

import java.util.Scanner;

/* 
 * 
 * 
 * 
 * 
 * */
public class Ex702 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int a=1;a<=num;a++) { // 1~num a를 통해 증감 반복
			
			for(int b=num;b>=a;b--) { // num~a b를 통해 감소반복, 반복되는만큼 * 출력
				System.out.print("*");// 
			}
			System.out.println(" "); // num~a 반복수행 후, 엔터 출력
		}
		
		
	}
}
