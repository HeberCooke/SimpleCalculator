

public class Calculations {
	static double answer = 0.0;
	static double num1;
	static double num2;
	static String temp1 = "";
	static String temp2 = "";
	static String sign = ""; // *,/,+,-,.,%
	static String[] regex = { "*", "%", "/", "-", "+" }; 
	static int i = 0;


	public static String calculation(String calc) {// method for calculating

		for (i = 0; i < regex.length; i++) { // finding the sign
			if (calc.contains(regex[i])) {
				sign = regex[i];

			}
		}
		int sNum = calc.indexOf(sign);
		temp1 = calc.substring(0, sNum);
		temp2 = calc.substring(sNum + 1);

		num1 = Double.parseDouble(temp1);
		num2 = Double.parseDouble(temp2);

		switch (sign) {
		case "/":
		
			answer = num1 / num2;

			if( num1 == 0 || num2 == 0) {
				return " UNIVERSE BROKEN!";
			}
			break;
		case "*":
			answer = num1 * num2;
			break;
		case "-":
			answer = num1 - num2;
			break;
		case "+":
			answer = num1 + num2;
			break;
		case "%":
			int  num3 = (int) Math.rint( num1 / num2);
			System.out.println(num3);
			int n = (int) (num2 *num3);
			answer = num1 - n;
			break;
		}
		if (temp1 != "" || temp2 != "" || sign != "") { //making sure the problem is not empty
		
			return String.format("%.2f", answer); 
					
		} else
			return "";
	} // end calculation
}



