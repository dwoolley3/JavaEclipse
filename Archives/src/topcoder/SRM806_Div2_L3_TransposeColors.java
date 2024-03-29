package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM806_Div2_L3_TransposeColors
{
	public int[] move(int N)
	{
		ArrayList<Integer> al = new ArrayList<>();
		if (N == 1) {			
		} else if (N == 2) {
			al.add(2); al.add(1); al.add(4);
		} else {
			int b[][] = new int[N][N];
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++) {
					b[i][j] = i+1;
				}
			
			int x = 0, y = 1;
			al.add(x*N+y);
			boolean ok = true;
			while (ok) {
				ok = false;
				for (int i = 0; i < N && !ok; i++) {
					for (int j = 0; j < N && !ok; j++) {
						if (i == x && j == y) continue;
						if (b[i][j] == y+1 && i != x) {
							b[x][y] = y+1;
							al.add(i*N+j);
							x= i; y = j;
							ok = true;								
						}
					}			
				}
			}
			al.add(N*N);			
		}		
		
		int n = al.size();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = al.get(i);
		}
		return a;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, boolean hasAnswer, int[] p1) {
		System.out.print("Test " + testNum + ": [" + p0);
		System.out.println("]");
		SRM806_Div2_L3_TransposeColors obj;
		int[] answer;
		obj = new SRM806_Div2_L3_TransposeColors();
		long startTime = System.currentTimeMillis();
		answer = obj.move(p0);
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
		
		int p0;
		int[] p1;
		
		// ----- test 0 -----
		p0 = 1;
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 2;
		p1 = new int[]{2,1,4};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 3;
		p1 = new int[]{1,5,6,2,7,3,9};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
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
