//package princeton;
//
///*************************************************************************
// *  Compilation:  javac DegreesOfSeparation.java
// *  Execution:    java DegreesOfSeparation filename delimiter source
// *  Dependencies: SymbolGraph.java Graph.java BreadthFirstPaths.java StdOut.java
// *  Data files:   http://algs4.cs.princeton.edu/41undirected/routes.txt
// *                http://algs4.cs.princeton.edu/41undirected/movies.txt
// *  
// *  
// *  %  java DegreesOfSeparation routes.txt " " "JFK"
// *  LAS
// *     JFK
// *     ORD
// *     DEN
// *     LAS
// *  DFW
// *     JFK
// *     ORD
// *     DFW
// *  EWR
// *     Not in database.
// *
// *  % java DegreesOfSeparation movies.txt "/" "Bacon, Kevin"
// *  Kidman, Nicole
// *     Bacon, Kevin
// *     Woodsman, The (2004)
// *     Grier, David Alan
// *     Bewitched (2005)
// *     Kidman, Nicole
// *  Grant, Cary
// *     Bacon, Kevin
// *     Planes, Trains & Automobiles (1987)
// *     Martin, Steve (I)
// *     Dead Men Don't Wear Plaid (1982)
// *     Grant, Cary
// *
// *  % java DegreesOfSeparation movies.txt "/" "Animal House (1978)"
// *  Titanic (1997)
// *     Animal House (1978)
// *     Allen, Karen (I)
// *     Raiders of the Lost Ark (1981)
// *     Taylor, Rocky (I)
// *     Titanic (1997)
// *  To Catch a Thief (1955)
// *     Animal House (1978)
// *     Vernon, John (I)
// *     Topaz (1969)
// *     Hitchcock, Alfred (I)
// *     To Catch a Thief (1955)
// *
// *************************************************************************/
//
///**
// *  The <tt>DegreesOfSeparation</tt> class provides a client for finding
// *  the degree of separation between one distinguished individual and
// *  every other individual in a social network.
// *  As an example, if the social network consists of actors in which
// *  two actors are connected by a link if they appeared in the same movie,
// *  and Kevin Bacon is the distinguished individual, then the client
// *  computes the Kevin Bacon number of every actor in the network.
// *  <p>
// *  The running time is proportional to the number of individuals and
// *  connections in the network. If the connections are given implicitly,
// *  as in the movie network example (where every two actors are connected
// *  if they appear in the same movie), the efficiency of the algorithm
// *  is improved by allowing both movie and actor vertices and connecting
// *  each movie to all of the actors that appear in that movie.
// *  <p>
// *  For additional documentation,
// *  see <a href="http://algs4.cs.princeton.edu/41undirected">Section 4.1</a> of
// *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
// *
// *  @author Robert Sedgewick
// *  @author Kevin Wayne
// */
//public class DegreesOfSeparation {
//
//    // this class cannot be instantiated
//    private DegreesOfSeparation() { }
//
//    /**
//     *  Reads in a social network from a file, and then repeatedly reads in
//     *  individuals from standard input and prints out their degrees of
//     *  separation.
//     *  Takes three command-line arguments: the name of a file,
//     *  a delimiter, and the name of the distinguished individual.
//     *  Each line in the file contains the name of a vertex, followed by a
//     *  list of the names of the vertices adjacent to that vertex,
//     *  separated by the delimiter.
//     */
//    public static void main(String[] args) {
//        String filename  = args[0];
//        String delimiter = args[1];
//        String source    = args[2];
//
//        // StdOut.println("Source: " + source);
//
//        SymbolGraph sg = new SymbolGraph(filename, delimiter);
//        Graph G = sg.G();
//        if (!sg.contains(source)) {
//            StdOut.println(source + " not in database.");
//            return;
//        }
//
//        int s = sg.index(source);
//        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);
//
//        while (!StdIn.isEmpty()) {
//            String sink = StdIn.readLine();
//            if (sg.contains(sink)) {
//                int t = sg.index(sink);
//                if (bfs.hasPathTo(t)) {
//                    for (int v : bfs.pathTo(t)) {
//                        StdOut.println("   " + sg.name(v));
//                    }
//                }
//                else {
//                    StdOut.println("Not connected");
//                }
//            }
//            else {
//                StdOut.println("   Not in database.");
//            }
//        }
//    }
//}
