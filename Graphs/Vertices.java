package Graphs;

import java.util.*;

public class Vertices {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // Creation Of Graphs
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));
    }

    // (BFS)Breadth First Search
    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean visitedArray[] = new boolean[V];

        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visitedArray[curr] == false) {
                System.out.print(curr + " ");
                visitedArray[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // (DFS) Depth First Search
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visitedArray[]) {
        System.out.print(curr + " ");
        visitedArray[curr] = true;

        // Visit all adjacent nodes of the current node
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visitedArray[e.dest]) {
                dfs(graph, e.dest, visitedArray);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices in the graph

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean visitedArray[] = new boolean[V];
        dfs(graph, 0, visitedArray); // Start DFS traversal from vertex 0
    }
}
