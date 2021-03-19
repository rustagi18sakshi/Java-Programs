package advanced_java_programs;

public class convertRomanNumberalToDecimals {

	public static void main(String[] args) {

		String romanNumeral = "DMCIX";

		int length = romanNumeral.length();
		int sum = 0;

		for (int i = 0; i < length - 1; i++) {
			int s1 = value(romanNumeral.charAt(i));
			int s2 = value(romanNumeral.charAt(i + 1));

			if (s1 < s2) {
				sum = sum - s1 + s2;
				i++;
			} else {
				sum = sum + s1;
			}
		}

		int lastDigit = value(romanNumeral.charAt(length - 1));
		int secondLastDigit = value(romanNumeral.charAt(length - 2));

		if (lastDigit <= secondLastDigit) {
			sum = sum + lastDigit;
		}
		System.out.println("Converted decimal number is : " + sum);
	}

	public static int value(Character c) {
		int output = 0;
		if (c == 'I') {
			output = 1;
		} else if (c == 'V') {
			output = 5;
		} else if (c == 'X') {
			output = 10;
		} else if (c == 'L') {
			output = 50;
		} else if (c == 'C') {
			output = 100;
		} else if (c == 'D') {
			output = 500;
		} else if (c == 'M') {
			output = 1000;
		}

		return output;
	}

}
