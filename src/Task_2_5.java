import java.util.Scanner;
public class Task_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int value = input.nextInt();
		if (value < 0) {
			System.out.printf("The square of the entered number: %f", (Math.pow(value, 2)));
		}
		else {
			System.out.print("Error");
		}
		
	}

}
