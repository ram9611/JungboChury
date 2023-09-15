package day14;

import java.util.Scanner;

/*
 * [고급] 16진수 4자리 값을 하나 입력 받아서(문자열 입력), 그 2진수 구성을 아래와 같이 출력하는 프로그램을 자것ㅇ하세요. 다음과 같이 주어진 BITS 라는 문자열 배열을 사용하세요.
			final String[] BITS = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
			};
	(실행결과의 예) 16진수 값(4자리)을 입력 : 1a7f (엔터)
			"1a7f"의 이진수 표현 : 0001 1010 0111 1111

				※ 따옴표를 출력 : 문자열 따옴표 안에서 \" 를 사용.
					Ex) sysout("\""); ----> 출력 : "

 * 
 */
public class Q1402 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		final String[] BITS = {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"
			};
		
		System.out.print("16진수 값(4자리)을 입력 : ");
		String s=sc.next();
		
		for(int i=0;i<4;i++) {
			
			
			
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				int num=s.charAt(i)-'0';
				System.out.print(BITS[num]+" ");
				}
			
			if(s.charAt(i)>='a'&&s.charAt(i)<='f') {
				int num=s.charAt(i)-'a'+10;
				System.out.print(BITS[num]+" ");
				}
			
		}
		
	}
}
