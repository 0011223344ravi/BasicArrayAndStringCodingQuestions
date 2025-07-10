package org.example.basicarrayandstringcodingquestions.Graph;

import java.util.*;

public class GraphBasics {
    private Map<Integer, List<Integer>> adj;

    public GraphBasics(int numVertices) {
        adj = new HashMap<>();
        for (int i = 0; i < numVertices; i++) {
            adj.put(i, new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // because it's an undirected graph
    }

    public void printGraph() {
        for (int node : adj.keySet()) {
            System.out.print(node + " → ");
            for (int neighbor : adj.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphBasics g = new GraphBasics(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}

