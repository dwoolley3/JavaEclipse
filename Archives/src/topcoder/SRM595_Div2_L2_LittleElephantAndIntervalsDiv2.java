package topcoder;
import java.util.*;   //ArrayList
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM595_Div2_L2_LittleElephantAndIntervalsDiv2
{
	public int getNumber(int M, int[] L, int[] R)
	{
        int[] c = new int[M + 1];
        int n = L.length;
        for (int i = 0; i < n; i++)
            for (int j = L[i]; j <= R[i]; j++)
                c[j] = i+1;

        int cnt = 0;

        int[] u = new int[n + 1];
        for (int i = 1; i <= M; i++)
            if (c[i] > 0)
            {
                if (u[c[i]] == 0) cnt++;
                u[c[i]] = 1;
            }
        
        //Alternate way to obtain count of unique numbers
        ArrayList<Integer> un = new ArrayList<Integer>();
        for (int i = 1; i <= M; i++)
            if (c[i] > 0 && !un.contains(c[i])) un.add(c[i]);
        cnt = un.size();

        int pow2 = (int)Math.pow(2, cnt);
        return pow2;
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
		SRM595_Div2_L2_LittleElephantAndIntervalsDiv2 obj;
		int answer;
		obj = new SRM595_Div2_L2_LittleElephantAndIntervalsDiv2();
		long startTime = System.currentTimeMillis();
		answer = obj.getNumber(p0, p1, p2);
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
		p1 = new int[]{1,2,3};
		p2 = new int[]{1,2,3};
		p3 = 8;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 3;
		p1 = new int[]{1,1,2};
		p2 = new int[]{3,1,3};
		p3 = 4;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 100;
		p1 = new int[]{47};
		p2 = new int[]{74};
		p3 = 2;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 100;
		p1 = new int[]{10,20,50};
		p2 = new int[]{20,50,100};
		p3 = 8;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 42;
		p1 = new int[]{5,23,4,1,15,2,22,26,13,16};
		p2 = new int[]{30,41,17,1,21,6,28,30,15,19};
		p3 = 512;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
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
