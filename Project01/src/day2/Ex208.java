package day2;
/*
 * 스캐너 객체 사용해서 정수 값 입력
 * Scanner sc=new Scanner(System.in);
 * sc.nextInt();
 * 
 * 
 */

import java.util.Scanner; // import문 ->뒤에서

public class Ex208 {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num=sc.nextInt();	//사용자 입력 값
		
		System.out.println("num: "+num);
		
		
	}
}
