/*
 * 5 vs 5.0?
 * 
 * ���� (ex.5)---> int
 * �Ǽ� (ex. 5.0)-->double
 * ���ڿ� : ���ڵ��� ����---> ����ǥ(")�� ��� String
 * ���� : �� ���� -----> Ȭ����ǥ(')-->char
 * 
 */
public class Ex102 {

	public static void main(String[] args) {
		int n=5; //(ǥ�� ����) "������ ����� ���ÿ� �ʱ�ȭ"
		System.out.println("n: "+n);
		
		double n2=5.0; //5.0->5�� ���ĵ� ���� ����
		System.out.println("n2: "+n2);
		
		double n3=5; //5.0->5�� ���ĵ� ���� ����
		System.out.println("n2: "+n3);

		String s ="abc";
		System.out.println("s : "+s);
		
		char c='A'; // �� ����(����)
		System.out.println(c);

	}

}
