package day8;

import java.util.Scanner;

/*
 * (고급)
 * 
 * 세 자릿수인 소수를 난수 발생해서,
 * 그 다음번 소수를 맞히는 게임.
 * 
 * 소수 제시: 541
 * 541의 다음번 소수 : ___
 * 
 * 541의 다음번 소수 : 546
 * 틀렸습니다!
 * 
 * 541의 다음번 소수 : 547
 * 맞았습니다!
 * 
 */
public class Q803 {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int count_1=0;
		
		while(true) {
			
			int num=(int)(Math.random()*900)+100;
			for(int i=1;i<=num;i++) {
				
				if(num%i==0)
					count_1++;
				}
			
			if(count_1==2)
				break;
		}
		
		
		System.out.println(num);
		
		/*while(true) {
		int num=(int)(Math.random()*900)+100;
		
		
		
		if(num) {
			
			int count=0;
			
			System.out.println("소수 제시: "+num);
			System.out.print(num+"의 다음번 소수: ");
			int N_P_num=sc.nextInt();
			
			
			for(int i=1;i<=N_P_num;i++) {
				
				if(N_P_num%i==0) {
					count++;
				}
				
			}
		
			if(count==2)
				{System.out.println("맞았습니다!");
				break;
				}else {System.out.println("틀렸습니다!");
				break;
				}
			
			
		}
		}*/
		
		
		
	}
}
