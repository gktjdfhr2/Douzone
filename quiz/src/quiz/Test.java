package quiz;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list[] = new ArrayList[8];

		for(int i=1; i<=7; i++) {
            list[i] = new ArrayList<Integer>();
        }
		
		list[1].add(6);
		list[1].add(4);
		list[2].add(1);
		list[2].add(3);
		list[3].add(6);
		list[3].add(5);
		list[4].add(1);
		list[4].add(2);
		list[1].add(7);

		for(int item : list[1]) {
			System.out.println("item = " + item);
		}
		
		
	}
}
