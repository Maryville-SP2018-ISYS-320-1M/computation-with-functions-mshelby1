/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/1/2018
*/

/*
 What were the errors you found?
 I'm not exactly sure what the errors are with the original program.
 So, I made the program simpler to avoid the errors,
 and now you only have to input the temperature in Fahrenheit to get the corresponding Celsius temperature. 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = (tempf - 32) * 5 / 9;
		System.out.println("Body temp in C is: " + tempc);
	}
}
