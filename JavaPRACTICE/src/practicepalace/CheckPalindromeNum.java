package practicepalace;

public class CheckPalindromeNum {

	public static void main(String[] args) {
		
		int n = 1551;
		int rev = 0 ;
		int rem ;
		int temp = n;
		
		for(;n != 0 ; n /= 10 ) {
			rem = n%10;
			rev = rev*10 + rem;		
		}
		if(temp == rev) {
			System.out.println(temp + " is a palindrome.");
		}
		else {
			System.out.println(temp + " is not a palindrome.");
		}
		
		
	}

}
