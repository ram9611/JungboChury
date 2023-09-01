package day3;

public class test {
	public static void main(String[] args) {
		char c=65;
		int i=c;
		System.out.println(i);
		
		//short s=c; err 표현범위가 다름
		
		//byte b=65;
		//c=b; err 표현범위가 다름
		
		float f=0x4048f5c3;
		System.out.println(f);
		
		//0x4048f5c3;--->3.14;
		
		//정수는 int로 만들어지고, 실수는 double로 만들어진다. 
		long num=2_200_000_000L;
		System.out.println(num);
	}
}
