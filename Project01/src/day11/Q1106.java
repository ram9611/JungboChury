package day11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 크기가 10인 정수형 배열 만들고
 * 여기에 0이상 9이하의 정수로 채우고 출력한 후
 * 정수 값 하나 입력 받아서
 * 이 값이 배열에 존재하는 지 여부를 출력
 * 
 */
public class Q1106 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd=new Random();
		
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=rd.nextInt(10);
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(num==arr[i])
				count++;
			
		}
		
		if(count>0) 
			System.out.println(num+"은(는) 배열에 있습니다");
		else
			System.out.println(num+"은(는) 배열에 없습니다");
		
	}
}
