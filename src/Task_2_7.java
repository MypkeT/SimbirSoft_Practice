import java.util.Scanner;
public class Task_2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit number: ");
		int number = input.nextInt();
		if (number > 99 && number < 1000) {
			int third = number % 10;
			int second = number / 10 % 10;
			int first = number / 100 % 10;
					
			if (number > 500) {
				System.out.printf("The number is %d%d%d", third, second, first);
			}
			else {
				System.out.printf("The number is %d%d%d", first, third, second);
			}
		}
	}

}
