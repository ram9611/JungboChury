package day5;
/*
 * 조건문 if, switch
 * 1)(조건식){...}---> 실행될 조건은?
 * 	= if문의 조건식이 true일 것.
 * 
 * 2)if(조건식){..a.} 
 * 	else{..b.}
 * 	---> a 실행될 조건, b 실행될 조건
 * 
 * 3) if(조건식1){...c}
 * 	else if(조건식2){...d}
 * 	else{...e}
 * 	--->c가 실행될 조건: 조건식 1 true일때, 
 * 		d가 실행될 조건: 조건식 1 false이고 조건식 2 true일 때, 
 * 		e 실행될 조건: 조건식1, 조건식2 모두 false일 때
 * 		
 * 4) if(조건식1){...c}
 * 	  if(조건식2){...d}
 * 	  else{...e}
 * 
 * if문
 * 90점 이상 100점 이하: A
 * 80,90:B
 * 70,80:C
 * 60,70:D
 * 60미만:F 
 * 
 * 
 * Switch문
 * ex)
 * switch(변수){
 * 		case 값1: ...a; break;
 * 		case 값2: ...b; break;
 * 		case 값3: ...c;	break;
 * a 실행조건? 변수의 값이 값1일 것 
 * b 실행조건? 변수의 값이 값2일 것 
 * c 실행조건? 변수의 값이 값3일 것 
 * }
 * 
 */

import java.util.Scanner;

public class Ex504 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요(0-100) : ");
		int score=sc.nextInt();
		score/=10; //또는 score=score/10;
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else(score<=60) {
			System.out.println("F");
		}
		
	}
}
