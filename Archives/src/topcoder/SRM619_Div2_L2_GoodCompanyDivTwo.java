package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM619_Div2_L2_GoodCompanyDivTwo
{
	public int countGood(int[] superior, int[] workType)
	{
		
		int n = superior.length, cnt = 0;
		for (int i = 0; i < n; i++)
		{
			ArrayList<Integer> al = new ArrayList<Integer>();
			boolean div = true;
			al.add(workType[i]);
			for (int j = 0; j < n; j++)
			{
				if (i == j || (superior[j] == -1)) continue;
				if (i != j && superior[j] ==  i) 
				{
					if (al.contains(workType[j])) 
						div = false;
					else
						al.add(workType[j]);
				}
			}
			if (div) cnt++;
		}
		return cnt;		
				
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
		SRM619_Div2_L2_GoodCompanyDivTwo obj;
		int answer;
		obj = new SRM619_Div2_L2_GoodCompanyDivTwo();
		long startTime = System.currentTimeMillis();
		answer = obj.countGood(p0, p1);
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
		p0 = new int[]{-1};
		p1 = new int[]{1};
		p2 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{-1,0};
		p1 = new int[]{1,2};
		p2 = 2;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{-1,0};
		p1 = new int[]{1,1};
		p2 = 1;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{-1,0,1,1};
		p1 = new int[]{1,4,3,2};
		p2 = 4;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{-1,0,1,0,0};
		p1 = new int[]{3,3,5,2,2};
		p2 = 4;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{-1,0,1,1,1,0,2,5};
		p1 = new int[]{1,1,2,3,4,5,3,3};
		p2 = 7;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{-1,0,0,1,1,3,0,2,0,5,2,5,5,6,1,2,11,12,10,4,7,16,10,9,12,18,15,23,20,7,4};
		p1 = new int[]{4,6,4,7,7,1,2,8,1,7,2,4,2,9,11,1,10,11,4,6,11,7,2,8,9,9,10,10,9,8,8};
		p2 = 27;
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
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
