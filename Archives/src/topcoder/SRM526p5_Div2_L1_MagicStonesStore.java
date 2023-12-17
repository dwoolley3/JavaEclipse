package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM526p5_Div2_L1_MagicStonesStore
{
    boolean IsPrime(int num)
    {
        if (num == 1) return false;
        for (int i = 2; i * i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public String ableToDivide(int n)
	{
        n *= 2;
        int p2;
        for (int i = 2; i < n; i++)
        {
            p2 = n - i;
            if (IsPrime(i) && IsPrime(p2))
                return "YES";
        }
        return "NO";
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, String p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM526p5_Div2_L1_MagicStonesStore obj;
		String answer;
		obj = new SRM526p5_Div2_L1_MagicStonesStore();
		long startTime = System.currentTimeMillis();
		answer = obj.ableToDivide(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p1 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p1);
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
		String p1;
		
		// ----- test 0 -----
		p0 = 1;
		p1 = "NO";
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = "YES";
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = "YES";
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = "YES";
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
