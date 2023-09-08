package day8;

import java.util.Scanner;

/*
 * 변수를 하나받고, 소수를 n개 출력 //2부터시작
 * 
 * 변수 입력 : 6
 * 2 3 5 7 11 13
 * 
 * 
 */
public class Q802 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("변수 입력 : ");
		int num=sc.nextInt();
		
		int i=1; // 무한 반복문에서 사용되는 소수 판별을 위한 변수 선언 및 초기화
		int n_cnt=0; // 소수 판별시 카운트 되는 변수 선언 및 초기화
		
		while(true) {
			
			int count=0; // for문에서 i%j==0 성립시 카운트를 위한 변수 선언 및 초기화
			
			i++; //2부터 시작
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0)
					count++; // i%j==0 성립시 카운트
			}
			
			if(count==2) // for문 완료 후 카운트 2개 되었다면 소수갯수 카운트 및 변수 출력
			{
				n_cnt++;
				System.out.print(i+" ");
				
				
				if(n_cnt==num) // 스캔으로 선언된 변수와 소수갯수 카운트 동일하다면 무한 반복문 탈출 및 종료
					break;
			}
			
			
			
		}
		
	}
}
