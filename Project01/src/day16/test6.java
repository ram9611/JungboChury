package day16;
/*
 * 
 * - 피보나치 수열 (+응용)
 */
public class test6 {
	public static void main(String[] args) {
		
		int a=1;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		int i=2;
		
		while(i<10) {
			
			i++;
			
			 int c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
