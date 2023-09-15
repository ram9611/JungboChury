package day12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 몇 과목인가요? 4
 * 과목1의 점수 입력 : 80
 * 과목2의 점수 입력 : 90
 * 과목3의 점수 입력 : 100
 * 과목4의 점수 입력 : 70
 * 
 * 총점 : 340
 * 평균 : 85
 * 
 */
public class Q1201 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇 과목인가요?");
		int num=sc.nextInt();
		
		int[] score=new int[num];
		
		for(int i=0;i<score.length;i++) {
			
			System.out.print("과목"+(i+1)+"의 점수 입력 : ");
			score[i]=sc.nextInt();
			System.out.println();
			
		}
		
		System.out.println(Arrays.toString(score));
		
		int sum=0;
		
		for(int n: score) {
			
			sum+=n;
		}
		
		
		System.out.println("총점 : "+sum);
		System.out.println("총점 : "+(int)(sum/num));
	}
}
