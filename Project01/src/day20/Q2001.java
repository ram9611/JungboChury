package day20;

import java.util.Arrays;

public class Q2001 {
	public static void main(String[] args) {
		
		int arr[][]=new int[3][3];
		int i = 0;
		int j = 1;
		int cnt=0;
		cnt++;
		arr[i][j]=cnt;
		
		while(true) {
			cnt++;
			i--;
			j++;
			
			if(i==-1)i=2;
			if(j==3)j=0;
			
			arr[i][j]=cnt;
			
			if(cnt==9);
			break;
			
		}
		for(int k=0;k<arr.length;k++) {
		System.out.println(Arrays.toString(arr[k]));}
	}
}
