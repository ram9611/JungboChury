package day5;

public class Q512 {
	public static void main(String[] args) {
		//0 1 2 3 (for문)
		//0 1 2 3 (for-> while문)
		//0 1 2 3 (while->do~ while문)
		
		
		for(int i=0;i<=4;i++) {
			System.out.println(i);
		}
		
		int j=0;
		while(j<=4) {
			System.out.println(j);
			j++;
		}
	
		int i=1;
		do {
			System.out.println(i);
			i++;
		} while(i<=4);
		
		
		System.out.println("============");
		
		//1 4 7 10
		
		for(int k=1; k<=10;k+=3) {
			System.out.println(k);
		}
		
		int k=1;
		while(k<=10) {
			System.out.println(k);
			k+=3;
		}
		
		k=1;
		do {
			System.out.println(k);
			k+=3;
		}while(k<=10);
		
		System.out.println("============");
		
		
		//0 2 4 6 8
		
		for(int m=0;m<=8;m+=2) {
			System.out.println(m);
		}
		
		int m=0;
		while(m<=8) {
			System.out.println(m);
			m+=2;
		}
		
		m=0;
		do {
			System.out.println(m);
			m+=2;
		}while(m<=8);
		
		System.out.println("============");
		
		//100 90 80 70
		
		for(int n=100;n>=70;n-=10) {
			System.out.println(n);
		}
		
		int n=100;
		while(n>=70) {
			System.out.println(n);
			n-=10;
		}
		
		n=100;
		do {
			System.out.println(n);
			n-=10;
		}while(n>=70);
		
		System.out.println("============");
		
		//1 4 9 16 25 36
		int s=0;
		System.out.println(s);
		for(int l=3;l<=11;l+=2) {
			
			s=s+l;
			System.out.println(s);
			
			
		}
		
	}
}
