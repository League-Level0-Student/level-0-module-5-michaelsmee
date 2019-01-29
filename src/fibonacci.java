
public class fibonacci {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int x;

		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i < 12; i++) {
			x = num1 + num2;
			System.out.println(x);
			num1 = num2;
			num2 = x;
		}

	}
}
