public class Experiment {

    public void RunTraversals(Graph graph) {

        long startTime=System.nanoTime();
        graph.Bfs(0);
        long endTime=System.nanoTime();

        long bfsTime=endTime-startTime;

        startTime=System.nanoTime();
        graph.Dfs(0);
        endTime=System.nanoTime();

        long dfsTime=endTime-startTime;

        System.out.println("BFS time: "+bfsTime+" ns");
        System.out.println("DFS time: "+dfsTime+" ns");
    }

    public void RunMultipleTests() {

        int[] sizes={10,30,100};

        for(int size : sizes) {

            System.out.println("\nGraph with "+size+" vertices");

            Graph graph=new Graph();

            for(int i=0;i<size;i++) {
                graph.AddVertex(new Vertex(i));
            }

            for(int i=0;i<size-1;i++) {
                graph.AddEdge(i,i+1);
            }

            RunTraversals(graph);
        }
    }

    public void PrintResults() {
        System.out.println("Tests completed.");
    }
}