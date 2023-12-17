package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM157_Div2_L2_Salary
{
	public int howMuch(String[] arrival, String[] departure, int wage)
	{
        int n = arrival.length;
        double sum = 0;

        for (int i = 0; i < n; i++)
        {
            String[] a = arrival[i].split(":");
            int ahour = Integer.parseInt(a[0]);
            int amin = Integer.parseInt(a[1]);
            int asec = Integer.parseInt(a[2]);
            int aseconds = ahour*3600 + amin*60 + asec;

            String[] d = departure[i].split(":");
            int dhour = Integer.parseInt(d[0]);
            int dmin = Integer.parseInt(d[1]);
            int dsec = Integer.parseInt(d[2]);
            int dseconds = dhour*3600 + dmin*60 + dsec;

            double ot = 0, tim = 0;
            for (int t = 0; t < 24 * 3600; t++)
            {
                if (t >= aseconds && t < dseconds)
                    if (t < 6 * 3600 || t >= 18 * 3600)
                        ot++;
                    else
                        tim++;
            }
            sum += tim / 3600.0 * wage + ot / 3600.0 * wage * 1.5;           
        }

        return (int)sum;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, String[] p1, int p2, boolean hasAnswer, int p3) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}" + "," + "{");
		for (int i = 0; p1.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p1[i] + "\"");
		}
		System.out.print("}" + "," + p2);
		System.out.println("]");
		SRM157_Div2_L2_Salary obj;
		int answer;
		obj = new SRM157_Div2_L2_Salary();
		long startTime = System.currentTimeMillis();
		answer = obj.howMuch(p0, p1, p2);
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
		
		String[] p0;
		String[] p1;
		int p2;
		int p3;
		
		// ----- test 0 -----
		p0 = new String[]{"08:00:00","13:00:00","19:27:32"};
		p1 = new String[]{"12:00:00","17:00:00","20:48:10"};
		p2 = 1000;
		p3 = 10015;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new String[]{"01:05:47","16:48:12"};
		p1 = new String[]{"09:27:30","21:17:59"};
		p2 = 2000;
		p3 = 33920;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new String[]{"00:00:00"};
		p1 = new String[]{"23:59:59"};
		p2 = 10000;
		p3 = 299995;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new String[]{"10:00:00"};
		p1 = new String[]{"18:00:00"};
		p2 = 10000;
		p3 = 80000;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new String[]{"22:19:46"};
		p1 = new String[]{"23:12:46"};
		p2 = 5320;
		p3 = 7049;
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
