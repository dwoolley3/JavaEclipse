package codejam;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList

public class GCJ_2016_QR_C
{	
	FastReader in;
	PrintWriter out;
//	final String PROBLEM_NAME = "C-ex";
//	final String PROBLEM_NAME = "C-small-attempt0";
//	final String PROBLEM_NAME = "C-small-attempt1";
	final String PROBLEM_NAME = "C-large";
	
	public static void main(String[] args) throws IOException  {
		new GCJ_2016_QR_C().runWithFiles();
	}
	
	void run()
	{		
		in = new FastReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}
	
	void runWithFiles() throws IOException  {
		in = new FastReader(new File("src/" + PROBLEM_NAME + ".in")); //"_in.txt"));
		out = new PrintWriter(new File("src/" + PROBLEM_NAME + ".out")); //"_out.txt"));

		solve();
		out.close();
	}
	
	void solve()
	{
		int T = in.nextInt();  

		for (int tc = 1; tc <= T; tc++)
		{
			int N = in.nextInt();
			int J = in.nextInt();
			
			String ans = "";
			System.out.println("Case #" + tc + ": " + ans);
			out.println("Case #" + tc + ": " + ans);
			
			String[] s = new String[] {
					"10000000000000000000000000000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000000011 83 7 3 11 23 3 569 173 3",
					"10000000000000000000000000000101 7 13 3 31 43 3 73 7 3",
					"10000000000000000000000000000111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000001101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000010001 5 67 3 43 4423 3 6197 127 3",
					"10000000000000000000000000010011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000010101 29 2 397 2 193 2 11 2 13513",
					"10000000000000000000000000011001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000000000011101 31 5 11 11 5 419 5 11 41",
					"10000000000000000000000000011111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000000100001 7 13 3 31 41 3 73 7 3",
					"10000000000000000000000000100101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000101011 3 163 19 3 5 151 3 149 1723",
					"10000000000000000000000000101111 5 2 3 2 11 2 5 2 3",
					"10000000000000000000000000110001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000000110111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000000111001 5 317 47 23 5 5 83 523 23",
					"10000000000000000000000000111011 17 2 3 2 1297 2 17 2 3",
					"10000000000000000000000000111101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001000011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000001000111 709 17 13 293 5 263 2663 137 67",
					"10000000000000000000000001001001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000001001011 7 7 11 223 5 103 113 7 7",
					"10000000000000000000000001001111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001010111 5 2 3 2 37 2 5 2 3",
					"10000000000000000000000001011011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001011101 13 2 3 2 71 2 17 2 3",
					"10000000000000000000000001100001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000001100111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001101011 5 2 3 2 23 2 5 2 3",
					"10000000000000000000000001101101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001101111 19 7 67 41 733 13 7 71 7",
					"10000000000000000000000001110011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001110101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000000001110111 11 1093 11 7 53 29 7 547 239",
					"10000000000000000000000001111001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000001111111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000010000011 7 2 13 2 593 2 157 2 28031",
					"10000000000000000000000010000101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000010001001 5 2 2179 2 11 2 167 2 23",
					"10000000000000000000000010001111 359 2 3 2 13 2 61 2 3",
					"10000000000000000000000010010001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000010010011 5 7 887 53 5 5 239 71 7",
					"10000000000000000000000010010101 19 5 223 19 5 11 5 17 7417",
					"10000000000000000000000010010111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000010011001 31 11 7 11 5 37 31 11 41",
					"10000000000000000000000010011101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000010100011 3 1429 463 3 5 41 3 541 17",
					"10000000000000000000000010100111 5 2 3 2 37 2 5 2 3",
					"10000000000000000000000010101011 13 2 3 2 349 2 25237 2 3",
					"10000000000000000000000010101101 7 2 3 2 43 2 73 2 3",
					"10000000000000000000000010110001 5 23 607 269 5 5 41 43 19",
					"10000000000000000000000010110011 11197 2 3 2 307 2 11 2 3",
					"10000000000000000000000010110101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000010110111 2207 7 7 83 67 241 7 11 7",
					"10000000000000000000000010111001 11 2 3 2 28723 2 23 2 3",
					"10000000000000000000000011000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000011000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011001011 73 2 3 2 11 2 1789 2 3",
					"10000000000000000000000011001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011010101 191 2 3 2 173 2 37 2 3",
					"10000000000000000000000011011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000011100001 19 1433 149 17 5 7883 947 17 13",
					"10000000000000000000000011100011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000000011100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011101011 3 17 269 3 17 14813 3 5077 443",
					"10000000000000000000000011101101 5 7 5861 11 5483 5 7 23 7",
					"10000000000000000000000011110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000011110111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000011111011 11 2 7 2 13 2 1787 2 8101",
					"10000000000000000000000011111101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000100000001 5 13 3 31 11 3 17 7 3",
					"10000000000000000000000100000011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000100001001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000100001111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100010001 11 2 191 2 89 2 5 2 113",
					"10000000000000000000000100010011 13 47 163 131 5 13 37 647 47",
					"10000000000000000000000100010101 3 11 11 3 5 5 3 11 41",
					"10000000000000000000000100011011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100011101 7 2 3 2 43 2 11 2 3",
					"10000000000000000000000100100001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000100100111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100101001 5 239 2711 131 5 5 199 113 359",
					"10000000000000000000000100101011 7 2 3 2 43 2 73 2 3",
					"10000000000000000000000100101101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100110011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100110101 439 2 3 2 11 2 491 2 3",
					"10000000000000000000000100111001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000100111111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000101000111 5 2 3 2 13 2 5 2 3",
					"10000000000000000000000101001011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000101010101 7 2 3 2 17 2 71 2 3",
					"10000000000000000000000101100011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000101100101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000000101101001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000101101111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000101110001 7 2 3 2 43 2 29 2 3",
					"10000000000000000000000101110101 3 19 43 3 89 13 3 167 239",
					"10000000000000000000000101111011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000101111111 7 13 3 31 43 3 43 7 3",
					"10000000000000000000000110000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000110000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110010001 31 11 11 11 5 2801 13 11 41",
					"10000000000000000000000110010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110010101 11 2 3 2 79 2 23 2 3",
					"10000000000000000000000110011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000110100001 5 7 19 1783 5 5 4517 29 7",
					"10000000000000000000000110100011 67 2 3 2 13 2 59 2 3",
					"10000000000000000000000110100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110101001 7 2 3 2 43 2 73 2 3",
					"10000000000000000000000110101111 13 2 7211 2 53 2 17183 2 13",
					"10000000000000000000000110110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000110110111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000110111101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111000001 11 5 13 43 5 29 5 23 19",
					"10000000000000000000000111000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000111000101 7 2 3 2 43 2 73 2 3",
					"10000000000000000000000111000111 977 11 29 421 11 131 7 337 17",
					"10000000000000000000000111001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000111001111 3 2 5 2 7 2 3 2 7",
					"10000000000000000000000111010011 5 19 13 61 41 5 7 7 2069",
					"10000000000000000000000111011011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111011111 1051 5 3 17 1237 3 5 83 3",
					"10000000000000000000000111100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000000111100101 29 53 13 11 17 21787 7 1823 19423",
					"10000000000000000000000111100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111101011 19 2 13 2 13163 2 23 2 41",
					"10000000000000000000000111101101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111101111 7 13 3 19 19 3 17 7 3",
					"10000000000000000000000111110011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111110101 17 2 29 2 1979 2 113 2 7",
					"10000000000000000000000111111001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000000111111101 7 5 3 31 43 3 5 7 3",
					"10000000000000000000000111111111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000001000000101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001000001001 8849 2 7 2 19427 2 11 2 17",
					"10000000000000000000001000001101 31 11 11 11 5 17 31 11 41",
					"10000000000000000000001000001111 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001000010001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000001000010111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001000011011 6421 2 3 2 269 2 7333 2 3",
					"10000000000000000000001000011101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001000100011 3 31 1097 3 5 5 3 53 31",
					"10000000000000000000001000100111 7 2 3 2 43 2 73 2 3",
					"10000000000000000000001000101001 3 7 13 3 5 23 3 37 7",
					"10000000000000000000001000101101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001000110011 1949 2 3 2 197 2 229 2 3",
					"10000000000000000000001000110101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001000111001 17 2 3 2 557 2 17 2 3",
					"10000000000000000000001000111011 3 5 13 3 31 43 3 11 7",
					"10000000000000000000001001000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001001000011 7 7 227 809 5 89 43 7 7",
					"10000000000000000000001001000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001001011 5 2 3 2 13 2 5 2 3",
					"10000000000000000000001001001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001010101 5 2 3 2 19 2 5 2 3",
					"10000000000000000000001001011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001011101 19 17 7 29 11 8353 7 6569 31",
					"10000000000000000000001001011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001001100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001101001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001001110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001001110011 5 1093 43 19 467 5 7 547 239",
					"10000000000000000000001001110111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001001111011 7 2 1609 2 2131 2 733 2 157",
					"10000000000000000000001001111101 3 2 5 2 7 2 3 2 7",
					"10000000000000000000001010000001 73 2 1999 2 149 2 41 2 149",
					"10000000000000000000001010000101 89 41 463 7 5 31 29 37 1033",
					"10000000000000000000001010000111 5 2 3 2 19 2 5 2 3",
					"10000000000000000000001010001001 3 5 11 3 5 13 3 7 41",
					"10000000000000000000001010001011 2579 2 3 2 15137 2 317 2 3",
					"10000000000000000000001010001101 59 2 3 2 211 2 11 2 3",
					"10000000000000000000001010010101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001010011101 11 5 1019 173 22501 23 5 163 23",
					"10000000000000000000001010011111 17 2 7 2 3389 2 1283 2 7",
					"10000000000000000000001010100101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001010100111 3 41 149 3 59 11 3 11 23",
					"10000000000000000000001010101111 5 2 17 2 37 2 5 2 101",
					"10000000000000000000001010111001 3 7 13 3 13 5 3 73 7",
					"10000000000000000000001011000011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001011000101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001011000111 31 263 2269 199 137 349 7 29 71",
					"10000000000000000000001011001001 11 2 3 2 691 2 131 2 3",
					"10000000000000000000001011010001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001011010011 43 7 107 1097 103 4561 7 13 7",
					"10000000000000000000001011010111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001011011011 47 2 11 2 11 2 6101 2 47",
					"10000000000000000000001011011101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001011100001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001011100111 13 2 13 2 23 2 97 2 19",
					"10000000000000000000001011101011 5 2 17 2 37 2 5 2 7",
					"10000000000000000000001011110101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001011111011 3 11 3 3 2521 3 3 83 3",
					"10000000000000000000001011111111 5 2 17 2 5 2 5 2 101",
					"10000000000000000000001100000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001100000101 17 7 11 11 5 23 31 11 7",
					"10000000000000000000001100000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100001011 11 2 3 2 53 2 479 2 3",
					"10000000000000000000001100001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100010101 7 2 3 2 43 2 43 2 3",
					"10000000000000000000001100011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100011011 13 73 11 53 13 13 7 6481 313",
					"10000000000000000000001100011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001100100011 7 2 3 2 43 2 73 2 3",
					"10000000000000000000001100100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001100110111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001100111101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001100111111 7 5 3 31 43 3 5 7 3",
					"10000000000000000000001101000001 19 229 347 17627 5 311 7057 17 283",
					"10000000000000000000001101000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001101000101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000001101001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001101001111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001101010001 30757 2 3 2 107 2 41 2 3",
					"10000000000000000000001101010101 3 127 7901 3 433 31 3 587 199",
					"10000000000000000000001101011011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001101011111 41 7 3 29 59 3 17 37 3",
					"10000000000000000000001101100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001101100011 5 7 103 151 503 5 7 17 7",
					"10000000000000000000001101100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001101101101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001101110001 127 5 43 19531 13 29 5 11 239",
					"10000000000000000000001101110011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001101110101 4877 2 23 2 337 2 919 2 31",
					"10000000000000000000001101110111 5 11 3 31 23 3 11 7 3",
					"10000000000000000000001101111001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000001101111111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000001110000001 5 11 11 7 5 5 31 11 41",
					"10000000000000000000001110000011 13 2 3 2 17 2 97 2 3",
					"10000000000000000000001110000101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001110001111 11 2 20981 2 4967 2 487 2 10957",
					"10000000000000000000001110010001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001110010111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001110011011 79 2 7 2 397 2 5 2 7",
					"10000000000000000000001110011101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001110100001 7 2 3 2 43 2 11 2 3",
					"10000000000000000000001110101011 457 2 691 2 11 2 4463 2 1531",
					"10000000000000000000001110101101 197 2 2729 2 47 2 53 2 7",
					"10000000000000000000001110101111 3 13 3 3 43 3 3 7 3",
					"10000000000000000000001110110101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001110110111 13 5 3 7 601 3 5 4051 3",
					"10000000000000000000001110111101 5 13 3 23 13 3 73 7 3",
					"10000000000000000000001110111111 31 2 11 2 5 2 31 2 7",
					"10000000000000000000001111000001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000001111000111 3 2 5 2 7 2 3 2 7",
					"10000000000000000000001111001101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001111010011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001111010101 43 2 97 2 6067 2 503 2 251",
					"10000000000000000000001111011001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001111011111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000001111100011 9941 2 13 2 79 2 11 2 23",
					"10000000000000000000001111100101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001111100111 7 13 3 31 17 3 73 7 3",
					"10000000000000000000001111101111 5 2 17 2 5 2 5 2 13",
					"10000000000000000000001111110001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000001111110101 7 13 3 31 43 3 73 7 3",
					"10000000000000000000001111110111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000001111111001 5 19 3 47 383 3 3319 1201 3",
					"10000000000000000000001111111011 2543 2 317 2 5 2 43 2 31",
					"10000000000000000000001111111101 3 2 5 2 5 2 3 2 11",
					"10000000000000000000010000000001 71 59 3 17 191 3 1789 11 3",
					"10000000000000000000010000000011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010000001001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000010000001111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000010101 3 7 13 3 5 43 3 73 7",
					"10000000000000000000010000010111 5 2 3 2 19 2 5 2 3",
					"10000000000000000000010000011011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000011101 149 2 3 2 13 2 3701 2 3",
					"10000000000000000000010000100001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010000100111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000101001 11 11 19 1579 5 41 211 11551 19",
					"10000000000000000000010000101011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010000101101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000110011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000110101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010000110111 17 11 7 79 13 79 7 317 23",
					"10000000000000000000010000111001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010000111111 3 2 5 2 7 2 3 2 7",
					"10000000000000000000010001001011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010001001101 571 2 3 2 9397 2 379 2 3",
					"10000000000000000000010001010001 3 71 7 3 5 257 3 4943 257",
					"10000000000000000000010001010011 5 2 3 2 13 2 5 2 3",
					"10000000000000000000010001010101 11 2 3 2 1861 2 23 2 3",
					"10000000000000000000010001011001 17 2 3 2 29 2 17 2 3",
					"10000000000000000000010001011101 3 7 13 3 31 5 3 73 7",
					"10000000000000000000010001100011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010001100101 7 2 3 2 43 2 73 2 3",
					"10000000000000000000010001101001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010001101111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010001110001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010001110011 7 7 47 17 139 11 7 7 7",
					"10000000000000000000010001111011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010010000001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010010000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010011011 89 5 227 17 677 17 5 317 61",
					"10000000000000000000010010011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010010100011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010010100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010101001 6673 2 3 2 11 2 29 2 3",
					"10000000000000000000010010101101 5 167 3257 563 13 5 7 71 1399",
					"10000000000000000000010010110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010010110111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010010111101 3 2 5 2 7 2 3 2 7",
					"10000000000000000000010010111111 17 2543 3 5197 283 3 37 1627 3",
					"10000000000000000000010011000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010011001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010011001111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011010001 277 2 3 2 349 2 61 2 3",
					"10000000000000000000010011011011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010011100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011101101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011110011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011111001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010011111111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000010100000111 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010100001011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010100001101 7 2 3 2 11 2 73 2 3",
					"10000000000000000000010100001111 47 7 11 211 13 3037 7 149 7",
					"10000000000000000000010100010001 3 7 13 3 5 5 3 73 7",
					"10000000000000000000010100011001 23 2 3 2 17 2 43 2 3",
					"10000000000000000000010100100011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010100100101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010100101001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010100101111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010100110001 11 2 3 2 13 2 31 2 3",
					"10000000000000000000010100110101 3 7 13 3 31 37 3 73 7",
					"10000000000000000000010100110111 7 2 21613 2 157 2 97 2 269",
					"10000000000000000000010100111011 3 2 5 2 7 2 3 2 7",
					"10000000000000000000010100111101 13 2 11 2 4153 2 11 2 11257",
					"10000000000000000000010101000001 3 131 67 3 5 11 3 59 5441",
					"10000000000000000000010101000011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010101000101 7 2 3 2 43 2 73 2 3",
					"10000000000000000000010101000111 3 967 157 3 17 71 3 1549 151",
					"10000000000000000000010101001101 3 1789 11 3 373 5 3 89 4759",
					"10000000000000000000010101001111 103 2 19 2 11 2 1039 2 41",
					"10000000000000000000010101010001 59 2 3 2 15401 2 11 2 3",
					"10000000000000000000010101010101 19 17 5 19 1033 59 7 5 9043",
					"10000000000000000000010101010111 5 2 17 2 13 2 5 2 101",
					"10000000000000000000010101011001 3 5 13 3 11 43 3 19 7",
					"10000000000000000000010101011011 73 2 7 2 29 2 23 2 17",
					"10000000000000000000010101100001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000010101100011 239 29 53 7 11 17 7 11 163",
					"10000000000000000000010101100111 353 2 5849 2 41 2 61 2 7",
					"10000000000000000000010101101011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010101101111 7 13 3 17 43 3 73 7 3",
					"10000000000000000000010101110101 5 2 17 2 37 2 5 2 79",
					"10000000000000000000010101111011 19 18287 3 19 13 3 101 461 3",
					"10000000000000000000010101111101 3 7 3 3 17 3 3 7 3",
					"10000000000000000000010101111111 5 2 17 2 5 2 5 2 101",
					"10000000000000000000010110000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010110000101 29 2 3 2 17 2 67 2 3",
					"10000000000000000000010110001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010110001011 7 5 11 7 11 11 5 7 29",
					"10000000000000000000010110001101 37 7 8741 29 149 13907 7 293 7",
					"10000000000000000000010110001111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010110010101 3 5 7 3 19 13 3 317 953",
					"10000000000000000000010110011011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010110100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000010110100011 23 7 7 19 4099 73 7 263 7",
					"10000000000000000000010110100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010110101101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010110110011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010110111001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000010110111101 317 5 3 73 71 3 5 223 3",
					"10000000000000000000010110111111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000010111001011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010111010011 67 2 23 2 19 2 83 2 7",
					"10000000000000000000010111011011 28499 5 3 2237 1091 3 5 11 3",
					"10000000000000000000010111100011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010111101001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000010111101101 5 13 3 19 19 3 73 7 3",
					"10000000000000000000010111101111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000010111110111 5 2 7 2 5 2 5 2 7",
					"10000000000000000000010111111011 3 2 5 2 5 2 3 2 11",
					"10000000000000000000010111111111 23 11 23 241 23 11 23 23 21649",
					"10000000000000000000011000000001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011000000011 1789 53 7 17 5 13 3701 17 3833",
					"10000000000000000000011000000111 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000001001 7 19 229 251 5 409 29 7 83",
					"10000000000000000000011000001011 5 2 3 2 37 2 5 2 3",
					"10000000000000000000011000001101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000010011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000010101 5 2 3 2 11 2 5 2 3",
					"10000000000000000000011000011001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000011111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011000100101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000101001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000011000101011 3 7 13 3 11 29 3 73 7",
					"10000000000000000000011000110001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011000110111 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011000111011 563 2 7 2 197 2 293 2 23",
					"10000000000000000000011000111101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011001000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011001001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011001001111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011001010001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000011001010101 3 7 13 3 31 43 3 73 7",
					"10000000000000000000011001011011 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011001011111 19 11 3 47 19 3 23 23 3",
					"10000000000000000000011001100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011001100101 5 11 853 41 29 5 7 23 359",
					"10000000000000000000011001100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011001101001 31 43 7 17 13 11 7 1667 17",
					"10000000000000000000011001101011 7 2 23 2 20051 2 11 2 79",
					"10000000000000000000011001101101 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011001110011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011001110101 13 2 11 2 17 2 3677 2 223",
					"10000000000000000000011001111001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011001111111 3 2 5 2 5 2 3 2 7",
					"10000000000000000000011010000011 5 2 3 2 23 2 5 2 3",
					"10000000000000000000011010000101 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011010000111 7 3137 41 7 719 4679 7 7 499",
					"10000000000000000000011010001001 23 2 3 2 947 2 7211 2 3",
					"10000000000000000000011010001011 3 1193 61 3 271 1051 3 13 17",
					"10000000000000000000011010001111 13 2 7 2 127 2 1481 2 7",
					"10000000000000000000011010010001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011010010011 41 431 79 11 11 11 7 5821 233",
					"10000000000000000000011010010111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011010011101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011010100001 5 2 3 2 13 2 5 2 3",
					"10000000000000000000011010100111 11 2 37 2 401 2 211 2 29",
					"10000000000000000000011010101001 3 7 13 3 31 43 3 73 7",
					"10000000000000000000011010101011 5 2 7 2 37 2 5 2 101",
					"10000000000000000000011010101111 3 29 3 3 11 3 3 373 3",
					"10000000000000000000011010110101 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011010111011 3 7 3 3 31 3 3 71 3",
					"10000000000000000000011010111111 5 2 17 2 5 2 5 2 101",
					"10000000000000000000011011000001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011011000111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011011001101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011011001111 163 5 3 7 1693 3 5 17 3",
					"10000000000000000000011011010011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011011010101 859 2 7 2 1327 2 17 2 503",
					"10000000000000000000011011011001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011011011111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000011011100101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011011100111 5 7 3 11 523 3 1867 157 3",
					"10000000000000000000011011101011 3 107 3 3 13 3 3 11393 3",
					"10000000000000000000011011110001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011011110111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000011011111011 5 2 17 2 5 2 5 2 101",
					"10000000000000000000011011111101 3 2 5 2 5 2 3 2 7",
					"10000000000000000000011100000011 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011100000101 5 2 3 2 37 2 5 2 3",
					"10000000000000000000011100001001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011100001101 367 389 157 7 353 11 7 359 61",
					"10000000000000000000011100001111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011100010001 13 2 3 2 257 2 11939 2 3",
					"10000000000000000000011100011011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011100011101 19 2 2741 2 11 2 43 2 7",
					"10000000000000000000011100100001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011100100111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011100101011 11 2 29 2 3593 2 281 2 17",
					"10000000000000000000011100101101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011100101111 7 13 3 11 43 3 11 7 3",
					"10000000000000000000011100110011 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011100110101 347 2 179 2 521 2 41 2 5651",
					"10000000000000000000011100111001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011100111101 7 11 3 31 43 3 73 7 3",
					"10000000000000000000011100111111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000011101000001 5 2 3 2 37 2 5 2 3",
					"10000000000000000000011101000101 3 37 293 3 11 5801 3 43 461",
					"10000000000000000000011101001001 37 11 7 53 2221 13 7 421 1907",
					"10000000000000000000011101001011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011101010001 3 7 13 3 31 11 3 11 7",
					"10000000000000000000011101010101 5 2 17 2 37 2 5 2 101",
					"10000000000000000000011101010111 3 11 3 3 1021 3 3 17 3",
					"10000000000000000000011101011111 5 2 17 2 5 2 5 2 59",
					"10000000000000000000011101100011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011101100111 7 5 3 31 29 3 5 7 3",
					"10000000000000000000011101101001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011101101111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000011101110101 3 7 3 3 31 3 3 7 3",
					"10000000000000000000011101111011 3 2 5 2 5 2 3 2 7",
					"10000000000000000000011101111101 5 2 17 2 5 2 5 2 19",
					"10000000000000000000011110000001 3 2 3 2 7 2 3 2 3",
					"10000000000000000000011110000111 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011110001101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011110010011 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011110010101 30469 2 23 2 53 2 71 2 569",
					"10000000000000000000011110011001 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011110011101 23 5 3 7 433 3 5 607 3",
					"10000000000000000000011110011111 3 2 5 2 5 2 3 2 11",
					"10000000000000000000011110100101 3 2 5 2 7 2 3 2 11",
					"10000000000000000000011110101101 7 13 3 31 43 3 73 7 3",
					"10000000000000000000011110101111 5 2 17 2 5 2 5 2 7",
					"10000000000000000000011110110001 3 2 5 2 7 2 3 2 7",
					"10000000000000000000011110110011 97 5 3 10169 18341 3 5 3019 3",
			};
			
			int ind = 0;
			for (ind = 0; ind < s.length; ind++)
			{
				System.out.println(s[ind]);
				out.println(s[ind]);
			}
			if (ind >= s.length) return;
			
			int[] a = new int[N];
			a[0] = 1; a[N-1] = 1;

			
			int cnt = 0;
			BigInteger b0 = new BigInteger("0");
			for (int i = 0; i < (1 << (N-2)); i++)
			{				
				boolean ok = false;
				ans = "";
				for (int b = 2; b <= 10; b++)
				{
					//long num = 0;
					BigInteger num = b0;
					BigInteger bi = new BigInteger(b+"");
					for (int j = 0; j < N; j++)
					{
						//num = num * b + a[j];
						num = num.multiply(bi);
						BigInteger aj = new BigInteger(a[j]+"");
						num = num.add(aj);
					}

					ok = false;
					for (long j = 2; j*j <= 1_000_000_000 && !ok; j++)
					{
						BigInteger jb = new BigInteger(j+"");
						if (num.mod(jb).equals(b0))
						{
							ans += " " + j;
							ok = true;
						}
					}
					if (!ok) break;
				}
				if (ok)
				{
					cnt++;
					String numSt = "";
					for (int j = 0; j < N; j++)
						numSt += a[j];
					ans = '"' + numSt + ans + '"' + ",";
					System.out.println(ans);
					out.println(ans);
					if (cnt == J) break;
				}
				
				//Add 1
				for (int j = N-2; j > 0; j--)
					if (a[j] == 1)
						a[j] = 0;
					else if (a[j] == 0)
					{
						a[j] = 1;
						break;
					}
			}
		}
	}

	//-----------------------------------------------------

	
	class FastReader
	{
	    BufferedReader br;
	    StringTokenizer tokenizer;
	    
	    public FastReader(InputStream stream)
	    {
	        br = new BufferedReader(new InputStreamReader(stream));
	        tokenizer = null;
	    }
		public FastReader(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
				tokenizer = null;
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	    
	    private String next() {
	        while (tokenizer == null || !tokenizer.hasMoreTokens())
	            try {
	            	tokenizer = new StringTokenizer(br.readLine());
	            }
	            catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	        return tokenizer.nextToken();
	    }
		public String nextLine() {
			try	{
				return br.readLine();
			}
			catch(Exception e) {
				throw(new RuntimeException());
			}
		}

	    int nextInt() {
	        return Integer.parseInt(next());
	    }
	    long nextLong() {
	        return Long.parseLong(next());
	    }
	    double nextDouble() {
	        return Double.parseDouble(next());
	    }	    
	    BigInteger nextBigInteger() {
	        return new BigInteger(next());
	    }
	    BigDecimal nextBigDecimal() {
	        return new BigDecimal(next());
	    }
	}
}
