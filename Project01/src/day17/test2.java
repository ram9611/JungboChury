package day17;

public class test2 {
	
	static void fibo(int cnt) {
		
		int a=1;
		int b=1;
		
		System.out.print(a+" "+b+" ");
		
		int i=2;
		
		while(true) {
		
			i++;
			
		int c=a+b;
		System.out.print(c+" ");
		
		a=b;
		b=c;
		
		if(i==cnt)
			break;
		
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		fibo(6);
		fibo(8);
		
	}
}
