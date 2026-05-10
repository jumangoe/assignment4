public class Edge {

    private int source;
    private int destination;

    public Edge(int source,int destination) {
        this.source=source;
        this.destination=destination;
    }

    public int GetSource() {
        return source;
    }

    public int GetDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return source+" -> "+destination;
    }
}