package practicepalace;

public class StarPattern {
	
	static void downwardStar(int n) {

		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print("*");// Keeps printing in the same line
			}
			System.out.println();// Changes the line
		}
	}
	static void upwardStar(int n) {
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n-row+1;column++) {
				System.out.print("0");// column>=row
			}
			System.out.println();
		}
	}
	static void numberSeries(int n)	{
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(column);
			}
			System.out.println();
		}
	}
	static void rightKaStar(int n)	{
		for(int row=1; row<n; row++) {
			for(int column=1; column<=row; column++) {
				System.out.print(column);
			}
			System.out.println();
		}
		for(int row=1; row<=n; row++) {
			for(int column=1; column<=n-row+1; column++){
				System.out.print(column);
			}
			System.out.println();
		}
	}
	static void leftKaStar(int n) {
		for(int row=1; row<=n; row++) {

			for(int spaces=1; spaces<=n-row; spaces++) {
				System.out.print(" ");
			}      		
			for(int column=1; column<=row; column++) {
				System.out.print(column);
			}
			System.out.println();  
		} 
		for(int row=1; row<=n; row++) {
			for(int spaces=1; spaces<=row; spaces++) {
				System.out.print(" ");
			}
			for(int column=1; column<=n-row; column++) {
				System.out.print(column);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Increasing STAR");
		downwardStar(4);
		
		System.out.println("Decreasing STAR");
		upwardStar(4);
		
		System.out.println("Number Series");
		numberSeries(4);
		
		System.out.println("Right Side STAR");
		rightKaStar(5);
		
		System.out.println("Left Side STAR");
		leftKaStar(5);
		
		
		

	}

}
