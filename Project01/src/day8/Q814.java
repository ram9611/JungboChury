package day8;

import java.util.Random;
import java.util.Scanner;

/*
 * Guess(1~100) : 50 (엔터)
		더 작은 수를 입력하세요
		Guess(1~100) : 25 (엔터)
		더 큰 수를 입력하세요
		Guess(1~100) : 37 (엔터)
		3번만에 맞혔습니다!

 * 
 * 
 */
public class Q814 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Random rd=new Random();
		int num=rd.nextInt(100);
		
		int count=0;
		
		while(true) {
			
			count++;
			
			System.out.print("Guess(1~100) :");
			int insert=sc.nextInt();
			
			if(num<insert) {
				System.out.println("더 작은 수를 입력하세요!");
			}else if(num>insert) {
				System.out.println("더 큰 값을 입력하세요!");
			}else {
				System.out.println(count+"번만에 맞혔습니다");
				break;
			}
			
			
			
			
		}
		
	}
}
