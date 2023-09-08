package day7;

import java.util.Scanner;

/* 
 
 입력 : 4
 *******
  *****
   ***
 	*	
 
 
 * */
public class Ex705 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		int n_1=2*n-1; // int형 n_1 변수 선언, 입력받은 n에 2를 곱하고 1을 뺀 값으로 초기화
		
		for(int i=0;i<n;i++) { //0~n-1만큼 증감 반복 i를 통해 수행
			
			
			for(int k=0;k<=i;k++) { //0~i만큼 증감 반복 k를 통해 수행, 반복되는만큼 공백 출력
				System.out.print(" ");
			}
			
			
			for(int j=n_1-i*2;j>=1;j--) { // n_1에서 i*2를 뺀 값~1까지 감소반복 수행, 반복되는만큼 * 출력
				System.out.print("*");
			}
			
			
			
			System.out.println(); // 이중 포문 완료 후 엔터키 출력
		}
		
		 
	}
}
