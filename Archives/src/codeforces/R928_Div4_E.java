package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R928_Div4_E
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R928_Div4_E().run();
	}
	
	void run()
	{		
		in = new FastReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}
	
	void solve()
	{
		int t = in.nextInt();
		for (int T = 0; T < t; T++) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			int mult = 2;
			int num1 = (n-1) / (mult) + 1;
			int ans = 0;
			if (k <= num1) {
				ans = k * 2 - 1;
			} else {
				for (mult = 4; mult < 2000000000; mult *= 2) {
					k -= num1;
					num1 = (n-mult/2) / mult + 1;
					if (k <= num1) {
						ans = k * mult - mult/2;
						break;
					}
				}
//				k -= num1;
//				mult = 4;
//				int num2 = (n-2) / (mult) + 1;
//				if (k <= num2) {
//					ans = k * (mult) - 2;
//				} else {
//					k -= num2;
//					mult = 8;
//					int num4 = (n-4) / (mult) + 1;
//					if (k <= num4) {
//						ans = k * (mult) - 4;
//					} else {
//						k -= num4;
//						mult = 16;
//						int num16 = (n-16) / (mult) + 1;
//						if (k <= num16) {
//							ans = k * (mult) - 8;
//						}
//					}
//				}			
			}
					
			out.println(ans);
		}
	}

	//-----------------------------------------------------
	void runWithFiles() {
		in = new FastReader(new File("input.txt"));
		try {
			out = new PrintWriter(new File("output.txt"));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		solve();
		out.close();
	}
	
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
