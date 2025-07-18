import java.io.*;    //PrintWriter
import java.math.*;  //BigInteger, BigDecimal
import java.util.*;  //StringTokenizer, ArrayList


//For Code Chef, do not precede class Program with "public"
class sp_CC2016_03_LT_D_PAIRCLST
{	
	FastReader in;
	PrintWriter out;
	
	public static void main(String[] args)  {
		new sp_CC2016_03_LT_D_PAIRCLST().run();
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
        //int T = in.nextInt();
        //for (int t = 0; t < T; t++)
        {
			int n = in.nextInt();
			int m = in.nextInt();
			int kk = in.nextInt();
				
			int[] a = new int[kk];
			for (int i = 0; i < kk; i++) 
				a[i] = in.nextInt();
			
			final int INF = (int)1e9;
	        int[][] graph = new int[n+1][n+1];
	        for (int i = 0; i <= n; i++)
	            for (int j = 0; j <= n; j++)
                    graph[i][j] = INF;
			
			for (int i = 0; i < m; i++) 
				graph[in.nextInt()][in.nextInt()] = in.nextInt();
			
	        //Get Shortest Path from i to j; initially graph[i,j] is
	        //  0 (to self), 1 (connection), or INF (no connection)
	        //Floyd Warshall algorithm
	        for (int k = 0; k < n; k++)
	            for (int i = 0; i < n; i++)
	                for (int j = 0; j < n; j++)
	                    graph[i][j] = Math.min(graph[i][j],
	                        graph[i][k] + graph[k][j]);
			
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i < kk; i++)
	        	for (int j = 0; j < kk; j++)
	        		if (i != j && graph[a[i]][a[j]] < min)
	        			min = graph[a[i]][a[j]];
	        
			out.println(min);	
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
