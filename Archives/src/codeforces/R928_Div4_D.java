package codeforces;
import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


public class R928_Div4_D
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new R928_Div4_D().run();
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
			int[] a = new int[n];
			int max = 2147483647;			
			HashMap<Integer,Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) { 
				a[i] = in.nextInt();
				int cnt = (hm.containsKey(a[i])) ? hm.get(a[i]) : 0; 
				hm.put(a[i], cnt+1);
			}
			
			int group = 0;
			for (int i = 0; i < n; i++) {
				int aiCnt = hm.get(a[i]);
				if (aiCnt > 0) {
					int comp = max ^ a[i];
					if (hm.containsKey(comp)) {
						int compCnt = hm.get(comp);
						if (compCnt > 0) {
							hm.put(a[i], aiCnt-1);
							hm.put(comp, compCnt-1);
							group++;
						}
					}
				}
			}
			for (int i = 0; i < n; i++) {
				int aiCnt = hm.get(a[i]);
				group += aiCnt;
				hm.put(a[i], 0);
			}
			
			out.println(group);
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
