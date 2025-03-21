public class App {
    public static void main(String[] args) {
        MySimpleLinkedList<String> listaString = new MySimpleLinkedList<String>();
        listaString.insertFront("Agustin");
        listaString.insertFront("Pedro");
        listaString.insertFront("Belen");
        listaString.insertFront("Carolina");
        System.out.println(listaString.toString());



        MySimpleLinkedList<Integer> listaInteger = new MySimpleLinkedList<Integer>();
        listaInteger.insertFront(2002);
        listaInteger.insertFront(1999);
        listaInteger.insertFront(1986);
        listaInteger.insertFront(2025);
        System.out.println(listaInteger.toString());

    }
}
