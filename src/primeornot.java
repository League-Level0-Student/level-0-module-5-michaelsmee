import javax.swing.JOptionPane;

public class primeornot {
	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("What number?");

		int x2 = Integer.parseInt(x);

		for (int x21 = 2; x21 <= x2 / 2; x21++) {
			if (x2 % x21 == 0) {
				System.out.println("not prime");
				System.exit(0);
			}
		}
		System.out.println("is prime");
	}
}
