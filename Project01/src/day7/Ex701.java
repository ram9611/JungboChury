package day7;

import java.util.Scanner;
/*
 
 * 
 ** 
 *** 
 ****
 ***** 만들기 
 */
public class Ex701 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		for(int a=1;a<=num;a++) { // 1~num a를 통해 반복 선언
			
			for(int b=0;b<a;b++) { // 0~a-1 b를 통해 반복 선언, 반복되는 만큼  * 출력
				System.out.print("*"); 
			}
			System.out.println(" "); //b 반복 종료후 다음 행 이동
		}
		
	}
}
