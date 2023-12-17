package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class TCO19_R2B_L1_MedianFaking
{
	public int[] minimize(int F, int M, int[] data, int goal)
	{
		int n = F * M;
		Pair[] p = new Pair[n];
		int tot = 0;
		for (int i = 0; i < F; i++)
			for (int j = 0; j < M; j++)
			{
				p[tot] = new Pair(data[tot], i);
				tot++;
			}
		
		Arrays.sort(p, (o1, o2) -> o1.a - o2.a);
		int mid = n / 2; 
		if (n%2 == 0) mid--;

		int person = 0, changes = 0;
		int[] beyond = new int[F];
		if (p[mid].a == goal) {
			return new int[] {person, changes};	
		}
		
		int dif = 0, ind = -1;
		if (p[mid].a < goal) {
			for (int i = 0; i < n; i++) {
				if (p[i].a < goal)
					beyond[p[i].b]++;
				else if (ind == -1) {
					ind = i;
				}
			}
			if (ind == -1) ind = n;
			
		} else if (p[mid].a > goal) {
			for (int i = 0; i < n; i++) {
				if (p[i].a > goal)
					beyond[p[i].b]++;
				else {
					ind = i;
				}
			}
		} 
		dif = Math.abs(ind - mid);	
		Arrays.sort(beyond);
		int f = F-1;
		changes = dif;
		while (dif > 0) {
			dif -= beyond[f--];
			person++;
		}
		
		return new int[] {person, changes};			
	}
	
	class Pair {
		int a,b;
		public Pair(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int[] p2, int p3, boolean hasAnswer, int[] p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + "{");
		for (int i = 0; p2.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p2[i]);
		}
		System.out.print("}" + "," + p3);
		System.out.println("]");
		TCO19_R2B_L1_MedianFaking obj;
		int[] answer;
		obj = new TCO19_R2B_L1_MedianFaking();
		long startTime = System.currentTimeMillis();
		answer = obj.minimize(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p4.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p4[i]);
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
			if (answer.length != p4.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p4[i]) {
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
		
		int p0;
		int p1;
		int[] p2;
		int p3;
		int[] p4;
		
		// ----- test 0 -----
		p0 = 5;
		p1 = 5;
		p2 = new int[]{1,2,3,4,5,10,9,8,7,6,25,24,23,22,21,18,16,17,19,20,11,13,12,14,15};
		p3 = 8;
		p4 = new int[]{1,5};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 5;
		p2 = new int[]{1,2,25,24,23,3,4,22,21,20,5,6,19,18,17,7,16,15,14,13,8,12,11,10,9};
		p3 = 8;
		p4 = new int[]{2,5};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 1;
		p1 = 4;
		p2 = new int[]{10,40,30,20};
		p3 = 20;
		p4 = new int[]{0,0};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 4;
		p1 = 3;
		p2 = new int[]{3,8,12,3,8,12,3,8,12,8,12,17};
		p3 = 12;
		p4 = new int[]{1,2};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 5;
		p1 = 1;
		p2 = new int[]{10,20,30,40,50};
		p3 = 23;
		p4 = new int[]{1,1};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 5;
		p1 = 1;
		p2 = new int[]{10,20,30,40,50};
		p3 = 60;
		p4 = new int[]{3,3};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 5;
		p1 = 1;
		p2 = new int[]{10,20,30,40,50};
		p3 = 0;
		p4 = new int[]{3,3};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 3;
		p1 = 2;
		p2 = new int[]{14, 4, 13, 21, 10, 3};
		p3 = 22;
		p4 = new int[]{2,4};
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
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
