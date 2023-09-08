package day5;
/*
 * 문자를 하나 입력 받아서, 대문자이면 소문자로 바꿔서 출력하고,
 * 대문자가 아니면 그냥 출력.
 * (실행결과의 예) 
 * 문자 입력: a(엔터)
 * 출력 : A
 * 
 * 문자 입력: B
 * b
 * 
 * 문자 입력: 9
 * 9
 * 
 * 
 */

import java.util.Scanner;

public class Q508 {
	public static void main(String[] args) {
		
		while(true) {
		Scanner sc=new Scanner(System.in);
		
	 
		System.out.println("알파벳 입력: ");
		String s=sc.next();
		char ch=s.charAt(0);
		
		
		
		
		
		if(ch>65&&ch<97)
			System.out.println((char)(ch+32));
		else if(ch>=97&&ch<123)
			System.out.println(ch);
		else
			System.out.println("알파벳이 아닙니다");
			System.out.println(ch);
			
		if(ch>=65&&ch<=122)
			break;
			
		}
	}
}
