import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = numbers.nextInt();
		System.out.print("Enter second number: ");
		int number2 = numbers.nextInt();
		numbers.close();
		if (number1 > number2)
		{
			System.out.println("The first number is greater than the second");
		}
		if (number1 < number2)
		{
			System.out.println("The first number is less than the second");
		}
		else
		{
			System.out.println("The numbers are equal");
		}
	}

}
