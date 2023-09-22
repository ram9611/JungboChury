package day15;

public class Ex1508 {
	
	static void printStars(int a,String s) {
		
		for(int i=0;i<a;i++) {
			System.out.print(s);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		printStars(4,"*"); // ****
		System.out.println();
		printStars(6,"o"); // oooooo
		
	}
}
