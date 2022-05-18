import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double number1 = value.nextInt();
		System.out.print("Enter second number: ");
		double number2 = value.nextInt();
        System.out.print("Enter a symbol (+, -, *, /): ");
        String symbol = value.next();
		value.close();
		
		switch(symbol){
	    case "+": 
	        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
	        break;
	    case "-": 
	        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
	        break;
	    case "*": 
	        System.out.println(number1 + " * " + number2 + " = " + (number1*number2));
	        break;
	    case "/":
	    	if ((number1 == 0) | (number2 ==0)) {
	    		System.out.println("Сannot be divided by 0");
	    		break;
	    	}
	    	double del = number1 / number2;
	    	System.out.printf("%f / %f = %f", number1, number2, del);
	        break;
	}
	}

}
