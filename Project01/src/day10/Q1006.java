package day10;
/*
 * 난수 발생
 * 1) 0~9 10개 한줄에
 * 2) 1~5 10개 한줄에
 * 3) -5~+5 10개 한줄에
 * 
 * 
 */
public class Q1006 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.print((int)(Math.random()*9)+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			
			System.out.print((int)(Math.random()*5)+1+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			
			
			int num1=(int)(Math.random()*11)-5;
			
			System.out.print(num1+" ");
		}
		
		
	}
}
