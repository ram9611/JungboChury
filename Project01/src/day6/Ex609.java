package day6;

import java.util.Scanner;

//1*2*3*4=?
public class Ex609 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("얼마를 누적곱 할까요? ");
		int num=sc.nextInt();
		int mul=1;
		for(int i=1;i<=num;i++) {
			mul*=i;
			
			
			if(i<num)
			{System.out.print(i);
			System.out.print("*");}
			
			if(i==num) {
				System.out.print(num+"=");
			}
			
			}
		System.out.println(mul);
		
	}
}
