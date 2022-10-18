package practicepalace;

public class GeneratePrimeNum {

	public static void main(String[] args) {
		
		for(int i =1; i<=100; i++) {

			int r = i;
			int num = i;
			int count = 0;

			for(; r>0; r--) {

				int rem = num%r;
				if(rem == 0) {
					count = count + 1;
				}
			}
			if(count == 2) {
				System.out.println(num+" is a prime number");
			}
		}
		

	}

}
