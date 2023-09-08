package day5;

import java.util.Scanner;

/*
 * 고급
 * switch문을 이용한 계산기
 * 정수1 입력: 3
 * 연산자 입력: +
 * 정수2 입력: 5
 * 출력: 3+5=8
 * 
 * switch문을 이용한 계산기(2)
 * 수1 입력 : 3
 * 연산자 입력: +
 * 수2 입력: 5.5
 * 3+5.5=8.5
 * 
 * 수1 입력: 3.5
 * 연산자 입력: -
 * 수2 입력:2.5
 * 3.5-2.5=1
 * 
 * 
 */
public class Q510 {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int I_num1=0;
			int I_num2=0;
			
			System.out.print("정수1 입력: ");
			double num1=sc.nextDouble();
			
			if(num1%1==0)
				I_num1=(int)num1;
			
			System.out.print("연산자 입력: ");
			String s=sc.next();
			char oper=s.charAt(0);
			
			System.out.print("정수2 입력: ");
			double num2=sc.nextDouble();
			if(num2%1==0)
				I_num2=(int)num2;
			
			
			
			switch(oper) {
			
			
			case '+':
				double sum=num1+num2;
					
				if(sum%1==0) 
				System.out.printf("%d + %d= %d",num1,num2,(int)sum);
				else
				System.out.printf("%f + %f=%f",num1,num2,sum);
				
				break;
				
				
			
			
			}
			
		}

}
