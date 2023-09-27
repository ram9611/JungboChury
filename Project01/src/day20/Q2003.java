package day20;

import java.util.Scanner;

/*
 * Q1803.	연습.
	문자열 하나를 파라미터로 받아서
	2진수 숫자가 맞는지 여부를 판단하여
	2진수 숫자가 맞으면 true를, 아니면 false를 리턴하는 메서드
	checkBinaryStr()을 작성해보세요. // main()은 알아서.

	(실행결과의 예) 2진수 숫자를 입력 : 10100011 (엔터)
			"10100011"은 2진수 숫자가 맞음.
	(실행결과의 예) 2진수 숫자를 입력 : 10102000 (엔터)
			"10102000"은 2진수 숫자가 아님.
				
					Hint. sysout("\"");
 * 
 */
public class Q2003 {
	
	static boolean checkBinaryStr(String s){
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='0'||ch=='1')
				continue;
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 문자열 입력: ");
		String s = sc.next();
		
		if(checkBinaryStr(s))
			System.out.println("\""+s+"\""+"은 2진수 숫자가 맞음");
		else
			System.out.println("\""+s+"\""+"은 2진수 숫자가 아님");
	}
}
