package day4;

import java.util.Scanner;

/*
 * 연습
 * 스캐너 객체 생성 : Scanner sc= new Scanner(System.in);
 * 스캐너-> 정수입력: sc.nextInt();
 * 	ex)sysout("정수 입력 : ");
 * 	    int input =sc. nextInt();
 * 
 * 공식 : 화씨 온도를 입력받아서, 섭씨 온도로 변환해서 출력
 * C=5/9*(F-32) -> 0입력 주의!
 * 
 * C=float 5/9*(F-32)
 * C=float 5/ float 9 *(F-32)
 * C=float 0.5555...*float 68
 * C=float 0.5555...*68.0
 * 
 * 정수 값을 입력 받아서, 입력받은 화씨 온도를 섭씨 온도로 변환
 * 
 * 
 * 단항연산자/삼항연산자
 * -단항연산자('항'이 하나) : 부호연산자(-), 증감연ㅅ나자(--,++)
 * -삼항연산자: "조건식? 참(true):거짓(false) "
 * 
 */

public class Q401 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); // 스캐너 객체 생성
		
		float C1; // 실수형 float 변수 선언
		float C2;
		
		System.out.print("섭씨 온도 입력 :");
		int F=sc.nextInt(); // 정수형 변수 선언 후 스캐너 입력 받기
		
		C1=(float) (0.5555555555556*(F-32)); // 입력받은 값 
		C2= 5.0f/9*(F-32);
		
		
		System.out.printf("화씨 온도 출력 : %.3f\n",C1);
		System.out.printf("화씨 온도 출력 : %.3f\n",C2);
	}
}
