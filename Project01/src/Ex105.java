/* ������ ǥ������
 * ++, --
 * ex) int num=5;
 * 			num++; // num�� ���� 1 ����
 * 			syso(num);
 * 
 * 
 */
public class Ex105 {

	public static void main(String[] args) {
		byte b=127;
		System.out.println(b);
		
		b++;	// overflow (����)
		System.out.println(b);//128----> -128 [���]
		
		// 1) byte Ÿ���� ������ ����� 128�� ǥ���� �� ����!
	}

}
