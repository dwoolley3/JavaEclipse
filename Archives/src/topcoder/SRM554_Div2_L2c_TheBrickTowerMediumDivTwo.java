package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

//Using next_permutation();     permute();  permute(n,h) but unsorted
//10! = 3,628,800   = .16 sec;  .39 sec;    .08 sec
//11! = 39,916,800  = 1.8 sec;  5.0 sec;    1.2  sec

public class SRM554_Div2_L2c_TheBrickTowerMediumDivTwo
{
	private int[] ans, per;
		
	public int[] find(int[] heights)
	{
		int n = heights.length;
		ans = new int[n];
		per = generateInitialPermutation(n);  //Initial = 0,1,...n-1
			
		permute(0, heights);
		return ans;
	}
	
	public int[] generateInitialPermutation(int size)
	{
		int[] p = new int[size];
		for (int i = 0; i < size; i++) p[i] = i;
		return p;
	}
	
	//Generate permutations of 0...n-1 in per[], not in lexicographical order
	public void permute(int n, int[] h)
	{
		if (n == per.length - 1)
		{
			@SuppressWarnings("unused")
			int cnt = 0;
			for (int i = 0; i < per.length; i++)
				cnt += h[per[i]];
			//	System.out.print(h[per[i]]+" ");
			//System.out.println();
			return;
		}
		else  // n < per.length - 1
		{
			int temp;
	        for (int i = n; i < per.length; i++)
	        {
	            temp = per[n]; per[n] = per[i]; per[i] = temp;
	            permute(n + 1, h);
	            temp = per[n]; per[n] = per[i]; per[i] = temp;
	        }
		}		
	}
	
	boolean next_permutation(int[] p) 
	{
		// 0,1,2 -> 0,2,1 -> 1,0,2 -> 1,2,0 -> 2,0,1 -> 2,1,0
		int t, n = p.length;
		for (int i = n - 2; i >= 0; i--)
		    if (p[i] < p[i + 1])
		    	for (int j = n - 1;; j--)
		    		if (p[j] > p[i]) 
		    		{
		    			t = p[i]; p[i] = p[j];  p[j] = t;
				        for (i++, j = n - 1; i < j; i++, j--) 
				        {
				        	t = p[i]; p[i] = p[j]; p[j] = t;
				        }
				        return true;
		    		}
		 return false;  //p is last lexicographically, e.g. -> 2, 1, 0
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
		SRM554_Div2_L2c_TheBrickTowerMediumDivTwo obj;
		int[] answer;
		obj = new SRM554_Div2_L2c_TheBrickTowerMediumDivTwo();
		long startTime = System.currentTimeMillis();
		answer = obj.find(p0);
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
		p0 = new int[]{4,7,5};
		p1 = new int[]{0,2,1};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{4,4,4,4,4,4,4};
		p1 = new int[]{0,1,2,3,4,5,6};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{2,3,3,2};
		p1 = new int[]{0,3,1,2};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{13,32,38,25,43,47,6};
		p1 = new int[]{0,6,3,1,2,4,5};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------		
		
		// ----- test 4 -----
		p0 = new int[]{4,4,4,4,4,4,4,4,4,4};
		p1 = new int[]{0,1,2,3,4,5,6,7,8,9};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------

		// ----- test 5 -----
		p0 = new int[]{4,4,4,4,4,4,4,4,4,4,4};
		p1 = new int[]{0,1,2,3,4,5,6,7,8,9,10};
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
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
