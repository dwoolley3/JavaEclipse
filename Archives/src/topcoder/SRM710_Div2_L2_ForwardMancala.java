package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM710_Div2_L2_ForwardMancala
{
	public int[] findMoves(int[] s)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] ans = new int[0];
		int n = s.length;
		int pos = 0, posi = -1;

		for (int i = 0; i < n; i++)
			if (s[i] > 0)
			{
				pos++;
				if (posi == -1)
					posi = i;
			}
		
		while (pos != 1)
		{
			int ind = posi;
			for (int i = 0; i < n-1; i++)
			{
				ind++;
				if (ind == n) ind = 0;
				if (s[ind] > 0)
				{
					int k = ind;
					int num = s[ind];
					for (int j = 0; j < num; j++)
					{
						k++;
						if (k == n) k = 0;
						s[k]++;
						s[ind]--;
					}
					al.add(ind);			
				}
			}

			pos = 0;
			for (int i = 0; i < n; i++)
				if (s[i] > 0)
				{
					pos++;
				}
			
			if (pos == 1)
			{
				int sz = al.size();
				ans = new int[sz];
				for (int i = 0; i < sz; i++)
					ans[i] = al.get(i);
			}			
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
		SRM710_Div2_L2_ForwardMancala obj;
		int[] answer;
		obj = new SRM710_Div2_L2_ForwardMancala();
		long startTime = System.currentTimeMillis();
		answer = obj.findMoves(p0);
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
		p0 = new int[]{6,1,0,1};
		p1 = new int[]{1,2,3,1,2,3};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{0,10,0,0,0};
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{0,1,0,1,0,1};
		p1 = new int[]{3,4,1,2,3,4};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{5,0,0,1,3,0,2,0};
		p1 = new int[]{3,4,5,6,7,1,2,3,4,5,6,7,1,2,3,4,5,6,7};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{10,10,10,10,10,10,10,10,10,10};
		p1 = new int[]{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{1,1,0,6};
		p1 = new int[]{1,2,3,1,2,3};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
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
