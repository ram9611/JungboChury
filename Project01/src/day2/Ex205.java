package day2;
/*
 * ��� + ���Կ�����
 * += -= *= /= %=
 * 
 * 
 */

public class Ex205 {
	public static void main(String[] args) {
		int a=3;
		int b=2;
		a+=b; // ó������ �̷���: a=a+b;��� �ǹ�
		System.out.println(a);
		
		
		a*=b;
		System.out.println(a); // a=a*b -> 10
		
		
		b/=10;
		System.out.println(a); // b=b/10 -> 0
	}
}
