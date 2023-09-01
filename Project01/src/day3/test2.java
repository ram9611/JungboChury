package day3;
/*
 * 이진법 연습기
 * 
 */

public class test2 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			int num=0;
			String s="";
			for(int j=0;j<=7;j++) {
				num=(int)((Math.random()*10000)%10);
				s+=num;
			}
			System.out.println(i+")"+s);
		}
	}
}
