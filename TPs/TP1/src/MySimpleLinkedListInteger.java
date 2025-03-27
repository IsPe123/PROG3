public class MySimpleLinkedListInteger<Integer> implements Iterable<Integer> {

	private NodeInteger<Integer> first;
	private int cant;

	public MySimpleLinkedListInteger() {
		this.first = null;
		this.cant = 0;
	}

	public void insertFront(Integer info) {
		NodeInteger<Integer> tmp = new NodeInteger<Integer>(info, null);
		tmp.setNext(this.first);
		this.first = tmp;
	}

	public Integer extractFront() {
		if (this.first.getNext() != null) {
			NodeInteger<Integer> eliminado = this.first;
			this.first = eliminado.getNext();
			eliminado.setNext(null); // no es necesario. El garbage collector se fija solo si alguien lo está
										// referenciando, no si el nodo referencia a alguien
			this.cant--;
			return eliminado.getInfo();
		}
		return null;
	}

	public boolean isEmpty() {
		if (this.first.getNext() == null) {
			return true;
		}
		return false;
	}

	public Integer get(int index) {
		NodeInteger<Integer> temp = this.first;
		while (temp != null && index != 0) {
			temp = temp.getNext();
			index--;
		}
		if (temp != null) {
			return temp.getInfo();
		}
		return null;
	}

	public int size() {
		return this.cant;
	}

	@Override
	public String toString() {
		String resultado = "{";
		NodeInteger<Integer> temp = this.first;
		while (temp != null) {
			resultado += temp.toString();
			temp = temp.getNext();
			if (temp != null) {
				resultado += ", ";
			}
		}
		resultado += "}";
		return resultado;
	}

	public int indexOf(Integer info) {
		NodeInteger<Integer> temp = this.first;
		int index = 0;

		while (temp != null && !temp.getInfo().equals(info)) {
			temp = temp.getNext();
			index++;
		}

		if (temp != null) {
			return index;
		}
		return -1;
	}

	public boolean contains(Integer ii) {
		NodeInteger<Integer> temp = this.first;
		while (temp != null) {
			if (temp.getInfo().equals(ii)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public MyIteratorInteger<Integer> iterator() {
		return new MyIteratorInteger<>(this.first);
	}

	//TP Arboles:
	

}