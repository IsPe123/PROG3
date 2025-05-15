import TPs.TP4.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

public class BFS<T> {
    private Queue<Integer> cola;
    HashSet<Integer> visitados;
    public void BFS(GrafoDirigido<T> gr){
        cola.clear();
        Iterator<Integer> it = gr.obtenerVertices();
        visitados = new HashSet<>();

        while (it.hasNext()){
            if (!visitados.contains(it.next())){ 
                recorrerBFS(gr, it.next());
                cola.clear();

            }
        }
    }

    private void recorrerBFS(GrafoDirigido<T> gr, Integer next) {
        visitados.add(next);
        cola.add(next);

        while (!cola.isEmpty()){
            Iterator<Integer> adyacente = gr.obtenerAdyacentes(next);
            while (adyacente.hasNext()){
                if (!visitados.contains(adyacente.next())){ 
                    visitados.add(adyacente.next());
                    cola.add(adyacente.next());
                }
            }
        }
    }

}