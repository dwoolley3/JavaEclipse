package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R920_Div3_D
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R920_Div3_D().run();
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
			
			int[] a = new int[n];
			for (int i = 0; i < n; i++) 
				a[i] = in.nextInt();
			
			int[] b = new int[m];
			for (int i = 0; i < m; i++) 
				b[i] = in.nextInt();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			long dif1 = 0;
			int left = 0, right = m-1, ai;
			for (int i = 0; i < n; i++) {
				if (i%2 == 0) 
					ai = a[i/2]; 
				else 
					ai = a[n-1 - (i/2)];
				int le = Math.abs(ai - b[left]);
				int ri = Math.abs(ai - b[right]);
				if (le > ri) {
					left++;
					dif1 += le;
				} else {
					right--;
					dif1 += ri;
				}
			}
			
			long dif2 = 0;
			left = 0; right = m-1;
			for (int i = n-1; i >= 0; i--) {
				if (i%2 == 0) 
					ai = a[i/2]; 
				else 
					ai = a[n-1 - (i/2)];
				int le = Math.abs(ai - b[left]);
				int ri = Math.abs(ai - b[right]);
				if (le > ri) {
					left++;
					dif2 += le;
				} else {
					right--;
					dif2 += ri;
				}
			}

			long dif = (dif1 > dif2) ? dif1 : dif2;
			out.println(dif);
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
