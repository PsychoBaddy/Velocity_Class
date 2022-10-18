package practicepalace;

import java.util.Scanner;

public class PracticeOperators {

	public static void main(String[] args) {

		Scanner kkr = new Scanner(System.in);

		System.out.println(" write a mssg wins");
		String mssg = kkr.nextLine();
		System.out.println("test run for "+ mssg);

		System.out.println("Enter the first number");
		int num = kkr.nextInt();
		System.out.println("First Number is "+ num);
		int nnn = ++num;
		System.out.println("urunary operator "+ nnn);

		System.out.println("Enter the first number ");
		float num1 = kkr.nextFloat();
		System.out.println("First Number is "+ num1);
		System.out.println("Enter the second number");
		float num2 = kkr.nextFloat();
		System.out.println("Second number is "+ num2);

		float sum = num1 + num2;
		boolean result = num1 > num2;
		System.out.println("SUM is "+ sum);
		System.out.println("Given condition is "+ result);

		// .next(); gives only one word ability
		System.out.println("final result");
		kkr.nextLine();
		String msg = kkr.nextLine();
		System.out.println("1st condition is "+ msg);

		kkr.close();

	}

}
