import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private ArrayList<Vertex> vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph() {
        vertices=new ArrayList<>();
        adjacencyList=new ArrayList<>();
    }

    public void AddVertex(Vertex vertex) {
        vertices.add(vertex);
        adjacencyList.add(new ArrayList<>());
    }

    public void AddEdge(int from,int to) {
        adjacencyList.get(from).add(to);
    }

    public void PrintGraph() {

        System.out.println("Graph structure:");

        for(int i=0;i<adjacencyList.size();i++) {

            System.out.print(i+" -> ");

            for(int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor+" ");
            }

            System.out.println();
        }
    }

    public void Bfs(int start) {

        boolean[] visited=new boolean[vertices.size()];

        Queue<Integer> queue=new LinkedList<>();

        visited[start]=true;
        queue.add(start);

        System.out.print("BFS: ");

        while(!queue.isEmpty()) {

            int current=queue.poll();

            System.out.print(current+" ");

            for(int neighbor : adjacencyList.get(current)) {

                if(!visited[neighbor]) {

                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    public void Dfs(int start) {

        boolean[] visited=new boolean[vertices.size()];

        System.out.print("DFS: ");

        DfsHelper(start,visited);

        System.out.println();
    }

    private void DfsHelper(int current,boolean[] visited) {

        visited[current]=true;

        System.out.print(current+" ");

        for(int neighbor : adjacencyList.get(current)) {

            if(!visited[neighbor]) {
                DfsHelper(neighbor,visited);
            }
        }
    }
}