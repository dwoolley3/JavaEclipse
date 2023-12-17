package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM788_Div2_L2_StarsInTheSky
{
	public int countPictures(int n, int[] X, int[] Y)
	{
		int INF = (int)1e9 + 1;	
		HashSet<String> hs = new HashSet<>();
		for (int i = 1; i < 1 << n; i++)
		{
			int minx = INF, miny = INF, maxx = -1, maxy = -1;
			for (int j = 0; j < n; j++)
			{
				if (((1 << j) & i) != 0)
				{
					minx = Math.min(minx,  X[j]);
					miny = Math.min(miny,  Y[j]);
					maxx = Math.max(maxx,  X[j]);
					maxy = Math.max(maxy,  Y[j]);
				}
			}
			String st = minx + " " + miny + " " + maxx + " " + maxy;
			if (!hs.contains(st)) {
				hs.add(st);
			}
		}
		return hs.size();
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int[] p1, int[] p2, boolean hasAnswer, int p3) {
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
		System.out.print("}");
		System.out.println("]");
		SRM788_Div2_L2_StarsInTheSky obj;
		int answer;
		obj = new SRM788_Div2_L2_StarsInTheSky();
		long startTime = System.currentTimeMillis();
		answer = obj.countPictures(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p3);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p3;
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
		
		// ----- test 0 -----
		p0 = 4;
		p1 = new int[]{1,2,3,4};
		p2 = new int[]{1,1,1,1};
		p3 = 10;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 4;
		p1 = new int[]{100,200,200,100};
		p2 = new int[]{100,100,200,200};
		p3 = 9;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = new int[]{10000,11000,12000};
		p2 = new int[]{52000,50000,51000};
		p3 = 7;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 7;
		p1 = new int[]{0,6,2,3,4,0,6};
		p2 = new int[]{0,0,4,5,6,10,10};
		p3 = 45;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 15;
		p1 = new int[]{3,141592653,589793238,462643383,279502884,197169399,375105820,974944592,307816406,286208998,628034825,342117067,982148086,513282306,647093844};
		p2 = new int[]{1,414213562,373095048,801688724,209698078,569671875,376948073,176679737,990732478,462107038,850387534,327641572,735013846,230912297,24924836};
		p3 = 613;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 1;
		p1 = new int[]{2};
		p2 = new int[]{3};
		p3 = 1;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
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