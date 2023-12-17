package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM577_Div2_L3_EllysCoprimesDiv2
{
	public int getCount(int[] num)
	{
        Arrays.sort(num);
        int n = num.length;
        int sum = 0;
        for (int i = 0; i < n-1; i++)
        {
            if (GCD(num[i], num[i + 1]) > 1)
                sum += GetMin(num[i], num[i + 1]);
        }
        return sum;
	}

    private int GCD(int a, int b)
    {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    private int GetMin(int a, int b)
    {
        int last = a;
        for (int i = a + 1; i < b; i++)
            if (GCD(last, i) == 1 && GCD(i, b) == 1)
            {
                return 1;
            }
        return 2;
    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM577_Div2_L3_EllysCoprimesDiv2 obj;
		int answer;
		obj = new SRM577_Div2_L3_EllysCoprimesDiv2();
		long startTime = System.currentTimeMillis();
		answer = obj.getCount(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p1);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p1;
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
		int p1;
		
		// ----- test 0 -----
		p0 = new int[]{2200,42,2184,17};
		p1 = 3;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{13,1,6,20,33};
		p1 = 0;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{7,42};
		p1 = 1;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{55780,44918,55653,4762,41536,40083,79260,7374,24124,91858,7856,12999,64025,12706,19770,71495,32817,79309,53779,8421,97984,34586,893,64549,77792,12143,52732,94416,54207,51811,80845,67079,14829,25350,22976,23932,62273,58871,82358,13283,33667,64263,1337,42666};
		p1 = 15;
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
