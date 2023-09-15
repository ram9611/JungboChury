package day12;

import java.util.Arrays;
import java.util.Scanner;

/*
 *Q1204.	좌석예약프로그램.
	(실행결과)
		--------------------
		1 2 3 4 5 6 7 8 9 10
		. . . . . . . . . .    // . : 비어있음(예약가능) / X : 예약불가능
		--------------------
		예약하시겠습니까? y (엔터)      // 또는 Y
		예약할 좌석번호 입력 : 7 (엔터)
		예약되었습니다.

		--------------------
		1 2 3 4 5 6 7 8 9 10
		. . . . . . X . . .  
		--------------------
		예약하시겠습니까? y (엔터)     
		예약할 좌석번호 입력 : 7 (엔터)
		이미 예약된 좌석입니다. 다시 입력해주세요.
		예약할 좌석번호 입력 : 6 (엔터)
		예약되었습니다.

		--------------------
		1 2 3 4 5 6 7 8 9 10
		. . . . . X X . . .  
		--------------------
		예약하시겠습니까? n (엔터)        // 또는 N
		끝.

 * 
 * 
 * boolean 변수 이용
 * equal, equalsIgnoreCase 이용가능
 * 
 * 
 */
public class Q1204 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String[] seat=new String[10];
		
		for(int i=0;i<seat.length;i++) {
			
			seat[i]=".";
			
		}
		
		
		while(true) {
		
		System.out.println("====================");    // 시트 현 상황 출력
						                               //
		for(int i=0;i<=1;i++) {
			
			
			
			for(int j=0;j<seat.length;j++) {
			if(i==0)
			System.out.print(j+1+" ");
			if(i==1)
			System.out.print(seat[j]+" ");
		}
		
		System.out.println();
	}
		
		System.out.println("====================");
		
		
		System.out.print("예약하시겠습니까? ");
		String s=sc.next();
		char ch=s.charAt(0);
		
		if(ch=='n'||ch=='N') 
		break;
		
		if(ch=='y'||ch=='Y') {
			
			while(true) {
			
			System.out.print("예약할 좌석번호 입력 : ");
			int num=sc.nextInt();
			
			if(seat[num-1]==".") {
			seat[num-1]="x";
			System.out.println("예약되었습니다");
			break;
			}
			
			if(seat[num-1]=="x") {
				
				System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요");
				
			}
			
			}
			
		}
		
		
		
		
		}
		
		
		
		System.out.println("예약프로그램을 마치겠습니다 꾸벅");
	}
}
