package day7;
//    *
//   **
//  ***
// ****
//*****
//

import java.util.Scanner;

public class Ex704 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n=sc.nextInt();
		
		for(int a=1;a<=n;a++) { // 1~n 증감반복 a를 통해 수행
			
			
			for(int b=n;b>=a;b--) { // n~a 감소 반복 b를 통해 수행, 반복되는만큼 공백 출력
				System.out.print(" ");
			}
			
			for(int c=1;c<=a;c++) { // 1~a 증감 반복 c를 통해 수행, 반복되는만큼 * 출력
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
