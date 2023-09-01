package day2;
/*
 * 증감연산자(++,--)
 * 
 * 
 */
public class Ex209 {
	public static void main(String[] args) {
		int num=5;
		num++;
		System.out.println(num); //6
		
		++num;
		System.out.println(num); //7
		
		num--;
		System.out.println(num); //6
		
		--num;
		System.out.println(num); //5
		
		System.out.println("========");
		
		int num2=num++; // 중요
		System.out.println(num2); //5
		//int num2= num; -> num=5 num2=5
		//++ -> num=6
		
		int num3=++num; // 중요
		System.out.println(num3); //7
		// ++ -> num=7
		// int num3= num; num=7 num3=7
		
		System.out.println("========");
		
		int num4=num--;
		System.out.println(--num4); // 6
		//int num4=num; -> num4=7
		//num4=6
		
	}
}
