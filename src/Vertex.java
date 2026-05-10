public class Vertex {

    private int id;

    public Vertex(int id) {
        this.id=id;
    }

    public int GetId() {
        return id;
    }

    @Override
    public String toString() {
        return "Vertex "+id;
    }
}