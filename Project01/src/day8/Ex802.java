package day8;

import java.util.Scanner;

/*
 * 소수 2
 * 
 * 정수 입력: 7
 * 출력: 소수임 <-----23456
 * 
 * 정수 입력 : 9
 * 출력: 소수가 아님 <----2345678
 */
public class Ex802 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		int count=0; // for문안 if문 true일때 카운트 되는 변수 및 초기화 선언
		
		if(num==1) //  1 입력된다면 소수 출력
			System.out.println("소수임");
		
		
		for(int i=2;i<=num-1;i++) { //for문을 통해 2~num-1 반복
			
			if(num%i==0) { // num % 2~num-1 나머지 연산 수행시 0이 된다면 true, true시 소수가 아님 출력, 카운트 추가, break을 통해 탈출
				System.out.println("소수가 아님"); 
				count++;
				break;
			}
			
			
			
		}
		
		if(count==0) // if문 한번도 true가 아니였다면 소수로 판단
		System.out.println("소수임");
	}
}
