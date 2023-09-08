package day5;

import java.util.Scanner;

/*
 * 연도(정수 값)를 하나 입력 받아서, 윤년인지 여부를 판단하는 코드
 * 1) 400으로 나누어 떨어지면 윤년
 * 그게 아니라면,
 * 2) 4로 나누어 떨어지면서 100으로는 나누어 떨어지지 않으면 윤년임
 * 
 * 
 */
public class Q505 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		
		if(year%400==0)
			System.out.println("윤년");
		else if(year%4==0&&year%100!=0)
			System.out.println("윤년");
		else
			System.out.println("윤년이 아닌듯");
	}
}
