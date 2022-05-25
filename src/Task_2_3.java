import java.util.Scanner;
public class Task_2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Input a negative number: ");
		int number = input.nextInt();
		if (number > 0) {
			number = 0;
		}
		System.out.printf("Output number: %d", (Math.abs(number)));
	}

}
