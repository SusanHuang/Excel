package excel;

public class solution {

	public static String convertToTitle(int inputInteger){
		int num = 0;
		int letter = 0;
		int letterTimes = 0;
		int letterTimesPlusOne = 0;
		int modulous = inputInteger % 26;
		int division = inputInteger / 26;
		String string = "";
		if(modulous == 0){
			letter = 'Z';
			letterTimes = division-1;
		}
		else {
			letter = 'A' + (modulous-1);
			letterTimes = division;
		}
		letterTimesPlusOne = letterTimes + 1;
		
		// Negative integers and Zero
		// Solution only takes positive integers
		if(inputInteger <= 0){
			System.out.println("Invalid input. Retry with positive integer.");
			return string;
		}
		
		// Positive integers
		else{
			String toAdd = Character.toString((char)letter);
			while(num < letterTimesPlusOne){
				string = string.concat(toAdd);
				num++;
			}	
			System.out.println(inputInteger + " -> " + string);
			return string;

		}
	}

}

