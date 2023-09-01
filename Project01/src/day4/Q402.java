package day4;

import java.util.Scanner;

/*
 * 화씨 온도를 입력하세요 : 100
 * 화씨 100도--->섭씨 37.7도\
 * 소수점 첫째 자리까지만 출력
 * 
 * 
 */
public class Q402 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in); // 스캐너 객체 생성
		
		float C1; // 실수형 float 변수 선언
		float C2;
		int i1;
		float C3;
		float C4;
		
		System.out.print("섭씨 온도 입력 :");
		int F=sc.nextInt(); // 정수형 변수 선언 후 스캐너 입력 받기
		
		C1=(float) (0.5555555555556*(F-32)); // 입력받은 값 
		i1= (int)C1; //
		System.out.println(i1);
		C3=C1%i1;
		System.out.println(C3);
		C4=C3/10;
		System.out.println(C4);
		
		C2= C1/(float) 100;
		float result=i1+C3-C4;
		
		
		System.out.println("화씨 온도 출력 : "+result);
		
	}
}
