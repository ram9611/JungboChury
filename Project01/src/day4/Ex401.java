package day4;

import java.util.Scanner;

/*
 *  단항연산자/삼항연산자
 * -단항연산자('항'이 하나) : 부호연산자(-), 증감연산자(--,++)
 * -삼항연산자: "조건식? 참(true):거짓(false) "
 * 
 * 
 * 
 * --->"num 입력 :" 출력하고 정수 값을 입력 받는 방식으로 변경.
 * 
 * 
 * 대입 연산자 : 오.정.왼.담.
 * 산술+대입연산자: += -= *= /= %=
 * 비교연산자: >>= <<= == =!
 * ex sysout(3!=4);
 * 연산의 결과가 boolean타입이다.
 * 
 * 
 * 
 */

public class Ex401 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // ctrl+shift+0
		
		System.out.println("숫자 입력");
		int num=sc.nextInt();
		System.out.println(-num); // -: 단항연산자(부호연산자) 
		//System.out.println(0-num); // -: 이항연산자(산술연산자)
		//-->이해: 부호연산자는 변수 num의 값을 바꾸는게 아니라 값(5)의 부호를 바꾸는 것. 즉, num을 건드린 적이 없음
		System.out.println(num); // 5?,5?
		
		int num2=10+num;
		char ch=(num2%2==1?'홀':'짝'); // num2 홀수라면 '홀' 아님 '짝'
		System.out.println(ch); // 홀
		
		
		// 추가 연습
		int a=15;
		int b=18;
		String max=(b>a?b:b==a?"동점":a);
		int min=(a<b?a:b);
		System.out.println("max: "+max);
		System.out.println("max: "+min);
		
	}
}
