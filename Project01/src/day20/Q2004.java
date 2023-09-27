package day20;

import java.util.Scanner;

/*
 * Q1804.	연습.
	문자열 하나를 파라미터로 받아서
	16진수 수가 맞는지 여부를 판단하고
	16진수 수가 맞으면 true를, 아니면 false를 리턴하는 메서드
	checkHexStr()을 작성해보세요.  // main()은 알아서.

	(실행결과의 예) 16진수 숫자를 입력 : ABc123 (엔터)
			"ABc123"은(는) 16진수 수가 맞음.
	(실행결과의 예) 16진수 숫자를 입력 : aB1004G (엔터)
			"aB1004G"은(는) 16진수 수가 아님.
 * 
 */
public class Q2004 {
	static boolean checkHexStr(String s) {
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if((ch>='0'&&ch<='9')||(ch>='A'&&ch<='F')||(ch>='a'&&ch<='f'))
				continue;
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("16진수 입력: ");
		String input = sc.next();
		
		System.out.print("\""+input+"\""+"은(는) 16진수가 ");
		if(checkHexStr(input))
			System.out.println("맞음");
		else
			System.out.println("아님");
		
	}
}
