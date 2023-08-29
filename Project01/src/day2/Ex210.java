package day2;
/*
 * 삼항 연산자( ? : ) 
 * 피연산자 3개 ex) 5+2->이항 연산자 / -3-> 단항 연산자
 * 
 * 역할:
 * __조건식___?___1___:____2___
 * 
 * 조건식 true이면 전체를 1로 바꿔
 * 조건식 false이면 전체를 2로 바꿔
 * 
 * 조건문: 1)if문 2)switch문
 * 
 * [사용] if(조건식) {___(a)___}
 * -->(a)가 실행될 조건 : 조건식이 true일 것
 * 
 * [사용] if(조건식){__(a)___} else(___(b)___)
 * --->(a)가 실행될 조건 : 조건식이 true일 것
 * 	   (b)가 실행될 조건: 조건식이 false일 것
 * 
 * [사용]if(조건식){__(a)___} else if(조건식2)(___(b)___) else{__(c)___}
 * --->(a)가 실행될 조건: 조건식 1이 true일것
 * 	   (b)가 실행될 조건: 조건식1이 true일 것, 조건식2이 false일 것
 * 	   (c)가 실행될 조건: 조건식1, 조건식2 false일 것
 * 
 */

public class Ex210 {
	public static void main(String[] args) {
		
		int num=7;
		System.out.println(num%2==0? "짝수":"홀수");
		//(7%2==0?)
		//(1==0?)
		//(false?-->홀수)
		
		char ch=(num%2==0? '짝':'홀');
		System.out.println(ch+"수");
		
		System.out.println("========");
		
		// Ex) a가 1또는 4 또는 7이고, b는 0보다 크냐?
		int a=1;
		int b=2;
		
		boolean tf=(a==1||a==4||a==7) && (b>0);
		System.out.println(tf);
		
	}
}
