
import java.util.ArrayList;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T> {

	private ArrayList<Vertice<T>> listaVertices;
    private ArrayList<Arco> arcos;
	
	public GrafoDirigido() {
		this.listaVertices = new ArrayList<Vertice<T>>();
		this.arcos = new ArrayList<Arco>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		listaVertices.add(new Vertice<T>(verticeId));
	}

	@Override
	public void borrarVertice(int verticeId) {
		for (Vertice vertice : listaVertices) {
			if (vertice.getId() == verticeId) {
				listaVertices.remove(vertice);
			}
		}
	}

	// lista[
	//         [1, listaArcos]
	//         [2, listaArcos]
	//         [3, listaArcos]
	//         [4, listaArcos]
	//      ]

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if(existeVertice(verticeId1) && existeVertice(verticeId2)) {
			Arco aa = new Arco<T>(verticeId1, verticeId2, etiqueta);
			arcos.add(aa);
		} else {
			System.out.println("Flashaste negro");
		}
	}

	public boolean existeVertice(int ID) {
		for (Vertice vv : listaVertices) {
			if(vv.contains(ID)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		for (Arco aa : arcos) {
			if (aa.contains(verticeId1, verticeId2)) {
				arcos.remove(aa);
			}
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		for (Vertice vertice : listaVertices) {
			if(vertice.getId() == verticeId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		for (Arco aa : arcos) {
			if (aa.contains(verticeId1, verticeId2)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		for (Arco arco : arcos) {
			if (arco.contains(verticeId1, verticeId2)) {
				Arco copia = new Arco<T>(arco.getVerticeOrigen(), arco.getVerticeDestino(), (T)arco.getEtiqueta());
				return copia;
			}
		}
		return null;
	}

	@Override
	public int cantidadVertices() {
		return listaVertices.size();
	}

	@Override
	public int cantidadArcos() {
		return arcos.size();
	}

	@Override
    public Iterator<Integer> obtenerVertices() {
        ArrayList<Integer> result = new ArrayList<>();
        for (Vertice vertice : listaVertices) {
			result.add(vertice.getId());
		}
        return result.iterator();
    } 


	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Arco aa : arcos) {
			if (aa.getVerticeOrigen() == verticeId) {
				result.add(aa.getVerticeDestino());	
			}
		}
        return result.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		ArrayList<Arco<T>> res = new ArrayList<>(arcos);
		return res.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		ArrayList<Arco<T>> res = new ArrayList<>();
		for (Arco arco : arcos) {
			if (arco.containsOrigen(verticeId)) {
				res.add(arco);
			}
		}
		return res.iterator();
	}


}