import java.util.Scanner;


public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1 :");
		double num1=sc.nextDouble();
		System.out.println("Enter number2 :");
		double num2=sc.nextDouble();
		System.out.println("Enter operator:+,-,*,/,%");
		String op=sc.next();
		
		switch(op){
		case "+":
			System.out.println("Addition of number1 and number2 is : "+(num1+num2));
			break;
		case "-":
			System.out.println("Subtraction of number1 and number2 is :"+(num1-num2));
			break;
		case "*":
			System.out.println("Multiplication of number1 and number2 is :"+(num1*num2));
			break;
		case "/":
			System.out.println("Division of number1 and number2 is :"+(num1/num2));
			break;
		case "%":
			System.out.println("Remainder of number1 and number2 is:"+(num1%num2));
			break;
		}
	}

}
