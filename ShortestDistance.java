package hw11;

/**
 * The ShortestDistance class represents a graph and provides methods to find the shortest distance between pairs of vertices using the Floyd-Warshall algorithm.
 */
public class ShortestDistance  {
    final static int inf = 10000;
    final static int num = 5;

    /**
     * Prints the shortest distance between pairs of vertices in the graph.
     *
     * @param tri the 2D array representing the distances between vertices
     */
    public static void matrix(int tri[][]) {
        System.out.println("Shortest distance between pairs: ");

        for (int i = 0; i < num; i++) {
            for (int z = 0; z < num; z++) {
                System.out.print(tri[i][z] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Applies the Floyd-Warshall algorithm to find the shortest distance between all pairs of vertices in the graph.
     *
     * @param tri the 2D array representing the distances between vertices
     */
    public void FloydWarshall(int tri[][]) {
        int i, z, a;
        for (a = 0; a < num; a++) {
            for (i = 0; i < num; i++) {
                for (z = 0; z < num; z++) {
                    tri[i][z] = Math.min(tri[i][z], tri[i][a] + tri[a][z]);
                }
            }
        }
        matrix(tri);
    }

    /**
     * The main method of the program.
     
     *  It initializes a 2D array 'tri' with the distance values between vertices. It creates an instance of the ShortestDistance class and calls the FloydWarshall method.
     */
    public static void main(String[] args) {
        int tri[][] = {
                {0, 3, 8, inf, -4},
                {inf, 0, inf, 1, 7},
                {inf, 4, 0, inf, inf},
                {2, inf, -5, 0, inf},
                {inf, inf, inf, 6, 0}
        };
        ShortestDistance i = new ShortestDistance();

        i.FloydWarshall(tri);
    }
}
