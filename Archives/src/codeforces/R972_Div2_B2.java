package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R972_Div2_B2
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R972_Div2_B2().run();
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
			int m = in.nextInt();
			int q = in.nextInt();
			
			TreeSet<Integer> b = new TreeSet<>();
			for (int i = 0; i < m; i++) 
				b.add(in.nextInt());

			int[] a = new int[q];
			for (int i = 0; i < q; i++) 
				a[i] = in.nextInt();
			
			int ans = 0;		
			for (int i = 0; i < q; i++) {
				if (b.floor(a[i]) == null) {
					ans = b.ceiling(a[i]) - 1;
				}
				else if (b.ceiling(a[i]) == null) {
					ans = n - b.floor(a[i]);
				}
				else {
					ans = (b.ceiling(a[i]) - b.floor(a[i])) / 2;
				}
				out.println(ans);
			}

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
