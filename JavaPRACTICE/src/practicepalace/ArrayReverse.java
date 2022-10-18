package practicepalace;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {

		int arrData [] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arrData));

		for(int i = 0; i < arrData.length/2 ; i++)
		{
			int temp = arrData[i];
			arrData[i] = arrData[arrData.length - 1 - i ];
			arrData[arrData.length - 1 - i ] = temp;
			
		}
		System.out.println(Arrays.toString(arrData));
		
		String arrName [] = {"Asif","Ajaz","Rozee","Akib","Papa","Ammi"};
		System.out.println(Arrays.asList(arrName));
		
		int length = arrName.length;
		
		for(int i = 0; i < length/2; i++) {
			
			String temp = arrName[i];
			arrName[i] = arrName[length-1-i];
			arrName[length-1-i] = temp;
			
		}
		System.out.println(Arrays.toString(arrName));

	}

}
