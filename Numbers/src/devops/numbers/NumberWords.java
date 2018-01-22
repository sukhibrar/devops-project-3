package devops.numbers;

public class NumberWords {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };
	
	public static final String[] tens = { "", // 0
			"", // 1
			"Twenty", // 2
			"Thirty", // 3
			"Forty", // 4
			"Fifty", // 5
			"Sixty", // 6
			"Seventy", // 7
			"Eighty", // 8
			"Ninety" // 9
	};
	
	public String toWords( int number ) {
		String result = "" ;
		result = num2Word(number);
		return result.trim() ;
	}
	
	public static String num2Word(final int n) {
		if (n < 0) {
			return "Number out of range";
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "")
					+ num2Word(n % 100);
		}

		if (n < 100000) {
			return num2Word(n / 1000) + " Thousand"
					+ ((n % 10000 != 0) ? " " : "") + num2Word(n % 1000);
		}

		if (n < 10000000) {
			return num2Word(n / 100000) + " Lakh"
					+ ((n % 100000 != 0) ? " " : "") + num2Word(n % 100000);
		}

		return num2Word(n / 10000000) + " Crore"
				+ ((n % 10000000 != 0) ? " " : "") + num2Word(n % 10000000);
	}

}
