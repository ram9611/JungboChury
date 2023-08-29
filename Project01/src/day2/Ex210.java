package day2;
/*
 * ���� ������( ? : ) 
 * �ǿ����� 3�� ex) 5+2->���� ������ / -3-> ���� ������
 * 
 * ����:
 * __���ǽ�___?___1___:____2___
 * 
 * ���ǽ� true�̸� ��ü�� 1�� �ٲ�
 * ���ǽ� false�̸� ��ü�� 2�� �ٲ�
 * 
 * ���ǹ�: 1)if�� 2)switch��
 * 
 * [���] if(���ǽ�) {___(a)___}
 * -->(a)�� ����� ���� : ���ǽ��� true�� ��
 * 
 * [���] if(���ǽ�){__(a)___} else(___(b)___)
 * --->(a)�� ����� ���� : ���ǽ��� true�� ��
 * 	   (b)�� ����� ����: ���ǽ��� false�� ��
 * 
 * [���]if(���ǽ�){__(a)___} else if(���ǽ�2)(___(b)___) else{__(c)___}
 * --->(a)�� ����� ����: ���ǽ� 1�� true�ϰ�
 * 	   (b)�� ����� ����: ���ǽ�1�� true�� ��, ���ǽ�2�� false�� ��
 * 	   (c)�� ����� ����: ���ǽ�1, ���ǽ�2 false�� ��
 * 
 */

public class Ex210 {
	public static void main(String[] args) {
		
		int num=7;
		System.out.println(num%2==0? "¦��":"Ȧ��");
		//(7%2==0?)
		//(1==0?)
		//(false?-->Ȧ��)
		
		char ch=(num%2==0? '¦':'Ȧ');
		System.out.println(ch+"��");
		
		System.out.println("========");
		
		// Ex) a�� 1�Ǵ� 4 �Ǵ� 7�̰�, b�� 0���� ũ��?
		int a=1;
		int b=2;
		
		boolean tf=(a==1||a==4||a==7) && (b>0);
		System.out.println(tf);
		
	}
}