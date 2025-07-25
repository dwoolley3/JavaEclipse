//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;
package topcoder;

public class SRM855_Div2_L2_SurroundArea
{
	// Incorrect for N=3, A=5
	
	public String draw(int N, int A)
	{
		int sq = 1;
		for (sq = 1; sq <= N && sq*sq <= A; sq++) { 
		}		
		int row = sq-1;
		int extra = A - row*row;
		System.out.println(row + " " + extra);
		
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < row; i++) s.append("D");
		int exRow = 0;
		if (extra > 0) {
			s.append("D");
			exRow = 1;
		}
		if (extra == 0) extra = row;
		int min = Math.min(extra,row);
		for (int i = 0; i < min; i++) {
			s.append("R");
		}
		for (int i = 0; i < row - min; i++) s.append("R");		
		extra -= Math.min(extra,row);
		int exCol = (extra > 0) ? 1 : 0;
		if (extra > 0) {
			s.append("R");
			extra--;
		}
		if (exRow == 1) s.append("U");	
		min = Math.min(extra, row);
		for (int i = 0; i < min; i++) {
			s.append("U");
		}
		if (exCol ==1) {
			s.append("L");
		}
		for (int i = 0; i < row - min; i++) s.append("U");
		for (int i = 0; i < row; i++) s.append("L");

		return s.toString();
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, boolean hasAnswer, String p2) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1);
		System.out.println("]");
		SRM855_Div2_L2_SurroundArea obj;
		String answer;
		obj = new SRM855_Div2_L2_SurroundArea();
		long startTime = System.currentTimeMillis();
		answer = obj.draw(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p2 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p2);
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
		String p2;
		
		// ----- test 0 -----
		p0 = 3;
		p1 = 6;
		p2 = "DDDRRUUULL";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 24;
		p2 = "RRRRDRDDDDLLLLLUUUUU";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 4;
		p1 = 13;
		p2 = "DDRDRDRRUUUULLLL";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 3;
		p1 = 2;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		
		// ----- test 3 -----
		p0 = 3;
		p1 = 4;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 6;
		p1 = 9;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 4;
		p1 = 1;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 500;
		p1 = 240000;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		
		// ----- test 3 -----
		p0 = 3;
		p1 = 5;
		p2 = "DDRUUL";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
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
