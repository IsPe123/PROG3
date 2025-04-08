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

   /*  public boolean delete(Integer value) {
        return delete(root, value);
    }

    private boolean delete(TreeNode actual, Integer value) {
        if (actual == null) {
            return false;
        }

        if (actual.getValue().equals(value)) {
            return true;
        }

    } */

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
           /*  TreeNode nuevo = getMinNode(actual.getRight());
            actual.setValue(nuevo.getValue());
            actual.setRight(delete(actual.getRight(), nuevo.getValue())); */

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
}