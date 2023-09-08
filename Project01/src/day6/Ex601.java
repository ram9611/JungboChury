package day6;

public class Ex601 {
	public static void main(String[] args) {
		//0 1 2 3
		for(int i=0;i<=3;i++) {
			System.out.println(i);
		}
		
		
		int i=0;
		while(3<=3) {
			System.out.println(i);
			i++;
		}
		
		 i=0;
		do{
			System.out.println(i);
			i++;
		}while(i<=3);
			
			
			
		//6 5 4 3 2
		for(int j=6;j>=2;j--) {
			System.out.println(j);
		}	
		
		int j=6;
		while(j>=2) {
			System.out.println(j);
			j--;
		}
		
		j=6;
		do {
			System.out.println(j);
			j--;
		} while(j>=2);
			
			
			
		//0 2 4 6 8
		for(int k=0;k<=8;k+=2) {
			System.out.println(k);
		}
		
		int k=0;
		while(k<=8) {
			System.out.println(k);
			k+=2;
		}
		
		k=0;
		do{System.out.println(k);
			k+=2;
		}while(k<=8);
			
		//1 4 7 10
		for(int l=1;l<=10;l+=2) {
			System.out.println(l);
		}
		
		int l=1;
		while(l<=10) {
			System.out.println(l);
			l+=3;
		}
		
		l=1;
		do{
			System.out.println(l);
			l+=3;
		} while(l<=10);
		
		//100 90 80 70
		for(int x=100;x>=70;x-=10) {
			System.out.println(x);
		}
		
		int x=100;
		while(x>=70) {
			System.out.println(x);
			x-=10;
		}
		
		x=100;
		do{
			System.out.println(x);
			x-=10;
		} while(x>=70);
			
			
		//1 4 9 16 25 36
		for(int y=1;y<=6;y++) {
			System.out.println(y*y);
		}
		
		int y=1;
		while(y<=6) {
			System.out.println(y*y);
			y++;
		}
		
		y=1;
		do{
			System.out.println(y*y);
			y++;
		} while(y<=6);
		
	}
}
