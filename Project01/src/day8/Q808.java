package day8;

import java.util.Scanner;

/*
 * 세 정수를 입력받고(a,b,c), 세 정수의 합계가 짝수인지 아닌지 여부를 출력.
	(+고급화) 세 정수의 합계가 홀수이면 다시 입력(반복)
 * 
 * 
 */
public class Q808 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		while(true){

		System.out.print("a 출력: ");
		int a=sc.nextInt(); // int형 a변수 선언 및 스캔을 통해 초기화 

		System.out.print("b 출력: ");
		int b=sc.nextInt(); // int형 b변수 선언 및 스캔을 통해 초기화 

		System.out.print("c 출력: ");
		int c=sc.nextInt(); // int형 c변수 선언 및 스캔을 통해 초기화 

		int sum=a+b+c; // int형 sum변수 선언 및 a,b,c 합을 통해 초기화 

		if(sum%2==0) // if문 true시 결과 출력 및 무한반복문 탈출 : a,b,c 총합 2와 나머지 연산 결과 0이라면 true
		{System.out.println(sum);
		break;}
		else // if문 false시 프린트문 출력 및 다시 무한반복문
		System.out.println("다시 입력하세요!");


		}
		
		
	}
}
