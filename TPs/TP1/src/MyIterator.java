import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Node<T> temp;

    public MyIterator(Node<T> nn) {
        this.temp = nn;
    }

    @Override
    public boolean hasNext() {
        return temp != null;
    }

    @Override
    public T next() {
        T salida = temp.getInfo();
        this.temp = temp.getNext();
        return salida; 
    }
}
