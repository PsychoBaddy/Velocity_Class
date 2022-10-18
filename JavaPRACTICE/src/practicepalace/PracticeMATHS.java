package practicepalace;

import java.util.Scanner;

public class PracticeMATHS {

	public static void main(String[] args) {

		Scanner kkr = new Scanner(System.in);

		System.out.println("Enter Starting limit");
		int a = kkr.nextInt();
		System.out.println("Enter End limit");
		int b = kkr.nextInt();
		int num = 0;
		for (num=a;num<=b;num++) {
			if (num%2 == 0) {
				System.out.println(num+" is EVEN");
			}
			else if (num==0) {
				System.out.println("ZERO is Neither EVEn or ODD");
			}
			else {
				System.out.println(num+" is ODD");
			}
		}

		System.out.println("$$$$$$$$");

		System.out.println("Enter initial limit");
		int c = kkr.nextInt();
		System.out.println("Enter final limit");
		int d = kkr.nextInt();
		while (c<=d) {
			System.out.println("Multiple of SIX is "+6*c);
			c++;
		}		
		kkr.close();
	}

}
