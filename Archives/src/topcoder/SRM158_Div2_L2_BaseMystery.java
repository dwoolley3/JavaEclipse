package topcoder;
import java.util.*;  //ArrayList
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM158_Div2_L2_BaseMystery
{
	public int[] getBase(String equation)
	{
        int n = equation.length();
        int start = 0, sum;
        for (int i = 0; i < n; i++)
            start = Math.max(start, GetVal(equation.charAt(i)));
        if (start < 1) start = 1;

        ArrayList<Integer> b = new ArrayList<Integer>();
        String[] s = equation.split("[+=]"); //, "=");
        for (int i = start + 1; i <= 20; i++)
        {
            sum = ConvertToBase10(s[0], i) + ConvertToBase10(s[1], i);
            if (sum == ConvertToBase10(s[2], i))
                b.add(i);
        }
        int[] ret = new int[b.size()];
        for (int i = 0; i < b.size(); i++) ret[i] = b.get(i);
        return ret;
	}

    private int ConvertToBase10(String s, int b)
    {
        int sum = 0;
        for (char c : s.toCharArray())
            sum = sum * b + GetVal(c);
        return sum;
    }

    private int GetVal(char c)
    {
        return "0123456789ABCDEFGHIJ".indexOf(c);
        //if (c >= '0' && c <= '9') return c - '0';
        //else return c - 'A' + 10;
    }
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, boolean hasAnswer, int[] p1) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"");
		System.out.println("]");
		SRM158_Div2_L2_BaseMystery obj;
		int[] answer;
		obj = new SRM158_Div2_L2_BaseMystery();
		long startTime = System.currentTimeMillis();
		answer = obj.getBase(p0);
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
		
		String p0;
		int[] p1;
		
		// ----- test 0 -----
		p0 = "1+1=2";
		p1 = new int[]{3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "1+1=10";
		p1 = new int[]{2};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "1+1=3";
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "ABCD+211=B000";
		p1 = new int[]{14};
		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "ABCD+322=B000";
		p1 = new int[]{15};
		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "1+0=1";
		p1 = new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = "GHIJ+1111=HJ00";
		p1 = new int[]{20};
		all_right = KawigiEdit_RunTest(6, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = "1234+8765=9999";
		p1 = new int[]{10,11,12,13,14,15,16,17,18,19,20};
		all_right = KawigiEdit_RunTest(7, p0, true, p1) && all_right;
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