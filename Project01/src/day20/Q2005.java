package day20;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
Q1805(고급). 문자열을 뒤집는 메서드 reverseStr(String)을 작성해 보세요.  // main()은 알아서.

	(실행결과의 예) 문자열 입력 : HelloYG (엔터)
			"HelloYG"를 뒤집으면 "GYolleh".
 * 
 */
public class Q2005 {
	
	static String reverseStr(String s) {
		
		char[] arr=new char[s.length()];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=s.charAt(s.length()-i-1);
			
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		
		
		
		System.out.println(reverseStr(input));
		
		
	}
}
