import java.util.Scanner;
public class Task_2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int first = input.nextInt();
		System.out.print("Input second number: ");
		int second = input.nextInt();
		if (first != second) {
			System.out.printf("Ascending: %d, %d", (Math.min(first, second)), (Math.max(first, second)));
			System.out.printf("\nDescending: %d, %d", (Math.max(first, second)), (Math.min(first, second)));
		}
		else {
			System.out.print("The numbers are equal");
		}
	}

}
