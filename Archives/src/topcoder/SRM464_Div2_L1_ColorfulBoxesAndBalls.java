package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM464_Div2_L1_ColorfulBoxesAndBalls
{
	public int getMaximum(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors)
	{
        int sum1 = numRed * onlyRed + numBlue * onlyBlue;
        int min = Math.min(numRed, numBlue);
        int sum2 = (numRed - min) * onlyRed + (numBlue - min) * onlyBlue
            + min * 2 * bothColors;

        return Math.max(sum1, sum2); 
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, int p4, boolean hasAnswer, int p5) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3 + "," + p4);
		System.out.println("]");
		SRM464_Div2_L1_ColorfulBoxesAndBalls obj;
		int answer;
		obj = new SRM464_Div2_L1_ColorfulBoxesAndBalls();
		long startTime = System.currentTimeMillis();
		answer = obj.getMaximum(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p5);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p5;
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
		int p1;
		int p2;
		int p3;
		int p4;
		int p5;
		
		// ----- test 0 -----
		p0 = 2;
		p1 = 3;
		p2 = 100;
		p3 = 400;
		p4 = 200;
		p5 = 1400;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = 3;
		p2 = 100;
		p3 = 400;
		p4 = 300;
		p5 = 1600;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 5;
		p1 = 5;
		p2 = 464;
		p3 = 464;
		p4 = 464;
		p5 = 4640;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1;
		p1 = 4;
		p2 = 20;
		p3 = -30;
		p4 = -10;
		p5 = -100;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 9;
		p1 = 1;
		p2 = -1;
		p3 = -10;
		p4 = 4;
		p5 = 0;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, p4, true, p5) && all_right;
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
