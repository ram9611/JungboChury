package day19;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q1703.	첫 번째 파라미터로 int형 배열(arr)을
	두 번째 파라미터로 int값(key)을 받아서,
	그 배열에 그 값(key)이 존재하는지 여부를 리턴하는 메서드
	contains() 를 작성해 보세요.
	배열에 그 값이 존재하면 true를, 아니면 false를 리턴하도록 합니다.
		static boolean contains(int[] arr, int key)

	작성한 contains() 메서드를 테스트하는 코드를
	main()에 적당하게 작성해보세요.
 * 
 * 
 */
public class Q1903 {
	
	static boolean contains(int[]arr,int num) {
		
		
		for(int i=0;i<arr.length;i++) {
		
			if(arr[i]==num)
				return true;
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[3];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*10+1);
			
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.print("key 값 입력: ");
		int num=sc.nextInt();
		
		boolean check=contains(arr,num);
		
		
		if(check)
			System.out.println("배열안에 값이 존재합니다.");
		else
			System.out.println("배열안에 값이 존재하지 않습니다.");
	}
}
