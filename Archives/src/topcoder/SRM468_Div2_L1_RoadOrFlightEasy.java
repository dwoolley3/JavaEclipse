package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM468_Div2_L1_RoadOrFlightEasy
{
	public int minTime(int N, int[] roadTime, int[] flightTime, int K)
	{
        int sum = 0;
        boolean[] used = new boolean[N+1];
        for (int i = 1; i <= K; i++)
        {
            int max = -1, maxj = -1;
            for (int j = 0; j < N; j++)
                if (roadTime[j] - flightTime[j] > max && !used[j])
                {
                    max = roadTime[j] - flightTime[j];
                    maxj = j;
                }
            if (maxj > -1)
            {
                sum += flightTime[maxj];
                used[maxj] = true;
            }
        }
        for (int j = 0; j < N; j++)
            if (!used[j]) sum += roadTime[j];

        return sum;   
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, int[] p2, int p3, boolean hasAnswer, int p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p1[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}" + "," + p3);
		System.out.println("]");
		SRM468_Div2_L1_RoadOrFlightEasy obj;
		int answer;
		obj = new SRM468_Div2_L1_RoadOrFlightEasy();
		long startTime = System.currentTimeMillis();
		answer = obj.minTime(p0, p1, p2, p3);
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
		int[] p1;
		int[] p2;
		int p3;
		int p4;
		
		// ----- test 0 -----
		p0 = 3;
		p1 = new int[]{4,6,7};
		p2 = new int[]{1,2,3};
		p3 = 1;
		p4 = 13;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = new int[]{4,6,7};
		p2 = new int[]{1,2,3};
		p3 = 2;
		p4 = 9;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = new int[]{4,6,7};
		p2 = new int[]{1,2,3};
		p3 = 3;
		p4 = 6;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 3;
		p1 = new int[]{1,2,3};
		p2 = new int[]{2,3,4};
		p3 = 2;
		p4 = 6;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 7;
		p1 = new int[]{50,287,621,266,224,68,636};
		p2 = new int[]{797,661,644,102,114,452,420};
		p3 = 2;
		p4 = 1772;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
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