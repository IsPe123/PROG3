import java.util.ArrayList;

public class Vertice<T> {
    private Integer id;
    private ArrayList<Arco> arcos;

    public Vertice(int id) {
        this.id = id;
        this.arcos = new ArrayList<Arco>();
    }

    public int getId() {
        return id;
    }

    public void crearArco(Integer destino, T etiqueta) {
        Arco<T> aa = new Arco<T>(this.id , destino, etiqueta);
        arcos.add(aa);
    }

    public void deleteArco(Arco aa) {
        arcos.remove(aa);
    }

    public ArrayList<Arco> getArcos() {
        return new ArrayList<Arco>(arcos);
    }
    
}
