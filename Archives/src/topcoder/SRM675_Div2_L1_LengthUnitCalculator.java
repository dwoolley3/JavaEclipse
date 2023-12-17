package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM675_Div2_L1_LengthUnitCalculator
{
	public double calc(int amount, String fromUnit, String toUnit)
	{
		double inch = amount;
		if (fromUnit.equals("ft")) inch *= 12;
		if (fromUnit.equals("yd")) inch *= 36;
		if (fromUnit.equals("mi")) inch *= 12 * 5280;
		if (toUnit.equals("in")) return inch;
		if (toUnit.equals("ft")) return inch / 12.0;
		if (toUnit.equals("yd")) return inch / 36.0;
		if (toUnit.equals("mi")) return inch / 12.0 / 5280.0;
		return 0;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, String p1, String p2, boolean hasAnswer, double p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "\"" + p1 + "\"" + "," + "\"" + p2 + "\"");
		System.out.println("]");
		SRM675_Div2_L1_LengthUnitCalculator obj;
		double answer;
		obj = new SRM675_Div2_L1_LengthUnitCalculator();
		long startTime = System.currentTimeMillis();
		answer = obj.calc(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = Math.abs(p3 - answer) <= 1e-9 * Math.max(1.0, Math.abs(p3));
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		int p0;
		String p1;
		String p2;
		double p3;
		
		// ----- test 0 -----
		p0 = 100;
		p1 = "mi";
		p2 = "in";
		p3 = 6336000.0D;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 1;
		p1 = "mi";
		p2 = "ft";
		p3 = 5280.0D;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1;
		p1 = "ft";
		p2 = "mi";
		p3 = 1.893939393939394E-4D;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 123;
		p1 = "ft";
		p2 = "yd";
		p3 = 41.0D;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1000;
		p1 = "mi";
		p2 = "in";
		p3 = 6.336E7D;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 1;
		p1 = "in";
		p2 = "mi";
		p3 = 1.5782828282828283E-5D;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 47;
		p1 = "mi";
		p2 = "mi";
		p3 = 47.0D;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!