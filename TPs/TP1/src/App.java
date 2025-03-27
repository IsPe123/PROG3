public class App {
    public static void main(String[] args) {

        MySimpleLinkedList<String> listaString = new MySimpleLinkedList<String>();
        listaString.insertFront("Agustin");
        listaString.insertFront("Pedro");
        listaString.insertFront("Belen");
        listaString.insertFront("Carolina");
/*         System.out.println(listaString.toString());
 */
/*         System.out.println(listaString.toString());
 */



        
        MySimpleLinkedListInteger<Integer> listaInteger = new MySimpleLinkedListInteger<Integer>();
        listaInteger.insertFront(1);
        listaInteger.insertFront(2);
        listaInteger.insertFront(3);
        listaInteger.insertFront(6);
        listaInteger.insertFront(5);
        listaInteger.insertFront(4);
/*         System.out.println(listaInteger.toString());
 */
        
        MySimpleLinkedListInteger<Integer> listaInteger2 = new MySimpleLinkedListInteger<Integer>();
        listaInteger2.insertFront(2);
        listaInteger2.insertFront(6);
        listaInteger2.insertFront(4);
        listaInteger2.insertFront(8);
/*         System.out.println(listaInteger2.toString()); */




        MySimpleLinkedListInteger<Integer> listaInteger3 = new MySimpleLinkedListInteger<Integer>();
        
        for (Integer ii : listaInteger) {
            if (listaInteger2.contains(ii)) {
                for (Integer aux : listaInteger3) {
                    if (!(aux > ii)) {
                        
                    }
                }
                listaInteger3.insertFront(ii);
            }
        }

/*         System.out.println("EJ 5:");
        System.out.println(listaInteger3.toString()); */




        // PRÁCTICO ARBOLES
        NodoBinario n1 = new NodoBinario(1);
        NodoBinario n2 = new NodoBinario(2);
        NodoBinario n3 = new NodoBinario(3);
        NodoBinario n4 = new NodoBinario(4);
        NodoBinario n5 = new NodoBinario(5);
        NodoBinario n6 = new NodoBinario(6);
        NodoBinario n7 = new NodoBinario(7);
        NodoBinario n8 = new NodoBinario(8);


        n1.setNodoLeft(n2);
        n1.setNodoRight(n3);

        n2.setNodoLeft(n4);
        n2.setNodoRight(n5);

        n3.setNodoLeft(n6);
        n3.setNodoRight(n7);

        n4.setNodoLeft(n8);

        
        System.out.println(n1.hasElem(9));
        System.out.println(n6.getRoot());
    }
}
