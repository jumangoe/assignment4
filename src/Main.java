public class Main {

    public static void main(String[] args) {

        Graph graph=new Graph();

        for(int i=0;i<10;i++) {
            graph.AddVertex(new Vertex(i));
        }

        graph.AddEdge(0,1);
        graph.AddEdge(0,2);
        graph.AddEdge(1,3);
        graph.AddEdge(1,4);
        graph.AddEdge(2,5);
        graph.AddEdge(3,6);
        graph.AddEdge(4,7);
        graph.AddEdge(5,8);
        graph.AddEdge(6,9);

        graph.PrintGraph();

        Experiment experiment=new Experiment();

        experiment.RunTraversals(graph);

        experiment.RunMultipleTests();

        experiment.PrintResults();
    }
}