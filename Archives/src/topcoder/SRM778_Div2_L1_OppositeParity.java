package topcoder;
import java.util.*;



public class SRM778_Div2_L1_OppositeParity
{
	public int[] rearrange(int[] A)
	{
		int n = A.length;
		int[] p = new int[n];
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p[i] = A[i] % 2;
			if (A[i] % 2 == 1) 
				odd.add(A[i]);
			else
				even.add(A[i]);
		}
		if (odd.size() != even.size()) return new int[] {};
		
		int eInd = 0, oInd = 0;
		for (int i = 0; i < n; i++)
			if (A[i] % 2 == 1)
				A[i] = even.get(eInd++);
			else
				A[i] = odd.get(oInd++);
		
		return A;		
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, boolean hasAnswer, int[] p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(p0[i]);
		}
		System.out.print("}");
		System.out.println("]");
		SRM778_Div2_L1_OppositeParity obj;
		int[] answer;
		obj = new SRM778_Div2_L1_OppositeParity();
		long startTime = System.currentTimeMillis();
		answer = obj.rearrange(p0);
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
		
		int[] p0;
		int[] p1;
		
		// ----- test 0 -----
		p0 = new int[]{1,4,1,4,2,1,3,5,6,2};
		p1 = new int[]{6,1,2,3,1,4,2,4,5,1};
		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{1,1,2};
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{3,1,4,1,5,9};
		p1 = new int[]{};
		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{27,18,281,828,45,90,452,3};
		p1 = new int[]{452,3,90,45,828,281,27,18};
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
