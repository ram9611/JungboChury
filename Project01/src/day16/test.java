package day16;

import java.util.Random;

/*
 * 
 * - 난수발생 --> 'Random 클래스' 방식. / 일정 범위의 정수 난수 발생.
 * 
 */
public class test {
	public static void main(String[]args){
		
		Random rd= new Random();
		
		int num1=rd.nextInt(10); //0-9
		System.out.println(num1);
		
		
	}

}
