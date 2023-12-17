package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM598_Div1_L2_FoxAndFencing
{
	public String WhoCanWin(int mov1, int mov2, int rng1, int rng2, int d)
	{
		if (mov1 + rng1 >= d)
			return "Ciel";
		if (mov2 + rng2 >= d + mov1)
			return "Liss";
		
		if (mov1 > mov2 && (mov1 + rng1 > mov2 + mov2 + rng2))
			return "Ciel";
		if (mov1 < mov2 && (mov2 + rng2 > mov1 + mov1 + rng1))
			return "Liss";
			
		return "Draw";
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, int p4, boolean hasAnswer, String p5) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3 + "," + p4);
		System.out.println("]");
		SRM598_Div1_L2_FoxAndFencing obj;
		String answer;
		obj = new SRM598_Div1_L2_FoxAndFencing();
		long startTime = System.currentTimeMillis();
		answer = obj.WhoCanWin(p0, p1, p2, p3, p4);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p5 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p5);
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
		String p5;
		
		// ----- test 0 -----
		p0 = 8162034;
		p1 = 9177151;
		p2 = 906682;
		p3 = 4158573;
		p4 = 9228270;
		p5 = "Draw";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 1;
		p1 = 58;
		p2 = 1;
		p3 = 58;
		p4 = 2;
		p5 = "Ciel";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = 1;
		p2 = 1;
		p3 = 100;
		p4 = 50;
		p5 = "Liss";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = 1;
		p2 = 1;
		p3 = 100;
		p4 = 150;
		p5 = "Draw";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 100;
		p1 = 100;
		p2 = 100;
		p3 = 100;
		p4 = 100000000;
		p5 = "Draw";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 100;
		p1 = 1;
		p2 = 100;
		p3 = 1;
		p4 = 100000000;
		p5 = "Ciel";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 100;
		p1 = 1;
		p2 = 100;
		p3 = 250;
		p4 = 100000000;
		p5 = "Draw";
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 100;
		p1 = 1;
		p2 = 100;
		p3 = 150;
		p4 = 100000000;
		p5 = "Ciel";
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = 100;
		p1 = 50;
		p2 = 100;
		p3 = 1;
		p4 = 100000000;
		p5 = "Ciel";
		all_right = KawigiEdit_RunTest(7, p0, p1, p2, p3, p4, true, p5) && all_right;
		// ------------------
		
		// ----- test 8 -----
		p0 = 100;
		p1 = 150;
		p2 = 100;
		p3 = 1;
		p4 = 100000000;
		p5 = "Draw";
		all_right = KawigiEdit_RunTest(8, p0, p1, p2, p3, p4, true, p5) && all_right;
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
