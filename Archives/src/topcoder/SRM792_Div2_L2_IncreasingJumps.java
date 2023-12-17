package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM792_Div2_L2_IncreasingJumps
{
	public int[] jump(int[] frogs)
	{
		int n = frogs.length;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			int pos = frogs[i];
			int fn = i+1;
			if (pos < frogs[0]) {
				for (int j = 0; j < frogs[0] - pos; j++) {
					al.add(-fn);
					al.add(fn);
				}				
			} else if (pos > frogs[0]) {
				for (int j = 0; j < pos - frogs[0]; j++) {
					al.add(fn);
					al.add(-fn);
				}	
			}		
		}
		for (int fn = 1; fn <= n; fn++) {
			al.add(fn);
		}
		//System.out.println(al.size());
		int[] ans = new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			ans[i] = al.get(i);
		}		
		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, boolean hasAnswer, int[] p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM792_Div2_L2_IncreasingJumps obj;
		int[] answer;
		obj = new SRM792_Div2_L2_IncreasingJumps();
		long startTime = System.currentTimeMillis();
		answer = obj.jump(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p1.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p1[i]);
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
			if (answer.length != p1.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p1[i]) {
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
		
		int[] p0;
		int[] p1;
		
		// ----- test 0 -----
		p0 = new int[]{5,6,1,9,8};
		p1 = new int[]{3,3,3};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{0,0,1,0};
		p1 = new int[]{-2,4};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,35};
		p1 = new int[]{1,1,1,1,1,1,-2,-2};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{4,7,3,9,5,6,10,8};
		p1 = new int[]{3,3,-3};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{0,50,50,50,50,50,50,50,50,50};
		p1 = new int[]{3,3,-3};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{0};
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
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