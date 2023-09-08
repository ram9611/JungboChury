package day7;

import java.util.Scanner;

/*
 * n:5
 * aaaaa
 * bbbb
 * ccc
 * dd
 * e
 * 
 * 
 * 
 */
public class Q701 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		
		char ch='A'; // Char형 변수 ch 선언, A 초기화
		
		for(int a=1;a<=n;a++) {// 1~n까지 증가반복문 a를 통해 수행
			
			for(int b=n;b>=a;b--) { //n~a까지 감소반복문 b를 통해 수행
				System.out.print(ch); // 반복되는만큼 ch값 출력
			}
			
			System.out.println(); // 이중반복문 빠져나온후 엔터키 수행
			ch++; // ch값 증감연산 수행 A->B
		}
		
	
				
		
		
	}
}
