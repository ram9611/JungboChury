package day11;

import java.util.Random;

/*
 * 5개의 정수를 담을 수 있는 배열을 만들고,
 * 난수발생(1~10)해서 5개의 정수를 랜덤하게 배열에 채운 후
 * 
 * 1) 반복문 사용해서 모든 요소를 출력하되, 이런 형식으로
 * 		ex) 3 9 8 4 5
 * 
 * 2) 이 배열에서 홀수의 개수와 짝수의 개수를 출력
 * 		ex)홀수는 3개 짝수는 2개
 * 
 * 
 * 
 */
public class Q1105 {
	public static void main(String[] args) {
		
		Random rd=new Random();
		
		int[] num=new int[5]; 
		
		for(int i=0;i<num.length;i++) {
			
			//num[i]=(int)(Math.random()*9+1);
			num[i]=rd.nextInt(10);
			
			if(i==num.length)
				System.out.print(num[i]);
			else
				System.out.print(num[i]+" ");
			
		}
		
		System.out.println();
		
		int even=0; // 짝수의 개수
		int odd=0; // 홀수의 개수
		
		for(int n: num) {
			
			if(n%2==0)
				even++;
			else
				odd++;
			
		}
		
		System.out.println("홀수는 "+odd+"개, 짝수는 "+even+"개");
		
	}
}
