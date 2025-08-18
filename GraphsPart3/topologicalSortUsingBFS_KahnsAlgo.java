package GraphsPart3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSortUsingBFS_KahnsAlgo {

    static class Edge{
        int src, dis;

        public Edge(int s, int d){
            this.src = s;
            this.dis = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){ // TRUE
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calIndeg(ArrayList<Edge> graph[], int indeg[]){
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dis]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " "); //topological sort printed here

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dis]--;

                if (indeg[e.dis] == 0){
                    q.add(e.dis);
                }

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    }
}
