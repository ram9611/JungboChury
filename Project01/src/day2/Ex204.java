package day2;
/*
 * ���������(+ / - *  %)
 * 
 * "���Կ�����"(=)
 * 
 * [����] ������ ������(/)
 * 1) 5/3---> (������ ������)
 * 2) 5.0/3.0 --->(�Ǽ��� ������)
 * 3) 5.0/3--->�Ǽ�
 * 4) 5/3.0--->�Ǽ�
 * 
 */
public class Ex204 {
	public static void main(String[] args) {
		double a=3;
		int b=2;
		System.out.println(a+b); //5? 5.0? ������ Ÿ�� ��ġ�� �ʿ�->int 2�� double 2.0���� �ڵ� ����ȯ
		
		// a+b���� ���� sysout�� �� ����
		
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("==========");
		
		int num=7237;
		
		//1�� �ڸ�
		System.out.println(num%10);
		//100�� �ڸ�
		System.out.println(num/100%10);
		//100�� �ڸ�
		System.out.println(num/100);
	}
}
