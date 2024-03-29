package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM560_Div2_L2_TomekPhone
{
	public int minKeystrokes(int[] frequencies, int[] keySizes)
	{
        Arrays.sort(frequencies);
        Arrays.sort(keySizes);
        frequencies = reverseArray(frequencies);
        keySizes = reverseArray(keySizes);
        int n = frequencies.length;
        int k = keySizes.length;
        
        int keys = 0;
        for (int i = 0; i < k; i++)
            keys += keySizes[i];
        if (keys < n) return -1;

        int sum = 0, fact = 1, ind = 0;
        for (int i = 0; i < n; i++)
        {
            if (ind == k || keySizes[ind] == 0)
            {
                ind = 0;
                fact++;
            }
            keySizes[ind++]--;
            sum += frequencies[i] * fact;
        }
        return sum;
	}
	
	int[] reverseArray(int[] a)
	{
		int n = a.length;
        for (int i = 0; i < n / 2; i++) {
        	int t = a[i]; 
        	a[i] = a[n-1-i];
        	a[n-1-i] = t;
        }
        return a;
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
		SRM560_Div2_L2_TomekPhone obj;
		int answer;
		obj = new SRM560_Div2_L2_TomekPhone();
		long startTime = System.currentTimeMillis();
		answer = obj.minKeystrokes(p0, p1);
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
		p0 = new int[]{7,3,4,1};
		p1 = new int[]{2,2};
		p2 = 19;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{13,7,4,20};
		p1 = new int[]{2,1};
		p2 = -1;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{11,23,4,50,1000,7,18};
		p1 = new int[]{3,1,4};
		p2 = 1164;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{100,1000,1,10};
		p1 = new int[]{50};
		p2 = 1234;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		p1 = new int[]{10,10,10,10,10,10,10,10};
		p2 = 3353;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
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
