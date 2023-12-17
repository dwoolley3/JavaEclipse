//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class dp_SRM558_Div2_L2_Stamp
{
	int oo = 1_000_000_000;
	
	public int getMinimumCost(String desiredColor, int stampCost, int pushCost)
	{
        int N = desiredColor.length();
        int[] cost = new int[N + 1];
        int[] a = new int[N];
        //convert character to int for convenience
        for (int i = 0; i < N; i++)
        {
            char c = desiredColor.charAt(i);
            if (c == '*') a[i] = 7;
            if (c == 'R') a[i] = 1;
            if (c == 'G') a[i] = 2;
            if (c == 'B') a[i] = 4;
        }

        int res = oo;
        //try all the posibility of length of the stamp
        for (int len = 1; len <= N; len++)
        {
            cost[0] = 0;
            //dynamic program for the minimum cost
            for (int i = 1; i <= N; i++) cost[i] = oo;

            for (int i = 0; i < N; i++)
            {
                //with each position i, we try to paint until the furthest position j as long as we can use just 1 color
                int color = 7;
                for (int j = i; j < N; j++)
                {
                    color &= a[j];
                    if (color == 0) break;
                    int seg = j - i + 1;
                    if (seg < len) continue;
                    if (cost[i] != oo)
                    {
                        cost[j + 1] = Math.min(cost[j + 1], 
                            cost[i] + ((seg + len - 1) / len) * pushCost);
                    }
                }
            }
            if (cost[N] != oo)
            {
                res = Math.min(res, cost[N] + stampCost * len);
            }
        }

        return res;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, int p1, int p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + p1 + "," + p2);
		System.out.println("]");
		dp_SRM558_Div2_L2_Stamp obj;
		int answer;
		obj = new dp_SRM558_Div2_L2_Stamp();
		long startTime = System.currentTimeMillis();
		answer = obj.getMinimumCost(p0, p1, p2);
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
		
		String p0;
		int p1;
		int p2;
		int p3;
		
		// ----- test 0 -----
		p0 = "RRGGBB";
		p1 = 1;
		p2 = 1;
		p3 = 5;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "R**GB*";
		p1 = 1;
		p2 = 1;
		p3 = 5;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "BRRB";
		p1 = 2;
		p2 = 7;
		p3 = 30;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "R*RR*GG";
		p1 = 10;
		p2 = 58;
		p3 = 204;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "*B**B**B*BB*G*BBB**B**B*";
		p1 = 5;
		p2 = 2;
		p3 = 33;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = "*R*RG*G*GR*RGG*G*GGR***RR*GG";
		p1 = 7;
		p2 = 1;
		p3 = 30;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, true, p3) && all_right;
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
