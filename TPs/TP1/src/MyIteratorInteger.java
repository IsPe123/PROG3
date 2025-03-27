import java.util.Iterator;

public class MyIteratorInteger<Integer> implements Iterator<Integer> {
    private NodeInteger<Integer> temp;

    public MyIteratorInteger(NodeInteger<Integer> nn) {
        this.temp = nn;
    }

    @Override
    public boolean hasNext() {
        return temp != null;
    }

    @Override
    public Integer next() {
        Integer salida = temp.getInfo();
        this.temp = temp.getNext();
        return salida; 
    }
}
