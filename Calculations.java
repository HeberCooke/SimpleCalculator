

public class Calculations {
	static double answer = 0.0;
	static double num1;
	static double num2;
	static String temp1;
	static String temp2 = "";
	static String sign = ""; // *,/,+,-,.,%
	static String[] regex = { "*", "/", "-", "+" };
	static int i = 0;

	public static double getNum1() {
		return num1;
	}

	public static void setNum1(double num1) {
		Calculations.num1 = num1;
	}

	public static double getNum2() {
		return num2;
	}

	public static void setNum2(double num2) {
		Calculations.num2 = num2;
	}

	public static String getTemp1() {
		return temp1;
	}

	public static void setTemp1(String temp1) {
		Calculations.temp1 = temp1;
	}

	public static String getTemp2() {
		return temp2;
	}

	public static void setTemp2(String temp2) {
		Calculations.temp2 = temp2;
	}

	public static String calculationsForPercent(String calc) {
		double num3 =0;
		double num4 = 0;
		int sNum1 =0;
		for (i = 0; i < regex.length; i++) { // finding the sign
			if (calc.contains(regex[i])) {
				sign = regex[i];
			}
		}
		i = 0;
		sNum1 = calc.indexOf(sign);

		temp1 = calc.substring(0, sNum1);
		temp2 = calc.substring(sNum1 + 1, (calc.length() - 1));

		num1 = Double.parseDouble(temp1);
		num2 = Double.parseDouble(temp2);
		switch (sign) {
		case "/":  		// division-----------	done
				num3 = num2 /100;
				num4 = num3*num1;
				answer = num4;
		
			if (num1 == 0 || num2 == 0) {
				return " UNIVERSE BROKEN!";
			}
			break;
		case "*":			// multiplication --------- done 
		num3 = num1* num2;
			answer =num3/100;
			break;
		case "-":			// subtraction 	------------- done
			num3=0;
			num4=0;
			num3 = num2 / 100;
			num4 = num1*num3;
			answer = num1-num4;
			break;
		case "+":				//addition ----------------- done
			num3=0;
			num4=0;
			num3 = num2 / 100;
			num4 = num1*num3;
			answer = num1+num4;
			break;
		}
		if (temp1 != "" || temp2 != "" || sign != "") { // making sure the problem is not empty

			return String.format("%.2f", answer);

		} else
			return "";

	}// end calculations for percent

	public static String calculation(String calc2) {// method for calculating
		int sNum =0;

		for (i = 0; i < regex.length; i++) { // finding the sign
			if (calc2.contains(regex[i])) {
				sign = regex[i];

			}
		}
		 sNum = calc2.indexOf(sign);
		temp1 = calc2.substring(0, sNum);
		temp2 = calc2.substring(sNum + 1);

		num1 = Double.parseDouble(temp1);
		num2 = Double.parseDouble(temp2);

		switch (sign) {
		case "/":

			answer = num1 / num2;

			if (num1 == 0 || num2 == 0) {
				return "UNIVERSE BROKE!";
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

		}
		if (temp1 != "" || temp2 != "" || sign != "") { // making sure the problem is not empty

			return String.format("%.2f", answer);

		} else
			return "";
	} // end calculation
}
