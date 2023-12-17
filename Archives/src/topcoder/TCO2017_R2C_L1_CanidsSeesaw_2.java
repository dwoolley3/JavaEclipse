package topcoder;
import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;

public class TCO2017_R2C_L1_CanidsSeesaw_2 {
	
	public class Fox implements Comparable<Fox> {
		int w, ind;

		public Fox(int W, int Ind) {
			w = W;
			ind = Ind;
		}

		@Override
		public int compareTo(Fox F) {
			return Integer.compare(this.w, F.w);
		}
	}

	public int[] construct(int[] wolf, int[] fox, int k) {
		int n = wolf.length;
		int[] wSum = new int[n];
		wSum[0] = wolf[0];
		for (int i = 1; i < n; i++)
			wSum[i] = wSum[i - 1] + wolf[i];

		Fox[] F = new Fox[n];
		for (int i = 0; i < n; i++)
			F[i] = new Fox(fox[i], i);

		//Reverse order of array (Descending order)
		Arrays.sort(F, (o1, o2) -> Integer.compare(o2.w,o1.w));
		if (fScore(F, wSum) < k)
			return new int[] {};
		
		Arrays.sort(F);  //Ascending order
		if (fScore(F, wSum) > k)
			return new int[] {};

		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && fScore(F, wSum) < k) {
				Fox tmp = F[j];
				F[j] = F[j - 1];
				F[j - 1] = tmp;
				j--;
			}
		}
		if (fScore(F, wSum) == k)
			return perm(F);
		
		return new int[] {};
	}

	public int[] perm(Fox[] f) {
		int n = f.length;
		int[] ans = new int[n];
		for (int k = 0; k < n; k++)
			ans[k] = f[k].ind;
		return ans;
	}

	public int fScore(Fox[] f, int[] wSum) {
		int n = f.length;
		int score = 0, fSum = 0;
		for (int i = 0; i < n; i++) {
			fSum += f[i].w;
			if (fSum > wSum[i])
				score++;
		}
		return score;
	}

	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, int p2, boolean hasAnswer, int[] p3) {
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
			System.out.print(p1[i]);
		}
		System.out.print("}" + "," + p2);
		System.out.println("]");
		TCO2017_R2C_L1_CanidsSeesaw_2 obj;
		int[] answer;
		obj = new TCO2017_R2C_L1_CanidsSeesaw_2();
		long startTime = System.currentTimeMillis();
		answer = obj.construct(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.print("\t" + "{");
			for (int i = 0; p3.length > i; ++i) {
				if (i > 0) {
					System.out.print(",");
				}
				System.out.print(p3[i]);
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
			if (answer.length != p3.length) {
				res = false;
			} else {
				for (int i = 0; answer.length > i; ++i) {
					if (answer[i] != p3[i]) {
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

		int[] p0;
		int[] p1;
		int p2;
		int[] p3;

		// ----- test 0 -----
		p0 = new int[] { 3, 1 };
		p1 = new int[] { 4, 2 };
		p2 = 1;
		p3 = new int[] { 1, 0 };
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------

		// ----- test 1 -----
		p0 = new int[] { 1, 3 };
		p1 = new int[] { 4, 2 };
		p2 = 1;
		p3 = new int[] {};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------

		// ----- test 2 -----
		p0 = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		p1 = new int[] { 1, 100, 1, 100, 1, 100, 1, 100, 1, 100 };
		p2 = 7;
		p3 = new int[] { 0, 2, 4, 1, 6, 3, 5, 7, 9, 8 };
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------

		// ----- test 3 -----
		p0 = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		p1 = new int[] { 1, 100, 1, 100, 1, 100, 1, 100, 1, 100 };
		p2 = 4;
		p3 = new int[] {};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------

		// ----- test 4 -----
		p0 = new int[] { 2 };
		p1 = new int[] { 1 };
		p2 = 0;
		p3 = new int[] { 0 };
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
// Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
