package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM572_Div2_L2_NextOrPrev
{
	public int getMinimum(int nextCost, int prevCost, String start, String goal)
	{
        int n = start.length();
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (start.charAt(i) < start.charAt(j) && goal.charAt(i) > goal.charAt(j))
                    return -1;
            }
            if (start.charAt(i) >= goal.charAt(i))
                sum += (start.charAt(i) - goal.charAt(i)) * prevCost;
            else
                sum += (goal.charAt(i)- start.charAt(i)) * nextCost;
        }
        return sum;    
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, String p2, String p3, boolean hasAnswer, int p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + "\"" + p2 + "\"" + "," + "\"" + p3 + "\"");
		System.out.println("]");
		SRM572_Div2_L2_NextOrPrev obj;
		int answer;
		obj = new SRM572_Div2_L2_NextOrPrev();
		long startTime = System.currentTimeMillis();
		answer = obj.getMinimum(p0, p1, p2, p3);
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
		String p2;
		String p3;
		int p4;
		
		// ----- test 0 -----
		p0 = 5;
		p1 = 8;
		p2 = "ae";
		p3 = "bc";
		p4 = 21;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 8;
		p2 = "ae";
		p3 = "cb";
		p4 = -1;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1;
		p1 = 1;
		p2 = "srm";
		p3 = "srm";
		p4 = 0;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 10;
		p1 = 1;
		p2 = "acb";
		p3 = "bdc";
		p4 = 30;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 10;
		p1 = 1;
		p2 = "zyxw";
		p3 = "vuts";
		p4 = 16;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 563;
		p1 = 440;
		p2 = "ptrbgcnlaizo";
		p3 = "rtscedkiahul";
		p4 = 10295;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 126;
		p1 = 311;
		p2 = "yovlkwpjgsna";
		p3 = "zpwnkytjisob";
		p4 = -1;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, p3, true, p4) && all_right;
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
