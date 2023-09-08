package day6;

import java.util.Scanner;

public class Ex608 {
	public static void main(String[] args) {
		//연습 1부터 몇까지 더할까요?
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1부터 몇까지 더할까요?");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num-1;i++) {
			sum+=i;
			System.out.print(i);
			System.out.print("+");
			
			if(i==num-1)
				{System.out.print(num);
				System.out.print("=");}
		}
		
		System.out.println(sum);
	}
}
