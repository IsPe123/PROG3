
public class Vertice<T> {
    private Integer id;

    public Vertice(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean contains(int nn) {
        return this.id == nn;
    }
    
}