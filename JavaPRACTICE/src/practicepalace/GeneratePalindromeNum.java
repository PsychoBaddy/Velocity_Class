package practicepalace;

public class GeneratePalindromeNum {

	public static void main(String[] args) {

		for(int n=100; n<=1000; n++) {

			int rev = 0;
			int rem = 0;
			int r = n;
			int num = n;

			for(; r > 0 ; r /= 10) {
				rem = r%10;
				rev = rev*10 + rem;
			}

			if(num == rev) {
				System.out.println(num+" is a palindrome number");
			}

		}


	}

}
