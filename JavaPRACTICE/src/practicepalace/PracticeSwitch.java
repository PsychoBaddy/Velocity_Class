package practicepalace;

import java.util.Scanner;

public class PracticeSwitch {

	public static void main(String[] args) {

		Scanner kkr = new Scanner(System.in);

		System.out.println("write division class");
		String divison = kkr.nextLine(); 
		System.out.println("Write the operation");
		String operation = kkr.nextLine();
		System.out.println("Enter num1");
		int num1 = kkr.nextInt();
		System.out.println("Enter num2");
		int num2 = kkr.nextInt();
		int result = 0; 
		switch(operation.toUpperCase())

		{

		case "A" : result = num1+num2;break;
		case "S" : result = num1-num2;break;
		case "M" : result = num1*num2;break;
		case "D" : switch(divison.toUpperCase())
		{ 
		case "Q" : result = num1/num2;break;
		case "R" : result = num1%num2;break;
		default : System.out.println("invalid response of divi");}
		}	
		System.out.println("Answer is "+result);

		kkr.close();

	}

}
