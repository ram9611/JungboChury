package day8;
/*
 * 1부터 100까지의 정수 중 홀수만 출력.
 * 
 * 
 */
public class Q805 {
	public static void main(String[] args) {
		
		int i=0;
		while(i<100) {
			
			i++;
			if(i%2==1)
				System.out.print(i+" ");
			
		}
	}
}
