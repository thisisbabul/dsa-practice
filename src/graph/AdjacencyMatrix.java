package graph;

import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int node = in.nextInt();

        System.out.println("Enter number of edges:");
        int edge = in.nextInt();

        int n1, n2;
        int[][] adj = new int[100][100];

        for (int i = 0; i < edge; i++) {
            n1 = in.nextInt();
            n2 = in.nextInt();
            adj[n1][n2] = 1;
            adj[n2][n1] = 1;
        }

        for (int i = 0; i < node; i++) {
            for (int j = 0; j < node; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* input
n e
5 6
1 0
2 0
1 2
1 3
3 4
1 4

output
0 1 1 0 0
1 0 1 1 1
1 1 0 0 0
0 1 0 0 1
0 1 0 1 0
*/
