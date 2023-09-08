package day6;
/*
 
 *
 **
 ***
 ****
 
 ****
 ***
 **
 *

  
 */
public class Ex610 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("=======");
		
		for(int m=1;m<=4;m++) {
			for(int n=5;n>m;n--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	
	}
}
