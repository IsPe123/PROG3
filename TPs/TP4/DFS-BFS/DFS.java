import TPs.TP4.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class DFS<T> {
    private HashMap<Integer, String> visitados = new HashMap<>();

    public boolean dfsVisitar(GrafoDirigido grafo) {

        Iterator<Integer> vertices = grafo.obtenerVertices();
        while (vertices.hasNext()) {
            visitados.put(vertices.next(), "Blanco");
        }
       
        Iterator<Integer> vertices2 = grafo.obtenerVertices();
        while (vertices2.hasNext()) {
            int v = vertices2.next();
            if (visitados.get(v).equals("Blanco")) {
                if (buscarEnProfundidad(v, grafo)) {
                    return true; 
                }
            }
        }
        return false; 
    }

    private boolean buscarEnProfundidad(int v, GrafoDirigido grafo) {
        visitados.put(v, "Amarillo");

        Iterator<Integer> adyacentes = grafo.obtenerAdyacentes(v);
        while (adyacentes.hasNext()) {
            int adyacenteId = adyacentes.next();
            String color = visitados.get(adyacenteId);
            if (color.equals("Blanco")) {
                if (buscarEnProfundidad(adyacenteId, grafo)) {
                    return true;
                }
            } else if (color.equals("Amarillo")) {
                return true; 
            }
        }

        visitados.put(v, "Negro");
        return false;
    }

}