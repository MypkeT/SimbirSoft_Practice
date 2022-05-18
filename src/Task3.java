import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a height and width value: ");
		int height = value.nextInt();
		int width = value.nextInt();
		System.out.printf("Perimeter of a rectangle: %d", (2*(height+width)));
		System.out.printf("\nRectangle diagonal length: %f", (Math.sqrt((width*width)+(height*height))));
	}

}
