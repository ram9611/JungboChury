package day2;
/*
 * [����]
 * AND ���� : �Ѵ� True���� True�̴�
 * (�� �´�) �׸��� (���� �ۿ� ������) 
 * &&(shift+7) ampersand
 * 
 * OR ���� : �� �߿� �ϳ��� True�̸� True
 * (�� �´�) �Ǵ� (���� �´�)
 * ||(shift+ \\) pipe
 * 
 */
public class Ex207 {
	public static void main(String[] args) {
		int a=5;
		//1) a�� 5�̰ų� 6�̳�?
		System.out.println((a==5)||(a==6)); // (a�� 5��) || (a�� 6�̳�)
		//System.out.println(a==5||6);  err
		
		//2) a�� 5�̰ų� 6�̰ų� 7�̳�?
		System.out.println((a==5)||(a==6)||(a==7));
	}
}
