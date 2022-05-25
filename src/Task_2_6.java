import java.util.Scanner;
public class Task_2_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a two-digit number: ");
		int number = input.nextInt();
		if (number > 9 && number < 100 ) {
			int second = number % 10;
			int first = number / 10 % 10;
			if (first > second) {
				System.out.printf("%d > %d", first, second);
			}
			else if (first < second) {
				System.out.printf("%d < %d", first, second);
			}
			else { }
		}

	}

}
