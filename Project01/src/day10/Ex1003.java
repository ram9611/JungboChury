package day10;

import java.util.Scanner;



/*
 * Scanner 클래스
 * 
 * Scanner sc= new Scanner(System.in);
 * int n=sc.nextInt();
 * String s=sc.next();
 * 
 * [정리] 
 * -스캐너(객체)는 '입력버퍼'를 바라보고 있음 
 * -스캐너를 사용해서 입력 받을 때, 입려버퍼가 비어있는 상태라면 커서를 보여주고 입력을 기다림
 * -입력버퍼에 무언가 있는 상태라면(알아서 가져오고) 안 기다림
 * 1) 문자열 입력
 * 	.next() : 한 단어 입력
 *  .nextLine() : 한 문장 입력
 * 
 * 2) 정수 입력
 * .nextByte()
 * .nextShort()
 * .nextInt()
 * .nextLong()
 * 
 * 
 * 3.실수 입력
 * .nextFloat()
 * .nextDouble()
 * 
 */
public class Ex1003 {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String s=sc.nextLine();
			System.out.println("입력된 문자열 : "+s);
			
			System.out.println();
			
		}
}
