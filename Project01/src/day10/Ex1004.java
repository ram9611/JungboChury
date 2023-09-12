package day10;

import java.util.Scanner;

//sc.nextInt()
//sc.next() or sc.nextInt();
public class Ex1004 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int n=sc.nextInt(); // 5 입력-->입력버퍼로 들어감-->5나가고 엔터키만 남음
		sc.nextLine();
		
		
		System.out.println("문자열 입력: ");
		//입력버퍼를 비우고 싶어---->
		//sc.nextLine();
		
		String s=sc.nextLine();//엔터키 입력됨-->" "
		//String s=sc.next(); // 1. 해결 방법
		System.out.println("n : "+n);
		System.out.println("s : "+s);
		
	}
}
