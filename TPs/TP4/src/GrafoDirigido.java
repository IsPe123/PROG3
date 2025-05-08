
import java.util.ArrayList;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T> {

	private ArrayList<Vertice<T>> listaVertices;

	public GrafoDirigido() {
		this.listaVertices = new ArrayList<Vertice<T>>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		listaVertices.add(new Vertice<T>(verticeId));
	}

	@Override
	public void borrarVertice(int verticeId) {
		for (Vertice vertice : listaVertices) {
			ArrayList<Arco> arcos = vertice.getArcos();
			for (Arco arco : arcos) {
				if (arco.getVerticeDestino() == verticeId || arco.getVerticeOrigen() == verticeId) {
					vertice.deleteArco(arco);
				}
			}
		}
		listaVertices.remove(verticeId);
	}

	// lista[
	//         [1, listaArcos]
	//         [2, listaArcos]
	//         [3, listaArcos]
	//         [4, listaArcos]
	//      ]


	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		//Verificamos si existen los vertices pues no vas a agregar un arco en vertices que no existen xd 
		if(!listaVertices.contains(verticeId1) && !listaVertices.contains(verticeId2)) {
			System.out.println("El vertice no existe");
			return;
		}


//agregar si existe el arco 
/*
 		if(listaVertices.existeArco(verticeId1, verticeId2)) {
			System.out.println("El arco ya existe");
			return;
		} */
		for (Vertice<T> verticePapurri : listaVertices) {
			if (verticePapurri.getId() == verticeId1) {
				verticePapurri.crearArco(verticeId2, etiqueta);	
				return;
			}
		}
	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cantidadVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int cantidadArcos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		// TODO Auto-generated method stub
		return null;
	}

}