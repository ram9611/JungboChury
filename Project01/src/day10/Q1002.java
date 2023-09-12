package day10;
/*
 * 
 * 1~100사이의 모든 소수를 출력 합
 */
public class Q1002 {
	public static void main(String[] args) {
		
		
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			
			int count=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0)
				count++;
				
			}
			
			if(count==2) {
				sum+=i;
				System.out.print(i+" ");
			}
			
		}
		
		
		System.out.println();
		System.out.print("1~100사이의 모든 소수 합 : "+sum);
		
	}
}
