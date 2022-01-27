import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		char input = sc.next();
		
		

		int result;
		switch (input) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		
		case '*':
			result = su1 * su2;
			break;
		
		case '/':
			try {
				result = su1 / su2;
			} catch (Exception e) {
				System.out.print("자료형 다름");
			}
			
			break;		
		}
		
		
	}
}
