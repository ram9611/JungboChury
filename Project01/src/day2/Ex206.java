package day2;
/*
 * �� ������ --> ������ ���, true �Ǵ� false
 *  > <(ũ�� �۳�) 
 *  >= <= (�̻��̳� ���ϳ�)
 *  == != (���� �ٸ���) 
 *  
 *  
 *  [�ϱ�] 8���� �⺻ ������ Ÿ��(primitive)
 *  
 *  byte short int long float double char boolean
 *   1    2     4   8    4      8      2    1
 *  *. char�� ǥ�� ����(����) : 0-655535
 *  *. short�� ǥ�� ����(����) : -32768~32767
 *  *. boolean�� ǥ������ : true, false
 *  
 *  
 *  
 */
public class Ex206 {
	public static void main(String[] args) {
		int a=3;
		int b=2;
		System.out.println(a>b); // ����� true�� ��ü
		System.out.println(a<=b); // ����� false�� ��ü
	}
}
