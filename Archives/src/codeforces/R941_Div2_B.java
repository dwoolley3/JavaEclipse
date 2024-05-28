package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R941_Div2_B
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R941_Div2_B().run();
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
		String YES = "YES";
		String NO = "NO";
		int t = in.nextInt();
		for (int T = 0; T < t; T++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			String[] s = new String[n];
			for (int i = 0; i < n; i++) 
				s[i] = in.next();
			
			char tl = s[0].charAt(0);
			char tr = s[0].charAt(m-1);
			char bl = s[n-1].charAt(0);
			char br = s[n-1].charAt(m-1);
			
			if (tl == br || tr == bl) {
				out.println(YES);
			} else {
				boolean hor = false;
				for (int i = 1; i < m && !hor; i++)
					if (s[0].charAt(i) != tl) hor = true;
				boolean ver = false;
				for (int i = 1; i < n && !ver; i++)
					if (s[i].charAt(0) != tl) ver = true;
				if (hor && ver) {
					out.println(YES);
				} else {				
					hor = false;
					for (int i = 0; i < m-1 && !hor; i++)
						if (s[0].charAt(i) != tr) hor = true;
					ver = false;
					for (int i = 1; i < n && !ver; i++)
						if (s[i].charAt(m-1) != tr) ver = true;
					if (hor && ver) {
						out.println(YES);
					} else {						
						hor = false;
						for (int i = 0; i < m-1 && !hor; i++)
							if (s[n-1].charAt(i) != br) hor = true;
						ver = false;
						for (int i = 0; i < n-1 && !ver; i++)
							if (s[i].charAt(m-1) != br) ver = true;
						if (hor && ver) {
							out.println(YES);
						} else {						
							hor = false;
							for (int i = 1; i < m && !hor; i++)
								if (s[n-1].charAt(i) != bl) hor = true;
							ver = false;
							for (int i = 0; i < n-1 && !ver; i++)
								if (s[i].charAt(0) != bl) ver = true;
							if (hor && ver) {
								out.println(YES);
							} else {						
								out.println (NO);	
							}
						}
					}
				}			
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
