package GraphProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Step 1: Create adjacency list (graph) and indegree array
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course); // prereq -> course
            indegree[course]++;           // course depends on prereq
        }

        // Step 2: Initialize queue with all courses having indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: Process queue (BFS)
        int[] order = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            order[idx++] = curr;

            for (int next : graph.get(curr)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        // Step 4: If cycle exists, return empty array
        if (idx != numCourses) {
            return new int[0];
        }

        return order;

    }
    // 🔹 Main function for testing
    public static void main(String[] args) {
        courseSchedule2 sol = new courseSchedule2();

        // Example 1
        int numCourses1 = 4;
        int[][] prerequisites1 = {{1,0},{2,0},{3,1},{3,2}};
        int[] result1 = sol.findOrder(numCourses1, prerequisites1);
        System.out.print("Order for Example 1: ");
        for (int x : result1) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Example 2 (cycle case)
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1,0},{0,1}};
        int[] result2 = sol.findOrder(numCourses2, prerequisites2);
        System.out.print("Order for Example 2: ");
        for (int x : result2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
