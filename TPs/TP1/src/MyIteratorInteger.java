import java.util.Iterator;

public class MyIteratorInteger<T> implements Iterator<T> {
    private NodeInteger<T> temp;

    public MyIteratorInteger(NodeInteger<T> nn) {
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
