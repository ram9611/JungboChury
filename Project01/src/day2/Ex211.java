package day2;
/*
 * [�ϱ�] for(int i=1; i<=4; i++){
 * 			...
 * }
 * 
 * 
 */
import java.util.Scanner;

public class Ex211 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int a=sc.nextInt();
		
		// num: 0, -, +
		
		if(a==0) {
			System.out.println("0�̴�");
		} else if(a>0) {
			System.out.println("����̴�");
		} else {
			System.out.println("�����̴�");
		}
		
		
		
		
		/*if(a%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}*/
		
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=i+sum;
		}
		System.out.println(sum);
		
	}
}
