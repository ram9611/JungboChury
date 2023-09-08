package day5;

import java.util.Scanner;

/*
 * 알파벳을 하나 입력 받고, 대문자인지 여부를 출력 // 아스키코드표 참고
 * (참고) 문자 입력-> String s=sc.next();
 * 				  char ch=s.charAt(0);
 * (실행결과의 예) 
 * 알파벳 입력 : A 
 * 출력 : 대문자임!
 * 
 * 알파벳 입력 : b
 * 출력: 대문자 아님!
 * 
 * (고급)
 * 알파벳을 입력하지 않았으면, 알파벳을 입력할 때까지 반복해서 입력 받도록
 * 
 * 
 */
public class Q507 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("알파벳 입력: ");
		String s=sc.next();
		char ch=s.charAt(0);
		
		if(ch>'A'&&ch<'Z')
			System.out.println(ch);
		else if(ch>=97)
			System.out.println((char)(ch-32));
	}
}
