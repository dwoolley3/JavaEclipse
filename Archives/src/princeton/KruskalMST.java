//package princeton;
//
///*************************************************************************
// * Compilation:   javac KruskalMST.java
// *  Execution:    java  KruskalMST filename.txt
// *  Dependencies: EdgeWeightedGraph.java Edge.java Queue.java
// *                UF.java In.java StdOut.java
// *  Data files:   http://algs4.cs.princeton.edu/43mst/tinyEWG.txt
// *                http://algs4.cs.princeton.edu/43mst/mediumEWG.txt
// *                http://algs4.cs.princeton.edu/43mst/largeEWG.txt
// *
// *  Compute a minimum spanning forest using Kruskal's algorithm.
// *
// *  %  java KruskalMST tinyEWG.txt 
// *  0-7 0.16000
// *  2-3 0.17000
// *  1-7 0.19000
// *  0-2 0.26000
// *  5-7 0.28000
// *  4-5 0.35000
// *  6-2 0.40000
// *  1.81000
// *
// *  % java KruskalMST mediumEWG.txt
// *  168-231 0.00268
// *  151-208 0.00391
// *  7-157   0.00516
// *  122-205 0.00647
// *  8-152   0.00702
// *  156-219 0.00745
// *  28-198  0.00775
// *  38-126  0.00845
// *  10-123  0.00886
// *  ...
// *  10.46351
// *
// *************************************************************************/
//
///**
// *  The <tt>KruskalMST</tt> class represents a data type for computing a
// *  <em>minimum spanning tree</em> in an edge-weighted graph.
// *  The edge weights can be positive, zero, or negative and need not
// *  be distinct. If the graph is not connected, it computes a <em>minimum
// *  spanning forest</em>, which is the union of minimum spanning trees
// *  in each connected component. The <tt>weight()</tt> method returns the 
// *  weight of a minimum spanning tree and the <tt>edges()</tt> method
// *  returns its edges.
// *  <p>
// *  This implementation uses <em>Krusal's algorithm</em> and the
// *  union-find data type.
// *  The constructor takes time proportional to <em>E</em> log <em>V</em>
// *  and extra space (not including the graph) proportional to <em>V</em>,
// *  where <em>V</em> is the number of vertices and <em>E</em> is the number of edges.
// *  Afterwards, the <tt>weight()</tt> method takes constant time
// *  and the <tt>edges()</tt> method takes time proportional to <em>V</em>.
// *  <p>
// *  For additional documentation, see <a href="/algs4/44sp">Section 4.4</a> of
// *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
// *  For alternate implementations, see {@link LazyPrimMST}, {@link PrimMST},
// *  and {@link BoruvkaMST}.
// *
// *  @author Robert Sedgewick
// *  @author Kevin Wayne
// */
//public class KruskalMST {
//    private double weight;  // weight of MST
//    private Queue<Edge> mst = new Queue<Edge>();  // edges in MST
//
//    /**
//     * Compute a minimum spanning tree (or forest) of an edge-weighted graph.
//     * @param G the edge-weighted graph
//     */
//    public KruskalMST(EdgeWeightedGraph G) {
//        // more efficient to build heap by passing array of edges
//        MinPQ<Edge> pq = new MinPQ<Edge>();
//        for (Edge e : G.edges()) {
//            pq.insert(e);
//        }
//
//        // run greedy algorithm
//        UF uf = new UF(G.V());
//        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
//            Edge e = pq.delMin();
//            int v = e.either();
//            int w = e.other(v);
//            if (!uf.connected(v, w)) { // v-w does not create a cycle
//                uf.union(v, w);  // merge v and w components
//                mst.enqueue(e);  // add edge e to mst
//                weight += e.weight();
//            }
//        }
//
//        // check optimality conditions
//        assert check(G);
//    }
//
//    /**
//     * Returns the edges in a minimum spanning tree (or forest).
//     * @return the edges in a minimum spanning tree (or forest) as
//     *    an iterable of edges
//     */
//    public Iterable<Edge> edges() {
//        return mst;
//    }
//
//    /**
//     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
//     * @return the sum of the edge weights in a minimum spanning tree (or forest)
//     */
//    public double weight() {
//        return weight;
//    }
//    
//    // check optimality conditions (takes time proportional to E V lg* V)
//    private boolean check(EdgeWeightedGraph G) {
//
//        // check total weight
//        double total = 0.0;
//        for (Edge e : edges()) {
//            total += e.weight();
//        }
//        double EPSILON = 1E-12;
//        if (Math.abs(total - weight()) > EPSILON) {
//            System.err.printf("Weight of edges does not equal weight(): %f vs. %f\n", total, weight());
//            return false;
//        }
//
//        // check that it is acyclic
//        UF uf = new UF(G.V());
//        for (Edge e : edges()) {
//            int v = e.either(), w = e.other(v);
//            if (uf.connected(v, w)) {
//                System.err.println("Not a forest");
//                return false;
//            }
//            uf.union(v, w);
//        }
//
//        // check that it is a spanning forest
//        for (Edge e : G.edges()) {
//            int v = e.either(), w = e.other(v);
//            if (!uf.connected(v, w)) {
//                System.err.println("Not a spanning forest");
//                return false;
//            }
//        }
//
//        // check that it is a minimal spanning forest (cut optimality conditions)
//        for (Edge e : edges()) {
//
//            // all edges in MST except e
//            uf = new UF(G.V());
//            for (Edge f : mst) {
//                int x = f.either(), y = f.other(x);
//                if (f != e) uf.union(x, y);
//            }
//            
//            // check that e is min weight edge in crossing cut
//            for (Edge f : G.edges()) {
//                int x = f.either(), y = f.other(x);
//                if (!uf.connected(x, y)) {
//                    if (f.weight() < e.weight()) {
//                        System.err.println("Edge " + f + " violates cut optimality conditions");
//                        return false;
//                    }
//                }
//            }
//
//        }
//
//        return true;
//    }
//
//
//    /**
//     * Unit tests the <tt>KruskalMST</tt> data type.
//     */
//    public static void main(String[] args) {
//        In in = new In(args[0]);
//        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
//        KruskalMST mst = new KruskalMST(G);
//        for (Edge e : mst.edges()) {
//            StdOut.println(e);
//        }
//        StdOut.printf("%.5f\n", mst.weight());
//    }
//
//}
//
