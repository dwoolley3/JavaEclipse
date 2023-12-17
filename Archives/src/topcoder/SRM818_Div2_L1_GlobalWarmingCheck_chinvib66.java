package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM818_Div2_L1_GlobalWarmingCheck_chinvib66
{
	public static int calc(int i, int M) {
		//long temp = (i*i)%M + 4*i + 7;  // i*i is int*int, which will overflow
		int temp = (int)((1L * i*i + 4*i + 7) % M); // improved
		return temp%M;
	}
	
	public int[] solve(int N, int M, int Y)
	{		
		int[] ans = new int[2];
		int sum = 0;
		
		for (int i = 0; i<Y;i++) {
			sum += calc(i, M);
		}
		
		// N=1000000,M=100,Y=888888 will give wrong min answer of 0
		// since sum/Y is int/int and not the desired double/double
		// Could have used:
		double[] maxa = {(double)sum/Y, 0};
		double[] mina = {M+2, 0};
		
		//int[] maxa = {sum, 0};  //double[] maxa = {sum/Y, 0};
		//int[] mina = {sum, 0};  //double[] mina = {sum/Y, 0};
		
		int i = 0;
		int j = Y;
		
		while (j<N) {
			sum = sum - calc(i, M) + calc(j, M);
			i++;
			j++;
			//int temp = sum;   // double temp = (double) sum/Y;
			double temp = (double) sum/Y;
			maxa[0] = Math.max(maxa[0], temp);
			if (maxa[0] == temp) maxa[1] = i;
//			if(temp >= maxa[0]) {
//				maxa[0] = temp;
//				maxa[1] = i;
//			}
			double curr_min_avg = Math.min(mina[0], temp);
			if (curr_min_avg != mina[0]) {
				mina[0] = curr_min_avg;
				mina[1] = i;
			}
//			if (temp < mina[0]) {
//				mina[0] = temp;
//				mina[1] = i;
//			}
		}
		
		ans[0] = (int) mina[1];
		ans[1] = (int) maxa[1];
		return ans;
		
//		for (int i = 0; i < N; i++) {
//			t[i] = (int)((1L * i*i + 4*i + 7) % M);
//			//t[i] = ((i%M * i%M) % M + (4 * i%M) % M + 7) % M;
//		}
//		
//		int j = 0, sum = 0;
//		for (j = 0; j < Y; j++) {
//			sum += t[j];
//		}
//		int loSum = sum, hiSum = sum;
//		int lo = 0, hi = 0;
//		for (j = Y; j < N; j++) {
//			sum -= t[j-Y];
//			sum += t[j];
//			if (sum < loSum) {
//				loSum = sum;
//				lo = j - Y + 1;
//			}
//			if (sum >= hiSum) {
//				hiSum = sum;
//				hi = j - Y + 1;
//			}
//		}
//		int[] ans = new int[] {lo, hi};
//		return ans;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, boolean hasAnswer, int[] p3) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2);
		System.out.println("]");
		SRM818_Div2_L1_GlobalWarmingCheck_chinvib66 obj;
		int[] answer;
		obj = new SRM818_Div2_L1_GlobalWarmingCheck_chinvib66();
		long startTime = System.currentTimeMillis();
		answer = obj.solve(p0, p1, p2);
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
		
		int p0;
		int p1;
		int p2;
		int[] p3;
		
		// ----- test 0 -----
		p0 = 12;
		p1 = 20;
		p2 = 1;
		p3 = new int[]{8,4};
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 12;
		p1 = 20;
		p2 = 4;
		p3 = new int[]{6,2};
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 12;
		p1 = 1;
		p2 = 3;
		p3 = new int[]{0,9};
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 57000;
		p1 = 997;
		p2 = 23;
		p3 = new int[]{984,56322};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 1000000;
		p1 = 100;
		p2 = 888888;
		p3 = new int[]{23,111105};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 521447;
		p1 = 67;
		p2 = 501937;
		p3 = new int[]{39,19509};
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
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
