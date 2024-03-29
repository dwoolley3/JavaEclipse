package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM680_Div1_L1_BearFair_Petr
{
	public String isFair(int n, int b, int[] upTo, int[] quantity)
	{
		List<Bound> bounds = new ArrayList<>();
		for (int i = 0; i < upTo.length; i++)
			bounds.add(new Bound(upTo[i], quantity[i]));
		bounds.add(new Bound(0,0));
		bounds.add(new Bound(b,n));
		Collections.sort(bounds, new Comparator<Bound>() {
			public int compare(Bound o1, Bound o2) {
				return o1.max - o2.max;
			}
		});

		int maxEven = 0, minEven = 0;
		
		for (int i = 0; i+1 < bounds.size(); i++)
		{
			Bound l = bounds.get(i);
			Bound r = bounds.get(i+1);
			int len = r.max - l.max;
			int am = r.cnt - l.cnt;
			if (am < 0 || am > len) {
				return "unfair";
			}
			int lenEven = r.max / 2 - l.max / 2;
			maxEven += Math.min(am,  lenEven);
			minEven += Math.max(0,  am - (len - lenEven));
		}
		if (minEven <= n / 2 && maxEven >= n/2) 
			return "fair";
		else
			return "unfair";

	}
	
	static class Bound {
		int max;
		int cnt;
		
		public Bound(int max, int cnt) {
			this.max = max;
			this.cnt = cnt;
		}
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int[] p2, int[] p3, boolean hasAnswer, String p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p3.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p3[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM680_Div1_L1_BearFair_Petr obj;
		String answer;
		obj = new SRM680_Div1_L1_BearFair_Petr();
		long startTime = System.currentTimeMillis();
		answer = obj.isFair(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p4 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p4);
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
		int[] p2;
		int[] p3;
		String p4;
		
		// ----- test 0 -----
		p0 = 4;
		p1 = 6;
		p2 = new int[]{3,6};
		p3 = new int[]{2,4};
		p4 = "fair";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 4;
		p1 = 6;
		p2 = new int[]{3,6};
		p3 = new int[]{2,3};
		p4 = "unfair";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 2;
		p1 = 6;
		p2 = new int[]{1,2,3};
		p3 = new int[]{1,1,2};
		p4 = "unfair";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 50;
		p1 = 1000;
		p2 = new int[]{736,205,264,235,273,40,901,37,900,424,122,517,820,402,669,279,455,921,774,923,107,936,484,171,248,186,970,231,321,902,606,24,451,585,823,270,361,292,128,521,689,683,270,726,980,652,996,909,196,357};
		p3 = new int[]{35,9,9,9,9,3,46,3,46,18,7,25,39,18,32,9,20,49,37,49,7,49,24,8,9,8,49,9,12,46,29,2,20,29,39,9,16,11,7,27,33,32,9,34,49,32,50,47,8,16};
		p4 = "fair";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 4;
		p1 = 1000;
		p2 = new int[]{400,600};
		p3 = new int[]{4,0};
		p4 = "unfair";
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
