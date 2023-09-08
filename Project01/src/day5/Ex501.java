package day5;
/*
 * 
 * 
 * 
 */

public class Ex501 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=15;
		//int max=(a 최대값)? a:(b,c가 최대값);
		int max=(a>b && a>c)? a:(b>c)?b:c;
		//int max=a>b? a:b;
		//System.out.println("최대 값: "+max);
		
		/*int max;
		
		if(a>b)
			max=a;
		else
			max=b;
		System.out.println(max);*/
		
		
	}
}
