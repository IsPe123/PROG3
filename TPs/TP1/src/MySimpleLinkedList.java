public class MySimpleLinkedList<T> {
	
	private Node<T> first;
	static int cant = 0;
	
	public MySimpleLinkedList() {
		this.first = null;
	}
	
	public void insertFront(T info) {
		Node<T> tmp = new Node<T>(info,null);
		tmp.setNext(this.first);
		this.first = tmp;
	}

	public T extractFront() {		
		if (this.first.getNext() != null) {
			Node<T> eliminado = this.first;
			this.first = eliminado.getNext();
			eliminado.setNext(null); //no es necesario. El garbage collector se fija solo si alguien lo está referenciando, no si el nodo referencia a alguien
			cant--;		
			return eliminado.getInfo();
		}
		return null;
	}
		
	public boolean isEmpty() {
		if(this.first.getNext() == null) {
			return true;
		}	
		return false;
	}
	
	public T get(int index) {
		Node<T> temp = this.first;
	    while(temp != null && index != 0) {
			temp = temp.getNext();
			index--;
	    } 
		if(temp != null){
			return temp.getInfo();
		}
	   return null;
    }
	
	public int size(){
		return cant;
	}
	
	@Override
	public String toString() {
		String resultado = "{";
		Node<T> temp = this.first;
		while(temp != null){
			resultado += temp.toString();
			temp = temp.getNext();
			if (temp != null) {resultado += ", ";}
		}
		resultado += "}";
		return resultado;
	}
	
	
	public int indexOf(T info){
		Node<T> temp = this.first;
		int index = 0;

		while(temp != null && !temp.getInfo().equals(info)){
			temp = temp.getNext();
			index++;
		}

		if(temp != null ) {
			return index;
		}
		return -1;
	}


	
}