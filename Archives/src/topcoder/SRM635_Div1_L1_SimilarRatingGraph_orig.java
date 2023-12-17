package topcoder;
//import java.util.*;
//import java.util.regex.*;
//import java.text.*;
//import java.math.*;


public class SRM635_Div1_L1_SimilarRatingGraph_orig
{
	//TimeLimit exceeded
	public double maxLength(int[] date, int[] rating)
	{
		int n = date.length;
		long d1, r1, d2, r2, di, dj;
		double[] dist = new double[n];
		double len;
		for (int i = 1; i < n; i++)
		{
			d1 = date[i] - date[i-1];
			r1 = rating[i] - rating[i-1];
			len = Math.sqrt(d1*d1 + r1*r1);
			dist[i] = dist[i-1] + len;
		}
			
		double max = 0.0;
		for (int ln = 2; ln < n; ln++)
		{
			for (int i = 0; i < n-ln; i++)
				for (int j = i+1; j < n-ln+1; j++)
				{
					di = date[i+1] - date[i];
					dj = date[j+1] - date[j];
					boolean ok = true;
					for (int k = 0; k < ln-1; k++)
					{
						d1 = date[i+ k+1] - date[i+ k];
						r1 = rating[i+ k+1] - rating[i + k];
						d2 = date[j+ k+1] - date[j+ k];
						r2 = rating[j+ k+1] - rating[j + k];
						//if (d1 * r2 == d2 * r1)
						if (d1 * dj == d2 * di && r1 * dj == r2 * di)
							continue;
						ok = false;
						break;											
					}
					if (ok)
					{
						max = Math.max(max, dist[i+ln-1] - dist[i]);
						max = Math.max(max, dist[j+ln-1] - dist[j]);						
						//System.out.println(i + " " + j + " " + ln + " " + max);
					}
				}
		}
		return max;
	}
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, int[] p0, int[] p1, boolean hasAnswer, double p2) {
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
		System.out.print("}");
		System.out.println("]");
		SRM635_Div1_L1_SimilarRatingGraph_orig obj;
		double answer;
		obj = new SRM635_Div1_L1_SimilarRatingGraph_orig();
		long startTime = System.currentTimeMillis();
		answer = obj.maxLength(p0, p1);
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
			res = Math.abs(p2 - answer) <= 1e-9 * Math.max(1.0, Math.abs(p2));
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
		double p2;
		
		// ----- test 0 -----
		p0 = new int[]{1, 500000, 999999};
		p1 = new int[]{42, 42, 42};
		p2 = 499999.0;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{1, 2, 5, 7, 9, 15, 35, 37, 43, 47, 55};
		p1 = new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000};
		p2 = 20.0D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{1,2,3};
		p1 = new int[]{1,2,3};
		p2 = 1.4142135623730951D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{1,2};
		p1 = new int[]{1,2};
		p2 = 0.0D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 0 -----
		p0 = new int[]{1,2,4,8,16,32};
		p1 = new int[]{1,2,4,8,16,32};
		p2 = 42.42640687119285D;
		all_right = KawigiEdit_RunTest(0, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = new int[]{81,104,120,124,134,137};
		p1 = new int[]{1866,2332,2510,2678,2876,3002};
		p2 = 168.04761230080004D;
		all_right = KawigiEdit_RunTest(1, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = new int[]{10,11,13,15,19};
		p1 = new int[]{10,14,15,23,25};
		p2 = 12.7183472062349D;
		all_right = KawigiEdit_RunTest(2, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = new int[]{1,2,3,4};
		p1 = new int[]{1700,1800,1750,1850};
		p2 = 100.00499987500625D;
		all_right = KawigiEdit_RunTest(3, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = new int[]{1,2,3,4};
		p1 = new int[]{1,4,9,16};
		p2 = 0.0D;
		all_right = KawigiEdit_RunTest(4, p0, p1, true, p2) && all_right;
		// ------------------
		
		// ----- test 5 -----
		p0 = new int[]{5,11,25,58,92,162,255,350,458,566,677,792,919,1051,1189,1331,1489,1673,1882,2093,2315,2541,2771,3012,3254,3524,3797,4087,4379,4675,4973,5278,5588,5904,6225,6550,6888,7249,7612,8018,8428,8847,9267,9688,10109,10530,10964,11407,11870,12340,12811,13288,13768,14249,14734,15242,15774,16306,16847,17400,17966,18533,19108,19692,20278,20871,21471,22074,22679,23297,23916,24553,25190,25829,26472,27135,27814,28497,29181,29865,30555,31272,31994,32729,33487,34246,35005,35764,36537,37326,38119,38913,39725,40538,41360,42185,43010,43840,44671,45509,46350,47205,48063,48932,49807,50691,51577,52464,53289,54119,54950,55788,56629,57484,58342,59211,60086,60970,61856,62743,63568,64398,65388};
		p1 = new int[]{1505,1462,1436,1416,1463,1421,1411,1450,1497,1465,1423,1394,1391,1367,1358,1323,1310,1279,1268,1279,1311,1342,1359,1387,1414,1376,1424,1382,1373,1335,1359,1318,1275,1266,1227,1203,1168,1163,1184,1144,1169,1207,1250,1235,1209,1162,1124,1148,1168,1202,1190,1155,1179,1194,1195,1195,1203,1240,1218,1245,1220,1190,1208,1180,1182,1148,1139,1126,1152,1159,1147,1158,1112,1091,1101,1116,1123,1086,1126,1110,1128,1085,1132,1145,1135,1140,1117,1081,1120,1131,1081,1032,1071,1102,1071,1065,1068,1027,980,947,987,968,959,980,990,974,1003,996,999,958,911,878,918,899,890,911,921,905,934,927,930,889,844};
		p2 = 11940.179271014536D;
		all_right = KawigiEdit_RunTest(5, p0, p1, true, p2) && all_right;
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
