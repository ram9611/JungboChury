package day7;

import java.util.Scanner;

/*

*****
 ****
  ***
   **
    *	




 */
public class Ex703 {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) { // 행을 나타내는 i를 이용하여 출력한다
			
			for(int j=0;j<i-1;j++) {
				System.out.print(" "); //공백 출력
			}
			
			for(int k=n;k>=i;k--) {
				System.out.print("*"); //별표 출력
			}
			System.out.println();
		}
		
		
	}
}
