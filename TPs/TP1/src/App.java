import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        MySimpleLinkedList<String> listaString = new MySimpleLinkedList<String>();
        listaString.insertFront("Agustin");
        listaString.insertFront("Pedro");
        listaString.insertFront("Belen");
        listaString.insertFront("Carolina");
        System.out.println(listaString.toString());

        
        System.out.println(listaString.toString());



        Iterator<String> it = listaString.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        } 

/*         for (Integer ii : listaInteger) {
            System.out.println(ii);
        } */
        //Tanto el while como el foreach hacen lo mismo, ambos necesitan que la clase lista implemente el iterable










        
        MySimpleLinkedListInteger<Integer> listaInteger = new MySimpleLinkedListInteger<Integer>();
        listaInteger.insertFront(1);
        listaInteger.insertFront(2);
        listaInteger.insertFront(3);
        listaInteger.insertFront(6);
        listaInteger.insertFront(5);
        listaInteger.insertFront(4);
        System.out.println(listaInteger.toString());

        
        MySimpleLinkedListInteger<Integer> listaInteger2 = new MySimpleLinkedListInteger<Integer>();
        listaInteger2.insertFront(2);
        listaInteger2.insertFront(6);
        listaInteger2.insertFront(4);
        listaInteger2.insertFront(8);
        System.out.println(listaInteger2.toString());




        MySimpleLinkedListInteger<Integer> listaInteger3 = new MySimpleLinkedListInteger<Integer>();
        for (Integer ii : listaInteger) {
            if (listaInteger2.contains(ii)) {
                listaInteger3.insertFront(ii);
            }
        }

        System.out.println("EJ 5:");
        System.out.println(listaInteger3.toString());


    }
}
