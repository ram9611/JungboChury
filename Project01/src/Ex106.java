/*
 * ������ ���
 * 
 * ���� : ���� ���� �� �ִ�.
 * 		������ Ÿ�� �����̸�(����)
 * 
 * ��� : �׻� �� ���̴�.
 * 		������ ���� �տ� Final(����)
 */
public class Ex106 {

	public static void main(String[] args) {
		
		int a=5;
		a=10;
		System.out.println(a);	//10
		
		
		final int b=5;	// b�� ���: ����� ���� �� �� �ٽ� �ٲ� �� ����!
		//b=10;				����� ���� ������ �� ����
		System.out.println(b);	//15
		
		//�����, ����� �̸��� ��ü �빮�ڷ� ���� ������� ����.
		final double PI=3.141592;
		
		
	}

}
