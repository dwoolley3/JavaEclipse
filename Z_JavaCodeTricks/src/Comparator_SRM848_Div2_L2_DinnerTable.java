import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class Comparator_SRM848_Div2_L2_DinnerTable
{
	class Pair {
		int a,b;
		public Pair(int a, int b)
		{
			this.a = a;
			this.b = b;
		}
	}
	
	public long count(int R, int C, int L, int N)
	{
		int[] r = new int[N];
		int[] c = new int[N];
		Pair[] p = new Pair[N];
		for (int i = 0; i < N; i++) {
			r[i] = (int)((4L*i*i + 7*i) % R);
			c[i] = (int)((1L*i*i*i + 8L*i + 13) % C);
			p[i] = new Pair(r[i],c[i]);
		}
	
		// Need to have a sort that first compares a, but then compares b when a's are equal.
		// not Arrays.sort(p, (o1, o2) -> o1.a - o2.a);	
		
	    Arrays.sort(p, new Comparator<Pair>() {
	        @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.a == o2.a)
                    return o1.b - o2.b;
                return o1.a - o2.a;
            }
        });
	       
		long cnt = 0;		
		int lastr = 0, lastc = 0;
		int rowsWithPillars = 0;
		for (int i = 0; i < N; i++) { 	
			lastc = 0;
			lastr = p[i].a;
			while (i < N && p[i].a == lastr) {
				//System.out.println(i + " " + p[i].a + " " + p[i].b);
				cnt += Math.max((p[i].b - lastc) - L + 1, 0);
				lastc = p[i].b;
				i++;
			}
			cnt += Math.max((C-1 - lastc) - L + 1, 0);
			i--;
			rowsWithPillars++;
		}
		System.out.println(rowsWithPillars);
		cnt += 1L * (R - rowsWithPillars) * Math.max(C - L + 1, 0);	
		
		int t = R; R = C; C = t;
		p = new Pair[N];
		for (int i = 0; i < N; i++) {
			p[i] = new Pair(c[i],r[i]);
			//t = p[i].a; p[i].a = p[i].b; p[i].b = t;
		}
	    Arrays.sort(p, new Comparator<Pair>() {
	        @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.a == o2.a)
                    return o1.b - o2.b;
                return o1.a - o2.a;
            }
        });
	    

		lastr = 0; lastc = 0;
		rowsWithPillars = 0; 
		for (int i = 0; i < N; i++) { 	
			lastc = 0;
			lastr = p[i].a;
			while (i < N && p[i].a == lastr) {
				//System.out.println(i + " " + p[i].a + " " + p[i].b);
				cnt += Math.max((p[i].b - lastc) - L + 1, 0);
				lastc = p[i].b;
				i++;
			}
			cnt += Math.max((C-1 - lastc) - L + 1, 0);
			i--;
			rowsWithPillars++;
		}
		System.out.println(rowsWithPillars);
		cnt += 1L * (R - rowsWithPillars) * Math.max(C - L + 1, 0);	
		
		// Need to have a sort that first compares a, but then compares b when a's are equal.
		// not Arrays.sort(p, (o1, o2) -> o1.b - o2.b);	
		
//	    Arrays.sort(p, new Comparator<Pair>() {
//	        @Override
//            public int compare(Pair o1, Pair o2) {
//                if(o1.b == o2.b)
//                    return o1.a - o2.a;
//                return o1.b - o2.b;
//            }
//        });
//		
//		for (int i = 0; i < N; i++) { 
//			lastr = 0;
//			lastc = p[i].b;
//			while (i < N && p[i].b == lastc) {
//				//System.out.println(i + " " + p[i].a + " " + p[i].b);
//				cnt += Math.max((p[i].a - lastr) - L + 1, 0);
//				lastr = p[i].a;
//				i++;
//			}
//			cnt += Math.max((R-1 - lastr) - L + 1, 0);
//			i--;
//			colsWithPillars++;
//		}
//		cnt += 1L * (C - colsWithPillars) * Math.max(R - L + 1, 0);	
		
		return cnt;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int p0, int p1, int p2, int p3, boolean hasAnswer, long p4) {
		System.out.print("Test " + testNum + ": [" + p0 + "," + p1 + "," + p2 + "," + p3);
		System.out.println("]");
		Comparator_SRM848_Div2_L2_DinnerTable obj;
		long answer;
		obj = new Comparator_SRM848_Div2_L2_DinnerTable();
		long startTime = System.currentTimeMillis();
		answer = obj.count(p0, p1, p2, p3);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p4);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p4;
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
		int p3;
		long p4;
		
		// ----- test 3 -----
		p0 = 5;
		p1 = 6;
		p2 = 4;
		p3 = 2;
		p4 = 20L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = 4;
		p1 = 1;
		p2 = 2;
		p3 = 100000;
		p4 = 0L;
		all_right = KawigiEdit_RunTest(7, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = 5;
		p1 = 6;
		p2 = 6;
		p3 = 0;
		p4 = 5L;
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = 5;
		p1 = 6;
		p2 = 5;
		p3 = 0;
		p4 = 16L;
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = 5;
		p1 = 6;
		p2 = 7;
		p3 = 0;
		p4 = 0L;
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = 5;
		p1 = 6;
		p2 = 4;
		p3 = 2;
		p4 = 20L;
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = 5;
		p1 = 6;
		p2 = 4;
		p3 = 3;
		p4 = 20L;
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = 5;
		p1 = 6;
		p2 = 4;
		p3 = 5;
		p4 = 16L;
		all_right = KawigiEdit_RunTest(5, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 6 -----
		p0 = 100000;
		p1 = 100000;
		p2 = 10000;
		p3 = 20000;
		p4 = 17666220715L;
		all_right = KawigiEdit_RunTest(6, p0, p1, p2, p3, true, p4) && all_right;
		// ------------------
		
		// ----- test 7 -----
		p0 = 4;
		p1 = 1;
		p2 = 2;
		p3 = 100000;
		p4 = 0L;
		all_right = KawigiEdit_RunTest(7, p0, p1, p2, p3, true, p4) && all_right;
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
