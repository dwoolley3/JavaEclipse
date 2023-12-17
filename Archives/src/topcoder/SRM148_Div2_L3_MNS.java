package topcoder;
import java.util.*;   //for ArrayList
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM148_Div2_L3_MNS
{
	public int combos(int[] numbers)
	{
		int n = numbers.length;
        HashSet<Integer> d = new HashSet<Integer>();

        //Generate permutations of digits 0...n-1
        int[] s = new int[n];
        for (int i = 0; i < n; i++)
            s[i] = numbers[i];
        List<int[]> p = new ArrayList<int[]>();
        permute(0, s, p);

        for (int i = 0; i < p.size(); i++)
        {
            int sum = p.get(i)[0] + p.get(i)[1] + p.get(i)[2];
            if (sum == p.get(i)[3] + p.get(i)[4] + p.get(i)[5] &&
                sum == p.get(i)[6] + p.get(i)[7] + p.get(i)[8] &&
                sum == p.get(i)[0] + p.get(i)[3] + p.get(i)[6] &&
                sum == p.get(i)[1] + p.get(i)[4] + p.get(i)[7] &&
                sum == p.get(i)[2] + p.get(i)[5] + p.get(i)[8])
            {
                int num = 0, pow = 1;
                for (int j = 0; j < n; j++)
                {
                    num += p.get(i)[n-j-1] * pow;
                    pow *= 10;
                }
                d.add(num);
            }            
        }
        return d.size();
	}

    public void permute(int n, int[] s, List<int[]> p)
    {
        // Recursive method to permute n+1 elements of array s (0 based),
        // storing permuted sets in array p.
        // Arrays and Lists are passed by reference by default; int is not.
        int temp;

        if (n == s.length - 1)
        {
            //Need to add a "value" x rather than a "reference" s
            int[] x = new int[s.length];
            System.arraycopy(s, 0, x, 0, s.length);
            p.add(x);
        }
        else // (n < s.Length - 1)
        {
            for (int i = n; i < s.length; i++)
            {
                temp = s[n]; s[n] = s[i]; s[i] = temp;
                permute(n + 1, s, p);
                temp = s[n]; s[n] = s[i]; s[i] = temp;
            }
        }
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
		SRM148_Div2_L3_MNS obj;
		int answer;
		obj = new SRM148_Div2_L3_MNS();
		long startTime = System.currentTimeMillis();
		answer = obj.combos(p0);
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
		p0 = new int[]{1,2,3,3,2,1,2,2,2};
		p1 = 18;
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{4,4,4,4,4,4,4,4,4};
		p1 = 1;
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{1,5,1,2,5,6,2,3,2};
		p1 = 36;
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{1,2,6,6,6,4,2,6,4};
		p1 = 0;
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
