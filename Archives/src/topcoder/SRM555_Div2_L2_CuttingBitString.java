package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM555_Div2_L2_CuttingBitString
{
    int k = 0;
    
	public int getmin(String S)
	{
        int n = S.length();
        int INF = 1000;
        int[] mem = new int[n+1];
        for (int i = 0; i < n; i++)
        {
            mem[i] = INF;
            if (ok(S.substring(0, i + 1)))
                mem[i] = 1;
            else
                for (int j = 1; j <= i; j++)
                    if (ok(S.substring(j, i+1)))
                        mem[i] = Math.min(mem[i], mem[j-1] + 1);
        }
        if (mem[n - 1] == INF) return -1;
        return mem[n - 1];
	}
	
    public boolean ok(String s)
    {
        if (s.charAt(0) == '0') return false;
        long num = getBase10(s);
        return isPowOf5(num);
    }

    public boolean isPowOf5(long i)
    {
        while (i > 0 && i % 5 == 0)
            i /= 5;
        return (i == 1);
    }

    public long getBase10(String b2)
    {
        //Convert base 2 b2 to base 10 num
        long num = 0;
        for (char ch : b2.toCharArray())
            num = num * 2 + (ch - '0');
        return num;
    }
    
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM555_Div2_L2_CuttingBitString obj;
		int answer;
		obj = new SRM555_Div2_L2_CuttingBitString();
		long startTime = System.currentTimeMillis();
		answer = obj.getmin(p0);
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
		
		String p0;
		int p1;
		
		// ----- test 0 -----
		p0 = "101101101";
		p1 = 3;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "1111101";
		p1 = 1;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "00000";
		p1 = -1;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "110011011";
		p1 = 3;
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "1000101011";
		p1 = -1;
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "111011100110101100101110111";
		p1 = 5;
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
