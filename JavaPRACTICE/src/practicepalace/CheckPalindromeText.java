package practicepalace;

public class CheckPalindromeText {

	public static void palindromeCheck(String enterText) {

		String text = enterText.toLowerCase();
		int length = text.length();
		String reverse = "";

		for(int i = 0; i<length; i++) {

			reverse = reverse + text.charAt(length-1-i);
		}
		if(text.equals(reverse)) {
			System.out.println("Entered text "+enterText+" is palindrome in nature");
		}
		else {
			System.out.println("Entered text "+enterText+" is not palindrome in nature");
		}
	}

	public static void main(String[] args) {

		palindromeCheck("MARkram");


	}
}
