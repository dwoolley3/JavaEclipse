package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM554_Div1_L1_TheBrickTowerEasyDivOne
{
	public int find(int redCount, int redHeight, int blueCount, int blueHeight)
	{
        int cnt = Math.min(redCount, blueCount);
        if (redHeight == blueHeight)
            cnt *= 2;
        else
            cnt *= 3;

        if (redCount != blueCount) cnt++;
        return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, int p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM554_Div1_L1_TheBrickTowerEasyDivOne obj;
		int answer;
		obj = new SRM554_Div1_L1_TheBrickTowerEasyDivOne();
		long startTime = System.currentTimeMillis();
		answer = obj.find(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
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
		
		// ----- test 0 -----
		p0 = 1;
		p1 = 2;
		p2 = 3;
		p3 = 4;
		p4 = 4;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 4;
		p1 = 4;
		p2 = 4;
		p3 = 7;
		p4 = 12;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 7;
		p1 = 7;
		p2 = 4;
		p3 = 4;
		p4 = 13;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 47;
		p1 = 47;
		p2 = 47;
		p3 = 47;
		p4 = 94;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
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
