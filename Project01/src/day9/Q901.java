package day9;

import java.util.Scanner;

/*Q901.	연습(고급).
- 암산게임.
- 한 자릿수인 두 수(a,b)를 난수발생, 연산자(+,-,*,/)를 난수발생 -> 정답을 맞히는 게임.
- 정답이 소수점이 나오지 않도록 난수발생(ex. 4/3 --> 다시 난수발생)
- 0으로 나누는 문제가 나오지 않도록 난수발생
- 다섯 문제를 모두 풀면, 몇 문제를 맞혔는지 출력하고 끝.
(실행결과의 예)
	1번. 5 + 3 = 8 (엔터)
	2번. 7 - 2 = 4 (엔터)
	3번. 4 / 2 = 2 (엔터)
	4번. 7 * 3 = 21 (엔터)
	5번. 8 / 1 = 8 (엔터)
	5문제 중 4문제 정답!*/

public class Q901 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int correct=0;
		int circle=0;
		
		
		
		while(true) {
			
			circle++;
		
		int num1=0;
		int num2=0;
		
		
		num1=(int)(Math.random()*8+1);
		num2=(int)(Math.random()*8+1);
		
		
		int oper=(int)(Math.random()*3);
		
		int result=0;
		int u_result=0;
		
		switch(oper) {
		
		case 0:
			result=num1+num2;
			System.out.print(num1+"+"+num2+"=");
			 u_result=sc.nextInt();
			if(result==u_result)
				correct++;
			break;
			
		case 1:
			result=num1-num2;
			System.out.print(num1+"-"+num2+"=");
			 u_result=sc.nextInt();
			if(result==u_result)
				correct++;
			break;	
		
		case 2:
			result=num1*num2;
			System.out.print(num1+"*"+num2+"=");
			 u_result=sc.nextInt();
			if(result==u_result)
				correct++;
			break;		
			
		case 3:
			
			if(num1%num2==0) {
			result=num1/num2;
			System.out.print(num1+"/"+num2+"=");
			 u_result=sc.nextInt();
			if(result==u_result)
				correct++;
			break;	} else {
				break;
			}
		
		}
		
		if(circle==5) {
			System.out.print("5문제 중 "+correct+"개 정답");
			break;
			
		}
		
		}
	}
}
