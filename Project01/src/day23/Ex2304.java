package day23;
/*
 * add
 * size() --> 배열.length
 * get(인덱스)--> .get(인덱스)-->배열[인덱스]
 * remove(인덱스)
 */
import java.util.ArrayList;

public class Ex2304 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		
		list1.add(40);
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		list1.remove(2);
		System.out.println(list1);
	}
}
