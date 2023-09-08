package day6;

import java.util.Scanner;

/*
 * 예제1) 몇번을 반복할까요? 4
 * 1번 반복
 * 2번 반복
 * 3번 반복
 * 4번 반복
 * 반복 끝
 * 
 * 
 */
public class Ex602 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇 번을 반복할까요? ");
		int num=sc.nextInt();
		System.out.println(" ");
		
		for(int i=1;i<=num;i++) //1~num까지 증가반복 i를 통해 수행
		{
			System.out.printf("%d번 반복\n",i); //반복되는만큼 출력 수행
		}
		System.out.println("반복 끝");// for문 종료후 출력 수행
	}
}
