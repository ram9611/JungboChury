package day7;

import java.util.Scanner;

/*
 * 4개 정수 입력(a,b,c,d)
 * ex)
 * 입력: a=1, b=10, c=5, d=8
 * 출력: 1,2,3,4,9,10
 * 
 */
public class Ex711 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("a 정수입력 : ");
		int a=sc.nextInt(); // int형 변수 a 선언, 스캔값으로 초기화 
		
		System.out.print("b 정수입력 : ");
		int b=sc.nextInt();// int형 변수 b 선언, 스캔값으로 초기화 
		
		System.out.print("c 정수입력 : ");
		int c=sc.nextInt();// int형 변수 c 선언, 스캔값으로 초기화
		
		System.out.print("d 정수입력 : ");
		int d=sc.nextInt(); // int형 변수 d 선언, 스캔값으로 초기화
		
		System.out.print("출력:");
		for(int i=a;i<=b;i++) { //a~b까지 증가반복문 i를 통해 수행
		
		
		if(i<c||i>d) //조건 true시 i값 출력: i가 c보다 작거나 i가 d보다 크면 true
		System.out.print(i+" ");
		
		
		
		
		
		
	}
		
		
	}
}
