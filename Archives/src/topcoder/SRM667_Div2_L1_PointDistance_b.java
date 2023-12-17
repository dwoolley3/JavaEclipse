package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM667_Div2_L1_PointDistance_b
{
	public int[] findPoint(int x1, int y1, int x2, int y2)
	{
		for (int i = -100; i <= 100; i++)
			for (int j = -100; j <= 100; j++)
				if (dist(x1,y1,i,j) > dist(x2,y2,i,j))
					return new int[]{i,j};
		return new int[]{0,0};
	}
	
	private int dist(int x1, int y1, int x2, int y2)
	{
		return (x1 - x2)*(x1-x2) + (y1-y2)*(y1-y2);
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, int[] p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		SRM667_Div2_L1_PointDistance_b obj;
		int[] answer;
		obj = new SRM667_Div2_L1_PointDistance_b();
		long startTime = System.currentTimeMillis();
		answer = obj.findPoint(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p4.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p4[i]);
			}
			System.out.println("}");
		}
		System.out.println("Your answer:");
		System.out.print("\t" + "{");
		for (int i = 0; answer.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(answer[i]);
		}
		System.out.println("}");
		if (hasAnswer) {
			if (answer.length != p4.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p4[i]) {
						res = false;
					}
				}
			}
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
		int[] p4;
		
		// ----- test 0 -----
		p0 = -1;
		p1 = 0;
		p2 = 1;
		p3 = 0;
		p4 = new int[]{8,48};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 1;
		p1 = 1;
		p2 = -1;
		p3 = -1;
		p4 = new int[]{25,-63};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 0;
		p1 = 1;
		p2 = 2;
		p3 = 3;
		p4 = new int[]{41,65};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = -4;
		p2 = -2;
		p3 = 5;
		p4 = new int[]{68,70};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = -50;
		p1 = -50;
		p2 = 50;
		p3 = -50;
		p4 = new int[]{67,4};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = -50;
		p1 = 50;
		p2 = -49;
		p3 = 49;
		p4 = new int[]{73,-25};
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
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
