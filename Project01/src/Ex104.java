/*
 * ������ �ڷ����� ���� �ڷ����� ��ġ���� �ּ���.
 * �ڷ���. ������Ÿ��(data type)
 * 
 * 6���� ������ Ÿ��(�ڷ���)<�ϱ�>
 * byte-> short-> int-> long-> float-> double(�Ǽ�)
 * 
 * 1	  2	 	 4	  8             4      8
 * 
 * float, double(�Ǽ�)
 * 4	    8
 * 
 * 
 * �ڷ����� ǥ������<����>
 * byte: -128~+127 �ϱ�
 * short: -32768~32767
 * int: -21����-21����
 * ---> byte�δ� 128�� ǥ���� �� ����!
 * 
 */
public class Ex104 {
	public static void main(String[] args) {
		int num=5;
		
		double num2=5.15;
		
		//int num3=5.15;  double ���� int�� ������ ���� �� ����
		//Char ch="A"; err �������� Ȧ����ǥ��!
		
		char ch1='A';
		String ch2="A";
		
		System.out.println(ch1+ch2);
		
	}
}
