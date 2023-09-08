package day8;
/*
 * 1~100까지 정수 중 소수만 출력
 * 
 * 
 */
public class Q801 {
	public static void main(String[] args) {
		
		
		
		
		for(int i=1;i<=100;i++) { // for문으로 1-100까지 정수 생성
			
			int count=0;
			
			for(int j=1;j<=i;j++) { // i로 선언된 1-100을 j로 선언된 1~i까지 나머지 연산 수행, 나머지 연산 결과 0이라면 카운트 수행 
				
				if(i%j==0) {
					count++;
				}
				
				}
			if(count==2) // 카운트 두번 수행되었다면 소수로 판단, 출력 수행
			System.out.print(i+" ");
			
			
		}
		
	}
}
