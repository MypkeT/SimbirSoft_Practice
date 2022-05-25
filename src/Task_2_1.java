import java.util.Scanner;
public class Task_2_1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter avg: ");
	int avg = input.nextInt();
	if (avg == 100) {
		System.out.println("Good work");
	}
	
	System.out.print("\nEnter mark: ");
	double mark = input.nextInt();
	if (mark < 60) {
		double percent = (mark*10)/100;
		System.out.printf("mark value: %f\n", (mark+percent));
	}
	
	System.out.print("\nEnter value one: ");
	int one = input.nextInt();
	System.out.print("Enter value two: ");
	int two = input.nextInt();
	if (one > two) {
		System.out.printf("One: %d\n", one);
	}
	else if (one < two) {
		System.out.printf("Two: %d\n", two);
	}
	else {
		System.out.print(two);
	}
	
	System.out.print("\nEnter value of num: ");
	int num = input.nextInt();
	if (num > 0) {
		System.out.print("Num is positive\n");
	}
	else if (num < 0) {
		System.out.print("Num is negative\n");
	}
	else {
		System.out.print("Num are 0\n");
	}
	
	System.out.print("\nEnter ugol1: ");
	int ugol1 = input.nextInt();
	System.out.print("Enter ugol1: ");
	int ugol2 = input.nextInt();
	System.out.print("Enter ugol1: ");
	int ugol3 = input.nextInt();
	if ((ugol1+ugol2+ugol3) == 180) {
		System.out.print("These are the corners of a triangle");
	}
	else {
		System.out.print("These are not the corners of the triangle");
	}
	}

}
