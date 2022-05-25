import java.util.Scanner;
public class Task_2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int first = input.nextInt();
		System.out.print("Input second number: ");
		int second = input.nextInt();
		if (first == second) {
			System.out.print("The numbers are equal");
		}
		else {
			System.out.print("Numbers are not equal");
		}
	}

}
