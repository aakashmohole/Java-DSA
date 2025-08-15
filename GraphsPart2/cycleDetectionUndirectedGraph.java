package GraphsPart2;

import java.util.ArrayList;

public class cycleDetectionUndirectedGraph {
    static class Edge{
        int src, dis;

        public Edge(int s, int d){
            this.src = s;
            this.dis = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
//        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

//        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

         /*
                  0 ----- 3
                / |       |
               /  |       |
              1   |       |
               \  |       4
                 \|
                  2
        */
    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                if(detectCycleUtil(graph, vis, i, -1)) {
                    return true; //cycle detected in on of the parts
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            //case3 -> neg not vis and next call return true or detect cycle then return true
            if(!vis[e.dis]){
                if (detectCycleUtil(graph, vis, e.dis, curr)){
                    return true;
                }
            }

            //case 1 -> neg is vis and neg is not parent return true
            else if(vis[e.dis] && e.dis != par){
                return true;
            }

            //case 2 -> do nothing -> continue loop
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
