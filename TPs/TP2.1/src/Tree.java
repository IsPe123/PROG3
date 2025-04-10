import java.util.ArrayList;

public class Tree {

    private TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void add(Integer value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root, value);
    }

    private void add(TreeNode actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(), value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(), value);
            }
        }
    }

    public Integer getRoot() {
        if (this.root == null)
            return null;

        return this.root.getValue();
    }

    public boolean hasElem(Integer value) {
        return hasElem(root, value);
    }

    private boolean hasElem(TreeNode/* <Integer> */ actual, Integer value) {

        if (actual == null) {
            return false;
        }

        if (actual.getValue().equals(value)) {
            return true;
        }

        return value < actual.getValue() ? hasElem(actual.getLeft(), value) : hasElem(actual.getRight(), value);
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    /*
     * public boolean delete(Integer value) {
     * return delete(root, value);
     * }
     * 
     * private boolean delete(TreeNode actual, Integer value) {
     * if (actual == null) {
     * return false;
     * }
     * 
     * if (actual.getValue().equals(value)) {
     * return true;
     * }
     * 
     * }
     */

    ////////////////////////////////////////////
    public boolean delete(Integer value) {
        if (isEmpty() || !hasElem(value)) {
            return false;
        }

        root = delete(root, value);
        return true;
    }

    private TreeNode delete(TreeNode actual, Integer value) {
        if (actual == null) {
            return null;
        }

        if (value < actual.getValue()) {
            actual.setLeft(delete(actual.getLeft(), value));
        } else if (value > actual.getValue()) {
            actual.setRight(delete(actual.getRight(), value));
        } else {
            // es una hoja
            if (actual.getLeft() == null && actual.getRight() == null) {
                return null;
            }

            // tiene un solo nodo
            if (actual.getLeft() == null) {
                return actual.getRight();
            }

            if (actual.getRight() == null) {
                return actual.getLeft();
            }

            // tiene dos nodos
            /*
             * TreeNode nuevo = getMinNode(actual.getRight());
             * actual.setValue(nuevo.getValue());
             * actual.setRight(delete(actual.getRight(), nuevo.getValue()));
             */

        }

        return actual;
    }

    ////////////////////////////////////////////

    // PRÁCTICO ARBOLES
    // boolean delete(Integer) Borrar este nodo?
    // int getHeight() Subo y de ahi empiezo a bajar?
    // void printPosOrder() Imprimo de a uno o voy armando una lista?
    // void printPreOrder() --Lo mismo
    // void printInOrder() --Lo mismo
    // List getLongestBranch()
    // List getFrontera()
    // Integer getMaxElem()
    // List getElemAtLevel(int)

    // Ej2
    /*
    Dado un árbol binario de búsquedas que almacena números enteros, implementar un algoritmo que retorne la suma de todos los nodos internos del árbol.
     */
    public Integer sumarTodoElArbol() {
        return sumarTodoElArbol(this.root);
    }

    public Integer sumarTodoElArbol(TreeNode actual) {
        Integer salida = 0;
        if (actual != null) {
            salida += actual.getValue() + sumarTodoElArbol(actual.getLeft()) + sumarTodoElArbol(actual.getRight());
        }
        return salida;
    }

    // EJ 3
    /*
        Dado un árbol binario de búsqueda que almacena números enteros y un valor de entrada K, implementar un algoritmo que permita obtener un listado con los valores de todas las hojas cuyo valor supere K. Por ejemplo, para el árbol de la derecha, con un valor K = 8, el resultado debería ser [9, 11].
     */

    public ArrayList<Integer> buscarHojasMayores(Integer value) {
        return buscarHojasMayores(this.root, value);
    }

    public ArrayList<Integer> buscarHojasMayores(TreeNode actual, Integer value) {
        ArrayList<Integer> salida = new ArrayList<>();
        if (actual == null) {
            return null;
        }

        if (actual.getLeft() == null && actual.getRight() == null) { // esta linea verifica que el nodo actual es una
                                                                     // hoja ya que si no tiene izq o derecha es porque
                                                                     // esta solita
            if (actual.getValue() > value) {
                salida.add(actual.getValue());
            }
        } else {
            buscarHojasMayores(actual.getLeft(), value);
            buscarHojasMayores(actual.getRight(), value);
        }

        return salida;
    }

    /*
    Ejercicio 4
        Se posee un árbol binario (no de búsqueda), donde los nodos internos están vacíos, mientras que las hojas tienen valores enteros. Se debe implementar un método que recorra el árbol y coloque valores en los nodos vacíos (los nodos internos). El valor de cada nodo interno debe ser igual al valor de su hijo derecho, menos el valor de su hijo izquierdo. En caso de que el nodo tenga un solo hijo, el valor del hijo faltante se reemplaza por un 0. Por ejemplo, tomando como entrada el árbol de la izquierda, el árbol resultante debería  quedar con los mismos valores que el de la derecha.
     */

    public Integer agregarValores(TreeNode tn) {
        if (tn == null) {
            return 0;
        }

        if (tn.getLeft() == null && tn.getRight() == null) {
            return tn.getValue();
        }

        Integer valorIzq = agregarValores(tn.getLeft());
        Integer valorDer = agregarValores(tn.getRight());
       
        tn.setValue(valorDer - valorIzq);
        return tn.getValue();
    }





    /* 
    public void buscarNodoVacio(TreeNode tt){
        if (tt.getValue() == null) {

            if (tt.left != null) {
                if (tt.left.getValue() == null) {
                    buscarNodoVacio(tt.left());
                }
            }

            if (tt.right != null) {
                if (tt.right.getValue() == null) {
                    buscarNodoVacio(tt.right());
                }
            }

            tt.setValue(tt.left.getValue() - tt.right.getValue());
        }
    }
     
    */

}