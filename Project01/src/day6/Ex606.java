package day6;

import java.util.Scanner;

public class Ex606 {
	public static void main(String[] args) {
		/*
		 * 연습
		 * 입력 : 7
		 * 
		 * 7*1=7
		 * ...
		 * 7*9=63
		 * 
		 * 1~100중 몇의 배수 출력할까요? 5
		 * 
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		int num=sc.nextInt();
		
		
		for(int i=1;i<=9;i++) {
			
			System.out.println(num+"x"+i+"="+num*i);
		}
		
		
		System.out.println("=======");
		
		System.out.print("1~100중에서 몇의 배수를 출력할까요? ");
		int mul=sc.nextInt();
		
		for(int i=1;i<=100;i++) {
			if(i%mul==0)
				System.out.println(i);
		}
		
	}
}
