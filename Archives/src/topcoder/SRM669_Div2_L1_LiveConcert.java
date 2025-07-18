package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM669_Div2_L1_LiveConcert
{
	class Pair {
		int a; 
		String b;
		public Pair(int a, String b)
		{
			this.a = a;
			this.b = b;
		}
	}
	
	public int maxHappiness(int[] h, String[] s)
	{
		int m = h.length;
		Pair[] p = new Pair[m];
		for (int i = 0; i < m; i++) 
			p[i] = new Pair(h[i],s[i]);
				
		Arrays.sort(p, (o1, o2) -> o1.a - o2.a);
		
		int sum = 0;
		ArrayList<String> al = new ArrayList<String>();
		for (int i = m-1; i >= 0; i--)
			if (!al.contains(p[i].b))
			{
				sum += p[i].a;
				al.add(p[i].b);
			}

		return sum;
		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, String[] p1, boolean hasAnswer, int p2) {
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
			System.out.print("\"" + p1[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		SRM669_Div2_L1_LiveConcert obj;
		int answer;
		obj = new SRM669_Div2_L1_LiveConcert();
		long startTime = System.currentTimeMillis();
		answer = obj.maxHappiness(p0, p1);
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
		String[] p1;
		int p2;
		
		// ----- test 0 -----
		p0 = new int[]{10,5,6,7,1,2};
		p1 = new String[]{"ciel","bessie","john","bessie","bessie","john"};
		p2 = 23;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{3,3,4,3,3};
		p1 = new String[]{"a","a","a","a","a"};
		p2 = 4;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{1,2,3,4,5,6,7,8,9,10,100};
		p1 = new String[]{"a","b","c","d","e","e","d","c","b","a","abcde"};
		p2 = 140;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{100};
		p1 = new String[]{"oyusop"};
		p2 = 100;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{100,100,100,100,100,100,100,100,100,100,100,100,100};
		p1 = new String[]{"haruka","chihaya","yayoi","iori","yukiho","makoto","ami","mami","azusa","miki","hibiki","takane","ritsuko"};
		p2 = 1300;
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
