/*
 * [�ϱ�] �ڵ� ����ȯ ��Ģ
 *	6���� ������ Ÿ��(�ڷ���)
 * byte-> short-> int-> long-> float-> double(�Ǽ�)
 * 
 * 1	   2	 	4	 8         4      8
 * 
 * ex)
 * int num=5;
 * double num2=5 / int 5���� double 5.0���� �ڵ� ����ȯ
 * 
 * byte b=55;
 * short s=b;  / byte 55�� �ƴ� short 55�� s�� ��
 * 
 * double d=5.0;
 * long num=d; / double���� long���� ����ȯ X ->err
 * 
 * 
 * [�ϱ�] '��ĳ�� ��ü ����' ����
 * Scanner sc= new Scanner(System.in);
 * 
 * 
 * [�ϱ�] ��ĳ�� �̿��ؼ� ���� �� �ϳ� �Է�
 * "sc.nextInt()"
 */

package day2;

public class ex201 {
	public static void main(String[] args) {
		int a=33;
		double b=3.14;
		char c='��';
		System.out.printf("%d, %f, %c\n",a,b,c);
		
		System.out.println("=============");
		
		int x=5;
		int y=3;
		int z=x+y;
		System.out.println(z);
		System.out.println("=============");
		
		final double PI=3.14;
		int r=10;
		System.out.println(r*r*PI);
		
		
	}
}

}
