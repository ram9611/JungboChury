package day10;

import java.util.Scanner;

/*
 * 알파벳을 하나 입력 받아서,
 * 그거부터 시작해서 Z까지 출력.
 * 
 * 알파벳 입력: X
 * XYZ
 * 
 * 알파벳 입력: r
 * rstuwxyz
 * 
 * 
 */
public class Q1004 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("알파벳 입력: ");
		String s=sc.next();
		char ch=s.charAt(0);
		
		while(true) {
			
			if(ch>='a'&&ch<='z') {
				
				System.out.print(ch);
				
				
				if(ch=='z')
					break;
				
				ch++;
				
			}
			
			if(ch>='A'&&ch<='Z') {
				
				System.out.print(ch);
				
				
				if(ch=='Z')
					break;
				
				ch++;
			}
			
			
			
		}
		
	}
}
