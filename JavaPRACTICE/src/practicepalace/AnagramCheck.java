package practicepalace;

public class AnagramCheck {

	public static  void anagramCheck(String word1, String word2) {

		String text1 = word1.toLowerCase();
		String text2 = word2.toLowerCase();

		String blank = "";

		int length1 = text1.length();
		int length2 = text2.length();

		int count = 0;

		if(length1 == length2) {

			for(int i=0; i<length1; i++) {

				String t1 = blank + text1.charAt(i);

				for(int j=0; j<length2; j++) {

					String t2 = blank + text2.charAt(j);

					if(t1.equals(t2)) {
						count++;
					}
				}

			}

			if(count == length1) {
				System.out.println("Given words are anagram");
			}
			else {
				System.out.println("Given words are not anagram");
			}

		}
		else {
			System.out.println("Given words are not anagram");
		}

	}

	public static void main(String[] args) {

		anagramCheck("Fire","rife");

	}

}
