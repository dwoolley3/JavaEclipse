///*************************************************************************
// *  Compilation:  javac AcyclicLP.java
// *  Execution:    java AcyclicP V E
// *  Dependencies: EdgeWeightedDigraph.java DirectedEdge.java Topological.java
// *  Data files:   http://algs4.cs.princeton.edu/44sp/tinyEWDAG.txt
// *  
// *  Computes longeset paths in an edge-weighted acyclic digraph.
// *
// *  Remark: should probably check that graph is a DAG before running
// *
// *  % java AcyclicLP tinyEWDAG.txt 5
// *  5 to 0 (2.44)  5->1  0.32   1->3  0.29   3->6  0.52   6->4  0.93   4->0  0.38   
// *  5 to 1 (0.32)  5->1  0.32   
// *  5 to 2 (2.77)  5->1  0.32   1->3  0.29   3->6  0.52   6->4  0.93   4->7  0.37   7->2  0.34   
// *  5 to 3 (0.61)  5->1  0.32   1->3  0.29   
// *  5 to 4 (2.06)  5->1  0.32   1->3  0.29   3->6  0.52   6->4  0.93   
// *  5 to 5 (0.00)  
// *  5 to 6 (1.13)  5->1  0.32   1->3  0.29   3->6  0.52   
// *  5 to 7 (2.43)  5->1  0.32   1->3  0.29   3->6  0.52   6->4  0.93   4->7  0.37   
// *
// *************************************************************************/
//package princeton;
//
///**
// *  The <tt>AcyclicLP</tt> class represents a data type for solving the
// *  single-source longest paths problem in edge-weighted directed
// *  acyclic graphs (DAGs). The edge weights can be positive, negative, or zero.
// *  <p>
// *  This implementation uses a topological-sort based algorithm.
// *  The constructor takes time proportional to <em>V</em> + <em>E</em>,
// *  where <em>V</em> is the number of vertices and <em>E</em> is the number of edges.
// *  Afterwards, the <tt>distTo()</tt> and <tt>hasPathTo()</tt> methods take
// *  constant time and the <tt>pathTo()</tt> method takes time proportional to the
// *  number of edges in the longest path returned.
// *  <p>
// *  For additional documentation, see <a href="/algs4/44sp">Section 4.4</a> of
// *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
// *
// *  @author Robert Sedgewick
// *  @author Kevin Wayne
// */
//public class AcyclicLP {
//    private double[] distTo;          // distTo[v] = distance  of longest s->v path
//    private DirectedEdge[] edgeTo;    // edgeTo[v] = last edge on longest s->v path
//
//    /**
//     * Computes a longest paths tree from <tt>s</tt> to every other vertex in
//     * the directed acyclic graph <tt>G</tt>.
//     * @param G the acyclic digraph
//     * @param s the source vertex
//     * @throws IllegalArgumentException if the digraph is not acyclic
//     * @throws IllegalArgumentException unless 0 &le; <tt>s</tt> &le; <tt>V</tt> - 1
//     */
//    public AcyclicLP(EdgeWeightedDigraph G, int s) {
//        distTo = new double[G.V()];
//        edgeTo = new DirectedEdge[G.V()];
//        for (int v = 0; v < G.V(); v++) distTo[v] = Double.NEGATIVE_INFINITY;
//        distTo[s] = 0.0;
//
//        // relax vertices in toplogical order
//        Topological topological = new Topological(G);
//        if (!topological.hasOrder())
//            throw new IllegalArgumentException("Digraph is not acyclic.");
//        for (int v : topological.order()) {
//            for (DirectedEdge e : G.adj(v))
//                relax(e);
//        }
//    }
//
//    // relax edge e, but update if you find a *longer* path
//    private void relax(DirectedEdge e) {
//        int v = e.from(), w = e.to();
//        if (distTo[w] < distTo[v] + e.weight()) {
//            distTo[w] = distTo[v] + e.weight();
//            edgeTo[w] = e;
//        }       
//    }
//
//    /**
//     * Returns the length of a longest path from the source vertex <tt>s</tt> to vertex <tt>v</tt>.
//     * @param v the destination vertex
//     * @return the length of a longest path from the source vertex <tt>s</tt> to vertex <tt>v</tt>;
//     *    <tt>Double.NEGATIVE_INFINITY</tt> if no such path
//     */
//    public double distTo(int v) {
//        return distTo[v];
//    }
//
//    /**
//     * Is there a path from the source vertex <tt>s</tt> to vertex <tt>v</tt>?
//     * @param v the destination vertex
//     * @return <tt>true</tt> if there is a path from the source vertex
//     *    <tt>s</tt> to vertex <tt>v</tt>, and <tt>false</tt> otherwise
//     */
//    public boolean hasPathTo(int v) {
//        return distTo[v] > Double.NEGATIVE_INFINITY;
//    }
//
//    /**
//     * Returns a longest path from the source vertex <tt>s</tt> to vertex <tt>v</tt>.
//     * @param v the destination vertex
//     * @return a longest path from the source vertex <tt>s</tt> to vertex <tt>v</tt>
//     *    as an iterable of edges, and <tt>null</tt> if no such path
//     */
//    public Iterable<DirectedEdge> pathTo(int v) {
//        if (!hasPathTo(v)) return null;
//        Stack<DirectedEdge> path = new Stack<DirectedEdge>();
//        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
//            path.push(e);
//        }
//        return path;
//    }
//
//
//
//    /**
//     * Unit tests the <tt>AcyclicLP</tt> data type.
//     */
//    public static void main(String[] args) {
//        In in = new In(args[0]);
//        int s = Integer.parseInt(args[1]);
//        EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
//
//        AcyclicLP lp = new AcyclicLP(G, s);
//
//        for (int v = 0; v < G.V(); v++) {
//            if (lp.hasPathTo(v)) {
//                StdOut.printf("%d to %d (%.2f)  ", s, v, lp.distTo(v));
//                for (DirectedEdge e : lp.pathTo(v)) {
//                    StdOut.print(e + "   ");
//                }
//                StdOut.println();
//            }
//            else {
//                StdOut.printf("%d to %d         no path\n", s, v);
//            }
//        }
//    }
//}
