package practicepalace;

import java.util.Arrays;

public class ReverseSntcAtSamePos {

	public static void reverseSntcAtSamePos(String sentence) {

		String text = sentence;

		String arrText [] = text.split(" ");
		System.err.println(Arrays.toString(arrText));
		String reverseText = "";

		int length = arrText.length;

		for(int i=0; i<length; i++) {

			String reverse = "";
			String splitText = arrText[i];
			int reverseLength = splitText.length();

			for(int j=0; j<reverseLength; j++) {

				reverse = reverse + splitText.charAt(reverseLength-j-1);

			}

			reverseText = reverseText + reverse +" ";// for multiple words to get add
		}

		System.out.println(reverseText);

	}

	public static void main(String[] args) {
		
		reverseSntcAtSamePos("Early to bed tonight senior");
		
	}

}
