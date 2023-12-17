package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM668_Div2_L2_IsItASquare
{
	public String isSquare(int[] x, int[] y)
	{
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
			{
				if (i == j) continue;			
				for (int k = 0; k < 4; k++)
				{
					if (k == i || k == j) continue;
					for (int m = 0; m < 4; m++)
					{
						if (m == i || m == j || m == k) continue;
						if (dist(x[i],y[i],x[j],y[j]) ==
							dist(x[j],y[j],x[k],y[k]) &&							
							dist(x[j],y[j],x[k],y[k]) ==
							dist(x[k],y[k],x[m],y[m]) &&
							dist(x[k],y[k],x[m],y[m]) ==
							dist(x[m],y[m],x[i],y[i]) )
						{
							//int s = dist(x[i],y[i],x[j],y[j]);
							int d1 = dist(x[i],y[i],x[k],y[k]);
							int d2 = dist(x[j],y[j],x[m],y[m]);
							if (d1 == d2) // && (s*s + s*s == d1*d1))
							{
								//System.out.println(s + " " + d1);
								return "It's a square";
							}
						}
					}
				}
			}
		
		return "Not a square";
	}
	
	private int dist(int x1, int y1, int x2, int y2)
	{
		return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, String p2) {
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
		SRM668_Div2_L2_IsItASquare obj;
		String answer;
		obj = new SRM668_Div2_L2_IsItASquare();
		long startTime = System.currentTimeMillis();
		answer = obj.isSquare(p0, p1);
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
		
		int[] p0;
		int[] p1;
		String p2;
		
		// ----- test 0 -----
		p0 = new int[]{0,0,2,2};
		p1 = new int[]{0,2,0,2};
		p2 = "It's a square";
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{0,1,5,6};
		p1 = new int[]{1,6,0,5};
		p2 = "It's a square";
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,0,7,7};
		p1 = new int[]{0,3,0,3};
		p2 = "Not a square";
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{0,5000,5000,10000};
		p1 = new int[]{5000,0,10000,5000};
		p2 = "It's a square";
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{1,2,3,4};
		p1 = new int[]{4,3,2,1};
		p2 = "Not a square";
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{0,5,3,8};
		p1 = new int[]{0,0,4,4};
		p2 = "Not a square";
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