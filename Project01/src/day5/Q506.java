package day5;

import java.util.Scanner;

/*
 * 
 * 1) 변수 temp에 정수 값 하나 입력 받아서,
 * 물이 액체 상태인지 여부를 출력
 * 
 * 2) int num을 입력 받아서, 2진수로 출력
 */
public class Q506 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("온도 입력 : ");
		int temp=sc.nextInt();
		
		if(temp>100)
			System.out.println("액체 상태 아님");
		else if(temp<100&&temp>0)
			System.out.println("액체 상태");
		
		System.out.println("========");
		
		System.out.println("정수 입력 : ");
		int num=sc.nextInt();
		
	}
}
