package day6;

import java.util.Scanner;

public class Ex607 {
	public static void main(String[] args) {
		/*
		 * 입력: 4
		 * _
		 * __
		 * ___
		 * ____
		 * 
		 */
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("입력: ");
		 int num=sc.nextInt();
		 
		
		for(int i=1;i<=num;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("_");
			}
			System.out.println(" ");
		}
		
		System.out.println("========");
		
		int count=0;
		for(int m=1;m<=num;m++) {
			for(int n=0;n<m;n++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("========");
		
		int count_2=0;
		for(int x=1;x<=num;x++) {
			for(int z=0;z<x;z++) {
				count_2++;
				System.out.print("0"+count_2+" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
