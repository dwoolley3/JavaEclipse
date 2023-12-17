package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM565_Div2_L2_MonstersValley2
{
	public int minimumPrice(int[] dread, int[] price)
	{
        int n = dread.length;
        int min = Integer.MAX_VALUE;

        int it = (1 << n);
        for (int i = 0; i < it; i++)
        {
            int cost = 0;
            long party = 0;
            boolean good = true;
            for (int j = 0; j < n; j++)
            {
                if ((i & (1 << j)) > 0)
                {
                    party += dread[j];
                    cost += price[j];
                }
                else if (party < dread[j])
                    good = false;
            }
            if (good)
                min = Math.min(min, cost);
        }
        return min;   
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, int p2) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM565_Div2_L2_MonstersValley2 obj;
		int answer;
		obj = new SRM565_Div2_L2_MonstersValley2();
		long startTime = System.currentTimeMillis();
		answer = obj.minimumPrice(p0, p1);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p2);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p2;
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
		
		int[] p0;
		int[] p1;
		int p2;
		
		// ----- test 0 -----
		p0 = new int[]{8,5,10};
		p1 = new int[]{1,1,2};
		p2 = 2;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,2,4,1000000000};
		p1 = new int[]{1,1,1,2};
		p2 = 5;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{200,107,105,206,307,400};
		p1 = new int[]{1,2,1,1,1,2};
		p2 = 2;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{5216,12512,613,1256,66,17202,30000,23512,2125,33333};
		p1 = new int[]{2,2,1,1,1,1,2,1,2,1};
		p2 = 5;
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
