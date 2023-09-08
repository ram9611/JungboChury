package day8;

import java.util.Scanner;

/*
 * 
 * 두 정수를 입력받고(a<b 가정), a부터 b까지의 정수들 중 짝수만 출력.
 */
public class Q806 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("a 정수 입력: ");
		int a=sc.nextInt(); //a 변수 선언, 스캔을 통해 초기화

		System.out.println("b 정수 입력: ");
		int b=sc.nextInt();//b 변수 선언, 스캔을 통해 초기화

		for(int i=a;i<=b;i++){ // a~b까지 반복 

		if(i%2==0) // if문 true시 출력 실행 : a~b중 2와 나머지 연산 결과 0이라면 true
		System.out.print(i+" ");

		}
		
	}
}
