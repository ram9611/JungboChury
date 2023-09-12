package day10;
/*
 * while문을 사용-> 1~20사이의 모든 3의 배수 출력
 * 
 * 
 */
public class Q1001 {
	public static void main(String[] args) {
		
		
		System.out.print("3의 배수 :");
		
		int i=0;
		while(i<=19) {
			
			i++;
			
			if(i%3==0)
				System.out.print(i+" ");
			
		}
		
		
	}
}
