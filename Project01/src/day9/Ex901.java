package day9;
/*
 * 피보나치 수열
 * 1 1 2 3 5 8 13 ...
 * 
 */
public class Ex901 {
	public static void main(String[] args) {
	
			
		int a=1;
		int b=1;
		
		System.out.print(a+" "+b+" "); // 초기값 1 1 입력
		
		while(true) {
			
			int c=a+b;
			
			System.out.print(c+" ");// 1 1 2 3출력 
			
			if(c>100)
				break;
			
			a=b; //a=1
			b=c; //b=2
			
		}
		
		}
		
	}

