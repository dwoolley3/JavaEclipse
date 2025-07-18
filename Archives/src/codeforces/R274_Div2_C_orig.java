package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R274_Div2_C_orig
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R274_Div2_C_orig().run();
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
		int n = in.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		
		int t;
		for (int i = 0; i < n-1; i++) 
			for (int j = i+1; j < n; j++)
				if (a[i] > a[j] || (a[i] == a[j] && b[i] > b[j]))
				{
					t = a[i]; a[i] = a[j]; a[j] = t;
					t = b[i]; b[i] = b[j]; b[j] = t;
				}
		
		int day = b[0];
		for (int i = 1; i < n; i++)
		{
			if (b[i] >= day)
				day = b[i];
			else
				day = a[i];
		}
		
		out.println(day);		
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
