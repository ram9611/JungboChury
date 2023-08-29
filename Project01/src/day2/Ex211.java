package day2;
/*
 * [암기] for(int i=1; i<=4; i++){
 * 			...
 * }
 * 
 * 
 */
import java.util.Scanner;

public class Ex211 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int a=sc.nextInt();
		
		// num: 0, -, +
		
		if(a==0) {
			System.out.println("0이다");
		} else if(a>0) {
			System.out.println("양수이다");
		} else {
			System.out.println("음수이다");
		}
		
		
		
		
		/*if(a%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}*/
		
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=i+sum;
		}
		System.out.println(sum);
		
	}
}
