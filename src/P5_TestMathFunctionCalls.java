/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/1/2018
*/

/*
 5. Your predicted expression values:
 	1. 1.6 correct
 	2. 36 correct
 	3. 7 correct
 	4. -5 correct
 	5. 5 correct
 	6. 8 correct
 	7. 17 correct
 	8. 14 correct
 */
public class P5_TestMathFunctionCalls {

	public static void main(String[] args) {
		System.out.println(Math.abs( -1.6 ));
		System.out.println(Math.pow( 6, 2 ));
		System.out.println(Math.max( 7, 3 ));
		System.out.println(Math.min( -2,  -5 ));
		System.out.println(Math.min( 6, 3 + 2 ));
		System.out.println(Math.sqrt( 64 ));
		System.out.println( 13 + Math.abs( -7 ) - Math.pow( 2,  3 ) + 5 );
		System.out.println(Math.max( 18 - 5,  Math.ceil( 4.6 * 3 )));
	}

}
