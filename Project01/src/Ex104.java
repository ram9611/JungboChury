/*
 * 변수의 자료형과 값의 자료형을 일치시켜 주세요.
 * 자료형. 데이터타입(data type)
 * 
 * 6가지 데이터 타입(자료형)<암기>
 * byte-> short-> int-> long-> float-> double(실수)
 * 
 * 1	  2	 	 4	  8             4      8
 * 
 * float, double(실수)
 * 4	    8
 * 
 * 
 * 자료형의 표현범위<정리>
 * byte: -128~+127 암기
 * short: -32768~32767
 * int: -21억쯤-21억쯤
 * ---> byte로는 128을 표현할 수 없다!
 * 
 */
public class Ex104 {
	public static void main(String[] args) {
		int num=5;
		
		double num2=5.15;
		
		//int num3=5.15;  double 값을 int형 변수에 담을 수 없음
		//Char ch="A"; err 문자형은 홀따옴표로!
		
		char ch1='A';
		String ch2="A";
		
		System.out.println(ch1+ch2);
		
	}
}
